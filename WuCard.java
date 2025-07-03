
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wu_card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="wu_card">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="wu_card_number" type="{http://www.westernunion.com/schema/xrsi}wu_card_number" minOccurs="0"/>
 *         <element name="promo_code" type="{http://www.westernunion.com/schema/xrsi}promo_code" minOccurs="0"/>
 *         <element name="add_date" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}date">
 *               <minLength value="0"/>
 *               <maxLength value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="add_time" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}time">
 *               <minLength value="0"/>
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="change_date" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}date">
 *               <minLength value="0"/>
 *               <maxLength value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="change_time" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}time">
 *               <minLength value="0"/>
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="points" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="reward_type" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="minimum_redemption" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="maximum_redemption" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="increment_amount_from_min" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="reward_value_pin_disc" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="transaction_date" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}date">
 *               <minLength value="0"/>
 *               <maxLength value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         <element name="transaction_type" type="{http://www.westernunion.com/schema/xrsi}transaction_type" minOccurs="0"/>
 *         <element name="originating_country" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="destination_country" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="client_name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         <element name="amount_in_local_send_currency" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="qualifying_for_reward" type="{http://www.westernunion.com/schema/xrsi}qualifying_for_reward" minOccurs="0"/>
 *         <element name="amount_granted" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="unique_record_id" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}string">
 *               <minLength value="0"/>
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="points_available_current_year" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="total_points_earned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="total_points_redeemed" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="redemption_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="redemption_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="redemption_status" type="{http://www.westernunion.com/schema/xrsi}redemption_status" minOccurs="0"/>
 *         <element name="phone_pin" type="{http://www.westernunion.com/schema/xrsi}pin" minOccurs="0"/>
 *         <element name="csr_id" type="{http://www.westernunion.com/schema/xrsi}csr_id" minOccurs="0"/>
 *         <element name="discount_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="comments" type="{http://www.westernunion.com/schema/xrsi}comments" minOccurs="0"/>
 *         <element name="level_code" type="{http://www.westernunion.com/schema/xrsi}level_code" minOccurs="0"/>
 *         <element name="text_description" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}comments">
 *               <minLength value="0"/>
 *               <maxLength value="30"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="redemption_amount" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}string">
 *               <minLength value="0"/>
 *               <maxLength value="16"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="reward_value" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="reward_currency" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="delivery_service_code" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="special_pricing" type="{http://www.westernunion.com/schema/xrsi}special_pricing" minOccurs="0"/>
 *         <element name="wu_card_pin_text" type="{http://www.westernunion.com/schema/xrsi}pin_text" maxOccurs="3" minOccurs="0"/>
 *         <element name="points_to_be_managed" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="eligibility_buffer" type="{http://www.westernunion.com/schema/xrsi}pricing_buffer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wu_card", propOrder = {
    "wuCardNumber",
    "promoCode",
    "addDate",
    "addTime",
    "changeDate",
    "changeTime",
    "points",
    "rewardType",
    "minimumRedemption",
    "maximumRedemption",
    "incrementAmountFromMin",
    "rewardValuePinDisc",
    "transactionDate",
    "mtcn",
    "transactionType",
    "originatingCountry",
    "destinationCountry",
    "clientName",
    "amountInLocalSendCurrency",
    "qualifyingForReward",
    "amountGranted",
    "uniqueRecordId",
    "pointsAvailableCurrentYear",
    "totalPointsEarned",
    "totalPointsRedeemed",
    "redemptionDate",
    "redemptionTime",
    "redemptionStatus",
    "phonePin",
    "csrId",
    "discountDate",
    "comments",
    "levelCode",
    "textDescription",
    "redemptionAmount",
    "rewardValue",
    "rewardCurrency",
    "deliveryServiceCode",
    "specialPricing",
    "wuCardPinText",
    "pointsToBeManaged",
    "eligibilityBuffer"
})
public class WuCard {

