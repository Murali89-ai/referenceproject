
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_phone_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="mobile_phone_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HOME"/>
 *     <enumeration value="WORK"/>
 *     <enumeration value="MOBILE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "mobile_phone_type")
@XmlEnum
public enum MobilePhoneType {

    HOME,
    WORK,
    MOBILE;

    public String value() {
        return name();
    }

    public static MobilePhoneType fromValue(String v) {
        return valueOf(v);
    }

}
