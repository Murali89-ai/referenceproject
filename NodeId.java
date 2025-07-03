
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for node_id.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="node_id">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="B"/>
 *     <enumeration value="C"/>
 *     <enumeration value="D"/>
 *     <enumeration value="E"/>
 *     <enumeration value="F"/>
 *     <enumeration value="G"/>
 *     <enumeration value="H"/>
 *     <enumeration value="I"/>
 *     <enumeration value="J"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "node_id")
@XmlEnum
public enum NodeId {

    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J;

    public String value() {
        return name();
    }

    public static NodeId fromValue(String v) {
        return valueOf(v);
    }

}
