
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receiver_search_key.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="receiver_search_key">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="D2B"/>
 *     <enumeration value="All"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "receiver_search_key")
@XmlEnum
public enum ReceiverSearchKey {

    @XmlEnumValue("D2B")
    D_2_B("D2B"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ReceiverSearchKey(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverSearchKey fromValue(String v) {
        for (ReceiverSearchKey c: ReceiverSearchKey.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
