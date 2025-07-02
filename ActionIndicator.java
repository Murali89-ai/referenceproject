
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for action_indicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="action_indicator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REGULATORY_ENABLED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "action_indicator")
@XmlEnum
public enum ActionIndicator {

    REGULATORY_ENABLED;

    public String value() {
        return name();
    }

    public static ActionIndicator fromValue(String v) {
        return valueOf(v);
    }

}
