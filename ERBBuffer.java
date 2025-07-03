
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ERB_Buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ERB_Buffer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MarketVertical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SendCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DestinationCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SendCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DestinationCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DeliveredCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DeliveredState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MoneyAvailableinHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MoneyAvailableinMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CancelDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RefundDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RefundReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionRefundableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CanCancelTransactionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RefundableAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FundAvailableinHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FundAvailableinMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PostingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DeliveryServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BlazeReturnResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FutureuseFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FutureuseFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SendDeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PayDeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionSuspendedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionIdentifier" type="{http://www.westernunion.com/schema/xrsi}TransactionIdentifier" minOccurs="0"/>
 *         <element name="NameChangeAllowed" type="{http://www.westernunion.com/schema/xrsi}NameChangeFlag" minOccurs="0"/>
 *         <element name="BlazeResponseCode" type="{http://www.westernunion.com/schema/xrsi}saturn_blaze_response_code" minOccurs="0"/>
 *         <element name="ComplianceCode" type="{http://www.westernunion.com/schema/xrsi}compliance_code" minOccurs="0"/>
 *         <element name="UnisysCode" type="{http://www.westernunion.com/schema/xrsi}unisys_code" minOccurs="0"/>
 *         <element name="CancelPending" type="{http://www.westernunion.com/schema/xrsi}CancelPending" minOccurs="0"/>
 *         <element name="RefundPending" type="{http://www.westernunion.com/schema/xrsi}RefundPending" minOccurs="0"/>
 *         <element name="CaseCreationAllowed" type="{http://www.westernunion.com/schema/xrsi}CaseCreationFlag" minOccurs="0"/>
 *         <element name="ReceiverDirectedIndicator" type="{http://www.westernunion.com/schema/xrsi}ReceiverDirectedIndicator" minOccurs="0"/>
 *         <element name="RedirectCount" type="{http://www.westernunion.com/schema/xrsi}RedirectCount" minOccurs="0"/>
 *         <element name="APN_Substatus" type="{http://www.westernunion.com/schema/xrsi}APN_Substatus" minOccurs="0"/>
 *         <element name="DR_mtcn" type="{http://www.westernunion.com/schema/xrsi}new_mtcn" minOccurs="0"/>
 *         <element name="MTType" type="{http://www.westernunion.com/schema/xrsi}MTType" minOccurs="0"/>
 *         <element name="rd_status" type="{http://www.westernunion.com/schema/xrsi}rd_status" minOccurs="0"/>
 *         <element name="old_mtcn" type="{http://www.westernunion.com/schema/xrsi}new_mtcn" minOccurs="0"/>
 *         <element name="drt_decision" type="{http://www.westernunion.com/schema/xrsi}drt_decision" minOccurs="0"/>
 *         <element name="CSC_txn_identifier" type="{http://www.westernunion.com/schema/xrsi}CSC_txn_identifier" minOccurs="0"/>
 *         <element name="cancel_indicator" type="{http://www.westernunion.com/schema/xrsi}CancelIndicator" minOccurs="0"/>
 *         <element name="kycStatusFlag" type="{http://www.westernunion.com/schema/xrsi}kycStatusFlag" minOccurs="0"/>
 *         <element name="send_hold_expiry_dt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pay_hold_expiry_dt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RejectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RejectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DepositDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ERB_Buffer", propOrder = {
    "marketVertical",
    "sendCurrencyCode",
    "destinationCurrencyCode",
    "sendCountryCode",
    "destinationCountryCode",
    "exchangeRate",
    "deliveredCity",
    "deliveredState",
    "moneyAvailableinHours",
    "moneyAvailableinMinutes",
    "channel",
    "cancelDate",
    "cancelReason",
    "refundDate",
    "refundReason",
    "transactionRefundableFlag",
    "canCancelTransactionFlag",
    "refundableAmount",
    "fundAvailableinHours",
    "fundAvailableinMinutes",
    "postingDate",
    "deliveryDate",
    "deliveryServiceCode",
    "blazeReturnResponse",
    "futureuseFlag1",
    "futureuseFlag2",
    "paymentMethod",
    "sendDeviceId",
    "payDeviceId",
    "promoCode",
    "transactionSuspendedStatus",
    "transactionIdentifier",
    "nameChangeAllowed",
    "blazeResponseCode",
    "complianceCode",
    "unisysCode",
    "cancelPending",
    "refundPending",
    "caseCreationAllowed",
    "receiverDirectedIndicator",
    "redirectCount",
    "apnSubstatus",
    "drMtcn",
    "mtType",
    "rdStatus",
    "oldMtcn",
    "drtDecision",
    "cscTxnIdentifier",
    "cancelIndicator",
    "kycStatusFlag",
    "sendHoldExpiryDt",
    "payHoldExpiryDt",
    "rejectCode",
    "rejectReason",
    "depositDate"
})
public class ERBBuffer {

