package com.wu.brwallet.customer.profile.mapper.signon;

import com.wu.brwallet.customer.profile.model.common.gateway.xrsi.*;
import org.mapstruct.Mapper;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Mapper(componentModel = "spring",imports = {OffsetDateTime.class, DateTimeFormatter.class, UUID.class})
public interface GatewayMapper {

    default XRSIDasRequest txnHistory(String umn, String sessionId, String referenceNo) {
        XRSIDasRequest request = new XRSIDasRequest();
        request.setChannel(new Channel());
        request.getChannel().setName("WUDIGITAL");
        request.getChannel().setType(ChannelType.valueOf("WGD"));
        request.getChannel().setVersion("9711");
        request.setSecurity(new Security());
        request.getSecurity().setSession(new Session());
        request.getSecurity().getSession().setId(sessionId);
        request.setForeignRemoteSystem(new ForeignRemoteSystem());
        request.getForeignRemoteSystem().setIdentifier("WGR3MT9510P");
        request.getForeignRemoteSystem().setReferenceNo(referenceNo);
        request.getForeignRemoteSystem().setCounterId("MT951WBP001A");
        request.getForeignRemoteSystem().setOperatorId(umn);
        request.setDASQueryClientID("H2H");
        request.setDASQueryName("GetTransactionHistory");
        request.setDASQueryAgentAccountNumber("APH005229");
        request.setDASReqFilters(new DASReqFilters());
        request.getDASReqFilters().setDASQueryFilter1(umn);
        request.getDASReqFilters().setDASQueryFilter2("MAX");
        request.getDASReqFilters().setDASQueryFilter3("DS,MOBILE,A2A,CURR,BP,MYWU,IBP");

        return request;

    }




}
