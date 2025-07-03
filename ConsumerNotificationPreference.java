
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consumer_notification_preference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="consumer_notification_preference">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONE"/>
 *     <enumeration value="EMAIL"/>
 *     <enumeration value="AUTOMATED_PHONE_CALL"/>
 *     <enumeration value="SMS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "consumer_notification_preference")
@XmlEnum
public enum ConsumerNotificationPreference {

    NONE,
    EMAIL,
    AUTOMATED_PHONE_CALL,
    SMS;

    public String value() {
        return name();
    }

    public static ConsumerNotificationPreference fromValue(String v) {
        return valueOf(v);
    }

}
