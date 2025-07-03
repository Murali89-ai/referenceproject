
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employment_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="employment_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Employed"/>
 *     <enumeration value="Self Employed"/>
 *     <enumeration value="Unemployed"/>
 *     <enumeration value="Retired"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "employment_type")
@XmlEnum
public enum EmploymentType {

    @XmlEnumValue("Employed")
    EMPLOYED("Employed"),
    @XmlEnumValue("Self Employed")
    SELF_EMPLOYED("Self Employed"),
    @XmlEnumValue("Unemployed")
    UNEMPLOYED("Unemployed"),
    @XmlEnumValue("Retired")
    RETIRED("Retired");
    private final String value;

    EmploymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentType fromValue(String v) {
        for (EmploymentType c: EmploymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
