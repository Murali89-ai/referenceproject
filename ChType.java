
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ch_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ch_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WEB"/>
 *     <enumeration value="IVR"/>
 *     <enumeration value="CSC"/>
 *     <enumeration value="AGT"/>
 *     <enumeration value="SMARTPHONE"/>
 *     <enumeration value="STAGEANDPAY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ch_type")
@XmlEnum
public enum ChType {

    WEB,
    IVR,
    CSC,
    AGT,
    SMARTPHONE,
    STAGEANDPAY;

    public String value() {
        return name();
    }

    public static ChType fromValue(String v) {
        return valueOf(v);
    }

}
