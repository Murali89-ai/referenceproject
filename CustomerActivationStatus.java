
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer_activation_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="customer_activation_status">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTIVE"/>
 *     <enumeration value="NOT_ACTIVE"/>
 *     <enumeration value="BLOCKED"/>
 *     <enumeration value="UNKNOWN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "customer_activation_status")
@XmlEnum
public enum CustomerActivationStatus {

    ACTIVE,
    NOT_ACTIVE,
    BLOCKED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CustomerActivationStatus fromValue(String v) {
        return valueOf(v);
    }

}