    @XmlElement(name = "wu_card_number")
    protected String wuCardNumber;
    @XmlElement(name = "promo_code")
    protected String promoCode;
    @XmlElement(name = "add_date")
    protected String addDate;
    @XmlElement(name = "add_time")
    protected String addTime;
    @XmlElement(name = "change_date")
    protected String changeDate;
    @XmlElement(name = "change_time")
    protected String changeTime;
    protected BigInteger points;
    @XmlElement(name = "reward_type")
    protected String rewardType;
    @XmlElement(name = "minimum_redemption")
    protected BigInteger minimumRedemption;
    @XmlElement(name = "maximum_redemption")
    protected BigInteger maximumRedemption;
    @XmlElement(name = "increment_amount_from_min")
    protected Long incrementAmountFromMin;
    @XmlElement(name = "reward_value_pin_disc")
    protected Long rewardValuePinDisc;
    @XmlElement(name = "transaction_date")
    protected String transactionDate;
    protected String mtcn;
    @XmlElement(name = "transaction_type")
    @XmlSchemaType(name = "string")
    protected TransactionType transactionType;
    @XmlElement(name = "originating_country")
    protected CountryCurrencyInfo originatingCountry;
    @XmlElement(name = "destination_country")
    protected CountryCurrencyInfo destinationCountry;
    @XmlElement(name = "client_name")
    protected GeneralName clientName;
    @XmlElement(name = "amount_in_local_send_currency")
    protected String amountInLocalSendCurrency;
    @XmlElement(name = "qualifying_for_reward")
    protected String qualifyingForReward;
    @XmlElement(name = "amount_granted")
    protected Long amountGranted;
    @XmlElement(name = "unique_record_id")
    protected String uniqueRecordId;
    @XmlElement(name = "points_available_current_year")
    protected BigInteger pointsAvailableCurrentYear;
    @XmlElement(name = "total_points_earned")
    protected BigInteger totalPointsEarned;
    @XmlElement(name = "total_points_redeemed")
    protected BigInteger totalPointsRedeemed;
    @XmlElement(name = "redemption_date")
    protected String redemptionDate;
    @XmlElement(name = "redemption_time")
    protected String redemptionTime;
    @XmlElement(name = "redemption_status")
    protected String redemptionStatus;
    @XmlElement(name = "phone_pin")
    protected String phonePin;
    @XmlElement(name = "csr_id")
    protected String csrId;
    @XmlElement(name = "discount_date")
    protected String discountDate;
    protected String comments;
    @XmlElement(name = "level_code")
    protected String levelCode;
    @XmlElement(name = "text_description")
    protected String textDescription;
    @XmlElement(name = "redemption_amount")
    protected String redemptionAmount;
    @XmlElement(name = "reward_value")
    protected Long rewardValue;
    @XmlElement(name = "reward_currency")
    protected String rewardCurrency;
    @XmlElement(name = "delivery_service_code")
    protected String deliveryServiceCode;
    @XmlElement(name = "special_pricing")
    protected SpecialPricing specialPricing;
    @XmlElement(name = "wu_card_pin_text")
    protected List<String> wuCardPinText;
    @XmlElement(name = "points_to_be_managed")
    protected BigInteger pointsToBeManaged;
    @XmlElement(name = "eligibility_buffer")
    protected String eligibilityBuffer;

