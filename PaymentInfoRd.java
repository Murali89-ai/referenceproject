
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment_info_rd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="payment_info_rd">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mode_of_payment" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="C"/>
 *               <length value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="cheque_account_number" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="20"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="amount" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="receiver_score" type="{http://www.westernunion.com/schema/xrsi}score" minOccurs="0"/>
 *         <element name="sender_score" type="{http://www.westernunion.com/schema/xrsi}score" minOccurs="0"/>
 *         <element name="ReceiverDirectedIndicator" type="{http://www.westernunion.com/schema/xrsi}ReceiverDirectedIndicator" minOccurs="0"/>
 *         <element name="payout_channel">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="RedirectCount" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="customer_intent" type="{http://www.westernunion.com/schema/xrsi}customer_intent" minOccurs="0"/>
 *         <element name="Match_Flag" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_info_rd", propOrder = {
    "modeOfPayment",
    "chequeAccountNumber",
    "amount",
    "receiverScore",
    "senderScore",
    "receiverDirectedIndicator",
    "payoutChannel",
    "redirectCount",
    "customerIntent",
    "matchFlag"
})
public class PaymentInfoRd {

    @XmlElement(name = "mode_of_payment")
    protected String modeOfPayment;
    @XmlElement(name = "cheque_account_number")
    protected String chequeAccountNumber;
    protected String amount;
    @XmlElement(name = "receiver_score")
    protected String receiverScore;
    @XmlElement(name = "sender_score")
    protected String senderScore;
    @XmlElement(name = "ReceiverDirectedIndicator")
    @XmlSchemaType(name = "string")
    protected ReceiverDirectedIndicator receiverDirectedIndicator;
    @XmlElement(name = "payout_channel", required = true)
    protected String payoutChannel;
    @XmlElement(name = "RedirectCount")
    protected String redirectCount;
    @XmlElement(name = "customer_intent")
    @XmlSchemaType(name = "string")
    protected CustomerIntent customerIntent;
    @XmlElement(name = "Match_Flag")
    protected String matchFlag;

    /**
     * Gets the value of the modeOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeOfPayment() {
        return modeOfPayment;
    }

    /**
     * Sets the value of the modeOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeOfPayment(String value) {
        this.modeOfPayment = value;
    }

    /**
     * Gets the value of the chequeAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeAccountNumber() {
        return chequeAccountNumber;
    }

    /**
     * Sets the value of the chequeAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeAccountNumber(String value) {
        this.chequeAccountNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the receiverScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverScore() {
        return receiverScore;
    }

    /**
     * Sets the value of the receiverScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverScore(String value) {
        this.receiverScore = value;
    }

    /**
     * Gets the value of the senderScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderScore() {
        return senderScore;
    }

    /**
     * Sets the value of the senderScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderScore(String value) {
        this.senderScore = value;
    }

    /**
     * Gets the value of the receiverDirectedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverDirectedIndicator }
     *     
     */
    public ReceiverDirectedIndicator getReceiverDirectedIndicator() {
        return receiverDirectedIndicator;
    }

    /**
     * Sets the value of the receiverDirectedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverDirectedIndicator }
     *     
     */
    public void setReceiverDirectedIndicator(ReceiverDirectedIndicator value) {
        this.receiverDirectedIndicator = value;
    }

    /**
     * Gets the value of the payoutChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutChannel() {
        return payoutChannel;
    }

    /**
     * Sets the value of the payoutChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutChannel(String value) {
        this.payoutChannel = value;
    }

    /**
     * Gets the value of the redirectCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectCount() {
        return redirectCount;
    }

    /**
     * Sets the value of the redirectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectCount(String value) {
        this.redirectCount = value;
    }

    /**
     * Gets the value of the customerIntent property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIntent }
     *     
     */
    public CustomerIntent getCustomerIntent() {
        return customerIntent;
    }

    /**
     * Sets the value of the customerIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIntent }
     *     
     */
    public void setCustomerIntent(CustomerIntent value) {
        this.customerIntent = value;
    }

    /**
     * Gets the value of the matchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchFlag() {
        return matchFlag;
    }

    /**
     * Sets the value of the matchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchFlag(String value) {
        this.matchFlag = value;
    }

}
