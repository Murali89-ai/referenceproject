package com.wu.brwallet.customer.profile.adaptor;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.config.SoapClient;
import com.wu.brwallet.customer.profile.config.ConnectorSecurityConfig;
import com.wu.brwallet.customer.profile.config.RestTemplateConfig;
import com.wu.brwallet.customer.profile.config.SoapClient;
import com.wu.brwallet.customer.profile.config.WUExceptionConfig;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.mapper.signon.GatewayMapper;
import com.wu.brwallet.customer.profile.model.common.gateway.xrsi.XRSIDasRequest;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.gateway.SoapBody;
import com.wu.brwallet.customer.profile.model.request.gateway.SoapEnvelope;
import com.wu.era.library.auth.AuthException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import jakarta.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;


import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

@Service
@Slf4j
public class Gateway {

    @Autowired
    private GatewayMapper gatewayMapper;

    @Autowired(required = false)
    private ConnectorSecurityConfig connectorSecurityConfig;

    @Autowired
   @Qualifier("defaultRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private SoapClient soapClient;

    @Value("${gateway.host}")
    private String GATEWAY_HOST;

    @Autowired
    private WUExceptionConfig exceptionConfig;

    @Autowired
    RestTemplateConfig restTemplateConfig;

    // fetch customer details by UMN
    @LoggingAnnotation
    public com.wu.brwallet.customer.profile.model.response.gateway.SoapEnvelope getTxnDetails(String umn, String sessionId, String referenceNo, TransactionData incomingRequestDetails) throws AuthException, ExecutionException, JAXBException {
        if(ObjectUtils.isEmpty(referenceNo))
            referenceNo= UUID.randomUUID().toString();

        com.wu.brwallet.customer.profile.model.response.gateway.SoapEnvelope dasResponse = null;

        XRSIDasRequest dasRequest = gatewayMapper.txnHistory(umn, sessionId, referenceNo);
        SoapEnvelope soapEnvelope=new SoapEnvelope();
        SoapBody soapBody =new SoapBody();
        soapBody.setGatewayRequest(dasRequest);
        soapEnvelope.setBody(soapBody);

        var httpHeaders = getHttpHeaders(incomingRequestDetails);

        try {
            //convert request to xml
            String xmlRequest = soapClient.marshalTOXml(soapEnvelope);
            var request = new HttpEntity<String>(xmlRequest, httpHeaders);
        //    log.info("request sent to gateway das {}",request);
            String response = restTemplate.postForObject(GATEWAY_HOST, request, String.class);
        //    String response = restTemplate.postForObject(GATEWAY_VIP_PATH, request, String.class);
        //    log.info("response returned from gateway das {}",response);
             dasResponse = soapClient.unmarshalSoapResponse(response);

        } catch (JAXBException e) {
            log.error("error while marshaling xml");
        }
        catch (Exception e) {
            log.error("CUS_PROFILE2 getCustomerByUmnFromUCD()-error, exceptionTrace={}", e);
            throw exceptionConfig.prepareErrorCode(e,BusinessConstants.GATEWAY_TXN_UPSTREAM_SERVICE);
        }

       return dasResponse;
    }


    private HttpHeaders getHttpHeaders(TransactionData incomingRequestDetails) throws AuthException, ExecutionException {

        var httpHeaders = new HttpHeaders();
        httpHeaders.set("content-Type","text/xml");
        httpHeaders.set("Auth_token","1e419a7549e73b6562341354fd0e70cc360ae56411a61831ba14f0eecfa0b1adcc75114fb86f1474bd0add00b40d9e451a921b4ea0e7f5f3b789f0d6912b4777");
        httpHeaders.set("User_id","WUCOM");
        httpHeaders.set("Credential","test");
        httpHeaders.set("User-Agent","gateway");
        httpHeaders.set("x-wu-externalRefId",incomingRequestDetails.getExternalRefId());
        if(restTemplateConfig.isLocalEnv()){
            httpHeaders.set("x-api-key", connectorSecurityConfig.getConnectorXApiKey());
            httpHeaders.set("Authorization",connectorSecurityConfig.generateConnectorToken());
        }
        httpHeaders.set("x-wu-serviceid","GWTYCONN");

        return httpHeaders;

    }




}
