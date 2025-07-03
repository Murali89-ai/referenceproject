
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yes_no.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="yes_no">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Y"/>
 *     <enumeration value="N"/>
 *     <enumeration value="true"/>
 *     <enumeration value="false"/>
 *     <enumeration value="0"/>
 *     <enumeration value="1"/>
 *     <enumeration value=""/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "yes_no")
@XmlEnum
public enum YesNo {

    Y("Y"),
    N("N"),
    @XmlEnumValue("true")
    TRUE("true"),
    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("0")
    ZERO("0"),
    @XmlEnumValue("1")
    ONE("1"),
    @XmlEnumValue("")
    EMPTY("");
    private final String value;

    YesNo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNo fromValue(String v) {
        for (YesNo c: YesNo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
