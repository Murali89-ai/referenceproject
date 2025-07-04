package com.wu.brwallet.customer.profile.model.response.gateway;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "Envelope", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapEnvelope {

    @XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private SoapBody body;
}
