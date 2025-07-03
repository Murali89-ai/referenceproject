package com.wu.brwallet.customer.profile.service.signon;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wu.brwallet.customer.profile.adaptor.Gateway;
import com.wu.brwallet.customer.profile.adaptor.Mambu;
import com.wu.brwallet.customer.profile.adaptor.UCD;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.config.TemplateConfigProperties;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.helper.UCDHelper;
import com.wu.brwallet.customer.profile.mapper.signon.BusinessEventsBlazeMapper;
import com.wu.brwallet.customer.profile.mapper.signon.BusinessEventsGatewayMapper;
import com.wu.brwallet.customer.profile.mapper.signon.BusinessEventsUcdMapper;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeResponse;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupResponse;
import com.wu.brwallet.customer.profile.model.request.signon.CustomerAccountInfoDetails;
import com.wu.brwallet.customer.profile.model.request.signon.customer.SignOnRequest;
import com.wu.brwallet.customer.profile.model.response.gateway.SoapEnvelope;
import com.wu.brwallet.customer.profile.model.response.signon.SignOnResponse;
import com.wu.brwallet.customer.profile.model.response.validatepin.MambuClientResponse;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.era.library.auth.AuthException;
import jakarta.xml.bind.JAXBException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

import static com.wu.brwallet.customer.profile.constants.AppConstants.PROVIDER_STATUS_REGULAR;
import static com.wu.brwallet.customer.profile.constants.AppConstants.WALLET_ACCOUNT_TYPE_ID;


@Service
public class CustomerSignOnService {


    @Autowired
    private UCD ucd;

    @Autowired
    private UCDHelper ucdHelper;

    @Autowired
    private Gateway gateway;

    @Autowired
    private BlazeRiskService blazeRiskService;

    @Autowired
    private Mambu mambu;

    @Autowired
    private BusinessEventService businessEventService;


    @Autowired
    private BusinessEventsBlazeMapper businessEventsBlazeMapper;

    @Autowired
    private BusinessEventsGatewayMapper businessEventsGatewayMapper;

    @Autowired
    private BusinessEventsUcdMapper businessEventsUcdMapper;

    @Autowired
    private TemplateConfigProperties templateConfigProperties;

    private static final Logger logger = LoggerFactory.getLogger(CustomerSignOnService.class);


