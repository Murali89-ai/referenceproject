
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validate_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="validate_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PV"/>
 *     <enumeration value="DV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "validate_type")
@XmlEnum
public enum ValidateType {

    PV,
    DV;

    public String value() {
        return name();
    }

    public static ValidateType fromValue(String v) {
        return valueOf(v);
    }

}
