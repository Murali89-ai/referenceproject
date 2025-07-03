
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wcr_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="wcr_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WILL CALL"/>
 *     <enumeration value="RETRIEVAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "wcr_type")
@XmlEnum
public enum WcrType {

    @XmlEnumValue("WILL CALL")
    WILL_CALL("WILL CALL"),
    RETRIEVAL("RETRIEVAL");
    private final String value;

    WcrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WcrType fromValue(String v) {
        for (WcrType c: WcrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
