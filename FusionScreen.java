
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fusion_screen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="fusion_screen">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="0"/>
 *     <maxLength value="2"/>
 *     <enumeration value="MP"/>
 *     <enumeration value="PL"/>
 *     <enumeration value="OV"/>
 *     <enumeration value="AV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "fusion_screen")
@XmlEnum
public enum FusionScreen {

    MP,
    PL,
    OV,
    AV;

    public String value() {
        return name();
    }

    public static FusionScreen fromValue(String v) {
        return valueOf(v);
    }

}
