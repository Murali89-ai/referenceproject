
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paid_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="paid_status">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAID"/>
 *     <enumeration value="NOT PAID"/>
 *     <enumeration value="ON HOLD"/>
 *     <enumeration value="NOT AVAILABLE"/>
 *     <enumeration value="AVAILABLE"/>
 *     <enumeration value="PAID_OTHER"/>
 *     <enumeration value="QUEUED"/>
 *     <enumeration value="CANCELLED"/>
 *     <enumeration value="SUSPENDED"/>
 *     <enumeration value="UNKNOWN"/>
 *     <enumeration value="PURGED"/>
 *     <enumeration value="REFUND"/>
 *     <enumeration value="QQC1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "paid_status")
@XmlEnum
public enum PaidStatus {

    PAID("PAID"),
    @XmlEnumValue("NOT PAID")
    NOT_PAID("NOT PAID"),
    @XmlEnumValue("ON HOLD")
    ON_HOLD("ON HOLD"),
    @XmlEnumValue("NOT AVAILABLE")
    NOT_AVAILABLE("NOT AVAILABLE"),
    AVAILABLE("AVAILABLE"),
    PAID_OTHER("PAID_OTHER"),
    QUEUED("QUEUED"),
    CANCELLED("CANCELLED"),
    SUSPENDED("SUSPENDED"),
    UNKNOWN("UNKNOWN"),
    PURGED("PURGED"),
    REFUND("REFUND"),
    @XmlEnumValue("QQC1")
    QQC_1("QQC1");
    private final String value;

    PaidStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaidStatus fromValue(String v) {
        for (PaidStatus c: PaidStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
