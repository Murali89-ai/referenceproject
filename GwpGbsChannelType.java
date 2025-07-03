
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gwp_gbs_channel_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="gwp_gbs_channel_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GBS"/>
 *     <enumeration value="OHD"/>
 *     <enumeration value="MMT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "gwp_gbs_channel_type")
@XmlEnum
public enum GwpGbsChannelType {

    GBS,
    OHD,
    MMT;

    public String value() {
        return name();
    }

    public static GwpGbsChannelType fromValue(String v) {
        return valueOf(v);
    }

}