    @LoggingAnnotation
    public SignOnResponse getCustomerSignOn(SignOnRequest request, TransactionData incomingRequestDetails) throws AuthException, ExecutionException, JAXBException {
        var signOnResponse = new SignOnResponse();
        signOnResponse.setPinIsSet(false);
        CustomerLookupResponse customerLookupResponse = ucd.getCustomerDetails(request.getCustomerUmn(), incomingRequestDetails);
        BusinessEventData businessEventUcdData = businessEventsUcdMapper.getBusinessEventUcdRequest(request.getCustomerUmn());
        businessEventService.sendEvent(BusinessConstants.LOGIN_BUSINESS_EVENT_CODE, businessEventUcdData, incomingRequestDetails);

        logger.debug("ucdRespone:{}", customerLookupResponse.toString());
        int accountInfoSize = ucdHelper.sizeOfAccountInfo(customerLookupResponse);
        String accountTypeId = ucdHelper.findWalletAccountTypeId(customerLookupResponse, accountInfoSize);
        String providerAccountStatus = ucdHelper.findProviderAccountStatus(customerLookupResponse, accountTypeId);
        String countryCode = ucdHelper.findCountryCode(customerLookupResponse);
        String idvStatus = ucdHelper.findIDVStatus(customerLookupResponse);

        BlazeResponse loginSessionRiskResponse = blazeRiskService.executeBlazeFlows(new CustomerAccountInfoDetails(accountInfoSize, accountTypeId, providerAccountStatus), request, incomingRequestDetails, countryCode, idvStatus);
        logger.debug("blaze response {}", loginSessionRiskResponse);
        BusinessEventData businessEventBlazeData = businessEventsBlazeMapper.getBusinessEventBlazeRequest(request, customerLookupResponse);
        businessEventService.sendEvent(BusinessConstants.LOGIN_BUSINESS_EVENT_CODE, businessEventBlazeData, incomingRequestDetails);
        //create non wallet account

        if (!(accountInfoSize == 1 && accountTypeId.equalsIgnoreCase(WALLET_ACCOUNT_TYPE_ID))) {
            ucd.addOrUpdate(request.getCustomerUmn(), request.getLogonUserId(), incomingRequestDetails);
        }
        MambuClientResponse mambuClientResponse = null;
        SoapEnvelope transactions = gateway.getTxnDetails(request.getCustomerUmn(), request.getSessionId(), request.getReferenceNo(), incomingRequestDetails);
        if (AppConstants.WALLET_ACCOUNT_TYPE_ID.equalsIgnoreCase(accountTypeId) && PROVIDER_STATUS_REGULAR.equalsIgnoreCase(providerAccountStatus)) {
            mambuClientResponse = mambu.getClientDetails(request.getCustomerUmn(), incomingRequestDetails);
            if (!ObjectUtils.isEmpty(mambuClientResponse.getPayload())) {
                MambuClientResponse.ClientDetails client = Optional.ofNullable(mambuClientResponse.getPayload().get(0)).orElse(null);
                String storedPin = Optional.ofNullable(client.get_profile().getCustomerPin()).orElse("0");
                signOnResponse.setPinIsSet(storedPin != null);
            }
        }
        BusinessEventData businessEventGatewayData = businessEventsGatewayMapper.getBusinessEventGatewayRequest(request, customerLookupResponse);
        businessEventService.sendEvent(BusinessConstants.LOGIN_BUSINESS_EVENT_CODE, businessEventGatewayData, incomingRequestDetails);

        customerLookupResponse = ucd.getCustomerDetails(request.getCustomerUmn(), incomingRequestDetails);
        signOnResponse.setCustomerProfile(customerLookupResponse);
        signOnResponse.setVerificationStatus(loginSessionRiskResponse);
        setTransactionData(signOnResponse,transactions);
        if (mambuClientResponse != null && !ObjectUtils.isEmpty(mambuClientResponse.getPayload())
                && !ObjectUtils.isEmpty(mambuClientResponse.getPayload().get(0).get_profile().getCustomerPin())) {
            signOnResponse.setPinIsSet(true);
        }
        if (mambuClientResponse != null && !ObjectUtils.isEmpty(mambuClientResponse.getPayload())
                && !ObjectUtils.isEmpty(mambuClientResponse.getPayload().get(0).get_profile().getLastPinUpdatedDate())) {
            signOnResponse.setLastPinUpdatedDate(mambuClientResponse.getPayload().get(0).get_profile().getLastPinUpdatedDate());
        }

        signOnResponse.setTemplateId(templateConfigProperties.getId());
        signOnResponse.setTemplateVersion(templateConfigProperties.getVersion());
        return signOnResponse;
    }

    private void setTransactionData(SignOnResponse signOnResponse, com.wu.brwallet.customer.profile.model.response.gateway.SoapEnvelope transactions) {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        ObjectNode rootNode = objectMapper.createObjectNode();
        ObjectNode envelopeNode = rootNode.putObject("Envelope");
        ObjectNode bodyNode = envelopeNode.putObject("Body");
        ObjectNode h2hDasReplyNode = bodyNode.putObject("h2h-das-reply");
        ObjectNode mtmlNode = h2hDasReplyNode.putObject("MTML");
        ObjectNode replyNode = mtmlNode.putObject("REPLY");
        ObjectNode dataContextNode = replyNode.putObject("DATA_CONTEXT");
        ObjectNode headerNode = dataContextNode.putObject("HEADER");

        headerNode.put("ACCOUNT_NUM", transactions.getBody().getXrsiDasReply().getMTML().getDASReply().getDASDataContext().getDASHeader().getAgentAccountNumber());
        headerNode.put("COUNTER_ID", transactions.getBody().getXrsiDasReply().getMTML().getDASReply().getDASDataContext().getDASHeader().getDASQueryCounterID());
        headerNode.put("DATA_MORE", transactions.getBody().getXrsiDasReply().getMTML().getDASReply().getDASDataContext().getDASHeader().getAnyMoreRecords());
        headerNode.put("DATA_NUM_RECS", transactions.getBody().getXrsiDasReply().getMTML().getDASReply().getDASDataContext().getDASHeader().getNumberRecsReturned());
        headerNode.put("ERROR_MSG", transactions.getBody().getXrsiDasReply().getMTML().getDASReply().getDASDataContext().getDASHeader().getErrorMsg());
        headerNode.put("FSID", transactions.getBody().getXrsiDasReply().getMTML().getDASReply().getDASDataContext().getDASHeader().getDASQueryFSID());
        headerNode.put("NAME", transactions.getBody().getXrsiDasReply().getMTML().getDASReply().getDASDataContext().getDASHeader().getDASQueryName());
        headerNode.put("TERM_ID", transactions.getBody().getXrsiDasReply().getMTML().getDASReply().getDASDataContext().getDASHeader().getDASQueryTermID());

        signOnResponse.setTransactions(rootNode);
    }

}