    @XmlElement(name = "MarketVertical")
    protected String marketVertical;
    @XmlElement(name = "SendCurrencyCode")
    protected String sendCurrencyCode;
    @XmlElement(name = "DestinationCurrencyCode")
    protected String destinationCurrencyCode;
    @XmlElement(name = "SendCountryCode")
    protected String sendCountryCode;
    @XmlElement(name = "DestinationCountryCode")
    protected String destinationCountryCode;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "DeliveredCity")
    protected String deliveredCity;
    @XmlElement(name = "DeliveredState")
    protected String deliveredState;
    @XmlElement(name = "MoneyAvailableinHours")
    protected String moneyAvailableinHours;
    @XmlElement(name = "MoneyAvailableinMinutes")
    protected String moneyAvailableinMinutes;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "CancelDate")
    protected String cancelDate;
    @XmlElement(name = "CancelReason")
    protected String cancelReason;
    @XmlElement(name = "RefundDate")
    protected String refundDate;
    @XmlElement(name = "RefundReason")
    protected String refundReason;
    @XmlElement(name = "TransactionRefundableFlag")
    protected String transactionRefundableFlag;
    @XmlElement(name = "CanCancelTransactionFlag")
    protected String canCancelTransactionFlag;
    @XmlElement(name = "RefundableAmount")
    protected String refundableAmount;
    @XmlElement(name = "FundAvailableinHours")
    protected String fundAvailableinHours;
    @XmlElement(name = "FundAvailableinMinutes")
    protected String fundAvailableinMinutes;
    @XmlElement(name = "PostingDate")
    protected String postingDate;
    @XmlElement(name = "DeliveryDate")
    protected String deliveryDate;
    @XmlElement(name = "DeliveryServiceCode")
    protected String deliveryServiceCode;
    @XmlElement(name = "BlazeReturnResponse")
    protected String blazeReturnResponse;
    @XmlElement(name = "FutureuseFlag1")
    protected String futureuseFlag1;
    @XmlElement(name = "FutureuseFlag2")
    protected String futureuseFlag2;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "SendDeviceId")
    protected String sendDeviceId;
    @XmlElement(name = "PayDeviceId")
    protected String payDeviceId;
    @XmlElement(name = "PromoCode")
    protected String promoCode;
    @XmlElement(name = "TransactionSuspendedStatus")
    protected String transactionSuspendedStatus;
    @XmlElement(name = "TransactionIdentifier")
    @XmlSchemaType(name = "string")
    protected TransactionIdentifier transactionIdentifier;
    @XmlElement(name = "NameChangeAllowed")
    @XmlSchemaType(name = "string")
    protected NameChangeFlag nameChangeAllowed;
    @XmlElement(name = "BlazeResponseCode")
    protected String blazeResponseCode;
    @XmlElement(name = "ComplianceCode")
    protected String complianceCode;
    @XmlElement(name = "UnisysCode")
    protected String unisysCode;
    @XmlElement(name = "CancelPending")
    @XmlSchemaType(name = "string")
    protected CancelPending cancelPending;
    @XmlElement(name = "RefundPending")
    @XmlSchemaType(name = "string")
    protected RefundPending refundPending;
    @XmlElement(name = "CaseCreationAllowed")
    @XmlSchemaType(name = "string")
    protected CaseCreationFlag caseCreationAllowed;
    @XmlElement(name = "ReceiverDirectedIndicator")
    @XmlSchemaType(name = "string")
    protected ReceiverDirectedIndicator receiverDirectedIndicator;
    @XmlElement(name = "RedirectCount")
    protected String redirectCount;
    @XmlElement(name = "APN_Substatus")
    protected String apnSubstatus;
    @XmlElement(name = "DR_mtcn")
    protected BigInteger drMtcn;
    @XmlElement(name = "MTType")
    protected String mtType;
    @XmlElement(name = "rd_status")
    @XmlSchemaType(name = "string")
    protected RdStatus rdStatus;
    @XmlElement(name = "old_mtcn")
    protected BigInteger oldMtcn;
    @XmlElement(name = "drt_decision")
    @XmlSchemaType(name = "string")
    protected DrtDecision drtDecision;
    @XmlElement(name = "CSC_txn_identifier")
    protected String cscTxnIdentifier;
    @XmlElement(name = "cancel_indicator")
    protected String cancelIndicator;
    protected String kycStatusFlag;
    @XmlElement(name = "send_hold_expiry_dt")
    protected String sendHoldExpiryDt;
    @XmlElement(name = "pay_hold_expiry_dt")
    protected String payHoldExpiryDt;
    @XmlElement(name = "RejectCode")
    protected String rejectCode;
    @XmlElement(name = "RejectReason")
    protected String rejectReason;
    @XmlElement(name = "DepositDate")
    protected String depositDate;

    /**
     * Gets the value of the marketVertical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketVertical() {
        return marketVertical;
    }

    /**
     * Sets the value of the marketVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketVertical(String value) {
        this.marketVertical = value;
    }

    /**
     * Gets the value of the sendCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCurrencyCode() {
        return sendCurrencyCode;
    }

    /**
     * Sets the value of the sendCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCurrencyCode(String value) {
        this.sendCurrencyCode = value;
    }

    /**
     * Gets the value of the destinationCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCurrencyCode() {
        return destinationCurrencyCode;
    }

    /**
     * Sets the value of the destinationCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCurrencyCode(String value) {
        this.destinationCurrencyCode = value;
    }

    /**
     * Gets the value of the sendCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendCountryCode() {
        return sendCountryCode;
    }

    /**
     * Sets the value of the sendCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendCountryCode(String value) {
        this.sendCountryCode = value;
    }

    /**
     * Gets the value of the destinationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the deliveredCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveredCity() {
        return deliveredCity;
    }

    /**
     * Sets the value of the deliveredCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredCity(String value) {
        this.deliveredCity = value;
    }

    /**
     * Gets the value of the deliveredState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveredState() {
        return deliveredState;
    }

    /**
     * Sets the value of the deliveredState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredState(String value) {
        this.deliveredState = value;
    }

    /**
     * Gets the value of the moneyAvailableinHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyAvailableinHours() {
        return moneyAvailableinHours;
    }

    /**
     * Sets the value of the moneyAvailableinHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyAvailableinHours(String value) {
        this.moneyAvailableinHours = value;
    }

    /**
     * Gets the value of the moneyAvailableinMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyAvailableinMinutes() {
        return moneyAvailableinMinutes;
    }

    /**
     * Sets the value of the moneyAvailableinMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyAvailableinMinutes(String value) {
        this.moneyAvailableinMinutes = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
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
     * Gets the value of the refundDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundDate() {
        return refundDate;
    }

    /**
     * Sets the value of the refundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundDate(String value) {
        this.refundDate = value;
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
     * Gets the value of the transactionRefundableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionRefundableFlag() {
        return transactionRefundableFlag;
    }

    /**
     * Sets the value of the transactionRefundableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionRefundableFlag(String value) {
        this.transactionRefundableFlag = value;
    }

    /**
     * Gets the value of the canCancelTransactionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanCancelTransactionFlag() {
        return canCancelTransactionFlag;
    }

    /**
     * Sets the value of the canCancelTransactionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanCancelTransactionFlag(String value) {
        this.canCancelTransactionFlag = value;
    }

    /**
     * Gets the value of the refundableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundableAmount() {
        return refundableAmount;
    }

    /**
     * Sets the value of the refundableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundableAmount(String value) {
        this.refundableAmount = value;
    }

    /**
     * Gets the value of the fundAvailableinHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundAvailableinHours() {
        return fundAvailableinHours;
    }

    /**
     * Sets the value of the fundAvailableinHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundAvailableinHours(String value) {
        this.fundAvailableinHours = value;
    }

    /**
     * Gets the value of the fundAvailableinMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundAvailableinMinutes() {
        return fundAvailableinMinutes;
    }

    /**
     * Sets the value of the fundAvailableinMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundAvailableinMinutes(String value) {
        this.fundAvailableinMinutes = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingDate(String value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
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
     * Gets the value of the blazeReturnResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlazeReturnResponse() {
        return blazeReturnResponse;
    }

    /**
     * Sets the value of the blazeReturnResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlazeReturnResponse(String value) {
        this.blazeReturnResponse = value;
    }

    /**
     * Gets the value of the futureuseFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureuseFlag1() {
        return futureuseFlag1;
    }

    /**
     * Sets the value of the futureuseFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureuseFlag1(String value) {
        this.futureuseFlag1 = value;
    }

    /**
     * Gets the value of the futureuseFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureuseFlag2() {
        return futureuseFlag2;
    }

    /**
     * Sets the value of the futureuseFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureuseFlag2(String value) {
        this.futureuseFlag2 = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the sendDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDeviceId() {
        return sendDeviceId;
    }

    /**
     * Sets the value of the sendDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDeviceId(String value) {
        this.sendDeviceId = value;
    }

    /**
     * Gets the value of the payDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDeviceId() {
        return payDeviceId;
    }

    /**
     * Sets the value of the payDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDeviceId(String value) {
        this.payDeviceId = value;
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
     * Gets the value of the transactionSuspendedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSuspendedStatus() {
        return transactionSuspendedStatus;
    }

    /**
     * Sets the value of the transactionSuspendedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSuspendedStatus(String value) {
        this.transactionSuspendedStatus = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier }
     *     
     */
    public TransactionIdentifier getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier }
     *     
     */
    public void setTransactionIdentifier(TransactionIdentifier value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the nameChangeAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link NameChangeFlag }
     *     
     */
    public NameChangeFlag getNameChangeAllowed() {
        return nameChangeAllowed;
    }

    /**
     * Sets the value of the nameChangeAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameChangeFlag }
     *     
     */
    public void setNameChangeAllowed(NameChangeFlag value) {
        this.nameChangeAllowed = value;
    }

    /**
     * Gets the value of the blazeResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlazeResponseCode() {
        return blazeResponseCode;
    }

    /**
     * Sets the value of the blazeResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlazeResponseCode(String value) {
        this.blazeResponseCode = value;
    }

    /**
     * Gets the value of the complianceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceCode() {
        return complianceCode;
    }

    /**
     * Sets the value of the complianceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceCode(String value) {
        this.complianceCode = value;
    }

    /**
     * Gets the value of the unisysCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnisysCode() {
        return unisysCode;
    }

    /**
     * Sets the value of the unisysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnisysCode(String value) {
        this.unisysCode = value;
    }

    /**
     * Gets the value of the cancelPending property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPending }
     *     
     */
    public CancelPending getCancelPending() {
        return cancelPending;
    }

    /**
     * Sets the value of the cancelPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPending }
     *     
     */
    public void setCancelPending(CancelPending value) {
        this.cancelPending = value;
    }

    /**
     * Gets the value of the refundPending property.
     * 
     * @return
     *     possible object is
     *     {@link RefundPending }
     *     
     */
    public RefundPending getRefundPending() {
        return refundPending;
    }

    /**
     * Sets the value of the refundPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundPending }
     *     
     */
    public void setRefundPending(RefundPending value) {
        this.refundPending = value;
    }

    /**
     * Gets the value of the caseCreationAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link CaseCreationFlag }
     *     
     */
    public CaseCreationFlag getCaseCreationAllowed() {
        return caseCreationAllowed;
    }

    /**
     * Sets the value of the caseCreationAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseCreationFlag }
     *     
     */
    public void setCaseCreationAllowed(CaseCreationFlag value) {
        this.caseCreationAllowed = value;
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
     * Gets the value of the apnSubstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPNSubstatus() {
        return apnSubstatus;
    }

    /**
     * Sets the value of the apnSubstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPNSubstatus(String value) {
        this.apnSubstatus = value;
    }

    /**
     * Gets the value of the drMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDRMtcn() {
        return drMtcn;
    }

    /**
     * Sets the value of the drMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDRMtcn(BigInteger value) {
        this.drMtcn = value;
    }

    /**
     * Gets the value of the mtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTType() {
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
    public void setMTType(String value) {
        this.mtType = value;
    }

    /**
     * Gets the value of the rdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RdStatus }
     *     
     */
    public RdStatus getRdStatus() {
        return rdStatus;
    }

    /**
     * Sets the value of the rdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RdStatus }
     *     
     */
    public void setRdStatus(RdStatus value) {
        this.rdStatus = value;
    }

    /**
     * Gets the value of the oldMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOldMtcn() {
        return oldMtcn;
    }

    /**
     * Sets the value of the oldMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOldMtcn(BigInteger value) {
        this.oldMtcn = value;
    }

    /**
     * Gets the value of the drtDecision property.
     * 
     * @return
     *     possible object is
     *     {@link DrtDecision }
     *     
     */
    public DrtDecision getDrtDecision() {
        return drtDecision;
    }

    /**
     * Sets the value of the drtDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrtDecision }
     *     
     */
    public void setDrtDecision(DrtDecision value) {
        this.drtDecision = value;
    }

    /**
     * Gets the value of the cscTxnIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCTxnIdentifier() {
        return cscTxnIdentifier;
    }

    /**
     * Sets the value of the cscTxnIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCTxnIdentifier(String value) {
        this.cscTxnIdentifier = value;
    }

    /**
     * Gets the value of the cancelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelIndicator() {
        return cancelIndicator;
    }

    /**
     * Sets the value of the cancelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelIndicator(String value) {
        this.cancelIndicator = value;
    }

    /**
     * Gets the value of the kycStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKycStatusFlag() {
        return kycStatusFlag;
    }

    /**
     * Sets the value of the kycStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKycStatusFlag(String value) {
        this.kycStatusFlag = value;
    }

    /**
     * Gets the value of the sendHoldExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendHoldExpiryDt() {
        return sendHoldExpiryDt;
    }

    /**
     * Sets the value of the sendHoldExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendHoldExpiryDt(String value) {
        this.sendHoldExpiryDt = value;
    }

    /**
     * Gets the value of the payHoldExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayHoldExpiryDt() {
        return payHoldExpiryDt;
    }

    /**
     * Sets the value of the payHoldExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayHoldExpiryDt(String value) {
        this.payHoldExpiryDt = value;
    }

    /**
     * Gets the value of the rejectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectCode() {
        return rejectCode;
    }

    /**
     * Sets the value of the rejectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectCode(String value) {
        this.rejectCode = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositDate(String value) {
        this.depositDate = value;
    }

}
