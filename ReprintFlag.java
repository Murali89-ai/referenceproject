
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reprint_flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="reprint_flag">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="rep"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "reprint_flag")
@XmlEnum
public enum ReprintFlag {

    @XmlEnumValue("rep")
    REP("rep");
    private final String value;

    ReprintFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReprintFlag fromValue(String v) {
        for (ReprintFlag c: ReprintFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
