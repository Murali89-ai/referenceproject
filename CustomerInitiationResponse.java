package com.wu.brwallet.customer.profile.model.response.initiateCusVerify;


import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.WuProduct;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment.PaymentDetails;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.receiver.Receiver;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender.Sender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInitiationResponse {
    private String customerUmn;
    private String sessionId;
    private String clientIp;
    private String wuCardNumber;
    private String customerStatus;
    private String terminalId;
    private String idVerificationStatus;
    private String isEligibleToTransact;
    private String referenceId;
    private String locale;
    private Sender sender;
    private Receiver receiver;
    private WuProduct wuProduct;
    private PaymentDetails paymentDetails;
}