
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Refund_flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Refund_flag">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRUE"/>
 *     <enumeration value="FALSE"/>
 *     <enumeration value="Y"/>
 *     <enumeration value="N"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Refund_flag")
@XmlEnum
public enum RefundFlag {

    TRUE,
    FALSE,
    Y,
    N;

    public String value() {
        return name();
    }

    public static RefundFlag fromValue(String v) {
        return valueOf(v);
    }

}
