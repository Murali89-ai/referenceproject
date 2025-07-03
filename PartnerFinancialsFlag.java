
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_financials_flag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="partner_financials_flag">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Y"/>
 *     <enumeration value="N"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "partner_financials_flag")
@XmlEnum
public enum PartnerFinancialsFlag {

    Y,
    N;

    public String value() {
        return name();
    }

    public static PartnerFinancialsFlag fromValue(String v) {
        return valueOf(v);
    }

}
