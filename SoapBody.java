package com.wu.brwallet.customer.profile.model.request.gateway;

import com.wu.brwallet.customer.profile.model.common.gateway.xrsi.XRSIDasRequest;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapBody {
    @XmlElement(name = "h2h-das-request", namespace = "http://www.westernunion.com/schema/xrsi")
   private XRSIDasRequest gatewayRequest;


}
