
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloud_pricing_enabled.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="cloud_pricing_enabled">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Y"/>
 *     <enumeration value="N"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "cloud_pricing_enabled")
@XmlEnum
public enum CloudPricingEnabled {

    Y,
    N;

    public String value() {
        return name();
    }

    public static CloudPricingEnabled fromValue(String v) {
        return valueOf(v);
    }

}
