package com.wu.brwallet.customer.profile.adaptor;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.builder.event.PingBusinessEventBuilder;
import com.wu.brwallet.customer.profile.builder.request.PingRequestBuilder;
import com.wu.brwallet.customer.profile.config.ConnectorSecurityConfig;
import com.wu.brwallet.customer.profile.config.RestTemplateConfig;
import com.wu.brwallet.customer.profile.config.SecurityConfig;
import com.wu.brwallet.customer.profile.config.WUExceptionConfig;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationResponse;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import com.wu.brwallet.customer.profile.model.request.ping.create.PingCreateUser;
import com.wu.brwallet.customer.profile.model.request.ping.update.PingUpdateRequest;
import com.wu.brwallet.customer.profile.model.response.ping.PingResponse;
import com.wu.brwallet.customer.profile.model.response.ping.create.PingCreateResponse;
import com.wu.brwallet.customer.profile.model.response.ping.get.PingGetResponse;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.brwallet.customer.profile.util.PingHttpStatusUtility;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


@Service
public class Ping {

    private static final Logger logger = LoggerFactory.getLogger(Ping.class);

    @Autowired
    @Qualifier("defaultRestTemplate")
    private RestTemplate restTemplate;

    @Value("${ping.createUser.url}")
    private String pingCreateApiUrl;

    @Value("${ping.Bauth}")
    private String authToken;

    @Value("${createPingUser}")
    private boolean createPingUser;

    @Value("${updatePingUMN}")
    private boolean updatePingUMN;

    @Value("${ping.getApi.url}")
    private String pingGetApiUrl;

    @Value("${ping.update.url}")
    private String pingUpdateApiUrl;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private PingRequestBuilder pingRequestBuilder;

    @Autowired
    private PingHttpStatusUtility pingHttpStatusUtility;

    @Autowired
    private WUServiceExceptionUtils wuServiceExceptionUtils;

    @Autowired
    private PingBusinessEventBuilder pingBusinessEventBuilder;

    @Autowired
    private BusinessEventService businessEventService;

    PingResponse pingFinalResponse;

    CustomerRegistrationResponse ucdResponse;

    TransactionData transactionData;

    CustomerRegisterRequest customerRegistrationRequest;

    @Autowired
    private WUExceptionConfig exceptionConfig;

    @Autowired
    private RestTemplateConfig restTemplateConfig;

    @Autowired(required = false)
    private ConnectorSecurityConfig connectorSecurityConfig;


    @LoggingAnnotation
    public PingResponse createOrUpdateUser(CustomerRegisterRequest request, CustomerRegistrationResponse ucdResponse, TransactionData transactionData
                                            ) {

        //logger.info("Ping.createOrUpdateUser Registration request {} Ucd response {}", request, ucdResponse);
        this.ucdResponse=ucdResponse;
        this.transactionData=transactionData;
        this.customerRegistrationRequest=request;

        pingFinalResponse = new PingResponse();

        if (createPingUser) {
            createNewUser(request, ucdResponse,transactionData);

        }

        if (updatePingUMN) {
            updateUmnInPing(ucdResponse.getCustomerUmn(), request.getUserDn(), null);

        }

        logger.info("Ping.createOrUpdateUser Registration respons {} ", pingFinalResponse);
        return pingFinalResponse;
    }

    @LoggingAnnotation
    private void createNewUser(CustomerRegisterRequest request, CustomerRegistrationResponse ucdResponse, TransactionData transactionData) {

        HttpHeaders headers = getHeaders();

        PingCreateUser pingRequest = pingRequestBuilder.buildPingCreateUserRequest(request, ucdResponse.getCustomerUmn());


        HttpEntity<PingCreateUser> entity = new HttpEntity<>(pingRequest, headers);

     //   logger.info("Ping.createNewUser request {} ", entity);

        boolean httpStatus409 = false;

        try {
            String pingResponse = restTemplate.postForObject(pingCreateApiUrl, entity, String.class);

       //     logger.info("Ping.createNewUser response {} ", pingResponse);

            PingCreateResponse pingCreateUserResponse = objectMapper.readValue(pingResponse, new TypeReference<PingCreateResponse>() {
            });

            if (pingCreateUserResponse != null) {
                pingFinalResponse.setPingCreateResponse(pingCreateUserResponse);
            }

        } catch (WUServiceException e){
            throw e;
        }catch (Exception e) {
            httpStatus409 = e.getMessage().contains("409");
            logger.error("Ping.createNewUser- 409 statuscode {} , error {} ", httpStatus409, e.getMessage());
            pingHttpStatusUtility.checkStatusCodeIs409(httpStatus409);
            if (!httpStatus409) {
                throw exceptionConfig.prepareErrorCode(e,BusinessConstants.PING_CREATEUSER_UPSTREAM_NAME);
            }

        }
        BusinessEventData businessEventCreate = pingBusinessEventBuilder.buildPingCreateBusinessEvent(request, ucdResponse);
        businessEventService.sendEvent(BusinessConstants.REGISTER_BUSINESS_EVENT_CODE,businessEventCreate,transactionData);
        if (httpStatus409) {
            getUserDetailsFromPing(request, ucdResponse,transactionData);
        }


    }

