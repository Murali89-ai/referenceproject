
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for name_prefix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="name_prefix">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Mr."/>
 *     <enumeration value="Ms."/>
 *     <enumeration value="Mrs."/>
 *     <enumeration value="Miss"/>
 *     <enumeration value="Dr."/>
 *     <enumeration value="Professor"/>
 *     <enumeration value="Sir"/>
 *     <enumeration value="Madam"/>
 *     <enumeration value="M"/>
 *     <enumeration value="S"/>
 *     <enumeration value="F"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "name_prefix")
@XmlEnum
public enum NamePrefix {

    @XmlEnumValue("Mr.")
    MR("Mr."),
    @XmlEnumValue("Ms.")
    MS("Ms."),
    @XmlEnumValue("Mrs.")
    MRS("Mrs."),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Dr.")
    DR("Dr."),
    @XmlEnumValue("Professor")
    PROFESSOR("Professor"),
    @XmlEnumValue("Sir")
    SIR("Sir"),
    @XmlEnumValue("Madam")
    MADAM("Madam"),
    M("M"),
    S("S"),
    F("F");
    private final String value;

    NamePrefix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamePrefix fromValue(String v) {
        for (NamePrefix c: NamePrefix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
