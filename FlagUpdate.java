
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flag_update.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="flag_update">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="U"/>
 *     <enumeration value="D"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "flag_update")
@XmlEnum
public enum FlagUpdate {

    A,
    U,
    D;

    public String value() {
        return name();
    }

    public static FlagUpdate fromValue(String v) {
        return valueOf(v);
    }

}
