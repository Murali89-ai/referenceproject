
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="agent_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Recording Agent"/>
 *     <enumeration value="Paying Agent"/>
 *     <enumeration value="Ancillary Information"/>
 *     <enumeration value="Sender"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "agent_type")
@XmlEnum
public enum AgentType {

    @XmlEnumValue("Recording Agent")
    RECORDING_AGENT("Recording Agent"),
    @XmlEnumValue("Paying Agent")
    PAYING_AGENT("Paying Agent"),
    @XmlEnumValue("Ancillary Information")
    ANCILLARY_INFORMATION("Ancillary Information"),
    @XmlEnumValue("Sender")
    SENDER("Sender");
    private final String value;

    AgentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentType fromValue(String v) {
        for (AgentType c: AgentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
