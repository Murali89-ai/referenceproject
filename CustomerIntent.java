
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer_intent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="customer_intent">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Y"/>
 *     <enumeration value="P"/>
 *     <enumeration value="R"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "customer_intent")
@XmlEnum
public enum CustomerIntent {

    Y,
    P,
    R;

    public String value() {
        return name();
    }

    public static CustomerIntent fromValue(String v) {
        return valueOf(v);
    }

}
