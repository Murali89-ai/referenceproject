
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact_info_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="contact_info_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIMARY"/>
 *     <enumeration value="INSTANT NOTIFICATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "contact_info_type")
@XmlEnum
public enum ContactInfoType {

    PRIMARY("PRIMARY"),
    @XmlEnumValue("INSTANT NOTIFICATION")
    INSTANT_NOTIFICATION("INSTANT NOTIFICATION");
    private final String value;

    ContactInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactInfoType fromValue(String v) {
        for (ContactInfoType c: ContactInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
