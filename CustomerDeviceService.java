package com.wu.brwallet.customer.profile.service.device;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.adaptor.UCD;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.helper.UCDHelper;
import com.wu.brwallet.customer.profile.mapper.signon.BusinessEventsUcdMapper;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerDeviceAndAudit;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupResponse;
import com.wu.brwallet.customer.profile.model.request.registerDevice.RegisterDeviceRequest;
import com.wu.brwallet.customer.profile.model.request.updateDevice.UpdateDeviceRequest;
import com.wu.brwallet.customer.profile.model.response.registerDevice.RegisterDeviceResponse;
import com.wu.brwallet.customer.profile.model.response.updateDevice.UpdateDeviceResponse;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.era.library.auth.AuthException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class CustomerDeviceService {

    @Autowired
    private WUServiceExceptionUtils wuServiceExceptionUtils;

    @Autowired
    private UCD ucd;

    @Autowired
    private UCDHelper ucdHelper;

    @Autowired
    private BusinessEventService businessEventService;

    @Autowired
    private BusinessEventsUcdMapper businessEventsUcdMapper;


    @LoggingAnnotation
    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request, TransactionData incomingRequestDetails) throws AuthException, ExecutionException {
        CustomerLookupResponse customerLookupResponse = ucd.getCustomerDetails(request.getUmn(), incomingRequestDetails);
        BusinessEventData businessEventUcdData = businessEventsUcdMapper.getBusinessEventUcdRequest(request.getUmn());
        businessEventService.sendEvent(BusinessConstants.REGISTER_DEVICE_BUSINESS_EVENT_CODE, businessEventUcdData, incomingRequestDetails);

        List<CustomerDeviceAndAudit> deviceList = ucdHelper.getDeviceList(customerLookupResponse);
        String accountTypeId = ucdHelper.findWalletAccountTypeId(customerLookupResponse, 1);

        OffsetDateTime timestamp = getCurrentTimestamp();
        OffsetDateTime resultDateTime = CollectionUtils.isEmpty(deviceList) ? timestamp : timestamp.plus(Duration.ofDays(1));

        ucd.addDevice(request, accountTypeId,resultDateTime, incomingRequestDetails);
        businessEventUcdData = businessEventsUcdMapper.getBusinessEventUcdUpdateRequest(request.getUmn());
        businessEventService.sendEvent(BusinessConstants.REGISTER_DEVICE_BUSINESS_EVENT_CODE, businessEventUcdData, incomingRequestDetails);

        return RegisterDeviceResponse.builder()
                .umn(request.getUmn())
                .deviceId(request.getDeviceId())
                .deviceName(request.getDeviceName())
                .deviceModel(request.getDeviceModel())
                .deviceOs(request.getDeviceOs())
                .status(RegisterDeviceResponse.StatusEnum.valueOf("A"))
                .startDate(String.valueOf(resultDateTime))
                .build();

    }

    private OffsetDateTime getCurrentTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss.SSS-hh:mm");
        return OffsetDateTime.parse(LocalDateTime.now().format(formatter));
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest updateDeviceRequest, TransactionData incomingRequestDetails) {

        ucd.updateDevice(updateDeviceRequest, incomingRequestDetails);
        BusinessEventData businessEventUcdData = businessEventsUcdMapper.getBusinessEventUcdUpdateRequest(updateDeviceRequest.getUmn());
        businessEventService.sendEvent(BusinessConstants.UPDATE_DEVICE_BUSINESS_EVENT_CODE, businessEventUcdData, incomingRequestDetails);


        return UpdateDeviceResponse.builder()
                .umn(updateDeviceRequest.getUmn())
                .deviceId(updateDeviceRequest.getDeviceId())
                .status(UpdateDeviceResponse.StatusEnum.valueOf(updateDeviceRequest.getStatus().getValue()))
                .startDate(updateDeviceRequest.getStartDate())
                .endDate(updateDeviceRequest.getStatus().getValue().equals("I")? String.valueOf(getCurrentTimestamp()) :null)
                .build();
    }
}
