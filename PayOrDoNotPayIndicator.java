
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pay_or_do_not_pay_indicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="pay_or_do_not_pay_indicator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="0"/>
 *     <maxLength value="11"/>
 *     <enumeration value="PAY"/>
 *     <enumeration value="DO NOT PAY"/>
 *     <enumeration value="P"/>
 *     <enumeration value="D"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "pay_or_do_not_pay_indicator")
@XmlEnum
public enum PayOrDoNotPayIndicator {

    PAY("PAY"),
    @XmlEnumValue("DO NOT PAY")
    DO_NOT_PAY("DO NOT PAY"),
    P("P"),
    D("D");
    private final String value;

    PayOrDoNotPayIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayOrDoNotPayIndicator fromValue(String v) {
        for (PayOrDoNotPayIndicator c: PayOrDoNotPayIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
