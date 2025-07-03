
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentcsc_flags.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="agentcsc_flags">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="0"/>
 *     <maxLength value="16"/>
 *     <enumeration value="REFUND"/>
 *     <enumeration value="CANCEL_SEND"/>
 *     <enumeration value="CANCEL_PAID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "agentcsc_flags")
@XmlEnum
public enum AgentcscFlags {

    REFUND,
    CANCEL_SEND,
    CANCEL_PAID;

    public String value() {
        return name();
    }

    public static AgentcscFlags fromValue(String v) {
        return valueOf(v);
    }

}
