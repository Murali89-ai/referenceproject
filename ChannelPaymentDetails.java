
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_payment_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="channel_payment_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="origination" type="{http://www.westernunion.com/schema/xrsi}origination" minOccurs="0"/>
 *         <element name="destination" type="{http://www.westernunion.com/schema/xrsi}destination" minOccurs="0"/>
 *         <element name="expected_payout_location" type="{http://www.westernunion.com/schema/xrsi}expected_payout_location" minOccurs="0"/>
 *         <element name="promotion" type="{http://www.westernunion.com/schema/xrsi}channel_promotion" minOccurs="0"/>
 *         <element name="taxes" type="{http://www.westernunion.com/schema/xrsi}channel_taxes" minOccurs="0"/>
 *         <element name="fees" type="{http://www.westernunion.com/schema/xrsi}channel_fees" minOccurs="0"/>
 *         <element name="message_charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="min_amount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="max_amount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="payment_type" type="{http://www.westernunion.com/schema/xrsi}payment_type" minOccurs="0"/>
 *         <element name="identification_question" type="{http://www.westernunion.com/schema/xrsi}identification_question" minOccurs="0"/>
 *         <element name="payment_digest" type="{http://www.westernunion.com/schema/xrsi}fee_survey_pricing_digest" minOccurs="0"/>
 *         <element name="pay_wo_id_indicator" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="credit_debit_card_details" type="{http://www.westernunion.com/schema/xrsi}credit_debit_card" minOccurs="0"/>
 *         <element name="acs_verification_id" type="{http://www.westernunion.com/schema/xrsi}acs_verification_id" minOccurs="0"/>
 *         <element name="conv_session_cookie" type="{http://www.westernunion.com/schema/xrsi}convenience_cookie" minOccurs="0"/>
 *         <element name="total_undiscounted_charges" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="total_discount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="total_discounted_charges" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="fix_on_send" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="principal_amount_usd" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="exchange_rate_usd" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="pricing_buffer" type="{http://www.westernunion.com/schema/xrsi}pricing_buffer" minOccurs="0"/>
 *         <element name="txn_reason_code" type="{http://www.westernunion.com/schema/xrsi}txn_reason_code" minOccurs="0"/>
 *         <element name="regulatory_buffer" type="{http://www.westernunion.com/schema/xrsi}regulatory_buffer" minOccurs="0"/>
 *         <element name="df_fields" type="{http://www.westernunion.com/schema/xrsi}df_fields" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_payment_details", propOrder = {
    "origination",
    "destination",
    "expectedPayoutLocation",
    "promotion",
    "taxes",
    "fees",
    "messageCharges",
    "exchangeRate",
    "minAmount",
    "maxAmount",
    "paymentType",
    "identificationQuestion",
    "paymentDigest",
    "payWoIdIndicator",
    "creditDebitCardDetails",
    "acsVerificationId",
    "convSessionCookie",
    "totalUndiscountedCharges",
    "totalDiscount",
    "totalDiscountedCharges",
    "fixOnSend",
    "principalAmountUsd",
    "exchangeRateUsd",
    "pricingBuffer",
    "txnReasonCode",
    "regulatoryBuffer",
    "dfFields"
})
@XmlSeeAlso({
    MobilePaymentDetails.class,
    GbsGwpPaymentDetails.class
})
public class ChannelPaymentDetails {

    protected Origination origination;
    protected Destination destination;
    @XmlElement(name = "expected_payout_location")
    protected ExpectedPayoutLocation expectedPayoutLocation;
    protected ChannelPromotion promotion;
    protected ChannelTaxes taxes;
    protected ChannelFees fees;
    @XmlElement(name = "message_charges")
    protected Long messageCharges;
    @XmlElement(name = "exchange_rate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "min_amount")
    protected BigDecimal minAmount;
    @XmlElement(name = "max_amount")
    protected BigDecimal maxAmount;
    @XmlElement(name = "payment_type")
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;
    @XmlElement(name = "identification_question")
    protected IdentificationQuestion identificationQuestion;
    @XmlElement(name = "payment_digest")
    protected String paymentDigest;
    @XmlElement(name = "pay_wo_id_indicator")
    @XmlSchemaType(name = "string")
    protected YesNo payWoIdIndicator;
    @XmlElement(name = "credit_debit_card_details")
    protected CreditDebitCard creditDebitCardDetails;
    @XmlElement(name = "acs_verification_id")
    protected String acsVerificationId;
    @XmlElement(name = "conv_session_cookie")
    protected String convSessionCookie;
    @XmlElement(name = "total_undiscounted_charges")
    protected BigDecimal totalUndiscountedCharges;
    @XmlElement(name = "total_discount")
    protected BigDecimal totalDiscount;
    @XmlElement(name = "total_discounted_charges")
    protected BigDecimal totalDiscountedCharges;
    @XmlElement(name = "fix_on_send")
    @XmlSchemaType(name = "string")
    protected YesNo fixOnSend;
    @XmlElement(name = "principal_amount_usd")
    protected Long principalAmountUsd;
    @XmlElement(name = "exchange_rate_usd")
    protected BigDecimal exchangeRateUsd;
    @XmlElement(name = "pricing_buffer")
    protected String pricingBuffer;
    @XmlElement(name = "txn_reason_code")
    protected String txnReasonCode;
    @XmlElement(name = "regulatory_buffer")
    protected String regulatoryBuffer;
    @XmlElement(name = "df_fields")
    protected DfFields dfFields;

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link Origination }
     *     
     */
    public Origination getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Origination }
     *     
     */
    public void setOrigination(Origination value) {
        this.origination = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the expectedPayoutLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedPayoutLocation }
     *     
     */
    public ExpectedPayoutLocation getExpectedPayoutLocation() {
        return expectedPayoutLocation;
    }

    /**
     * Sets the value of the expectedPayoutLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedPayoutLocation }
     *     
     */
    public void setExpectedPayoutLocation(ExpectedPayoutLocation value) {
        this.expectedPayoutLocation = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelPromotion }
     *     
     */
    public ChannelPromotion getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelPromotion }
     *     
     */
    public void setPromotion(ChannelPromotion value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelTaxes }
     *     
     */
    public ChannelTaxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelTaxes }
     *     
     */
    public void setTaxes(ChannelTaxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelFees }
     *     
     */
    public ChannelFees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelFees }
     *     
     */
    public void setFees(ChannelFees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the messageCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessageCharges() {
        return messageCharges;
    }

    /**
     * Sets the value of the messageCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessageCharges(Long value) {
        this.messageCharges = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmount(BigDecimal value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the identificationQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationQuestion }
     *     
     */
    public IdentificationQuestion getIdentificationQuestion() {
        return identificationQuestion;
    }

    /**
     * Sets the value of the identificationQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationQuestion }
     *     
     */
    public void setIdentificationQuestion(IdentificationQuestion value) {
        this.identificationQuestion = value;
    }

    /**
     * Gets the value of the paymentDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDigest() {
        return paymentDigest;
    }

    /**
     * Sets the value of the paymentDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDigest(String value) {
        this.paymentDigest = value;
    }

    /**
     * Gets the value of the payWoIdIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPayWoIdIndicator() {
        return payWoIdIndicator;
    }

    /**
     * Sets the value of the payWoIdIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPayWoIdIndicator(YesNo value) {
        this.payWoIdIndicator = value;
    }

    /**
     * Gets the value of the creditDebitCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCard }
     *     
     */
    public CreditDebitCard getCreditDebitCardDetails() {
        return creditDebitCardDetails;
    }

    /**
     * Sets the value of the creditDebitCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCard }
     *     
     */
    public void setCreditDebitCardDetails(CreditDebitCard value) {
        this.creditDebitCardDetails = value;
    }

    /**
     * Gets the value of the acsVerificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsVerificationId() {
        return acsVerificationId;
    }

    /**
     * Sets the value of the acsVerificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsVerificationId(String value) {
        this.acsVerificationId = value;
    }

    /**
     * Gets the value of the convSessionCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvSessionCookie() {
        return convSessionCookie;
    }

    /**
     * Sets the value of the convSessionCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvSessionCookie(String value) {
        this.convSessionCookie = value;
    }

    /**
     * Gets the value of the totalUndiscountedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalUndiscountedCharges() {
        return totalUndiscountedCharges;
    }

    /**
     * Sets the value of the totalUndiscountedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalUndiscountedCharges(BigDecimal value) {
        this.totalUndiscountedCharges = value;
    }

    /**
     * Gets the value of the totalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Sets the value of the totalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscount(BigDecimal value) {
        this.totalDiscount = value;
    }

    /**
     * Gets the value of the totalDiscountedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscountedCharges() {
        return totalDiscountedCharges;
    }

    /**
     * Sets the value of the totalDiscountedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscountedCharges(BigDecimal value) {
        this.totalDiscountedCharges = value;
    }

    /**
     * Gets the value of the fixOnSend property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getFixOnSend() {
        return fixOnSend;
    }

    /**
     * Sets the value of the fixOnSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setFixOnSend(YesNo value) {
        this.fixOnSend = value;
    }

    /**
     * Gets the value of the principalAmountUsd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrincipalAmountUsd() {
        return principalAmountUsd;
    }

    /**
     * Sets the value of the principalAmountUsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrincipalAmountUsd(Long value) {
        this.principalAmountUsd = value;
    }

    /**
     * Gets the value of the exchangeRateUsd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRateUsd() {
        return exchangeRateUsd;
    }

    /**
     * Sets the value of the exchangeRateUsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRateUsd(BigDecimal value) {
        this.exchangeRateUsd = value;
    }

    /**
     * Gets the value of the pricingBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingBuffer() {
        return pricingBuffer;
    }

    /**
     * Sets the value of the pricingBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingBuffer(String value) {
        this.pricingBuffer = value;
    }

    /**
     * Gets the value of the txnReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnReasonCode() {
        return txnReasonCode;
    }

    /**
     * Sets the value of the txnReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnReasonCode(String value) {
        this.txnReasonCode = value;
    }

    /**
     * Gets the value of the regulatoryBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatoryBuffer() {
        return regulatoryBuffer;
    }

    /**
     * Sets the value of the regulatoryBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatoryBuffer(String value) {
        this.regulatoryBuffer = value;
    }

    /**
     * Gets the value of the dfFields property.
     * 
     * @return
     *     possible object is
     *     {@link DfFields }
     *     
     */
    public DfFields getDfFields() {
        return dfFields;
    }

    /**
     * Sets the value of the dfFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfFields }
     *     
     */
    public void setDfFields(DfFields value) {
        this.dfFields = value;
    }

}
