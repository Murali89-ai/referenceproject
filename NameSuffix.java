
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for name_suffix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="name_suffix">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Jr."/>
 *     <enumeration value="Sr."/>
 *     <enumeration value="I"/>
 *     <enumeration value="II"/>
 *     <enumeration value="III"/>
 *     <enumeration value="Esq."/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "name_suffix")
@XmlEnum
public enum NameSuffix {

    @XmlEnumValue("Jr.")
    JR("Jr."),
    @XmlEnumValue("Sr.")
    SR("Sr."),
    I("I"),
    II("II"),
    III("III"),
    @XmlEnumValue("Esq.")
    ESQ("Esq.");
    private final String value;

    NameSuffix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameSuffix fromValue(String v) {
        for (NameSuffix c: NameSuffix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
