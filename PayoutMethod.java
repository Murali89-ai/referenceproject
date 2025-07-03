
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payout_method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="payout_method">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="MOBILE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "payout_method")
@XmlEnum
public enum PayoutMethod {

    CASH,
    MOBILE;

    public String value() {
        return name();
    }

    public static PayoutMethod fromValue(String v) {
        return valueOf(v);
    }

}
