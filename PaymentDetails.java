
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="payment_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="origination" type="{http://www.westernunion.com/schema/xrsi}origination" minOccurs="0"/>
 *         <element name="destination" type="{http://www.westernunion.com/schema/xrsi}destination" minOccurs="0"/>
 *         <element name="expected_payout_location" type="{http://www.westernunion.com/schema/xrsi}expected_payout_location" minOccurs="0"/>
 *         <element name="canadian_dollar_conversion_factor" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="recording_country_currency" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="destination_country_currency" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="alt_destination_country_currency" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="originating_country_currency" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="originating_city" type="{http://www.westernunion.com/schema/xrsi}city" minOccurs="0"/>
 *         <element name="originating_state" type="{http://www.westernunion.com/schema/xrsi}state_province" minOccurs="0"/>
 *         <element name="second_exchange_rate" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="money_transfer_change" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="transaction_type" type="{http://www.westernunion.com/schema/xrsi}transaction_type" minOccurs="0"/>
 *         <element name="pass_fee_engine" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="plus_charges_code" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="ccmt_refund_type" type="{http://www.westernunion.com/schema/xrsi}ccmt_refund_type" minOccurs="0"/>
 *         <element name="override_charges" type="{http://www.westernunion.com/schema/xrsi}override_charges" minOccurs="0"/>
 *         <element name="currency_country_code" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="micr" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="encrypted_working_key" type="{http://www.westernunion.com/schema/xrsi}encrypted_working_key" minOccurs="0"/>
 *         <element name="track_data" type="{http://www.westernunion.com/schema/xrsi}track_data" minOccurs="0"/>
 *         <element name="payment_type" type="{http://www.westernunion.com/schema/xrsi}payment_type" minOccurs="0"/>
 *         <element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="fix_on_send" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="payout_country" type="{http://www.westernunion.com/schema/xrsi}country_iso_code" minOccurs="0"/>
 *         <element name="payout_currency" type="{http://www.westernunion.com/schema/xrsi}currency" minOccurs="0"/>
 *         <element name="checks" type="{http://www.westernunion.com/schema/xrsi}checks" minOccurs="0"/>
 *         <element name="pay_wo_id_indicator" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="quick_collect_country_code_for_dll" type="{http://www.westernunion.com/schema/xrsi}quick_collect_country_code_for_dll" minOccurs="0"/>
 *         <element name="credit_debit_card_details" type="{http://www.westernunion.com/schema/xrsi}credit_debit_card" minOccurs="0"/>
 *         <element name="acr_queue_flag" type="{http://www.westernunion.com/schema/xrsi}TResendFlag" minOccurs="0"/>
 *         <element name="resend_flag" type="{http://www.westernunion.com/schema/xrsi}TResendFlag" minOccurs="0"/>
 *         <element name="duplicate_detection_flag" type="{http://www.westernunion.com/schema/xrsi}TDuplicateDetectionFlag" minOccurs="0"/>
 *         <element name="route_designator" type="{http://www.westernunion.com/schema/xrsi}route_designator" minOccurs="0"/>
 *         <element name="receipt_opt_out" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="pc_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="auth_status" type="{http://www.westernunion.com/schema/xrsi}auth_status" minOccurs="0"/>
 *         <element name="op_status" type="{http://www.westernunion.com/schema/xrsi}op_status" minOccurs="0"/>
 *         <element name="partner_equipment" type="{http://www.westernunion.com/schema/xrsi}partner_equipment" minOccurs="0"/>
 *         <element name="money_transfer_type" type="{http://www.westernunion.com/schema/xrsi}money_transfer_type" minOccurs="0"/>
 *         <element name="original_destination_country_currency" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="send_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="dc_pin" type="{http://www.westernunion.com/schema/xrsi}dc_pin" minOccurs="0"/>
 *         <element name="identification_question" type="{http://www.westernunion.com/schema/xrsi}identification_question" minOccurs="0"/>
 *         <element name="payment_digest" type="{http://www.westernunion.com/schema/xrsi}fee_survey_pricing_digest" minOccurs="0"/>
 *         <element name="action_flag" type="{http://www.westernunion.com/schema/xrsi}action" minOccurs="0"/>
 *         <element name="channels" type="{http://www.westernunion.com/schema/xrsi}channels" minOccurs="0"/>
 *         <element name="acs_verification_id" type="{http://www.westernunion.com/schema/xrsi}acs_verification_id" minOccurs="0"/>
 *         <element name="additional_parameter" type="{http://www.westernunion.com/schema/xrsi}additional_parameter" minOccurs="0"/>
 *         <element name="currency_cd" type="{http://www.westernunion.com/schema/xrsi}currency_cd" minOccurs="0"/>
 *         <element name="currency_name" type="{http://www.westernunion.com/schema/xrsi}currency_name" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_details", propOrder = {
    "origination",
    "destination",
    "expectedPayoutLocation",
    "canadianDollarConversionFactor",
    "recordingCountryCurrency",
    "destinationCountryCurrency",
    "altDestinationCountryCurrency",
    "originatingCountryCurrency",
    "originatingCity",
    "originatingState",
    "secondExchangeRate",
    "moneyTransferChange",
    "transactionType",
    "passFeeEngine",
    "plusChargesCode",
    "ccmtRefundType",
    "overrideCharges",
    "currencyCountryCode",
    "micr",
    "encryptedWorkingKey",
    "trackData",
    "paymentType",
    "exchangeRate",
    "fixOnSend",
    "payoutCountry",
    "payoutCurrency",
    "checks",
    "payWoIdIndicator",
    "quickCollectCountryCodeForDll",
    "creditDebitCardDetails",
    "acrQueueFlag",
    "resendFlag",
    "duplicateDetectionFlag",
    "routeDesignator",
    "receiptOptOut",
    "pcFlag",
    "authStatus",
    "opStatus",
    "partnerEquipment",
    "moneyTransferType",
    "originalDestinationCountryCurrency",
    "sendDate",
    "dcPin",
    "identificationQuestion",
    "paymentDigest",
    "actionFlag",
    "channels",
    "acsVerificationId",
    "additionalParameter",
    "currencyCd",
    "currencyName"
})
public class PaymentDetails {

    protected Origination origination;
    protected Destination destination;
    @XmlElement(name = "expected_payout_location")
    protected ExpectedPayoutLocation expectedPayoutLocation;
    @XmlElement(name = "canadian_dollar_conversion_factor")
    protected Long canadianDollarConversionFactor;
    @XmlElement(name = "recording_country_currency")
    protected CountryCurrencyInfo recordingCountryCurrency;
    @XmlElement(name = "destination_country_currency")
    protected CountryCurrencyInfo destinationCountryCurrency;
    @XmlElement(name = "alt_destination_country_currency")
    protected CountryCurrencyInfo altDestinationCountryCurrency;
    @XmlElement(name = "originating_country_currency")
    protected CountryCurrencyInfo originatingCountryCurrency;
    @XmlElement(name = "originating_city")
    protected String originatingCity;
    @XmlElement(name = "originating_state")
    protected String originatingState;
    @XmlElement(name = "second_exchange_rate")
    protected Long secondExchangeRate;
    @XmlElement(name = "money_transfer_change")
    @XmlSchemaType(name = "string")
    protected YesNo moneyTransferChange;
    @XmlElement(name = "transaction_type")
    @XmlSchemaType(name = "string")
    protected TransactionType transactionType;
    @XmlElement(name = "pass_fee_engine")
    @XmlSchemaType(name = "string")
    protected YesNo passFeeEngine;
    @XmlElement(name = "plus_charges_code")
    @XmlSchemaType(name = "string")
    protected YesNo plusChargesCode;
    @XmlElement(name = "ccmt_refund_type")
    protected String ccmtRefundType;
    @XmlElement(name = "override_charges")
    protected String overrideCharges;
    @XmlElement(name = "currency_country_code")
    protected CountryCurrencyInfo currencyCountryCode;
    @XmlSchemaType(name = "string")
    protected YesNo micr;
    @XmlElement(name = "encrypted_working_key")
    protected String encryptedWorkingKey;
    @XmlElement(name = "track_data")
    protected String trackData;
    @XmlElement(name = "payment_type")
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;
    @XmlElement(name = "exchange_rate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "fix_on_send")
    @XmlSchemaType(name = "string")
    protected YesNo fixOnSend;
    @XmlElement(name = "payout_country")
    protected String payoutCountry;
    @XmlElement(name = "payout_currency")
    protected String payoutCurrency;
    protected Checks checks;
    @XmlElement(name = "pay_wo_id_indicator")
    @XmlSchemaType(name = "string")
    protected YesNo payWoIdIndicator;
    @XmlElement(name = "quick_collect_country_code_for_dll")
    protected String quickCollectCountryCodeForDll;
    @XmlElement(name = "credit_debit_card_details")
    protected CreditDebitCard creditDebitCardDetails;
    @XmlElement(name = "acr_queue_flag")
    protected String acrQueueFlag;
    @XmlElement(name = "resend_flag")
    protected String resendFlag;
    @XmlElement(name = "duplicate_detection_flag")
    protected String duplicateDetectionFlag;
    @XmlElement(name = "route_designator")
    protected String routeDesignator;
    @XmlElement(name = "receipt_opt_out")
    @XmlSchemaType(name = "string")
    protected YesNo receiptOptOut;
    @XmlElement(name = "pc_flag")
    @XmlSchemaType(name = "string")
    protected YesNo pcFlag;
    @XmlElement(name = "auth_status")
    protected String authStatus;
    @XmlElement(name = "op_status")
    protected String opStatus;
    @XmlElement(name = "partner_equipment")
    protected PartnerEquipment partnerEquipment;
    @XmlElement(name = "money_transfer_type")
    protected String moneyTransferType;
    @XmlElement(name = "original_destination_country_currency")
    protected CountryCurrencyInfo originalDestinationCountryCurrency;
    @XmlElement(name = "send_date")
    protected String sendDate;
    @XmlElement(name = "dc_pin")
    protected String dcPin;
    @XmlElement(name = "identification_question")
    protected IdentificationQuestion identificationQuestion;
    @XmlElement(name = "payment_digest")
    protected String paymentDigest;
    @XmlElement(name = "action_flag")
    protected BigInteger actionFlag;
    protected Channels channels;
    @XmlElement(name = "acs_verification_id")
    protected String acsVerificationId;
    @XmlElement(name = "additional_parameter")
    protected String additionalParameter;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "currency_name")
    protected String currencyName;

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
     * Gets the value of the canadianDollarConversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCanadianDollarConversionFactor() {
        return canadianDollarConversionFactor;
    }

    /**
     * Sets the value of the canadianDollarConversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCanadianDollarConversionFactor(Long value) {
        this.canadianDollarConversionFactor = value;
    }

    /**
     * Gets the value of the recordingCountryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getRecordingCountryCurrency() {
        return recordingCountryCurrency;
    }

    /**
     * Sets the value of the recordingCountryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setRecordingCountryCurrency(CountryCurrencyInfo value) {
        this.recordingCountryCurrency = value;
    }

    /**
     * Gets the value of the destinationCountryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getDestinationCountryCurrency() {
        return destinationCountryCurrency;
    }

    /**
     * Sets the value of the destinationCountryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setDestinationCountryCurrency(CountryCurrencyInfo value) {
        this.destinationCountryCurrency = value;
    }

    /**
     * Gets the value of the altDestinationCountryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getAltDestinationCountryCurrency() {
        return altDestinationCountryCurrency;
    }

    /**
     * Sets the value of the altDestinationCountryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setAltDestinationCountryCurrency(CountryCurrencyInfo value) {
        this.altDestinationCountryCurrency = value;
    }

    /**
     * Gets the value of the originatingCountryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getOriginatingCountryCurrency() {
        return originatingCountryCurrency;
    }

    /**
     * Sets the value of the originatingCountryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setOriginatingCountryCurrency(CountryCurrencyInfo value) {
        this.originatingCountryCurrency = value;
    }

    /**
     * Gets the value of the originatingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingCity() {
        return originatingCity;
    }

    /**
     * Sets the value of the originatingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingCity(String value) {
        this.originatingCity = value;
    }

    /**
     * Gets the value of the originatingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingState() {
        return originatingState;
    }

    /**
     * Sets the value of the originatingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingState(String value) {
        this.originatingState = value;
    }

    /**
     * Gets the value of the secondExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecondExchangeRate() {
        return secondExchangeRate;
    }

    /**
     * Sets the value of the secondExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecondExchangeRate(Long value) {
        this.secondExchangeRate = value;
    }

    /**
     * Gets the value of the moneyTransferChange property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getMoneyTransferChange() {
        return moneyTransferChange;
    }

    /**
     * Sets the value of the moneyTransferChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setMoneyTransferChange(YesNo value) {
        this.moneyTransferChange = value;
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
     * Gets the value of the passFeeEngine property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPassFeeEngine() {
        return passFeeEngine;
    }

    /**
     * Sets the value of the passFeeEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPassFeeEngine(YesNo value) {
        this.passFeeEngine = value;
    }

    /**
     * Gets the value of the plusChargesCode property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPlusChargesCode() {
        return plusChargesCode;
    }

    /**
     * Sets the value of the plusChargesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPlusChargesCode(YesNo value) {
        this.plusChargesCode = value;
    }

    /**
     * Gets the value of the ccmtRefundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcmtRefundType() {
        return ccmtRefundType;
    }

    /**
     * Sets the value of the ccmtRefundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcmtRefundType(String value) {
        this.ccmtRefundType = value;
    }

    /**
     * Gets the value of the overrideCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCharges() {
        return overrideCharges;
    }

    /**
     * Sets the value of the overrideCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCharges(String value) {
        this.overrideCharges = value;
    }

    /**
     * Gets the value of the currencyCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getCurrencyCountryCode() {
        return currencyCountryCode;
    }

    /**
     * Sets the value of the currencyCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setCurrencyCountryCode(CountryCurrencyInfo value) {
        this.currencyCountryCode = value;
    }

    /**
     * Gets the value of the micr property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getMicr() {
        return micr;
    }

    /**
     * Sets the value of the micr property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setMicr(YesNo value) {
        this.micr = value;
    }

    /**
     * Gets the value of the encryptedWorkingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedWorkingKey() {
        return encryptedWorkingKey;
    }

    /**
     * Sets the value of the encryptedWorkingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedWorkingKey(String value) {
        this.encryptedWorkingKey = value;
    }

    /**
     * Gets the value of the trackData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackData() {
        return trackData;
    }

    /**
     * Sets the value of the trackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackData(String value) {
        this.trackData = value;
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
     * Gets the value of the payoutCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutCountry() {
        return payoutCountry;
    }

    /**
     * Sets the value of the payoutCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutCountry(String value) {
        this.payoutCountry = value;
    }

    /**
     * Gets the value of the payoutCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutCurrency() {
        return payoutCurrency;
    }

    /**
     * Sets the value of the payoutCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutCurrency(String value) {
        this.payoutCurrency = value;
    }

    /**
     * Gets the value of the checks property.
     * 
     * @return
     *     possible object is
     *     {@link Checks }
     *     
     */
    public Checks getChecks() {
        return checks;
    }

    /**
     * Sets the value of the checks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Checks }
     *     
     */
    public void setChecks(Checks value) {
        this.checks = value;
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
     * Gets the value of the quickCollectCountryCodeForDll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickCollectCountryCodeForDll() {
        return quickCollectCountryCodeForDll;
    }

    /**
     * Sets the value of the quickCollectCountryCodeForDll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickCollectCountryCodeForDll(String value) {
        this.quickCollectCountryCodeForDll = value;
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
     * Gets the value of the acrQueueFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrQueueFlag() {
        return acrQueueFlag;
    }

    /**
     * Sets the value of the acrQueueFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrQueueFlag(String value) {
        this.acrQueueFlag = value;
    }

    /**
     * Gets the value of the resendFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResendFlag() {
        return resendFlag;
    }

    /**
     * Sets the value of the resendFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResendFlag(String value) {
        this.resendFlag = value;
    }

    /**
     * Gets the value of the duplicateDetectionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateDetectionFlag() {
        return duplicateDetectionFlag;
    }

    /**
     * Sets the value of the duplicateDetectionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateDetectionFlag(String value) {
        this.duplicateDetectionFlag = value;
    }

    /**
     * Gets the value of the routeDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDesignator() {
        return routeDesignator;
    }

    /**
     * Sets the value of the routeDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDesignator(String value) {
        this.routeDesignator = value;
    }

    /**
     * Gets the value of the receiptOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getReceiptOptOut() {
        return receiptOptOut;
    }

    /**
     * Sets the value of the receiptOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setReceiptOptOut(YesNo value) {
        this.receiptOptOut = value;
    }

    /**
     * Gets the value of the pcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPcFlag() {
        return pcFlag;
    }

    /**
     * Sets the value of the pcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPcFlag(YesNo value) {
        this.pcFlag = value;
    }

    /**
     * Gets the value of the authStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * Sets the value of the authStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthStatus(String value) {
        this.authStatus = value;
    }

    /**
     * Gets the value of the opStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpStatus() {
        return opStatus;
    }

    /**
     * Sets the value of the opStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpStatus(String value) {
        this.opStatus = value;
    }

    /**
     * Gets the value of the partnerEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerEquipment }
     *     
     */
    public PartnerEquipment getPartnerEquipment() {
        return partnerEquipment;
    }

    /**
     * Sets the value of the partnerEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerEquipment }
     *     
     */
    public void setPartnerEquipment(PartnerEquipment value) {
        this.partnerEquipment = value;
    }

    /**
     * Gets the value of the moneyTransferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyTransferType() {
        return moneyTransferType;
    }

    /**
     * Sets the value of the moneyTransferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyTransferType(String value) {
        this.moneyTransferType = value;
    }

    /**
     * Gets the value of the originalDestinationCountryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getOriginalDestinationCountryCurrency() {
        return originalDestinationCountryCurrency;
    }

    /**
     * Sets the value of the originalDestinationCountryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setOriginalDestinationCountryCurrency(CountryCurrencyInfo value) {
        this.originalDestinationCountryCurrency = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDate(String value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the dcPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcPin() {
        return dcPin;
    }

    /**
     * Sets the value of the dcPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcPin(String value) {
        this.dcPin = value;
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
     * Gets the value of the actionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActionFlag() {
        return actionFlag;
    }

    /**
     * Sets the value of the actionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActionFlag(BigInteger value) {
        this.actionFlag = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link Channels }
     *     
     */
    public Channels getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channels }
     *     
     */
    public void setChannels(Channels value) {
        this.channels = value;
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
     * Gets the value of the additionalParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalParameter() {
        return additionalParameter;
    }

    /**
     * Sets the value of the additionalParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalParameter(String value) {
        this.additionalParameter = value;
    }

    /**
     * Gets the value of the currencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCd() {
        return currencyCd;
    }

    /**
     * Sets the value of the currencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    /**
     * Gets the value of the currencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the value of the currencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

}
