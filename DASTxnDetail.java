
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASTxnDetail</b> object contains money transfer transaction detail information<br>
 *             				e.g. everything between <GETTRANSACTIONDETAIL>...</GETTRANSACTIONDETAIL> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TXNDETAIL_Type", propOrder = {

})
public class DASTxnDetail {

    @XmlElement(name = "TERM_ID")
    protected String termId;
    @XmlElement(name = "OP_ID")
    protected String opId;
    @XmlElement(name = "ACCOUNT_NUM")
    protected String accountNum;
    @XmlElement(name = "PRINCIPAL")
    protected BigDecimal principal;
    @XmlElement(name = "PRINCIPAL_INTL")
    protected BigDecimal principalIntl;
    @XmlElement(name = "CHARGES")
    protected BigDecimal charges;
    @XmlElement(name = "TOLLS")
    protected BigDecimal tolls;
    @XmlElement(name = "MUNICIPAL_TAX")
    protected BigDecimal municipalTax;
    @XmlElement(name = "COUNTY_TAX")
    protected BigDecimal countyTax;
    @XmlElement(name = "STATE_TAX")
    protected BigDecimal stateTax;
    @XmlElement(name = "GROSS")
    protected BigDecimal gross;
    @XmlElement(name = "PLUS_CHARGES_AMOUNT")
    protected BigDecimal plusChargesAmount;
    @XmlElement(name = "WORD_COUNT")
    protected BigDecimal wordCount;
    @XmlElement(name = "MT_TYPE")
    protected String mtType;
    @XmlElement(name = "TRANS_MODS")
    protected String transMods;
    @XmlElement(name = "MTCN")
    protected String mtcn;
    @XmlElement(name = "SENDER_NAME")
    protected String senderName;
    @XmlElement(name = "SENDER_UA")
    protected String senderUa;
    @XmlElement(name = "PAYEE_NAME")
    protected String payeeName;
    @XmlElement(name = "PAYEE_UA")
    protected String payeeUa;
    @XmlElement(name = "BILLING_NAME")
    protected String billingName;
    @XmlElement(name = "BILLING_UA")
    protected String billingUa;
    @XmlElement(name = "DATE_TIME")
    protected String dateTime;
    @XmlElement(name = "TQ_QUESTION")
    protected String tqQuestion;
    @XmlElement(name = "PLUS_CHARGES_CODE")
    protected String plusChargesCode;
    @XmlElement(name = "CLERK_ID")
    protected String clerkId;
    @XmlElement(name = "CURRENT_FX")
    protected String currentFx;
    @XmlElement(name = "FX_FEE")
    protected String fxFee;
    @XmlElement(name = "CURRENT_FX2")
    protected String currentFx2;
    @XmlElement(name = "FX_FEE2")
    protected String fxFee2;
    @XmlElement(name = "DEST_COUNTRY")
    protected String destCountry;
    @XmlElement(name = "ORIG_CURRENCY")
    protected String origCurrency;
    @XmlElement(name = "DEST_CURRENCY")
    protected String destCurrency;
    @XmlElement(name = "SITE_ID")
    protected String siteId;
    @XmlElement(name = "DELIVERY_INFO")
    protected String deliveryInfo;
    @XmlElement(name = "OVERRIDE_CHARGES_FLAG")
    protected String overrideChargesFlag;
    @XmlElement(name = "RESEND_FLAG")
    protected String resendFlag;
    @XmlElement(name = "TEXT")
    protected String text;
    @XmlElement(name = "BINGO_CARD")
    protected String bingoCard;
    @XmlElement(name = "BINGO_COORD")
    protected String bingoCoord;
    @XmlElement(name = "BINGO_NUM")
    protected String bingoNum;
    @XmlElement(name = "SIN_NUM")
    protected String sinNum;
    @XmlElement(name = "CMO_VAL")
    protected String cmoVal;
    @XmlElement(name = "PC_VERSION")
    protected String pcVersion;
    @XmlElement(name = "PHYSICAL_DESCRIPTION")
    protected String physicalDescription;
    @XmlElement(name = "PAY_WOID")
    protected String payWoid;
    @XmlElement(name = "ANI")
    protected String ani;
    @XmlElement(name = "MT_KEY")
    protected BigDecimal mtKey;
    @XmlElement(name = "ERROR_Q_FLAG")
    protected String errorQFlag;
    @XmlElement(name = "PFC_CARD_NUMBER")
    protected String pfcCardNumber;
    @XmlElement(name = "BINGO_OVERRIDE")
    protected String bingoOverride;
    @XmlElement(name = "CHANGE_FLAG")
    protected String changeFlag;
    @XmlElement(name = "PD_ROUTING_ACCOUNT_NUM")
    protected String pdRoutingAccountNum;
    @XmlElement(name = "QC_REF_NUM")
    protected String qcRefNum;
    @XmlElement(name = "QC_CREDIT_ACOUNT_NUM")
    protected String qcCreditAcountNum;
    @XmlElement(name = "ID_TYPE")
    protected String idType;
    @XmlElement(name = "ID_NUMBER")
    protected String idNumber;
    @XmlElement(name = "ID_TYPE2")
    protected String idType2;
    @XmlElement(name = "ID_NUMBER2")
    protected String idNumber2;
    @XmlElement(name = "CREDIT_CARD_NUM")
    protected String creditCardNum;
    @XmlElement(name = "AUTH_CODE")
    protected String authCode;
    @XmlElement(name = "EXP_DATE")
    protected String expDate;
    @XmlElement(name = "BANNER")
    protected String banner;
    @XmlElement(name = "RATE_FLAG")
    protected String rateFlag;
    @XmlElement(name = "PAYMENT_TYPE")
    protected String paymentType;
    @XmlElement(name = "PERMANENT_CHANGE_FLAG")
    protected String permanentChangeFlag;
    @XmlElement(name = "RCV_ADDRESS_TYPE")
    protected String rcvAddressType;
    @XmlElement(name = "DLVS_CODE")
    protected String dlvsCode;
    @XmlElement(name = "DLVS_FLAGS")
    protected String dlvsFlags;
    @XmlElement(name = "QCVS_RESPONSE_CODE")
    protected BigDecimal qcvsResponseCode;
    @XmlElement(name = "QC_ORIG_CITY")
    protected String qcOrigCity;
    @XmlElement(name = "QC_ORIG_COMPANY")
    protected String qcOrigCompany;
    @XmlElement(name = "QC_ORIG_ACCOUNT")
    protected String qcOrigAccount;
    @XmlElement(name = "QC_MESSAGE")
    protected String qcMessage;
    @XmlElement(name = "PROMO_PIN")
    protected String promoPin;
    @XmlElement(name = "PROMO_PIN_TEXT")
    protected String promoPinText;
    @XmlElement(name = "PROMOS")
    protected String promos;
    @XmlElement(name = "FIRST_USE_FLAG")
    protected String firstUseFlag;
    @XmlElement(name = "SND_NAME_TYPE")
    protected String sndNameType;
    @XmlElement(name = "SND_ADDRESS_TYPE")
    protected String sndAddressType;
    @XmlElement(name = "RCV_NUMBER")
    protected String rcvNumber;
    @XmlElement(name = "RECY_TYPE")
    protected String recyType;
    @XmlElement(name = "SND_ADDR_LINE1")
    protected String sndAddrLine1;
    @XmlElement(name = "SND_ADDR_LINE2")
    protected String sndAddrLine2;
    @XmlElement(name = "SND_ADDR_LINE3")
    protected String sndAddrLine3;
    @XmlElement(name = "SND_CITY")
    protected String sndCity;
    @XmlElement(name = "SND_STATE")
    protected String sndState;
    @XmlElement(name = "SND_COUNTRY")
    protected String sndCountry;
    @XmlElement(name = "SND_POSTAL_CODE")
    protected String sndPostalCode;
    @XmlElement(name = "RCV_ADDR_LINE1")
    protected String rcvAddrLine1;
    @XmlElement(name = "RCV_ADDR_LINE2")
    protected String rcvAddrLine2;
    @XmlElement(name = "RCV_ADDR_LINE3")
    protected String rcvAddrLine3;
    @XmlElement(name = "RCV_CITY")
    protected String rcvCity;
    @XmlElement(name = "RCV_STATE")
    protected String rcvState;
    @XmlElement(name = "RCV_COUNTRY")
    protected String rcvCountry;
    @XmlElement(name = "RCV_POSTAL_CODE")
    protected String rcvPostalCode;
    @XmlElement(name = "SND_COOKIE")
    protected String sndCookie;
    @XmlElement(name = "RCV_COOKIE")
    protected String rcvCookie;
    @XmlElement(name = "RCV_NAME_TYPE")
    protected String rcvNameType;
    @XmlElement(name = "RCV_ADDR_TYPE")
    protected String rcvAddrType;
    @XmlElement(name = "PIN_FLAG")
    protected String pinFlag;
    @XmlElement(name = "QC_ERROR_COUNT")
    protected String qcErrorCount;
    @XmlElement(name = "SYS_TRACE")
    protected String sysTrace;
    @XmlElement(name = "CHECK_NUM")
    protected String checkNum;
    @XmlElement(name = "SPLIT_INDICATOR")
    protected String splitIndicator;
    @XmlElement(name = "SENDER_ID")
    protected String senderId;
    @XmlElement(name = "NET_ID")
    protected String netId;
    @XmlElement(name = "MERCHANT_NAME")
    protected String merchantName;
    @XmlElement(name = "MERCHANT_LOCATION")
    protected String merchantLocation;
    @XmlElement(name = "CONFIRM_CODE")
    protected String confirmCode;
    @XmlElement(name = "INTERCONNECT_DATA")
    protected String interconnectData;
    @XmlElement(name = "INTERCONNECT_ID")
    protected String interconnectId;
    @XmlElement(name = "DC_PIN_NUM")
    protected String dcPinNum;
    @XmlElement(name = "FILE_NUMBER")
    protected String fileNumber;
    @XmlElement(name = "DEVICE_ID")
    protected String deviceId;
    @XmlElement(name = "MODEL_ID")
    protected String modelId;
    @XmlElement(name = "REFUND_TYPE")
    protected String refundType;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "OPERATOR_COMMENTS")
    protected String operatorComments;
    @XmlElement(name = "ISSUING_BANK")
    protected String issuingBank;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "DOB")
    protected String dob;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "RCV_EMAIL")
    protected String rcvEmail;
    @XmlElement(name = "CVVII")
    protected String cvvii;
    @XmlElement(name = "ORIG_EMAIL")
    protected String origEmail;
    @XmlElement(name = "DRIVERS_LICENSE")
    protected String driversLicense;
    @XmlElement(name = "CHECK_ROTING_INFO")
    protected String checkRotingInfo;
    @XmlElement(name = "CHECK_TYPE")
    protected String checkType;
    @XmlElement(name = "SEND_MTCN")
    protected String sendMtcn;
    @XmlElement(name = "DRIVERS_LICENSE_STATE")
    protected String driversLicenseState;
    @XmlElement(name = "TRANS_MODIFIER")
    protected String transModifier;
    @XmlElement(name = "SND_USER_ID")
    protected String sndUserId;
    @XmlElement(name = "RCV_USER_ID")
    protected String rcvUserId;
    @XmlElement(name = "IP_ADDRESS")
    protected String ipAddress;
    @XmlElement(name = "IPS_CARD_NUM")
    protected String ipsCardNum;
    @XmlElement(name = "IPS_CARD_BAL")
    protected BigDecimal ipsCardBal;
    @XmlElement(name = "IPS_CARD_NUM_LOADED")
    protected String ipsCardNumLoaded;
    @XmlElement(name = "IPD_FUNDS_LOADED")
    protected BigDecimal ipdFundsLoaded;
    @XmlElement(name = "IPS_FUNDS_PARTNER")
    protected String ipsFundsPartner;
    @XmlElement(name = "IPS_DATE")
    protected String ipsDate;
    @XmlElement(name = "IPS_STATUS")
    protected String ipsStatus;
    @XmlElement(name = "IPS_PIN")
    protected String ipsPin;
    @XmlElement(name = "IPS_MAIDEN_NAME")
    protected String ipsMaidenName;
    @XmlElement(name = "IPS_AUTH_CODE")
    protected String ipsAuthCode;
    @XmlElement(name = "CONTACT_PHONE")
    protected String contactPhone;
    @XmlElement(name = "CUSTOMER_LEVEL")
    protected String customerLevel;
    @XmlElement(name = "SHARE_FLAG")
    protected String shareFlag;
    @XmlElement(name = "MAIL_FLAG")
    protected String mailFlag;
    @XmlElement(name = "OPT_FLAG")
    protected String optFlag;
    @XmlElement(name = "LEVEL_CODE")
    protected String levelCode;
    @XmlElement(name = "POINTS")
    protected String points;
    @XmlElement(name = "RULE_ID")
    protected String ruleId;
    @XmlElement(name = "REDEMPTION_TYPE")
    protected String redemptionType;
    @XmlElement(name = "REDEMPTION_VALUE")
    protected String redemptionValue;
    @XmlElement(name = "PIN_TEXT")
    protected String pinText;
    @XmlElement(name = "LAST_SCORE")
    protected String lastScore;
    @XmlElement(name = "LEXNEX_FLAGS")
    protected String lexnexFlags;
    @XmlElement(name = "CALLING_PHONE")
    protected String callingPhone;
    @XmlElement(name = "ADDR_VER_CODE")
    protected String addrVerCode;
    @XmlElement(name = "REFUND_FLAGS")
    protected String refundFlags;
    @XmlElement(name = "REFUND_REASON")
    protected String refundReason;
    @XmlElement(name = "AVS_CODE")
    protected String avsCode;
    @XmlElement(name = "CSC_CAUTION_FLAG")
    protected String cscCautionFlag;
    @XmlElement(name = "FIRST_TMT_FLAG")
    protected String firstTmtFlag;
    @XmlElement(name = "PHONE_USED_FLAG")
    protected String phoneUsedFlag;
    @XmlElement(name = "PHONE_LISTING")
    protected String phoneListing;
    @XmlElement(name = "EMPLOY_CODE")
    protected String employCode;
    @XmlElement(name = "CANCEL_REASON")
    protected String cancelReason;
    @XmlElement(name = "BUSINESS_NAME")
    protected String businessName;
    @XmlElement(name = "BUSINESS_UA")
    protected String businessUa;
    @XmlElement(name = "COMMENT_LINE")
    protected String commentLine;
    @XmlElement(name = "FIXED_FLAG")
    protected String fixedFlag;
    @XmlElement(name = "ATTENTION_LINE")
    protected String attentionLine;
    @XmlElement(name = "TMT_STAGING")
    protected String tmtStaging;
    @XmlElement(name = "ROUTE_DESIGNATOR")
    protected String routeDesignator;
    @XmlElement(name = "SERVER_ERROR")
    protected String serverError;
    @XmlElement(name = "PROMO_SEQUENCE")
    protected String promoSequence;
    @XmlElement(name = "DISCOUNT_AMOUNT")
    protected BigDecimal discountAmount;
    @XmlElement(name = "CONNECTION_ID")
    protected String connectionId;
    @XmlElement(name = "TOTAL_POINTS")
    protected String totalPoints;
    @XmlElement(name = "BANKREG_DATA")
    protected String bankregData;
    @XmlElement(name = "TP_OPTION_FLAG")
    protected String tpOptionFlag;
    @XmlElement(name = "LANGUAGE_FLAG")
    protected String languageFlag;
    @XmlElement(name = "HOST_CUST_ID")
    protected String hostCustId;
    @XmlElement(name = "HOST_UPDATE_FIELD")
    protected String hostUpdateField;
    @XmlElement(name = "EC_INDICATOR")
    protected String ecIndicator;
    @XmlElement(name = "ACS_VER_ID")
    protected String acsVerId;
    @XmlElement(name = "HOST_MESSAGE2")
    protected String hostMessage2;
    @XmlElement(name = "RECEIPT_OPT_OUT")
    protected String receiptOptOut;
    @XmlElement(name = "PROMO_DESCRIPTION")
    protected String promoDescription;
    @XmlElement(name = "AUTO_ENROLL_FLAG")
    protected String autoEnrollFlag;
    @XmlElement(name = "AUTO_ENROLL_RULE")
    protected String autoEnrollRule;
    @XmlElement(name = "AUTO_ENROLL_TEXT")
    protected String autoEnrollText;
    @XmlElement(name = "ORIG_COUNTRY")
    protected String origCountry;
    @XmlElement(name = "PAYOUT_AMOUNT_LRD")
    protected String payoutamountlrd;
    @XmlElement(name = "PAYOUT_AMOUNT_USD")
    protected String payoutamountusd;
    @XmlElement(name = "EXCHANGE_RATE_LRD")
    protected String exchangeratelrd;
    @XmlElement(name = "EXCHNAGE_RATE_USD")
    protected String exchnagerateusd;

    /**
     * Gets the value of the termId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermId(String value) {
        this.termId = value;
    }

    /**
     * Gets the value of the opId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpId() {
        return opId;
    }

    /**
     * Sets the value of the opId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpId(String value) {
        this.opId = value;
    }

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipal(BigDecimal value) {
        this.principal = value;
    }

    /**
     * Gets the value of the principalIntl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalIntl() {
        return principalIntl;
    }

    /**
     * Sets the value of the principalIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalIntl(BigDecimal value) {
        this.principalIntl = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharges(BigDecimal value) {
        this.charges = value;
    }

    /**
     * Gets the value of the tolls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTolls() {
        return tolls;
    }

    /**
     * Sets the value of the tolls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTolls(BigDecimal value) {
        this.tolls = value;
    }

    /**
     * Gets the value of the municipalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMunicipalTax() {
        return municipalTax;
    }

    /**
     * Sets the value of the municipalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMunicipalTax(BigDecimal value) {
        this.municipalTax = value;
    }

    /**
     * Gets the value of the countyTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountyTax() {
        return countyTax;
    }

    /**
     * Sets the value of the countyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountyTax(BigDecimal value) {
        this.countyTax = value;
    }

    /**
     * Gets the value of the stateTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStateTax() {
        return stateTax;
    }

    /**
     * Sets the value of the stateTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStateTax(BigDecimal value) {
        this.stateTax = value;
    }

    /**
     * Gets the value of the gross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGross() {
        return gross;
    }

    /**
     * Sets the value of the gross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGross(BigDecimal value) {
        this.gross = value;
    }

    /**
     * Gets the value of the plusChargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlusChargesAmount() {
        return plusChargesAmount;
    }

    /**
     * Sets the value of the plusChargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlusChargesAmount(BigDecimal value) {
        this.plusChargesAmount = value;
    }

    /**
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWordCount(BigDecimal value) {
        this.wordCount = value;
    }

    /**
     * Gets the value of the mtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtType() {
        return mtType;
    }

    /**
     * Sets the value of the mtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtType(String value) {
        this.mtType = value;
    }

    /**
     * Gets the value of the transMods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransMods() {
        return transMods;
    }

    /**
     * Sets the value of the transMods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransMods(String value) {
        this.transMods = value;
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
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the senderUa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderUa() {
        return senderUa;
    }

    /**
     * Sets the value of the senderUa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderUa(String value) {
        this.senderUa = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the payeeUa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeUa() {
        return payeeUa;
    }

    /**
     * Sets the value of the payeeUa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeUa(String value) {
        this.payeeUa = value;
    }

    /**
     * Gets the value of the billingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingName() {
        return billingName;
    }

    /**
     * Sets the value of the billingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingName(String value) {
        this.billingName = value;
    }

    /**
     * Gets the value of the billingUa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingUa() {
        return billingUa;
    }

    /**
     * Sets the value of the billingUa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingUa(String value) {
        this.billingUa = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the tqQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTqQuestion() {
        return tqQuestion;
    }

    /**
     * Sets the value of the tqQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTqQuestion(String value) {
        this.tqQuestion = value;
    }

    /**
     * Gets the value of the plusChargesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlusChargesCode() {
        return plusChargesCode;
    }

    /**
     * Sets the value of the plusChargesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlusChargesCode(String value) {
        this.plusChargesCode = value;
    }

    /**
     * Gets the value of the clerkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClerkId() {
        return clerkId;
    }

    /**
     * Sets the value of the clerkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClerkId(String value) {
        this.clerkId = value;
    }

    /**
     * Gets the value of the currentFx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFx() {
        return currentFx;
    }

    /**
     * Sets the value of the currentFx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFx(String value) {
        this.currentFx = value;
    }

    /**
     * Gets the value of the fxFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxFee() {
        return fxFee;
    }

    /**
     * Sets the value of the fxFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxFee(String value) {
        this.fxFee = value;
    }

    /**
     * Gets the value of the currentFx2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFx2() {
        return currentFx2;
    }

    /**
     * Sets the value of the currentFx2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFx2(String value) {
        this.currentFx2 = value;
    }

    /**
     * Gets the value of the fxFee2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxFee2() {
        return fxFee2;
    }

    /**
     * Sets the value of the fxFee2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxFee2(String value) {
        this.fxFee2 = value;
    }

    /**
     * Gets the value of the destCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCountry() {
        return destCountry;
    }

    /**
     * Sets the value of the destCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCountry(String value) {
        this.destCountry = value;
    }

    /**
     * Gets the value of the origCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCurrency() {
        return origCurrency;
    }

    /**
     * Sets the value of the origCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCurrency(String value) {
        this.origCurrency = value;
    }

    /**
     * Gets the value of the destCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCurrency() {
        return destCurrency;
    }

    /**
     * Sets the value of the destCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCurrency(String value) {
        this.destCurrency = value;
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

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInfo(String value) {
        this.deliveryInfo = value;
    }

    /**
     * Gets the value of the overrideChargesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideChargesFlag() {
        return overrideChargesFlag;
    }

    /**
     * Sets the value of the overrideChargesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideChargesFlag(String value) {
        this.overrideChargesFlag = value;
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the bingoCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBingoCard() {
        return bingoCard;
    }

    /**
     * Sets the value of the bingoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBingoCard(String value) {
        this.bingoCard = value;
    }

    /**
     * Gets the value of the bingoCoord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBingoCoord() {
        return bingoCoord;
    }

    /**
     * Sets the value of the bingoCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBingoCoord(String value) {
        this.bingoCoord = value;
    }

    /**
     * Gets the value of the bingoNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBingoNum() {
        return bingoNum;
    }

    /**
     * Sets the value of the bingoNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBingoNum(String value) {
        this.bingoNum = value;
    }

    /**
     * Gets the value of the sinNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinNum() {
        return sinNum;
    }

    /**
     * Sets the value of the sinNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinNum(String value) {
        this.sinNum = value;
    }

    /**
     * Gets the value of the cmoVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmoVal() {
        return cmoVal;
    }

    /**
     * Sets the value of the cmoVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmoVal(String value) {
        this.cmoVal = value;
    }

    /**
     * Gets the value of the pcVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcVersion() {
        return pcVersion;
    }

    /**
     * Sets the value of the pcVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcVersion(String value) {
        this.pcVersion = value;
    }

    /**
     * Gets the value of the physicalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalDescription() {
        return physicalDescription;
    }

    /**
     * Sets the value of the physicalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalDescription(String value) {
        this.physicalDescription = value;
    }

    /**
     * Gets the value of the payWoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayWoid() {
        return payWoid;
    }

    /**
     * Sets the value of the payWoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayWoid(String value) {
        this.payWoid = value;
    }

    /**
     * Gets the value of the ani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAni() {
        return ani;
    }

    /**
     * Sets the value of the ani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAni(String value) {
        this.ani = value;
    }

    /**
     * Gets the value of the mtKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMtKey() {
        return mtKey;
    }

    /**
     * Sets the value of the mtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMtKey(BigDecimal value) {
        this.mtKey = value;
    }

    /**
     * Gets the value of the errorQFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorQFlag() {
        return errorQFlag;
    }

    /**
     * Sets the value of the errorQFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorQFlag(String value) {
        this.errorQFlag = value;
    }

    /**
     * Gets the value of the pfcCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfcCardNumber() {
        return pfcCardNumber;
    }

    /**
     * Sets the value of the pfcCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfcCardNumber(String value) {
        this.pfcCardNumber = value;
    }

    /**
     * Gets the value of the bingoOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBingoOverride() {
        return bingoOverride;
    }

    /**
     * Sets the value of the bingoOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBingoOverride(String value) {
        this.bingoOverride = value;
    }

    /**
     * Gets the value of the changeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFlag() {
        return changeFlag;
    }

    /**
     * Sets the value of the changeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFlag(String value) {
        this.changeFlag = value;
    }

    /**
     * Gets the value of the pdRoutingAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdRoutingAccountNum() {
        return pdRoutingAccountNum;
    }

    /**
     * Sets the value of the pdRoutingAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdRoutingAccountNum(String value) {
        this.pdRoutingAccountNum = value;
    }

    /**
     * Gets the value of the qcRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcRefNum() {
        return qcRefNum;
    }

    /**
     * Sets the value of the qcRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcRefNum(String value) {
        this.qcRefNum = value;
    }

    /**
     * Gets the value of the qcCreditAcountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcCreditAcountNum() {
        return qcCreditAcountNum;
    }

    /**
     * Sets the value of the qcCreditAcountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcCreditAcountNum(String value) {
        this.qcCreditAcountNum = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType2() {
        return idType2;
    }

    /**
     * Sets the value of the idType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType2(String value) {
        this.idType2 = value;
    }

    /**
     * Gets the value of the idNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber2() {
        return idNumber2;
    }

    /**
     * Sets the value of the idNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber2(String value) {
        this.idNumber2 = value;
    }

    /**
     * Gets the value of the creditCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNum() {
        return creditCardNum;
    }

    /**
     * Sets the value of the creditCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNum(String value) {
        this.creditCardNum = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDate(String value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanner(String value) {
        this.banner = value;
    }

    /**
     * Gets the value of the rateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateFlag() {
        return rateFlag;
    }

    /**
     * Sets the value of the rateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateFlag(String value) {
        this.rateFlag = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the permanentChangeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermanentChangeFlag() {
        return permanentChangeFlag;
    }

    /**
     * Sets the value of the permanentChangeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermanentChangeFlag(String value) {
        this.permanentChangeFlag = value;
    }

    /**
     * Gets the value of the rcvAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvAddressType() {
        return rcvAddressType;
    }

    /**
     * Sets the value of the rcvAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvAddressType(String value) {
        this.rcvAddressType = value;
    }

    /**
     * Gets the value of the dlvsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvsCode() {
        return dlvsCode;
    }

    /**
     * Sets the value of the dlvsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvsCode(String value) {
        this.dlvsCode = value;
    }

    /**
     * Gets the value of the dlvsFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvsFlags() {
        return dlvsFlags;
    }

    /**
     * Sets the value of the dlvsFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvsFlags(String value) {
        this.dlvsFlags = value;
    }

    /**
     * Gets the value of the qcvsResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQcvsResponseCode() {
        return qcvsResponseCode;
    }

    /**
     * Sets the value of the qcvsResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQcvsResponseCode(BigDecimal value) {
        this.qcvsResponseCode = value;
    }

    /**
     * Gets the value of the qcOrigCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcOrigCity() {
        return qcOrigCity;
    }

    /**
     * Sets the value of the qcOrigCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcOrigCity(String value) {
        this.qcOrigCity = value;
    }

    /**
     * Gets the value of the qcOrigCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcOrigCompany() {
        return qcOrigCompany;
    }

    /**
     * Sets the value of the qcOrigCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcOrigCompany(String value) {
        this.qcOrigCompany = value;
    }

    /**
     * Gets the value of the qcOrigAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcOrigAccount() {
        return qcOrigAccount;
    }

    /**
     * Sets the value of the qcOrigAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcOrigAccount(String value) {
        this.qcOrigAccount = value;
    }

    /**
     * Gets the value of the qcMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcMessage() {
        return qcMessage;
    }

    /**
     * Sets the value of the qcMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcMessage(String value) {
        this.qcMessage = value;
    }

    /**
     * Gets the value of the promoPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoPin() {
        return promoPin;
    }

    /**
     * Sets the value of the promoPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoPin(String value) {
        this.promoPin = value;
    }

    /**
     * Gets the value of the promoPinText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoPinText() {
        return promoPinText;
    }

    /**
     * Sets the value of the promoPinText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoPinText(String value) {
        this.promoPinText = value;
    }

    /**
     * Gets the value of the promos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromos() {
        return promos;
    }

    /**
     * Sets the value of the promos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromos(String value) {
        this.promos = value;
    }

    /**
     * Gets the value of the firstUseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstUseFlag() {
        return firstUseFlag;
    }

    /**
     * Sets the value of the firstUseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstUseFlag(String value) {
        this.firstUseFlag = value;
    }

    /**
     * Gets the value of the sndNameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndNameType() {
        return sndNameType;
    }

    /**
     * Sets the value of the sndNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndNameType(String value) {
        this.sndNameType = value;
    }

    /**
     * Gets the value of the sndAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndAddressType() {
        return sndAddressType;
    }

    /**
     * Sets the value of the sndAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndAddressType(String value) {
        this.sndAddressType = value;
    }

    /**
     * Gets the value of the rcvNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvNumber() {
        return rcvNumber;
    }

    /**
     * Sets the value of the rcvNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvNumber(String value) {
        this.rcvNumber = value;
    }

    /**
     * Gets the value of the recyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecyType() {
        return recyType;
    }

    /**
     * Sets the value of the recyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecyType(String value) {
        this.recyType = value;
    }

    /**
     * Gets the value of the sndAddrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndAddrLine1() {
        return sndAddrLine1;
    }

    /**
     * Sets the value of the sndAddrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndAddrLine1(String value) {
        this.sndAddrLine1 = value;
    }

    /**
     * Gets the value of the sndAddrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndAddrLine2() {
        return sndAddrLine2;
    }

    /**
     * Sets the value of the sndAddrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndAddrLine2(String value) {
        this.sndAddrLine2 = value;
    }

    /**
     * Gets the value of the sndAddrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndAddrLine3() {
        return sndAddrLine3;
    }

    /**
     * Sets the value of the sndAddrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndAddrLine3(String value) {
        this.sndAddrLine3 = value;
    }

    /**
     * Gets the value of the sndCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndCity() {
        return sndCity;
    }

    /**
     * Sets the value of the sndCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndCity(String value) {
        this.sndCity = value;
    }

    /**
     * Gets the value of the sndState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndState() {
        return sndState;
    }

    /**
     * Sets the value of the sndState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndState(String value) {
        this.sndState = value;
    }

    /**
     * Gets the value of the sndCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndCountry() {
        return sndCountry;
    }

    /**
     * Sets the value of the sndCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndCountry(String value) {
        this.sndCountry = value;
    }

    /**
     * Gets the value of the sndPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndPostalCode() {
        return sndPostalCode;
    }

    /**
     * Sets the value of the sndPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndPostalCode(String value) {
        this.sndPostalCode = value;
    }

    /**
     * Gets the value of the rcvAddrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvAddrLine1() {
        return rcvAddrLine1;
    }

    /**
     * Sets the value of the rcvAddrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvAddrLine1(String value) {
        this.rcvAddrLine1 = value;
    }

    /**
     * Gets the value of the rcvAddrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvAddrLine2() {
        return rcvAddrLine2;
    }

    /**
     * Sets the value of the rcvAddrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvAddrLine2(String value) {
        this.rcvAddrLine2 = value;
    }

    /**
     * Gets the value of the rcvAddrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvAddrLine3() {
        return rcvAddrLine3;
    }

    /**
     * Sets the value of the rcvAddrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvAddrLine3(String value) {
        this.rcvAddrLine3 = value;
    }

    /**
     * Gets the value of the rcvCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvCity() {
        return rcvCity;
    }

    /**
     * Sets the value of the rcvCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvCity(String value) {
        this.rcvCity = value;
    }

    /**
     * Gets the value of the rcvState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvState() {
        return rcvState;
    }

    /**
     * Sets the value of the rcvState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvState(String value) {
        this.rcvState = value;
    }

    /**
     * Gets the value of the rcvCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvCountry() {
        return rcvCountry;
    }

    /**
     * Sets the value of the rcvCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvCountry(String value) {
        this.rcvCountry = value;
    }

    /**
     * Gets the value of the rcvPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvPostalCode() {
        return rcvPostalCode;
    }

    /**
     * Sets the value of the rcvPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvPostalCode(String value) {
        this.rcvPostalCode = value;
    }

    /**
     * Gets the value of the sndCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndCookie() {
        return sndCookie;
    }

    /**
     * Sets the value of the sndCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndCookie(String value) {
        this.sndCookie = value;
    }

    /**
     * Gets the value of the rcvCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvCookie() {
        return rcvCookie;
    }

    /**
     * Sets the value of the rcvCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvCookie(String value) {
        this.rcvCookie = value;
    }

    /**
     * Gets the value of the rcvNameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvNameType() {
        return rcvNameType;
    }

    /**
     * Sets the value of the rcvNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvNameType(String value) {
        this.rcvNameType = value;
    }

    /**
     * Gets the value of the rcvAddrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvAddrType() {
        return rcvAddrType;
    }

    /**
     * Sets the value of the rcvAddrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvAddrType(String value) {
        this.rcvAddrType = value;
    }

    /**
     * Gets the value of the pinFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinFlag() {
        return pinFlag;
    }

    /**
     * Sets the value of the pinFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinFlag(String value) {
        this.pinFlag = value;
    }

    /**
     * Gets the value of the qcErrorCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcErrorCount() {
        return qcErrorCount;
    }

    /**
     * Sets the value of the qcErrorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcErrorCount(String value) {
        this.qcErrorCount = value;
    }

    /**
     * Gets the value of the sysTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTrace() {
        return sysTrace;
    }

    /**
     * Sets the value of the sysTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysTrace(String value) {
        this.sysTrace = value;
    }

    /**
     * Gets the value of the checkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNum() {
        return checkNum;
    }

    /**
     * Sets the value of the checkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNum(String value) {
        this.checkNum = value;
    }

    /**
     * Gets the value of the splitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitIndicator() {
        return splitIndicator;
    }

    /**
     * Sets the value of the splitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitIndicator(String value) {
        this.splitIndicator = value;
    }

    /**
     * Gets the value of the senderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderId(String value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the netId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetId() {
        return netId;
    }

    /**
     * Sets the value of the netId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetId(String value) {
        this.netId = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the merchantLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantLocation() {
        return merchantLocation;
    }

    /**
     * Sets the value of the merchantLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantLocation(String value) {
        this.merchantLocation = value;
    }

    /**
     * Gets the value of the confirmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmCode() {
        return confirmCode;
    }

    /**
     * Sets the value of the confirmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmCode(String value) {
        this.confirmCode = value;
    }

    /**
     * Gets the value of the interconnectData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterconnectData() {
        return interconnectData;
    }

    /**
     * Sets the value of the interconnectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterconnectData(String value) {
        this.interconnectData = value;
    }

    /**
     * Gets the value of the interconnectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterconnectId() {
        return interconnectId;
    }

    /**
     * Sets the value of the interconnectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterconnectId(String value) {
        this.interconnectId = value;
    }

    /**
     * Gets the value of the dcPinNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcPinNum() {
        return dcPinNum;
    }

    /**
     * Sets the value of the dcPinNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcPinNum(String value) {
        this.dcPinNum = value;
    }

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelId(String value) {
        this.modelId = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundType(String value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the operatorComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorComments() {
        return operatorComments;
    }

    /**
     * Sets the value of the operatorComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorComments(String value) {
        this.operatorComments = value;
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
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the rcvEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvEmail() {
        return rcvEmail;
    }

    /**
     * Sets the value of the rcvEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvEmail(String value) {
        this.rcvEmail = value;
    }

    /**
     * Gets the value of the cvvii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvvii() {
        return cvvii;
    }

    /**
     * Sets the value of the cvvii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvvii(String value) {
        this.cvvii = value;
    }

    /**
     * Gets the value of the origEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigEmail() {
        return origEmail;
    }

    /**
     * Sets the value of the origEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigEmail(String value) {
        this.origEmail = value;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicense(String value) {
        this.driversLicense = value;
    }

    /**
     * Gets the value of the checkRotingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckRotingInfo() {
        return checkRotingInfo;
    }

    /**
     * Sets the value of the checkRotingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckRotingInfo(String value) {
        this.checkRotingInfo = value;
    }

    /**
     * Gets the value of the checkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckType() {
        return checkType;
    }

    /**
     * Sets the value of the checkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckType(String value) {
        this.checkType = value;
    }

    /**
     * Gets the value of the sendMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMtcn() {
        return sendMtcn;
    }

    /**
     * Sets the value of the sendMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMtcn(String value) {
        this.sendMtcn = value;
    }

    /**
     * Gets the value of the driversLicenseState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseState() {
        return driversLicenseState;
    }

    /**
     * Sets the value of the driversLicenseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseState(String value) {
        this.driversLicenseState = value;
    }

    /**
     * Gets the value of the transModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransModifier() {
        return transModifier;
    }

    /**
     * Sets the value of the transModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransModifier(String value) {
        this.transModifier = value;
    }

    /**
     * Gets the value of the sndUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndUserId() {
        return sndUserId;
    }

    /**
     * Sets the value of the sndUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndUserId(String value) {
        this.sndUserId = value;
    }

    /**
     * Gets the value of the rcvUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvUserId() {
        return rcvUserId;
    }

    /**
     * Sets the value of the rcvUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvUserId(String value) {
        this.rcvUserId = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the ipsCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsCardNum() {
        return ipsCardNum;
    }

    /**
     * Sets the value of the ipsCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsCardNum(String value) {
        this.ipsCardNum = value;
    }

    /**
     * Gets the value of the ipsCardBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIpsCardBal() {
        return ipsCardBal;
    }

    /**
     * Sets the value of the ipsCardBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIpsCardBal(BigDecimal value) {
        this.ipsCardBal = value;
    }

    /**
     * Gets the value of the ipsCardNumLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsCardNumLoaded() {
        return ipsCardNumLoaded;
    }

    /**
     * Sets the value of the ipsCardNumLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsCardNumLoaded(String value) {
        this.ipsCardNumLoaded = value;
    }

    /**
     * Gets the value of the ipdFundsLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIpdFundsLoaded() {
        return ipdFundsLoaded;
    }

    /**
     * Sets the value of the ipdFundsLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIpdFundsLoaded(BigDecimal value) {
        this.ipdFundsLoaded = value;
    }

    /**
     * Gets the value of the ipsFundsPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsFundsPartner() {
        return ipsFundsPartner;
    }

    /**
     * Sets the value of the ipsFundsPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsFundsPartner(String value) {
        this.ipsFundsPartner = value;
    }

    /**
     * Gets the value of the ipsDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsDate() {
        return ipsDate;
    }

    /**
     * Sets the value of the ipsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsDate(String value) {
        this.ipsDate = value;
    }

    /**
     * Gets the value of the ipsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsStatus() {
        return ipsStatus;
    }

    /**
     * Sets the value of the ipsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsStatus(String value) {
        this.ipsStatus = value;
    }

    /**
     * Gets the value of the ipsPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsPin() {
        return ipsPin;
    }

    /**
     * Sets the value of the ipsPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsPin(String value) {
        this.ipsPin = value;
    }

    /**
     * Gets the value of the ipsMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsMaidenName() {
        return ipsMaidenName;
    }

    /**
     * Sets the value of the ipsMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsMaidenName(String value) {
        this.ipsMaidenName = value;
    }

    /**
     * Gets the value of the ipsAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpsAuthCode() {
        return ipsAuthCode;
    }

    /**
     * Sets the value of the ipsAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpsAuthCode(String value) {
        this.ipsAuthCode = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the customerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLevel() {
        return customerLevel;
    }

    /**
     * Sets the value of the customerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLevel(String value) {
        this.customerLevel = value;
    }

    /**
     * Gets the value of the shareFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareFlag() {
        return shareFlag;
    }

    /**
     * Sets the value of the shareFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareFlag(String value) {
        this.shareFlag = value;
    }

    /**
     * Gets the value of the mailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailFlag() {
        return mailFlag;
    }

    /**
     * Sets the value of the mailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailFlag(String value) {
        this.mailFlag = value;
    }

    /**
     * Gets the value of the optFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptFlag() {
        return optFlag;
    }

    /**
     * Sets the value of the optFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptFlag(String value) {
        this.optFlag = value;
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
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoints(String value) {
        this.points = value;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the redemptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionType() {
        return redemptionType;
    }

    /**
     * Sets the value of the redemptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionType(String value) {
        this.redemptionType = value;
    }

    /**
     * Gets the value of the redemptionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionValue() {
        return redemptionValue;
    }

    /**
     * Sets the value of the redemptionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionValue(String value) {
        this.redemptionValue = value;
    }

    /**
     * Gets the value of the pinText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinText() {
        return pinText;
    }

    /**
     * Sets the value of the pinText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinText(String value) {
        this.pinText = value;
    }

    /**
     * Gets the value of the lastScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastScore() {
        return lastScore;
    }

    /**
     * Sets the value of the lastScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastScore(String value) {
        this.lastScore = value;
    }

    /**
     * Gets the value of the lexnexFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLexnexFlags() {
        return lexnexFlags;
    }

    /**
     * Sets the value of the lexnexFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLexnexFlags(String value) {
        this.lexnexFlags = value;
    }

    /**
     * Gets the value of the callingPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPhone() {
        return callingPhone;
    }

    /**
     * Sets the value of the callingPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPhone(String value) {
        this.callingPhone = value;
    }

    /**
     * Gets the value of the addrVerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrVerCode() {
        return addrVerCode;
    }

    /**
     * Sets the value of the addrVerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrVerCode(String value) {
        this.addrVerCode = value;
    }

    /**
     * Gets the value of the refundFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundFlags() {
        return refundFlags;
    }

    /**
     * Sets the value of the refundFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundFlags(String value) {
        this.refundFlags = value;
    }

    /**
     * Gets the value of the refundReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Sets the value of the refundReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReason(String value) {
        this.refundReason = value;
    }

    /**
     * Gets the value of the avsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * Sets the value of the avsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCode(String value) {
        this.avsCode = value;
    }

    /**
     * Gets the value of the cscCautionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCscCautionFlag() {
        return cscCautionFlag;
    }

    /**
     * Sets the value of the cscCautionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCscCautionFlag(String value) {
        this.cscCautionFlag = value;
    }

    /**
     * Gets the value of the firstTmtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstTmtFlag() {
        return firstTmtFlag;
    }

    /**
     * Sets the value of the firstTmtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstTmtFlag(String value) {
        this.firstTmtFlag = value;
    }

    /**
     * Gets the value of the phoneUsedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneUsedFlag() {
        return phoneUsedFlag;
    }

    /**
     * Sets the value of the phoneUsedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneUsedFlag(String value) {
        this.phoneUsedFlag = value;
    }

    /**
     * Gets the value of the phoneListing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneListing() {
        return phoneListing;
    }

    /**
     * Sets the value of the phoneListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneListing(String value) {
        this.phoneListing = value;
    }

    /**
     * Gets the value of the employCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployCode() {
        return employCode;
    }

    /**
     * Sets the value of the employCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployCode(String value) {
        this.employCode = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the businessUa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUa() {
        return businessUa;
    }

    /**
     * Sets the value of the businessUa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUa(String value) {
        this.businessUa = value;
    }

    /**
     * Gets the value of the commentLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentLine() {
        return commentLine;
    }

    /**
     * Sets the value of the commentLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentLine(String value) {
        this.commentLine = value;
    }

    /**
     * Gets the value of the fixedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedFlag() {
        return fixedFlag;
    }

    /**
     * Sets the value of the fixedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedFlag(String value) {
        this.fixedFlag = value;
    }

    /**
     * Gets the value of the attentionLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionLine() {
        return attentionLine;
    }

    /**
     * Sets the value of the attentionLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionLine(String value) {
        this.attentionLine = value;
    }

    /**
     * Gets the value of the tmtStaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmtStaging() {
        return tmtStaging;
    }

    /**
     * Sets the value of the tmtStaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmtStaging(String value) {
        this.tmtStaging = value;
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
     * Gets the value of the serverError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerError() {
        return serverError;
    }

    /**
     * Sets the value of the serverError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerError(String value) {
        this.serverError = value;
    }

    /**
     * Gets the value of the promoSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoSequence() {
        return promoSequence;
    }

    /**
     * Sets the value of the promoSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoSequence(String value) {
        this.promoSequence = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the connectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * Sets the value of the connectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * Gets the value of the totalPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPoints() {
        return totalPoints;
    }

    /**
     * Sets the value of the totalPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPoints(String value) {
        this.totalPoints = value;
    }

    /**
     * Gets the value of the bankregData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankregData() {
        return bankregData;
    }

    /**
     * Sets the value of the bankregData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankregData(String value) {
        this.bankregData = value;
    }

    /**
     * Gets the value of the tpOptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpOptionFlag() {
        return tpOptionFlag;
    }

    /**
     * Sets the value of the tpOptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpOptionFlag(String value) {
        this.tpOptionFlag = value;
    }

    /**
     * Gets the value of the languageFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageFlag() {
        return languageFlag;
    }

    /**
     * Sets the value of the languageFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageFlag(String value) {
        this.languageFlag = value;
    }

    /**
     * Gets the value of the hostCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostCustId() {
        return hostCustId;
    }

    /**
     * Sets the value of the hostCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostCustId(String value) {
        this.hostCustId = value;
    }

    /**
     * Gets the value of the hostUpdateField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostUpdateField() {
        return hostUpdateField;
    }

    /**
     * Sets the value of the hostUpdateField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostUpdateField(String value) {
        this.hostUpdateField = value;
    }

    /**
     * Gets the value of the ecIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcIndicator() {
        return ecIndicator;
    }

    /**
     * Sets the value of the ecIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcIndicator(String value) {
        this.ecIndicator = value;
    }

    /**
     * Gets the value of the acsVerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsVerId() {
        return acsVerId;
    }

    /**
     * Sets the value of the acsVerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsVerId(String value) {
        this.acsVerId = value;
    }

    /**
     * Gets the value of the hostMessage2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMessage2() {
        return hostMessage2;
    }

    /**
     * Sets the value of the hostMessage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMessage2(String value) {
        this.hostMessage2 = value;
    }

    /**
     * Gets the value of the receiptOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptOptOut() {
        return receiptOptOut;
    }

    /**
     * Sets the value of the receiptOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptOptOut(String value) {
        this.receiptOptOut = value;
    }

    /**
     * Gets the value of the promoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDescription() {
        return promoDescription;
    }

    /**
     * Sets the value of the promoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDescription(String value) {
        this.promoDescription = value;
    }

    /**
     * Gets the value of the autoEnrollFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEnrollFlag() {
        return autoEnrollFlag;
    }

    /**
     * Sets the value of the autoEnrollFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEnrollFlag(String value) {
        this.autoEnrollFlag = value;
    }

    /**
     * Gets the value of the autoEnrollRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEnrollRule() {
        return autoEnrollRule;
    }

    /**
     * Sets the value of the autoEnrollRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEnrollRule(String value) {
        this.autoEnrollRule = value;
    }

    /**
     * Gets the value of the autoEnrollText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEnrollText() {
        return autoEnrollText;
    }

    /**
     * Sets the value of the autoEnrollText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEnrollText(String value) {
        this.autoEnrollText = value;
    }

    /**
     * Gets the value of the origCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCountry() {
        return origCountry;
    }

    /**
     * Sets the value of the origCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCountry(String value) {
        this.origCountry = value;
    }

    /**
     * Gets the value of the payoutamountlrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTAMOUNTLRD() {
        return payoutamountlrd;
    }

    /**
     * Sets the value of the payoutamountlrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTAMOUNTLRD(String value) {
        this.payoutamountlrd = value;
    }

    /**
     * Gets the value of the payoutamountusd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYOUTAMOUNTUSD() {
        return payoutamountusd;
    }

    /**
     * Sets the value of the payoutamountusd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYOUTAMOUNTUSD(String value) {
        this.payoutamountusd = value;
    }

    /**
     * Gets the value of the exchangeratelrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCHANGERATELRD() {
        return exchangeratelrd;
    }

    /**
     * Sets the value of the exchangeratelrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCHANGERATELRD(String value) {
        this.exchangeratelrd = value;
    }

    /**
     * Gets the value of the exchnagerateusd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCHNAGERATEUSD() {
        return exchnagerateusd;
    }

    /**
     * Sets the value of the exchnagerateusd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCHNAGERATEUSD(String value) {
        this.exchnagerateusd = value;
    }

}
