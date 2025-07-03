
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preferred_notification_method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="preferred_notification_method">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONE"/>
 *     <enumeration value="PHONE"/>
 *     <enumeration value="MOBILE_PHONE"/>
 *     <enumeration value="MOBILE_SMS"/>
 *     <enumeration value="EMAIL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "preferred_notification_method")
@XmlEnum
public enum PreferredNotificationMethod {

    NONE,
    PHONE,
    MOBILE_PHONE,
    MOBILE_SMS,
    EMAIL;

    public String value() {
        return name();
    }

    public static PreferredNotificationMethod fromValue(String v) {
        return valueOf(v);
    }

}
