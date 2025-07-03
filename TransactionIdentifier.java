
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIdentifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionIdentifier">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIGITAL"/>
 *     <enumeration value="RETAIL"/>
 *     <enumeration value="ABMT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionIdentifier")
@XmlEnum
public enum TransactionIdentifier {

    DIGITAL,
    RETAIL,
    ABMT;

    public String value() {
        return name();
    }

    public static TransactionIdentifier fromValue(String v) {
        return valueOf(v);
    }

}
