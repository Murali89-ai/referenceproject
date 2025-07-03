
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_buffer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="channel_buffer">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="POS"/>
 *     <enumeration value="WEB"/>
 *     <enumeration value="KIOSK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "channel_buffer")
@XmlEnum
public enum ChannelBuffer {

    POS,
    WEB,
    KIOSK;

    public String value() {
        return name();
    }

    public static ChannelBuffer fromValue(String v) {
        return valueOf(v);
    }

}
