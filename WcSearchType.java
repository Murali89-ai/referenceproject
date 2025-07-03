
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wc_search_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="wc_search_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="mtcn"/>
 *     <enumeration value="sender"/>
 *     <enumeration value="receiver"/>
 *     <enumeration value="default"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "wc_search_type")
@XmlEnum
public enum WcSearchType {

    @XmlEnumValue("mtcn")
    MTCN("mtcn"),
    @XmlEnumValue("sender")
    SENDER("sender"),
    @XmlEnumValue("receiver")
    RECEIVER("receiver"),
    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    WcSearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WcSearchType fromValue(String v) {
        for (WcSearchType c: WcSearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
