
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reminder_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="reminder_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIRST_REMINDER"/>
 *     <enumeration value="SECOND_REMINDER"/>
 *     <enumeration value="THIRD_REMINDER"/>
 *     <enumeration value="FOURTH_REMINDER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "reminder_type")
@XmlEnum
public enum ReminderType {

    FIRST_REMINDER,
    SECOND_REMINDER,
    THIRD_REMINDER,
    FOURTH_REMINDER;

    public String value() {
        return name();
    }

    public static ReminderType fromValue(String v) {
        return valueOf(v);
    }

}
