
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_customer_identity_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="channel_customer_identity_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MOBILE_ACCOUNT"/>
 *     <enumeration value="BANK_ACCOUNT"/>
 *     <enumeration value="PREPAID_CARD_NUMBER"/>
 *     <enumeration value="EMAIL_ADDRESS"/>
 *     <enumeration value="LOYALTY_CARD_NUMBER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "channel_customer_identity_type")
@XmlEnum
public enum ChannelCustomerIdentityType {

    MOBILE_ACCOUNT,
    BANK_ACCOUNT,
    PREPAID_CARD_NUMBER,
    EMAIL_ADDRESS,
    LOYALTY_CARD_NUMBER;

    public String value() {
        return name();
    }

    public static ChannelCustomerIdentityType fromValue(String v) {
        return valueOf(v);
    }

}
