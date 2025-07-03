
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Fixed header for CSC-DOS requests-stat
 * 
 * <p>Java class for fixed_header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="fixed_header">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="transaction_type" type="{http://www.westernunion.com/schema/xrsi}transaction_type" minOccurs="0"/>
 *         <element name="transaction_length" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="more_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sequence_number" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="record_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="script_identifier" type="{http://www.westernunion.com/schema/xrsi}id" minOccurs="0"/>
 *         <element name="site_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixed_header", propOrder = {
    "transactionType",
    "transactionLength",
    "moreData",
    "sequenceNumber",
    "recordNumber",
    "scriptIdentifier",
    "siteId"
})
public class FixedHeader {

    @XmlElement(name = "transaction_type")
    @XmlSchemaType(name = "string")
    protected TransactionType transactionType;
    @XmlElement(name = "transaction_length")
    protected BigInteger transactionLength;
    @XmlElement(name = "more_data")
    protected String moreData;
    @XmlElement(name = "sequence_number")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "record_number")
    protected String recordNumber;
    @XmlElement(name = "script_identifier")
    protected String scriptIdentifier;
    @XmlElement(name = "site_id")
    protected String siteId;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionLength() {
        return transactionLength;
    }

    /**
     * Sets the value of the transactionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionLength(BigInteger value) {
        this.transactionLength = value;
    }

    /**
     * Gets the value of the moreData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreData() {
        return moreData;
    }

    /**
     * Sets the value of the moreData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreData(String value) {
        this.moreData = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the recordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /**
     * Sets the value of the recordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordNumber(String value) {
        this.recordNumber = value;
    }

    /**
     * Gets the value of the scriptIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptIdentifier() {
        return scriptIdentifier;
    }

    /**
     * Sets the value of the scriptIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptIdentifier(String value) {
        this.scriptIdentifier = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

}
