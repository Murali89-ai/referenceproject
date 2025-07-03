
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="transaction_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value=""/>
 *     <enumeration value="WMN"/>
 *     <enumeration value="MOD"/>
 *     <enumeration value="QQC"/>
 *     <enumeration value="WMF"/>
 *     <enumeration value="EPY"/>
 *     <enumeration value="CCM"/>
 *     <enumeration value="CCMT"/>
 *     <enumeration value="ENR"/>
 *     <enumeration value="ERN"/>
 *     <enumeration value="CCQ"/>
 *     <enumeration value="CMN"/>
 *     <enumeration value="CMF"/>
 *     <enumeration value="CMW"/>
 *     <enumeration value="AMO"/>
 *     <enumeration value="TMO"/>
 *     <enumeration value="CCW"/>
 *     <enumeration value="GEN"/>
 *     <enumeration value="NTF"/>
 *     <enumeration value="MAL"/>
 *     <enumeration value="TEL"/>
 *     <enumeration value="OVL"/>
 *     <enumeration value="SEC"/>
 *     <enumeration value="FAC"/>
 *     <enumeration value="WMO"/>
 *     <enumeration value="CMO"/>
 *     <enumeration value="ACM"/>
 *     <enumeration value="PAY"/>
 *     <enumeration value="CSC"/>
 *     <enumeration value="TRN"/>
 *     <enumeration value="EBM"/>
 *     <enumeration value="CCS"/>
 *     <enumeration value="PSA"/>
 *     <enumeration value="PSU"/>
 *     <enumeration value="OBP"/>
 *     <enumeration value="PRA"/>
 *     <enumeration value="PRM"/>
 *     <enumeration value="PRU"/>
 *     <enumeration value="CNV"/>
 *     <enumeration value="TYP"/>
 *     <enumeration value="PSD"/>
 *     <enumeration value="WMB"/>
 *     <enumeration value="IAMT"/>
 *     <enumeration value="TRMT"/>
 *     <enumeration value="EBMT"/>
 *     <enumeration value="PLMT"/>
 *     <enumeration value="CCF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "transaction_type")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("")
    EMPTY(""),
    WMN("WMN"),
    MOD("MOD"),
    QQC("QQC"),
    WMF("WMF"),
    EPY("EPY"),
    CCM("CCM"),
    CCMT("CCMT"),
    ENR("ENR"),
    ERN("ERN"),
    CCQ("CCQ"),
    CMN("CMN"),
    CMF("CMF"),
    CMW("CMW"),
    AMO("AMO"),
    TMO("TMO"),
    CCW("CCW"),
    GEN("GEN"),
    NTF("NTF"),
    MAL("MAL"),
    TEL("TEL"),
    OVL("OVL"),
    SEC("SEC"),
    FAC("FAC"),
    WMO("WMO"),
    CMO("CMO"),
    ACM("ACM"),
    PAY("PAY"),
    CSC("CSC"),
    TRN("TRN"),
    EBM("EBM"),
    CCS("CCS"),
    PSA("PSA"),
    PSU("PSU"),
    OBP("OBP"),
    PRA("PRA"),
    PRM("PRM"),
    PRU("PRU"),
    CNV("CNV"),
    TYP("TYP"),
    PSD("PSD"),
    WMB("WMB"),
    IAMT("IAMT"),
    TRMT("TRMT"),
    EBMT("EBMT"),
    PLMT("PLMT"),
    CCF("CCF");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
