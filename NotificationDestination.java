
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notification_destination.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="notification_destination">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECORDING_PARTNER"/>
 *     <enumeration value="PAYING_PARTNER"/>
 *     <enumeration value="SENDER_MOBILE"/>
 *     <enumeration value="RECEIVER_MOBILE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "notification_destination")
@XmlEnum
public enum NotificationDestination {

    RECORDING_PARTNER,
    PAYING_PARTNER,
    SENDER_MOBILE,
    RECEIVER_MOBILE;

    public String value() {
        return name();
    }

    public static NotificationDestination fromValue(String v) {
        return valueOf(v);
    }

}
