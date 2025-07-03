
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for name_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="name_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="C"/>
 *     <enumeration value="D"/>
 *     <enumeration value="M"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "name_type")
@XmlEnum
public enum NameType {


    /**
     * Comany Name Type
     * 
     */
    C,

    /**
     * Domestic Name Type
     * 
     */
    D,

    /**
     * Mexican Name Type
     * 
     */
    M;

    public String value() {
        return name();
    }

    public static NameType fromValue(String v) {
        return valueOf(v);
    }

}
