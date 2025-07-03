
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for credit_debit_card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="credit_debit_card">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="card_number" type="{http://www.westernunion.com/schema/xrsi}credit_debit_card_number" minOccurs="0"/>
 *         <element name="message_text" type="{http://www.westernunion.com/schema/xrsi}credit_card_response_text" minOccurs="0"/>
 *         <element name="encryption_key" type="{http://www.westernunion.com/schema/xrsi}encryption_key" minOccurs="0"/>
 *         <element name="track_data" type="{http://www.westernunion.com/schema/xrsi}track_data" minOccurs="0"/>
 *         <element name="cvvii_code" type="{http://www.westernunion.com/schema/xrsi}cvv_ii" minOccurs="0"/>
 *         <element name="expiration_date" type="{http://www.westernunion.com/schema/xrsi}card_expiration_date" minOccurs="0"/>
 *         <element name="authorization_code" type="{http://www.westernunion.com/schema/xrsi}authorization_code" minOccurs="0"/>
 *         <element name="issuing_bank" type="{http://www.westernunion.com/schema/xrsi}issuing_bank" minOccurs="0"/>
 *         <element name="last_usage_date" type="{http://www.westernunion.com/schema/xrsi}last_usage_date" minOccurs="0"/>
 *         <element name="credit_card_error_flags" type="{http://www.westernunion.com/schema/xrsi}error_flags" minOccurs="0"/>
 *         <element name="cvv2_verify_code" type="{http://www.westernunion.com/schema/xrsi}cvv2_verify_code" minOccurs="0"/>
 *         <element name="last_score_value" type="{http://www.westernunion.com/schema/xrsi}last_score_value" minOccurs="0"/>
 *         <element name="product_code" type="{http://www.westernunion.com/schema/xrsi}product_code" minOccurs="0"/>
 *         <element name="scoring_results" type="{http://www.westernunion.com/schema/xrsi}scoring_results" minOccurs="0"/>
 *         <element name="card_type" type="{http://www.westernunion.com/schema/xrsi}credit_debit_card_type" minOccurs="0"/>
 *         <element name="card_digest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.westernunion.com/schema/xrsi}channel_general_name" minOccurs="0"/>
 *         <element name="pin_debit" type="{http://www.westernunion.com/schema/xrsi}pin_debit_details" minOccurs="0"/>
 *         <element name="card_indicator" type="{http://www.westernunion.com/schema/xrsi}TSplitIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_debit_card", propOrder = {
    "cardNumber",
    "messageText",
    "encryptionKey",
    "trackData",
    "cvviiCode",
    "expirationDate",
    "authorizationCode",
    "issuingBank",
    "lastUsageDate",
    "creditCardErrorFlags",
    "cvv2VerifyCode",
    "lastScoreValue",
    "productCode",
    "scoringResults",
    "cardType",
    "cardDigest",
    "name",
    "pinDebit",
    "cardIndicator"
})
public class CreditDebitCard {

    @XmlElement(name = "card_number")
    protected String cardNumber;
    @XmlElement(name = "message_text")
    protected String messageText;
    @XmlElement(name = "encryption_key")
    protected String encryptionKey;
    @XmlElement(name = "track_data")
    protected String trackData;
    @XmlElement(name = "cvvii_code")
    protected String cvviiCode;
    @XmlElement(name = "expiration_date")
    protected String expirationDate;
    @XmlElement(name = "authorization_code")
    protected String authorizationCode;
    @XmlElement(name = "issuing_bank")
    protected String issuingBank;
    @XmlElement(name = "last_usage_date")
    protected String lastUsageDate;
    @XmlElement(name = "credit_card_error_flags")
    protected String creditCardErrorFlags;
    @XmlElement(name = "cvv2_verify_code")
    protected String cvv2VerifyCode;
    @XmlElement(name = "last_score_value")
    protected String lastScoreValue;
    @XmlElement(name = "product_code")
    protected String productCode;
    @XmlElement(name = "scoring_results")
    protected String scoringResults;
    @XmlElement(name = "card_type")
    protected String cardType;
    @XmlElement(name = "card_digest")
    protected String cardDigest;
    protected ChannelGeneralName name;
    @XmlElement(name = "pin_debit")
    protected PinDebitDetails pinDebit;
    @XmlElement(name = "card_indicator")
    protected String cardIndicator;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
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
     * Gets the value of the cvviiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvviiCode() {
        return cvviiCode;
    }

    /**
     * Sets the value of the cvviiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvviiCode(String value) {
        this.cvviiCode = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the issuingBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBank() {
        return issuingBank;
    }

    /**
     * Sets the value of the issuingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBank(String value) {
        this.issuingBank = value;
    }

    /**
     * Gets the value of the lastUsageDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUsageDate() {
        return lastUsageDate;
    }

    /**
     * Sets the value of the lastUsageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUsageDate(String value) {
        this.lastUsageDate = value;
    }

    /**
     * Gets the value of the creditCardErrorFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardErrorFlags() {
        return creditCardErrorFlags;
    }

    /**
     * Sets the value of the creditCardErrorFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardErrorFlags(String value) {
        this.creditCardErrorFlags = value;
    }

    /**
     * Gets the value of the cvv2VerifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv2VerifyCode() {
        return cvv2VerifyCode;
    }

    /**
     * Sets the value of the cvv2VerifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv2VerifyCode(String value) {
        this.cvv2VerifyCode = value;
    }

    /**
     * Gets the value of the lastScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastScoreValue() {
        return lastScoreValue;
    }

    /**
     * Sets the value of the lastScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastScoreValue(String value) {
        this.lastScoreValue = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the scoringResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoringResults() {
        return scoringResults;
    }

    /**
     * Sets the value of the scoringResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoringResults(String value) {
        this.scoringResults = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDigest() {
        return cardDigest;
    }

    /**
     * Sets the value of the cardDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDigest(String value) {
        this.cardDigest = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelGeneralName }
     *     
     */
    public ChannelGeneralName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelGeneralName }
     *     
     */
    public void setName(ChannelGeneralName value) {
        this.name = value;
    }

    /**
     * Gets the value of the pinDebit property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitDetails }
     *     
     */
    public PinDebitDetails getPinDebit() {
        return pinDebit;
    }

    /**
     * Sets the value of the pinDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitDetails }
     *     
     */
    public void setPinDebit(PinDebitDetails value) {
        this.pinDebit = value;
    }

    /**
     * Gets the value of the cardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIndicator() {
        return cardIndicator;
    }

    /**
     * Sets the value of the cardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIndicator(String value) {
        this.cardIndicator = value;
    }

}