    @LoggingAnnotation
    private void getUserDetailsFromPing(CustomerRegisterRequest request, CustomerRegistrationResponse ucdResponse, TransactionData transactionData) {
        logger.info("Ping.getUserDetailsFromPing");
        HttpHeaders headers = getHeaders();

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(pingGetApiUrl)
                .queryParam(AppConstants.SEARCH_SCOPE, AppConstants.WHOLE_SUBTREE)
                .queryParam(AppConstants.PING_GET_FILTER, "emailJSON.value eq \"" + request.getEmail() + "\"");
    //    logger.info("Ping.getUserDetailsFromPing Api request {}", builder.toUriString());
        PingGetResponse pingGetResponse = null;
        try {
            String pingUserDetailResponse = restTemplate.exchange(RequestEntity.get(new URI(builder.toUriString())).headers(headers).build(), String.class).getBody();

          //  logger.info("Ping.getUserDetailsFromPing Api response {}", pingUserDetailResponse);

            pingGetResponse = objectMapper.readValue(pingUserDetailResponse, new TypeReference<PingGetResponse>() {
            });
            if (pingGetResponse != null) {
                pingFinalResponse.setPingGetResponse(pingGetResponse);
            }
        }catch (WUServiceException e){
            throw e;
        } catch (Exception e) {
            logger.error("Error in Ping.getUserDetailsFromPing {} ", e.getMessage());
            throw exceptionConfig.prepareErrorCode(e,BusinessConstants.PING_GETUSER_UPSTREAM_NAME);
        }

         BusinessEventData pingGetBusinessEvent = pingBusinessEventBuilder.buildPingGetBusinessEvent(request, ucdResponse);

        if(pingGetBusinessEvent !=null){
            businessEventService.sendEvent(BusinessConstants.REGISTER_BUSINESS_EVENT_CODE,pingGetBusinessEvent,transactionData);
        }

        if (pingGetResponse!=null && pingGetResponse.get_embedded().getEntries().get(0).getUmn().isEmpty()) {
            updateUmnInPing(ucdResponse.getCustomerUmn(), request.getUserDn(), pingGetResponse);
        } else if (pingGetResponse!=null && !pingGetResponse.get_embedded().getEntries().get(0).getUmn().equalsIgnoreCase(ucdResponse.getCustomerUmn())) {
            throw wuServiceExceptionUtils.prepareWuException(BusinessConstants.UMN_MISMATCH, new RuntimeException(), WUExceptionType.SERVER);
        }

    }

    @LoggingAnnotation
    private void updateUmnInPing(String umn, String usrDn, PingGetResponse pingGetResponse) {
        HttpHeaders headers =getHeaders();

        String userDn = null;
        PingUpdateRequest pingUpdateRequest = pingRequestBuilder.pingUpdateRequestBuilder(umn);

        HttpEntity<PingUpdateRequest> entity = new HttpEntity<>(pingUpdateRequest, headers);
   //     logger.info("Ping.updateUmnInPing Api request {}", entity);

        if (pingGetResponse != null && pingGetResponse.get_embedded().getEntries().get(0).get_dn() != null) {
            userDn = pingGetResponse.get_embedded().getEntries().get(0).get_dn();
        } else {
            userDn = usrDn;
        }


        String pingUpdateResponse = null;
        try {
            String updatePingUrl=UriComponentsBuilder.fromHttpUrl(pingUpdateApiUrl).buildAndExpand(userDn).toUriString();
            logger.info("ping update url::" + updatePingUrl);
            pingUpdateResponse = restTemplate.exchange(updatePingUrl, HttpMethod.PATCH, entity, String.class).getBody();

         //   logger.info("Ping.updateUmnInPing Api response {}", pingUpdateResponse);

            BusinessEventData pingUpdateBusinessEvent = pingBusinessEventBuilder.buildPingUpdateBusinessEvent(customerRegistrationRequest, ucdResponse);
            businessEventService.sendEvent(BusinessConstants.REGISTER_BUSINESS_EVENT_CODE,pingUpdateBusinessEvent,transactionData);

        } catch (WUServiceException e){
            throw e;
        }catch (Exception e) {
            logger.error("EXception occured in Ping.updateUmnInPing {}", e.getMessage());
            throw exceptionConfig.prepareErrorCode(e,BusinessConstants.PING_UPDATEUSER_UPSTREAM_NAME);
        }


    }

    public HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-wu-correlationId",transactionData.getCorrelationId());
        headers.set("x-wu-externalRefId", transactionData.getExternalRefId());
        headers.set("x-wu-serviceid", AppConstants.PING_SERVICE_ID);
        if (restTemplateConfig.isLocalEnv()) {
            headers.set("x-api-key", connectorSecurityConfig.getConnectorXApiKey());
            headers.set("Authorization",connectorSecurityConfig.generateConnectorToken());
        }
        return headers;
    }
}

