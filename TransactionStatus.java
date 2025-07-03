
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="transaction_status">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUCCESS"/>
 *     <enumeration value="FAILURE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "transaction_status")
@XmlEnum
public enum TransactionStatus {


    /**
     * Transaction successfully cancelled/suspended/resumed
     * 
     */
    SUCCESS,

    /**
     * Failure while canceling/suspending/resuming Transaction 
     * 
     */
    FAILURE;

    public String value() {
        return name();
    }

    public static TransactionStatus fromValue(String v) {
        return valueOf(v);
    }

}