    /**
     * Gets the value of the wuCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWuCardNumber() {
        return wuCardNumber;
    }

    /**
     * Sets the value of the wuCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWuCardNumber(String value) {
        this.wuCardNumber = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the addDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddDate() {
        return addDate;
    }

    /**
     * Sets the value of the addDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddDate(String value) {
        this.addDate = value;
    }

    /**
     * Gets the value of the addTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddTime() {
        return addTime;
    }

    /**
     * Sets the value of the addTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddTime(String value) {
        this.addTime = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeDate(String value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the changeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeTime() {
        return changeTime;
    }

    /**
     * Sets the value of the changeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeTime(String value) {
        this.changeTime = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPoints(BigInteger value) {
        this.points = value;
    }

    /**
     * Gets the value of the rewardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardType() {
        return rewardType;
    }

    /**
     * Sets the value of the rewardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardType(String value) {
        this.rewardType = value;
    }

    /**
     * Gets the value of the minimumRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumRedemption() {
        return minimumRedemption;
    }

    /**
     * Sets the value of the minimumRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumRedemption(BigInteger value) {
        this.minimumRedemption = value;
    }

    /**
     * Gets the value of the maximumRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumRedemption() {
        return maximumRedemption;
    }

    /**
     * Sets the value of the maximumRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumRedemption(BigInteger value) {
        this.maximumRedemption = value;
    }

    /**
     * Gets the value of the incrementAmountFromMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncrementAmountFromMin() {
        return incrementAmountFromMin;
    }

    /**
     * Sets the value of the incrementAmountFromMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncrementAmountFromMin(Long value) {
        this.incrementAmountFromMin = value;
    }

    /**
     * Gets the value of the rewardValuePinDisc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRewardValuePinDisc() {
        return rewardValuePinDisc;
    }

    /**
     * Sets the value of the rewardValuePinDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRewardValuePinDisc(Long value) {
        this.rewardValuePinDisc = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the mtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcn() {
        return mtcn;
    }

    /**
     * Sets the value of the mtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcn(String value) {
        this.mtcn = value;
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
     * Gets the value of the originatingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getOriginatingCountry() {
        return originatingCountry;
    }

    /**
     * Sets the value of the originatingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setOriginatingCountry(CountryCurrencyInfo value) {
        this.originatingCountry = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setDestinationCountry(CountryCurrencyInfo value) {
        this.destinationCountry = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setClientName(GeneralName value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the amountInLocalSendCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountInLocalSendCurrency() {
        return amountInLocalSendCurrency;
    }

    /**
     * Sets the value of the amountInLocalSendCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountInLocalSendCurrency(String value) {
        this.amountInLocalSendCurrency = value;
    }

    /**
     * Gets the value of the qualifyingForReward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifyingForReward() {
        return qualifyingForReward;
    }

    /**
     * Sets the value of the qualifyingForReward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifyingForReward(String value) {
        this.qualifyingForReward = value;
    }

    /**
     * Gets the value of the amountGranted property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountGranted() {
        return amountGranted;
    }

    /**
     * Sets the value of the amountGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountGranted(Long value) {
        this.amountGranted = value;
    }

    /**
     * Gets the value of the uniqueRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRecordId() {
        return uniqueRecordId;
    }

    /**
     * Sets the value of the uniqueRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRecordId(String value) {
        this.uniqueRecordId = value;
    }

    /**
     * Gets the value of the pointsAvailableCurrentYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsAvailableCurrentYear() {
        return pointsAvailableCurrentYear;
    }

    /**
     * Sets the value of the pointsAvailableCurrentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsAvailableCurrentYear(BigInteger value) {
        this.pointsAvailableCurrentYear = value;
    }

    /**
     * Gets the value of the totalPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPointsEarned() {
        return totalPointsEarned;
    }

    /**
     * Sets the value of the totalPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPointsEarned(BigInteger value) {
        this.totalPointsEarned = value;
    }

    /**
     * Gets the value of the totalPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPointsRedeemed() {
        return totalPointsRedeemed;
    }

    /**
     * Sets the value of the totalPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPointsRedeemed(BigInteger value) {
        this.totalPointsRedeemed = value;
    }

    /**
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionDate(String value) {
        this.redemptionDate = value;
    }

    /**
     * Gets the value of the redemptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionTime() {
        return redemptionTime;
    }

    /**
     * Sets the value of the redemptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionTime(String value) {
        this.redemptionTime = value;
    }

    /**
     * Gets the value of the redemptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionStatus() {
        return redemptionStatus;
    }

    /**
     * Sets the value of the redemptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionStatus(String value) {
        this.redemptionStatus = value;
    }

    /**
     * Gets the value of the phonePin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonePin() {
        return phonePin;
    }

    /**
     * Sets the value of the phonePin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonePin(String value) {
        this.phonePin = value;
    }

    /**
     * Gets the value of the csrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsrId() {
        return csrId;
    }

    /**
     * Sets the value of the csrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsrId(String value) {
        this.csrId = value;
    }

    /**
     * Gets the value of the discountDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountDate() {
        return discountDate;
    }

    /**
     * Sets the value of the discountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountDate(String value) {
        this.discountDate = value;
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
     * Gets the value of the levelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelCode() {
        return levelCode;
    }

    /**
     * Sets the value of the levelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelCode(String value) {
        this.levelCode = value;
    }

    /**
     * Gets the value of the textDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextDescription() {
        return textDescription;
    }

    /**
     * Sets the value of the textDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextDescription(String value) {
        this.textDescription = value;
    }

    /**
     * Gets the value of the redemptionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionAmount() {
        return redemptionAmount;
    }

    /**
     * Sets the value of the redemptionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionAmount(String value) {
        this.redemptionAmount = value;
    }

    /**
     * Gets the value of the rewardValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRewardValue() {
        return rewardValue;
    }

    /**
     * Sets the value of the rewardValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRewardValue(Long value) {
        this.rewardValue = value;
    }

    /**
     * Gets the value of the rewardCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCurrency() {
        return rewardCurrency;
    }

    /**
     * Sets the value of the rewardCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCurrency(String value) {
        this.rewardCurrency = value;
    }

    /**
     * Gets the value of the deliveryServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceCode() {
        return deliveryServiceCode;
    }

    /**
     * Sets the value of the deliveryServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceCode(String value) {
        this.deliveryServiceCode = value;
    }

    /**
     * Gets the value of the specialPricing property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialPricing }
     *     
     */
    public SpecialPricing getSpecialPricing() {
        return specialPricing;
    }

    /**
     * Sets the value of the specialPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialPricing }
     *     
     */
    public void setSpecialPricing(SpecialPricing value) {
        this.specialPricing = value;
    }

    /**
     * Gets the value of the wuCardPinText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wuCardPinText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWuCardPinText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the wuCardPinText property.
     */
    public List<String> getWuCardPinText() {
        if (wuCardPinText == null) {
            wuCardPinText = new ArrayList<>();
        }
        return this.wuCardPinText;
    }

    /**
     * Gets the value of the pointsToBeManaged property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsToBeManaged() {
        return pointsToBeManaged;
    }

    /**
     * Sets the value of the pointsToBeManaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsToBeManaged(BigInteger value) {
        this.pointsToBeManaged = value;
    }

    /**
     * Gets the value of the eligibilityBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityBuffer() {
        return eligibilityBuffer;
    }

    /**
     * Sets the value of the eligibilityBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityBuffer(String value) {
        this.eligibilityBuffer = value;
    }

}
