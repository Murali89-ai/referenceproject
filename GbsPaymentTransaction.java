
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_payment_transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gbs_payment_transaction">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sender" type="{http://www.westernunion.com/schema/xrsi}channel_customer" minOccurs="0"/>
 *         <element name="receiver" type="{http://www.westernunion.com/schema/xrsi}channel_customer" minOccurs="0"/>
 *         <element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}gbs_payment_details" minOccurs="0"/>
 *         <element name="transaction_id" type="{http://www.westernunion.com/schema/xrsi}gbs_transaction_id" minOccurs="0"/>
 *         <element name="money_transfer_control" type="{http://www.westernunion.com/schema/xrsi}money_transfer_control"/>
 *         <element name="status" type="{http://www.westernunion.com/schema/xrsi}paid_status" minOccurs="0"/>
 *         <element name="reference_key" type="{http://www.westernunion.com/schema/xrsi}reference_key" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_payment_transaction", propOrder = {
    "sender",
    "receiver",
    "paymentDetails",
    "transactionId",
    "moneyTransferControl",
    "status",
    "referenceKey"
})
public class GbsPaymentTransaction {

    protected ChannelCustomer sender;
    protected ChannelCustomer receiver;
    @XmlElement(name = "payment_details")
    protected GbsPaymentDetails paymentDetails;
    @XmlElement(name = "transaction_id")
    protected String transactionId;
    @XmlElement(name = "money_transfer_control", required = true)
    protected MoneyTransferControl moneyTransferControl;
    @XmlSchemaType(name = "string")
    protected PaidStatus status;
    @XmlElement(name = "reference_key")
    protected String referenceKey;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelCustomer }
     *     
     */
    public ChannelCustomer getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelCustomer }
     *     
     */
    public void setSender(ChannelCustomer value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelCustomer }
     *     
     */
    public ChannelCustomer getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelCustomer }
     *     
     */
    public void setReceiver(ChannelCustomer value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GbsPaymentDetails }
     *     
     */
    public GbsPaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GbsPaymentDetails }
     *     
     */
    public void setPaymentDetails(GbsPaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the moneyTransferControl property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyTransferControl }
     *     
     */
    public MoneyTransferControl getMoneyTransferControl() {
        return moneyTransferControl;
    }

    /**
     * Sets the value of the moneyTransferControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyTransferControl }
     *     
     */
    public void setMoneyTransferControl(MoneyTransferControl value) {
        this.moneyTransferControl = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PaidStatus }
     *     
     */
    public PaidStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidStatus }
     *     
     */
    public void setStatus(PaidStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the referenceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceKey() {
        return referenceKey;
    }

    /**
     * Sets the value of the referenceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceKey(String value) {
        this.referenceKey = value;
    }

}
