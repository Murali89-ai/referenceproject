
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auto_refile_buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="auto_refile_buffer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="originating_mtcn" type="{http://www.westernunion.com/schema/xrsi}mocn" minOccurs="0"/>
 *         <element name="recording_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="reason_code" type="{http://www.westernunion.com/schema/xrsi}transaction_type" minOccurs="0"/>
 *         <element name="reference_mtcn" type="{http://www.westernunion.com/schema/xrsi}mocn" minOccurs="0"/>
 *         <element name="reference_recording_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="requestor" type="{http://www.westernunion.com/schema/xrsi}name_base" minOccurs="0"/>
 *         <element name="comments" type="{http://www.westernunion.com/schema/xrsi}comments" minOccurs="0"/>
 *         <element name="originating_recording_agent_account" type="{http://www.westernunion.com/schema/xrsi}request_account_number" minOccurs="0"/>
 *         <element name="originating_paying_agent_account" type="{http://www.westernunion.com/schema/xrsi}request_account_number" minOccurs="0"/>
 *         <element name="transaction_type" type="{http://www.westernunion.com/schema/xrsi}transaction_type" minOccurs="0"/>
 *         <element name="reason" type="{http://www.westernunion.com/schema/xrsi}comments" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auto_refile_buffer", propOrder = {
    "originatingMtcn",
    "recordingDate",
    "reasonCode",
    "referenceMtcn",
    "referenceRecordingDate",
    "requestor",
    "comments",
    "originatingRecordingAgentAccount",
    "originatingPayingAgentAccount",
    "transactionType",
    "reason"
})
public class AutoRefileBuffer {

    @XmlElement(name = "originating_mtcn")
    protected String originatingMtcn;
    @XmlElement(name = "recording_date")
    protected String recordingDate;
    @XmlElement(name = "reason_code")
    @XmlSchemaType(name = "string")
    protected TransactionType reasonCode;
    @XmlElement(name = "reference_mtcn")
    protected String referenceMtcn;
    @XmlElement(name = "reference_recording_date")
    protected String referenceRecordingDate;
    protected String requestor;
    protected String comments;
    @XmlElement(name = "originating_recording_agent_account")
    protected String originatingRecordingAgentAccount;
    @XmlElement(name = "originating_paying_agent_account")
    protected String originatingPayingAgentAccount;
    @XmlElement(name = "transaction_type")
    @XmlSchemaType(name = "string")
    protected TransactionType transactionType;
    protected String reason;

    /**
     * Gets the value of the originatingMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingMtcn() {
        return originatingMtcn;
    }

    /**
     * Sets the value of the originatingMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingMtcn(String value) {
        this.originatingMtcn = value;
    }

    /**
     * Gets the value of the recordingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingDate() {
        return recordingDate;
    }

    /**
     * Sets the value of the recordingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingDate(String value) {
        this.recordingDate = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setReasonCode(TransactionType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the referenceMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceMtcn() {
        return referenceMtcn;
    }

    /**
     * Sets the value of the referenceMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceMtcn(String value) {
        this.referenceMtcn = value;
    }

    /**
     * Gets the value of the referenceRecordingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceRecordingDate() {
        return referenceRecordingDate;
    }

    /**
     * Sets the value of the referenceRecordingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceRecordingDate(String value) {
        this.referenceRecordingDate = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestor(String value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the originatingRecordingAgentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingRecordingAgentAccount() {
        return originatingRecordingAgentAccount;
    }

    /**
     * Sets the value of the originatingRecordingAgentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingRecordingAgentAccount(String value) {
        this.originatingRecordingAgentAccount = value;
    }

    /**
     * Gets the value of the originatingPayingAgentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingPayingAgentAccount() {
        return originatingPayingAgentAccount;
    }

    /**
     * Sets the value of the originatingPayingAgentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingPayingAgentAccount(String value) {
        this.originatingPayingAgentAccount = value;
    }

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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
