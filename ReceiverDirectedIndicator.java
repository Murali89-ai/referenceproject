
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverDirectedIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReceiverDirectedIndicator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Y"/>
 *     <enumeration value="N"/>
 *     <enumeration value="SD"/>
 *     <enumeration value="SR"/>
 *     <enumeration value="RR"/>
 *     <enumeration value="P"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReceiverDirectedIndicator")
@XmlEnum
public enum ReceiverDirectedIndicator {

    Y,
    N,
    SD,
    SR,
    RR,
    P;

    public String value() {
        return name();
    }

    public static ReceiverDirectedIndicator fromValue(String v) {
        return valueOf(v);
    }

}
