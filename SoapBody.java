package com.wu.brwallet.customer.profile.model.response.gateway;

import com.wu.brwallet.customer.profile.model.common.gateway.xrsi.XRSIDasReply;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapBody {
    @XmlElement(name = "h2h-das-reply", namespace = "http://www.westernunion.com/schema/xrsi")
    private XRSIDasReply xrsiDasReply;

    @XmlElement(name = "Fault", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private SoapFault fault;

}
