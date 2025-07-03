
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Other_Relationship_to_Receiver_Sender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Other_Relationship_to_Receiver_Sender">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <minLength value="0"/>
 *     <maxLength value="50"/>
 *     <enumeration value="Spouse"/>
 *     <enumeration value="Father"/>
 *     <enumeration value="Mother"/>
 *     <enumeration value="Brother"/>
 *     <enumeration value="Sister"/>
 *     <enumeration value="Son"/>
 *     <enumeration value="Daughter"/>
 *     <enumeration value="Business Partner"/>
 *     <enumeration value="Supplier"/>
 *     <enumeration value="Employee"/>
 *     <enumeration value="Friend"/>
 *     <enumeration value="Others"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Other_Relationship_to_Receiver_Sender")
@XmlEnum
public enum OtherRelationshipToReceiverSender {

    @XmlEnumValue("Spouse")
    SPOUSE("Spouse"),
    @XmlEnumValue("Father")
    FATHER("Father"),
    @XmlEnumValue("Mother")
    MOTHER("Mother"),
    @XmlEnumValue("Brother")
    BROTHER("Brother"),
    @XmlEnumValue("Sister")
    SISTER("Sister"),
    @XmlEnumValue("Son")
    SON("Son"),
    @XmlEnumValue("Daughter")
    DAUGHTER("Daughter"),
    @XmlEnumValue("Business Partner")
    BUSINESS_PARTNER("Business Partner"),
    @XmlEnumValue("Supplier")
    SUPPLIER("Supplier"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Friend")
    FRIEND("Friend"),
    @XmlEnumValue("Others")
    OTHERS("Others");
    private final String value;

    OtherRelationshipToReceiverSender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherRelationshipToReceiverSender fromValue(String v) {
        for (OtherRelationshipToReceiverSender c: OtherRelationshipToReceiverSender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
