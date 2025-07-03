
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notification_event.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="notification_event">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MONEY_AVAILABLE"/>
 *     <enumeration value="MONEY_PAID"/>
 *     <enumeration value="CASH_IN_ACCEPTED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "notification_event")
@XmlEnum
public enum NotificationEvent {

    MONEY_AVAILABLE,
    MONEY_PAID,
    CASH_IN_ACCEPTED;

    public String value() {
        return name();
    }

    public static NotificationEvent fromValue(String v) {
        return valueOf(v);
    }

}
