
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person_entity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="person_entity">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="P"/>
 *     <enumeration value="E"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "person_entity")
@XmlEnum
public enum PersonEntity {

    P,
    E;

    public String value() {
        return name();
    }

    public static PersonEntity fromValue(String v) {
        return valueOf(v);
    }

}
