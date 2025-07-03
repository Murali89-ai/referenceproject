
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bypass_limitcheck.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="bypass_limitcheck">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Y"/>
 *     <enumeration value="N"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "bypass_limitcheck")
@XmlEnum
public enum BypassLimitcheck {

    Y,
    N;

    public String value() {
        return name();
    }

    public static BypassLimitcheck fromValue(String v) {
        return valueOf(v);
    }

}
