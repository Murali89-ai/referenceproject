
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listing_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="listing_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Listed"/>
 *     <enumeration value="Not Listed"/>
 *     <enumeration value="UnPublished"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "listing_type")
@XmlEnum
public enum ListingType {

    @XmlEnumValue("Listed")
    LISTED("Listed"),
    @XmlEnumValue("Not Listed")
    NOT_LISTED("Not Listed"),
    @XmlEnumValue("UnPublished")
    UN_PUBLISHED("UnPublished");
    private final String value;

    ListingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingType fromValue(String v) {
        for (ListingType c: ListingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
