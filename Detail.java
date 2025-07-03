package com.wu.brwallet.customer.profile.model.response.gateway;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Detail {

    @XmlElement(name = "error-reply", namespace = "http://www.westernunion.com/schema/xrsi")
    private ErrorReply errorReply;
}
