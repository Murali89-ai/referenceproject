package com.wu.brwallet.customer.profile.model.response.gateway;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapFault {

    @XmlElement(name = "faultcode")
    private String faultCode;

    @XmlElement(name = "faultstring")
    private String faultString;

    @XmlElement(name = "faultactor")
    private String faultActor;

    @XmlElement(name = "detail")
    private Detail detail;
}
