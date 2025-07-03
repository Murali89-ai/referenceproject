
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_gwp_gbs_device_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="mobile_gwp_gbs_device_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATM"/>
 *     <enumeration value="WEB"/>
 *     <enumeration value="AGENT"/>
 *     <enumeration value="CSR"/>
 *     <enumeration value="IVR"/>
 *     <enumeration value="TMSI"/>
 *     <enumeration value="IMSI"/>
 *     <enumeration value="MSISDN"/>
 *     <enumeration value="ESN"/>
 *     <enumeration value="IMEI"/>
 *     <enumeration value="MEID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "mobile_gwp_gbs_device_type")
@XmlEnum
public enum MobileGwpGbsDeviceType {

    ATM,
    WEB,
    AGENT,
    CSR,
    IVR,
    TMSI,
    IMSI,
    MSISDN,
    ESN,
    IMEI,
    MEID;

    public String value() {
        return name();
    }

    public static MobileGwpGbsDeviceType fromValue(String v) {
        return valueOf(v);
    }

}
