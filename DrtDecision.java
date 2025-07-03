
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for drt_decision.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="drt_decision">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OK"/>
 *     <enumeration value="NOK"/>
 *     <enumeration value="PEN"/>
 *     <enumeration value="NA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "drt_decision")
@XmlEnum
public enum DrtDecision {

    OK,
    NOK,
    PEN,
    NA;

    public String value() {
        return name();
    }

    public static DrtDecision fromValue(String v) {
        return valueOf(v);
    }

}
