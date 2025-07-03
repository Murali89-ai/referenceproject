
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="product">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RETAIL"/>
 *     <enumeration value="FSS"/>
 *     <enumeration value="KIOSK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "product")
@XmlEnum
public enum Product {

    RETAIL,
    FSS,
    KIOSK;

    public String value() {
        return name();
    }

    public static Product fromValue(String v) {
        return valueOf(v);
    }

}
