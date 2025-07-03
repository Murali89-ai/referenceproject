
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gwp_gbs_device_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="gwp_gbs_device_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATM"/>
 *     <enumeration value="WEB"/>
 *     <enumeration value="AGENT"/>
 *     <enumeration value="CSR"/>
 *     <enumeration value="IVR"/>
 *     <enumeration value="MOBILE"/>
 *     <enumeration value="OTHER"/>
 *     <enumeration value="SYSTEM"/>
 *     <enumeration value="AGENTCSC"/>
 *     <enumeration value="RD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "gwp_gbs_device_type")
@XmlEnum
public enum GwpGbsDeviceType {

    ATM,
    WEB,
    AGENT,
    CSR,
    IVR,
    MOBILE,
    OTHER,
    SYSTEM,
    AGENTCSC,
    RD;

    public String value() {
        return name();
    }

    public static GwpGbsDeviceType fromValue(String v) {
        return valueOf(v);
    }

}
