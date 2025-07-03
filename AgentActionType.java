
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_action_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="agent_action_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Recorded"/>
 *     <enumeration value="Paid"/>
 *     <enumeration value="Retrived"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "agent_action_type")
@XmlEnum
public enum AgentActionType {

    @XmlEnumValue("Recorded")
    RECORDED("Recorded"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Retrived")
    RETRIVED("Retrived");
    private final String value;

    AgentActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentActionType fromValue(String v) {
        for (AgentActionType c: AgentActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
