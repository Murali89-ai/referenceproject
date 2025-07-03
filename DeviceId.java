
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for device_id.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="device_id">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="0"/>
 *     <maxLength value="2"/>
 *     <enumeration value="PC"/>
 *     <enumeration value="XP"/>
 *     <enumeration value="IP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "device_id")
@XmlEnum
public enum DeviceId {

    PC,
    XP,
    IP;

    public String value() {
        return name();
    }

    public static DeviceId fromValue(String v) {
        return valueOf(v);
    }

}
