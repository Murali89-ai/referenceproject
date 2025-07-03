
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for card_update_indicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="card_update_indicator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EnrollWuCard"/>
 *     <enumeration value="DeleteWuCard"/>
 *     <enumeration value="UpdateWuCard"/>
 *     <enumeration value="LookUp"/>
 *     <enumeration value="AddAssociate"/>
 *     <enumeration value="UpdateAssociate"/>
 *     <enumeration value="Store"/>
 *     <enumeration value="UpdateSenderAssociate"/>
 *     <enumeration value="None"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "card_update_indicator")
@XmlEnum
public enum CardUpdateIndicator {

    @XmlEnumValue("EnrollWuCard")
    ENROLL_WU_CARD("EnrollWuCard"),
    @XmlEnumValue("DeleteWuCard")
    DELETE_WU_CARD("DeleteWuCard"),
    @XmlEnumValue("UpdateWuCard")
    UPDATE_WU_CARD("UpdateWuCard"),
    @XmlEnumValue("LookUp")
    LOOK_UP("LookUp"),
    @XmlEnumValue("AddAssociate")
    ADD_ASSOCIATE("AddAssociate"),
    @XmlEnumValue("UpdateAssociate")
    UPDATE_ASSOCIATE("UpdateAssociate"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("UpdateSenderAssociate")
    UPDATE_SENDER_ASSOCIATE("UpdateSenderAssociate"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    CardUpdateIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardUpdateIndicator fromValue(String v) {
        for (CardUpdateIndicator c: CardUpdateIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
