
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preferred_customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="preferred_customer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="loyalty_card_update_indicator" type="{http://www.westernunion.com/schema/xrsi}pref_cust_permanent_change" minOccurs="0"/>
 *         <element name="permanent_change" type="{http://www.westernunion.com/schema/xrsi}card_update_indicator" minOccurs="0"/>
 *         <choice>
 *           <element name="account_nbr" type="{http://www.westernunion.com/schema/xrsi}pref_cust_account_number" minOccurs="0"/>
 *           <element name="mywu_number" type="{http://www.westernunion.com/schema/xrsi}pref_cust_account_number" minOccurs="0"/>
 *         </choice>
 *         <element name="level_code" type="{http://www.westernunion.com/schema/xrsi}level_code" minOccurs="0"/>
 *         <element name="points_assigned_redeemed" type="{http://www.westernunion.com/schema/xrsi}points_assigned_redeemed" minOccurs="0"/>
 *         <element name="total_points_earned" type="{http://www.westernunion.com/schema/xrsi}wu_card_total_points_earned" minOccurs="0"/>
 *         <element name="current_number_of_receivers" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="original_card_type" type="{http://www.westernunion.com/schema/xrsi}sender_orig_card_type" minOccurs="0"/>
 *         <element name="status" type="{http://www.westernunion.com/schema/xrsi}pref_cust_status" minOccurs="0"/>
 *         <element name="card_class" type="{http://www.westernunion.com/schema/xrsi}card_class" minOccurs="0"/>
 *         <element name="apply_discount" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="first_use" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="rate_modifier" type="{http://www.westernunion.com/schema/xrsi}rate_modifier" minOccurs="0"/>
 *         <element name="discount" type="{http://www.westernunion.com/schema/xrsi}preferred_customer_discount" minOccurs="0"/>
 *         <element name="name_altkey" type="{http://www.westernunion.com/schema/xrsi}preferred_customer_name_altkey" minOccurs="0"/>
 *         <element name="operation" type="{http://www.westernunion.com/schema/xrsi}operation" minOccurs="0"/>
 *         <element name="last_use_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="issue_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="first_use_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="nonpermanent_change_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="max_number_receivers_allowed" type="{http://www.westernunion.com/schema/xrsi}max_number_receivers_allowed" minOccurs="0"/>
 *         <element name="last_modification_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="last_change_source" type="{http://www.westernunion.com/schema/xrsi}last_change_source" minOccurs="0"/>
 *         <element name="interests" type="{http://www.westernunion.com/schema/xrsi}interests" minOccurs="0"/>
 *         <element name="expiration_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="card_replaced_count" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="card_changes_count" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="auto_enroll" type="{http://www.westernunion.com/schema/xrsi}auto_enroll" minOccurs="0"/>
 *         <element name="card_has_expired" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="update" type="{http://www.westernunion.com/schema/xrsi}update" minOccurs="0"/>
 *         <element name="share_personal_data" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="receive_mail" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="opt_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="opt_in_out" type="{http://www.westernunion.com/schema/xrsi}opt_in_out" minOccurs="0"/>
 *         <element name="opt_in_out_change_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="control_number" type="{http://www.westernunion.com/schema/xrsi}control_number" minOccurs="0"/>
 *         <element name="phone_pin" type="{http://www.westernunion.com/schema/xrsi}phone_pin" minOccurs="0"/>
 *         <element name="pref_cust_search_key" type="{http://www.westernunion.com/schema/xrsi}pref_cust_search_key" minOccurs="0"/>
 *         <element name="rcv_desire_privacy_policy" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="is_convenience_card" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preferred_customer", propOrder = {
    "loyaltyCardUpdateIndicator",
    "permanentChange",
    "accountNbr",
    "mywuNumber",
    "levelCode",
    "pointsAssignedRedeemed",
    "totalPointsEarned",
    "currentNumberOfReceivers",
    "originalCardType",
    "status",
    "cardClass",
    "applyDiscount",
    "firstUse",
    "rateModifier",
    "discount",
    "nameAltkey",
    "operation",
    "lastUseDate",
    "issueDate",
    "firstUseDate",
    "nonpermanentChangeCount",
    "maxNumberReceiversAllowed",
    "lastModificationTime",
    "lastChangeSource",
    "interests",
    "expirationDate",
    "cardReplacedCount",
    "cardChangesCount",
    "autoEnroll",
    "cardHasExpired",
    "update",
    "sharePersonalData",
    "receiveMail",
    "optFlag",
    "optInOut",
    "optInOutChangeDate",
    "controlNumber",
    "phonePin",
    "prefCustSearchKey",
    "rcvDesirePrivacyPolicy",
    "isConvenienceCard"
})
public class PreferredCustomer {

    @XmlElement(name = "loyalty_card_update_indicator")
    protected String loyaltyCardUpdateIndicator;
    @XmlElement(name = "permanent_change")
    @XmlSchemaType(name = "string")
    protected CardUpdateIndicator permanentChange;
    @XmlElement(name = "account_nbr")
    protected String accountNbr;
    @XmlElement(name = "mywu_number")
    protected String mywuNumber;
    @XmlElement(name = "level_code")
    protected String levelCode;
    @XmlElement(name = "points_assigned_redeemed")
    protected String pointsAssignedRedeemed;
    @XmlElement(name = "total_points_earned")
    protected String totalPointsEarned;
    @XmlElement(name = "current_number_of_receivers")
    protected BigInteger currentNumberOfReceivers;
    @XmlElement(name = "original_card_type")
    protected String originalCardType;
    protected String status;
    @XmlElement(name = "card_class")
    protected String cardClass;
    @XmlElement(name = "apply_discount")
    @XmlSchemaType(name = "string")
    protected YesNo applyDiscount;
    @XmlElement(name = "first_use")
    @XmlSchemaType(name = "string")
    protected YesNo firstUse;
    @XmlElement(name = "rate_modifier")
    protected String rateModifier;
    protected String discount;
    @XmlElement(name = "name_altkey")
    protected String nameAltkey;
    protected String operation;
    @XmlElement(name = "last_use_date")
    protected String lastUseDate;
    @XmlElement(name = "issue_date")
    protected String issueDate;
    @XmlElement(name = "first_use_date")
    protected String firstUseDate;
    @XmlElement(name = "nonpermanent_change_count")
    protected BigInteger nonpermanentChangeCount;
    @XmlElement(name = "max_number_receivers_allowed")
    protected String maxNumberReceiversAllowed;
    @XmlElement(name = "last_modification_time")
    protected String lastModificationTime;
    @XmlElement(name = "last_change_source")
    protected String lastChangeSource;
    protected String interests;
    @XmlElement(name = "expiration_date")
    protected String expirationDate;
    @XmlElement(name = "card_replaced_count")
    protected String cardReplacedCount;
    @XmlElement(name = "card_changes_count", defaultValue = "0")
    protected String cardChangesCount;
    @XmlElement(name = "auto_enroll")
    protected String autoEnroll;
    @XmlElement(name = "card_has_expired")
    @XmlSchemaType(name = "string")
    protected YesNo cardHasExpired;
    protected String update;
    @XmlElement(name = "share_personal_data")
    @XmlSchemaType(name = "string")
    protected YesNo sharePersonalData;
    @XmlElement(name = "receive_mail")
    @XmlSchemaType(name = "string")
    protected YesNo receiveMail;
    @XmlElement(name = "opt_flag")
    @XmlSchemaType(name = "string")
    protected YesNo optFlag;
    @XmlElement(name = "opt_in_out")
    protected String optInOut;
    @XmlElement(name = "opt_in_out_change_date")
    protected String optInOutChangeDate;
    @XmlElement(name = "control_number")
    protected String controlNumber;
    @XmlElement(name = "phone_pin")
    protected String phonePin;
    @XmlElement(name = "pref_cust_search_key")
    protected String prefCustSearchKey;
    @XmlElement(name = "rcv_desire_privacy_policy")
    @XmlSchemaType(name = "string")
    protected YesNo rcvDesirePrivacyPolicy;
    @XmlElement(name = "is_convenience_card")
    @XmlSchemaType(name = "string")
    protected YesNoFlag isConvenienceCard;

    /**
     * Gets the value of the loyaltyCardUpdateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyCardUpdateIndicator() {
        return loyaltyCardUpdateIndicator;
    }

    /**
     * Sets the value of the loyaltyCardUpdateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyCardUpdateIndicator(String value) {
        this.loyaltyCardUpdateIndicator = value;
    }

    /**
     * Gets the value of the permanentChange property.
     * 
     * @return
     *     possible object is
     *     {@link CardUpdateIndicator }
     *     
     */
    public CardUpdateIndicator getPermanentChange() {
        return permanentChange;
    }

    /**
     * Sets the value of the permanentChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardUpdateIndicator }
     *     
     */
    public void setPermanentChange(CardUpdateIndicator value) {
        this.permanentChange = value;
    }

    /**
     * Gets the value of the accountNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNbr() {
        return accountNbr;
    }

    /**
     * Sets the value of the accountNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNbr(String value) {
        this.accountNbr = value;
    }

    /**
     * Gets the value of the mywuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMywuNumber() {
        return mywuNumber;
    }

    /**
     * Sets the value of the mywuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMywuNumber(String value) {
        this.mywuNumber = value;
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
     * Gets the value of the pointsAssignedRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsAssignedRedeemed() {
        return pointsAssignedRedeemed;
    }

    /**
     * Sets the value of the pointsAssignedRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsAssignedRedeemed(String value) {
        this.pointsAssignedRedeemed = value;
    }

    /**
     * Gets the value of the totalPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPointsEarned() {
        return totalPointsEarned;
    }

    /**
     * Sets the value of the totalPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPointsEarned(String value) {
        this.totalPointsEarned = value;
    }

    /**
     * Gets the value of the currentNumberOfReceivers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentNumberOfReceivers() {
        return currentNumberOfReceivers;
    }

    /**
     * Sets the value of the currentNumberOfReceivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentNumberOfReceivers(BigInteger value) {
        this.currentNumberOfReceivers = value;
    }

    /**
     * Gets the value of the originalCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCardType() {
        return originalCardType;
    }

    /**
     * Sets the value of the originalCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCardType(String value) {
        this.originalCardType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the cardClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardClass() {
        return cardClass;
    }

    /**
     * Sets the value of the cardClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardClass(String value) {
        this.cardClass = value;
    }

    /**
     * Gets the value of the applyDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getApplyDiscount() {
        return applyDiscount;
    }

    /**
     * Sets the value of the applyDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setApplyDiscount(YesNo value) {
        this.applyDiscount = value;
    }

    /**
     * Gets the value of the firstUse property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getFirstUse() {
        return firstUse;
    }

    /**
     * Sets the value of the firstUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setFirstUse(YesNo value) {
        this.firstUse = value;
    }

    /**
     * Gets the value of the rateModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateModifier() {
        return rateModifier;
    }

    /**
     * Sets the value of the rateModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateModifier(String value) {
        this.rateModifier = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the nameAltkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAltkey() {
        return nameAltkey;
    }

    /**
     * Sets the value of the nameAltkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAltkey(String value) {
        this.nameAltkey = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the lastUseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUseDate() {
        return lastUseDate;
    }

    /**
     * Sets the value of the lastUseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUseDate(String value) {
        this.lastUseDate = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the firstUseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstUseDate() {
        return firstUseDate;
    }

    /**
     * Sets the value of the firstUseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstUseDate(String value) {
        this.firstUseDate = value;
    }

    /**
     * Gets the value of the nonpermanentChangeCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonpermanentChangeCount() {
        return nonpermanentChangeCount;
    }

    /**
     * Sets the value of the nonpermanentChangeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonpermanentChangeCount(BigInteger value) {
        this.nonpermanentChangeCount = value;
    }

    /**
     * Gets the value of the maxNumberReceiversAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumberReceiversAllowed() {
        return maxNumberReceiversAllowed;
    }

    /**
     * Sets the value of the maxNumberReceiversAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumberReceiversAllowed(String value) {
        this.maxNumberReceiversAllowed = value;
    }

    /**
     * Gets the value of the lastModificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModificationTime() {
        return lastModificationTime;
    }

    /**
     * Sets the value of the lastModificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationTime(String value) {
        this.lastModificationTime = value;
    }

    /**
     * Gets the value of the lastChangeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangeSource() {
        return lastChangeSource;
    }

    /**
     * Sets the value of the lastChangeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangeSource(String value) {
        this.lastChangeSource = value;
    }

    /**
     * Gets the value of the interests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterests() {
        return interests;
    }

    /**
     * Sets the value of the interests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterests(String value) {
        this.interests = value;
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
     * Gets the value of the cardReplacedCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardReplacedCount() {
        return cardReplacedCount;
    }

    /**
     * Sets the value of the cardReplacedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardReplacedCount(String value) {
        this.cardReplacedCount = value;
    }

    /**
     * Gets the value of the cardChangesCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardChangesCount() {
        return cardChangesCount;
    }

    /**
     * Sets the value of the cardChangesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardChangesCount(String value) {
        this.cardChangesCount = value;
    }

    /**
     * Gets the value of the autoEnroll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEnroll() {
        return autoEnroll;
    }

    /**
     * Sets the value of the autoEnroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEnroll(String value) {
        this.autoEnroll = value;
    }

    /**
     * Gets the value of the cardHasExpired property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCardHasExpired() {
        return cardHasExpired;
    }

    /**
     * Sets the value of the cardHasExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCardHasExpired(YesNo value) {
        this.cardHasExpired = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdate(String value) {
        this.update = value;
    }

    /**
     * Gets the value of the sharePersonalData property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSharePersonalData() {
        return sharePersonalData;
    }

    /**
     * Sets the value of the sharePersonalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSharePersonalData(YesNo value) {
        this.sharePersonalData = value;
    }

    /**
     * Gets the value of the receiveMail property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getReceiveMail() {
        return receiveMail;
    }

    /**
     * Sets the value of the receiveMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setReceiveMail(YesNo value) {
        this.receiveMail = value;
    }

    /**
     * Gets the value of the optFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getOptFlag() {
        return optFlag;
    }

    /**
     * Sets the value of the optFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setOptFlag(YesNo value) {
        this.optFlag = value;
    }

    /**
     * Gets the value of the optInOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptInOut() {
        return optInOut;
    }

    /**
     * Sets the value of the optInOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptInOut(String value) {
        this.optInOut = value;
    }

    /**
     * Gets the value of the optInOutChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptInOutChangeDate() {
        return optInOutChangeDate;
    }

    /**
     * Sets the value of the optInOutChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptInOutChangeDate(String value) {
        this.optInOutChangeDate = value;
    }

    /**
     * Gets the value of the controlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * Sets the value of the controlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
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
     * Gets the value of the prefCustSearchKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefCustSearchKey() {
        return prefCustSearchKey;
    }

    /**
     * Sets the value of the prefCustSearchKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefCustSearchKey(String value) {
        this.prefCustSearchKey = value;
    }

    /**
     * Gets the value of the rcvDesirePrivacyPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getRcvDesirePrivacyPolicy() {
        return rcvDesirePrivacyPolicy;
    }

    /**
     * Sets the value of the rcvDesirePrivacyPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setRcvDesirePrivacyPolicy(YesNo value) {
        this.rcvDesirePrivacyPolicy = value;
    }

    /**
     * Gets the value of the isConvenienceCard property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getIsConvenienceCard() {
        return isConvenienceCard;
    }

    /**
     * Sets the value of the isConvenienceCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setIsConvenienceCard(YesNoFlag value) {
        this.isConvenienceCard = value;
    }

}
