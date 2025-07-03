
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for id_document_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="id_document_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PASSPORT"/>
 *     <enumeration value="DRIVER_LICENSE"/>
 *     <enumeration value="NATIONAL_ID"/>
 *     <enumeration value="ALIEN_ID"/>
 *     <enumeration value="STATE_ID"/>
 *     <enumeration value="SSN"/>
 *     <enumeration value="PRC_ID"/>
 *     <enumeration value="IBP_ID"/>
 *     <enumeration value="NBI_CLEARANCE"/>
 *     <enumeration value="POLICE_CLEARANCE_CERTIFICATE"/>
 *     <enumeration value="POSTAL_ID"/>
 *     <enumeration value="VOTERS_ID"/>
 *     <enumeration value="GSIS_E_CARD"/>
 *     <enumeration value="SSS_CARD"/>
 *     <enumeration value="SENIOR_CITIZEN_CARD"/>
 *     <enumeration value="OWWA_ID"/>
 *     <enumeration value="OFW_ID"/>
 *     <enumeration value="SEAMANS_BOOK"/>
 *     <enumeration value="FIRE_ARM_LICENSE"/>
 *     <enumeration value="EMPLOYMENT_ID"/>
 *     <enumeration value="STUDENT_ID"/>
 *     <enumeration value="OTHER_GOVERNMENT_ID"/>
 *     <enumeration value="OTHER_ID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "id_document_type")
@XmlEnum
public enum IdDocumentType {

    PASSPORT,
    DRIVER_LICENSE,
    NATIONAL_ID,
    ALIEN_ID,
    STATE_ID,
    SSN,
    PRC_ID,
    IBP_ID,
    NBI_CLEARANCE,
    POLICE_CLEARANCE_CERTIFICATE,
    POSTAL_ID,
    VOTERS_ID,
    GSIS_E_CARD,
    SSS_CARD,
    SENIOR_CITIZEN_CARD,
    OWWA_ID,
    OFW_ID,
    SEAMANS_BOOK,
    FIRE_ARM_LICENSE,
    EMPLOYMENT_ID,
    STUDENT_ID,
    OTHER_GOVERNMENT_ID,
    OTHER_ID;

    public String value() {
        return name();
    }

    public static IdDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
