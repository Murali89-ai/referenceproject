package com.wu.brwallet.customer.profile.model.request.initcusverify.customer;

import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment.PaymentDetails;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.receiver.Receiver;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender.Sender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInitiationRequest {
        private String customerUmn;
        private String sessionId;
        private String clientIp;
        private String mtcn;
        private String referenceId;
        private String terminalId;
        private String deviceAlias;
        private String loginAuthType;
        private String countryCode;
        private Sender sender;
        private Receiver receiver;
        private WuProduct wuProduct;
        private PaymentDetails paymentDetails;


    }
