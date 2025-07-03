
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for info_lookup_key.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="info_lookup_key">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="company_name"/>
 *     <enumeration value="code_city"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "info_lookup_key")
@XmlEnum
public enum InfoLookupKey {

    @XmlEnumValue("company_name")
    COMPANY_NAME("company_name"),
    @XmlEnumValue("code_city")
    CODE_CITY("code_city");
    private final String value;

    InfoLookupKey(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfoLookupKey fromValue(String v) {
        for (InfoLookupKey c: InfoLookupKey.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
