
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment_transaction_search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="payment_transaction_search">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         <element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         <element name="qp_company" type="{http://www.westernunion.com/schema/xrsi}qp_company" minOccurs="0"/>
 *         <element name="staged_pins" type="{http://www.westernunion.com/schema/xrsi}staged_pins" minOccurs="0"/>
 *         <element name="financials" type="{http://www.westernunion.com/schema/xrsi}financials" minOccurs="0"/>
 *         <element name="wu_product" type="{http://www.westernunion.com/schema/xrsi}wu_product" minOccurs="0"/>
 *         <element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}gbs_payment_details" minOccurs="0"/>
 *         <element name="billing_details" type="{http://www.westernunion.com/schema/xrsi}billing_details" minOccurs="0"/>
 *         <element name="bank_details" type="{http://www.westernunion.com/schema/xrsi}bank_details" minOccurs="0"/>
 *         <element name="wallet_details" type="{http://www.westernunion.com/schema/xrsi}wallet_details" minOccurs="0"/>
 *         <element name="promotions" type="{http://www.westernunion.com/schema/xrsi}promotions" minOccurs="0"/>
 *         <element name="delivery_services" type="{http://www.westernunion.com/schema/xrsi}delivery_services" minOccurs="0"/>
 *         <element name="emea_ii" type="{http://www.westernunion.com/schema/xrsi}emea_ii" minOccurs="0"/>
 *         <element name="encompass_status" type="{http://www.westernunion.com/schema/xrsi}encompass_status" minOccurs="0"/>
 *         <element name="encompass_reason_code" type="{http://www.westernunion.com/schema/xrsi}encompass_reason_code" minOccurs="0"/>
 *         <element name="filing_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="filing_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="money_transfer_key" type="{http://www.westernunion.com/schema/xrsi}money_transfer_key" minOccurs="0"/>
 *         <element name="yellow_phone_label" type="{http://www.westernunion.com/schema/xrsi}yellow_phone_lable" minOccurs="0"/>
 *         <element name="pay_status_description" type="{http://www.westernunion.com/schema/xrsi}pay_status_description" minOccurs="0"/>
 *         <element name="find_number" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mocn" minOccurs="0"/>
 *         <element name="new_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         <element name="msg_delivery_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="msg_type" type="{http://www.westernunion.com/schema/xrsi}msg_type" minOccurs="0"/>
 *         <element name="database_key" type="{http://www.westernunion.com/schema/xrsi}database_key" minOccurs="0"/>
 *         <element name="status" type="{http://www.westernunion.com/schema/xrsi}status" minOccurs="0"/>
 *         <element name="filing_account_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="wu_card" type="{http://www.westernunion.com/schema/xrsi}wu_card" minOccurs="0"/>
 *         <element name="fusion" type="{http://www.westernunion.com/schema/xrsi}fusion" minOccurs="0"/>
 *         <element name="wu_network_agent_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="conv_session_cookie" type="{http://www.westernunion.com/schema/xrsi}convenience_cookie" minOccurs="0"/>
 *         <element name="convenience_search" type="{http://www.westernunion.com/schema/xrsi}convenience_search" minOccurs="0"/>
 *         <element name="acs_verification_id" type="{http://www.westernunion.com/schema/xrsi}acs_verification_id" minOccurs="0"/>
 *         <element name="electronic_commerce_indicator" type="{http://www.westernunion.com/schema/xrsi}electronic_commerce_indicator" minOccurs="0"/>
 *         <element name="comment_details" type="{http://www.westernunion.com/schema/xrsi}comment_details" minOccurs="0"/>
 *         <element name="customer_profile" type="{http://www.westernunion.com/schema/xrsi}customer_profile" minOccurs="0"/>
 *         <element name="tpfla_operator" type="{http://www.westernunion.com/schema/xrsi}operator" minOccurs="0"/>
 *         <element name="link_share" type="{http://www.westernunion.com/schema/xrsi}link_share" minOccurs="0"/>
 *         <element name="ccscan_transaction_id" type="{http://www.westernunion.com/schema/xrsi}ccscan_transaction_id" minOccurs="0"/>
 *         <element name="system_trace" type="{http://www.westernunion.com/schema/xrsi}system_trace" minOccurs="0"/>
 *         <element name="visa_flag" type="{http://www.westernunion.com/schema/xrsi}visa_flag" minOccurs="0"/>
 *         <element name="visa_number" type="{http://www.westernunion.com/schema/xrsi}visa_number" minOccurs="0"/>
 *         <element name="visa_date" type="{http://www.westernunion.com/schema/xrsi}visa_date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_transaction_search", propOrder = {
    "sender",
    "receiver",
    "qpCompany",
    "stagedPins",
    "financials",
    "wuProduct",
    "paymentDetails",
    "billingDetails",
    "bankDetails",
    "walletDetails",
    "promotions",
    "deliveryServices",
    "emeaIi",
    "encompassStatus",
    "encompassReasonCode",
    "filingDate",
    "filingTime",
    "moneyTransferKey",
    "yellowPhoneLabel",
    "payStatusDescription",
    "findNumber",
    "mtcn",
    "newMtcn",
    "msgDeliveryDate",
    "msgType",
    "databaseKey",
    "status",
    "filingAccountNumber",
    "wuCard",
    "fusion",
    "wuNetworkAgentIndicator",
    "convSessionCookie",
    "convenienceSearch",
    "acsVerificationId",
    "electronicCommerceIndicator",
    "commentDetails",
    "customerProfile",
    "tpflaOperator",
    "linkShare",
    "ccscanTransactionId",
    "systemTrace",
    "visaFlag",
    "visaNumber",
    "visaDate"
})
public class PaymentTransactionSearch {

    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "qp_company")
    protected QpCompany qpCompany;
    @XmlElement(name = "staged_pins")
    protected StagedPins stagedPins;
    protected Financials financials;
    @XmlElement(name = "wu_product")
    protected WuProduct wuProduct;
    @XmlElement(name = "payment_details")
    protected GbsPaymentDetails paymentDetails;
    @XmlElement(name = "billing_details")
    protected BillingDetails billingDetails;
    @XmlElement(name = "bank_details")
    protected BankDetails bankDetails;
    @XmlElement(name = "wallet_details")
    protected WalletDetails walletDetails;
    protected Promotions promotions;
    @XmlElement(name = "delivery_services")
    protected DeliveryServices deliveryServices;
    @XmlElement(name = "emea_ii")
    protected EmeaIi emeaIi;
    @XmlElement(name = "encompass_status")
    protected String encompassStatus;
    @XmlElement(name = "encompass_reason_code")
    protected String encompassReasonCode;
    @XmlElement(name = "filing_date")
    protected String filingDate;
    @XmlElement(name = "filing_time")
    protected String filingTime;
    @XmlElement(name = "money_transfer_key")
    protected String moneyTransferKey;
    @XmlElement(name = "yellow_phone_label")
    protected String yellowPhoneLabel;
    @XmlElement(name = "pay_status_description")
    protected String payStatusDescription;
    @XmlElement(name = "find_number")
    protected BigInteger findNumber;
    protected String mtcn;
    @XmlElement(name = "new_mtcn")
    protected String newMtcn;
    @XmlElement(name = "msg_delivery_date")
    protected String msgDeliveryDate;
    @XmlElement(name = "msg_type")
    protected String msgType;
    @XmlElement(name = "database_key")
    protected String databaseKey;
    protected String status;
    @XmlElement(name = "filing_account_number")
    protected String filingAccountNumber;
    @XmlElement(name = "wu_card")
    protected WuCard wuCard;
    protected Fusion fusion;
    @XmlElement(name = "wu_network_agent_indicator")
    protected String wuNetworkAgentIndicator;
    @XmlElement(name = "conv_session_cookie")
    protected String convSessionCookie;
    @XmlElement(name = "convenience_search")
    protected ConvenienceSearch convenienceSearch;
    @XmlElement(name = "acs_verification_id")
    protected String acsVerificationId;
    @XmlElement(name = "electronic_commerce_indicator")
    protected String electronicCommerceIndicator;
    @XmlElement(name = "comment_details")
    protected CommentDetails commentDetails;
    @XmlElement(name = "customer_profile")
    protected CustomerProfile customerProfile;
    @XmlElement(name = "tpfla_operator")
    protected Operator tpflaOperator;
    @XmlElement(name = "link_share")
    protected String linkShare;
    @XmlElement(name = "ccscan_transaction_id")
    protected String ccscanTransactionId;
    @XmlElement(name = "system_trace")
    protected String systemTrace;
    @XmlElement(name = "visa_flag")
    protected String visaFlag;
    @XmlElement(name = "visa_number")
    protected String visaNumber;
    @XmlElement(name = "visa_date")
    protected String visaDate;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the qpCompany property.
     * 
     * @return
     *     possible object is
     *     {@link QpCompany }
     *     
     */
    public QpCompany getQpCompany() {
        return qpCompany;
    }

    /**
     * Sets the value of the qpCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link QpCompany }
     *     
     */
    public void setQpCompany(QpCompany value) {
        this.qpCompany = value;
    }

    /**
     * Gets the value of the stagedPins property.
     * 
     * @return
     *     possible object is
     *     {@link StagedPins }
     *     
     */
    public StagedPins getStagedPins() {
        return stagedPins;
    }

    /**
     * Sets the value of the stagedPins property.
     * 
     * @param value
     *     allowed object is
     *     {@link StagedPins }
     *     
     */
    public void setStagedPins(StagedPins value) {
        this.stagedPins = value;
    }

    /**
     * Gets the value of the financials property.
     * 
     * @return
     *     possible object is
     *     {@link Financials }
     *     
     */
    public Financials getFinancials() {
        return financials;
    }

    /**
     * Sets the value of the financials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financials }
     *     
     */
    public void setFinancials(Financials value) {
        this.financials = value;
    }

    /**
     * Gets the value of the wuProduct property.
     * 
     * @return
     *     possible object is
     *     {@link WuProduct }
     *     
     */
    public WuProduct getWuProduct() {
        return wuProduct;
    }

    /**
     * Sets the value of the wuProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link WuProduct }
     *     
     */
    public void setWuProduct(WuProduct value) {
        this.wuProduct = value;
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
     * Gets the value of the billingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetails }
     *     
     */
    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets the value of the billingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetails }
     *     
     */
    public void setBillingDetails(BillingDetails value) {
        this.billingDetails = value;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BankDetails }
     *     
     */
    public BankDetails getBankDetails() {
        return bankDetails;
    }

    /**
     * Sets the value of the bankDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankDetails }
     *     
     */
    public void setBankDetails(BankDetails value) {
        this.bankDetails = value;
    }

    /**
     * Gets the value of the walletDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WalletDetails }
     *     
     */
    public WalletDetails getWalletDetails() {
        return walletDetails;
    }

    /**
     * Sets the value of the walletDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletDetails }
     *     
     */
    public void setWalletDetails(WalletDetails value) {
        this.walletDetails = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link Promotions }
     *     
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotions }
     *     
     */
    public void setPromotions(Promotions value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the deliveryServices property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryServices }
     *     
     */
    public DeliveryServices getDeliveryServices() {
        return deliveryServices;
    }

    /**
     * Sets the value of the deliveryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryServices }
     *     
     */
    public void setDeliveryServices(DeliveryServices value) {
        this.deliveryServices = value;
    }

    /**
     * Gets the value of the emeaIi property.
     * 
     * @return
     *     possible object is
     *     {@link EmeaIi }
     *     
     */
    public EmeaIi getEmeaIi() {
        return emeaIi;
    }

    /**
     * Sets the value of the emeaIi property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmeaIi }
     *     
     */
    public void setEmeaIi(EmeaIi value) {
        this.emeaIi = value;
    }

    /**
     * Gets the value of the encompassStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncompassStatus() {
        return encompassStatus;
    }

    /**
     * Sets the value of the encompassStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncompassStatus(String value) {
        this.encompassStatus = value;
    }

    /**
     * Gets the value of the encompassReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncompassReasonCode() {
        return encompassReasonCode;
    }

    /**
     * Sets the value of the encompassReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncompassReasonCode(String value) {
        this.encompassReasonCode = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDate(String value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the filingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingTime() {
        return filingTime;
    }

    /**
     * Sets the value of the filingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingTime(String value) {
        this.filingTime = value;
    }

    /**
     * Gets the value of the moneyTransferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyTransferKey() {
        return moneyTransferKey;
    }

    /**
     * Sets the value of the moneyTransferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyTransferKey(String value) {
        this.moneyTransferKey = value;
    }

    /**
     * Gets the value of the yellowPhoneLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYellowPhoneLabel() {
        return yellowPhoneLabel;
    }

    /**
     * Sets the value of the yellowPhoneLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYellowPhoneLabel(String value) {
        this.yellowPhoneLabel = value;
    }

    /**
     * Gets the value of the payStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayStatusDescription() {
        return payStatusDescription;
    }

    /**
     * Sets the value of the payStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayStatusDescription(String value) {
        this.payStatusDescription = value;
    }

    /**
     * Gets the value of the findNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFindNumber() {
        return findNumber;
    }

    /**
     * Sets the value of the findNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFindNumber(BigInteger value) {
        this.findNumber = value;
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
     * Gets the value of the newMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMtcn() {
        return newMtcn;
    }

    /**
     * Sets the value of the newMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMtcn(String value) {
        this.newMtcn = value;
    }

    /**
     * Gets the value of the msgDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDeliveryDate() {
        return msgDeliveryDate;
    }

    /**
     * Sets the value of the msgDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDeliveryDate(String value) {
        this.msgDeliveryDate = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the databaseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseKey() {
        return databaseKey;
    }

    /**
     * Sets the value of the databaseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseKey(String value) {
        this.databaseKey = value;
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
     * Gets the value of the filingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingAccountNumber() {
        return filingAccountNumber;
    }

    /**
     * Sets the value of the filingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingAccountNumber(String value) {
        this.filingAccountNumber = value;
    }

    /**
     * Gets the value of the wuCard property.
     * 
     * @return
     *     possible object is
     *     {@link WuCard }
     *     
     */
    public WuCard getWuCard() {
        return wuCard;
    }

    /**
     * Sets the value of the wuCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link WuCard }
     *     
     */
    public void setWuCard(WuCard value) {
        this.wuCard = value;
    }

    /**
     * Gets the value of the fusion property.
     * 
     * @return
     *     possible object is
     *     {@link Fusion }
     *     
     */
    public Fusion getFusion() {
        return fusion;
    }

    /**
     * Sets the value of the fusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fusion }
     *     
     */
    public void setFusion(Fusion value) {
        this.fusion = value;
    }

    /**
     * Gets the value of the wuNetworkAgentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWuNetworkAgentIndicator() {
        return wuNetworkAgentIndicator;
    }

    /**
     * Sets the value of the wuNetworkAgentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWuNetworkAgentIndicator(String value) {
        this.wuNetworkAgentIndicator = value;
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
     * Gets the value of the convenienceSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ConvenienceSearch }
     *     
     */
    public ConvenienceSearch getConvenienceSearch() {
        return convenienceSearch;
    }

    /**
     * Sets the value of the convenienceSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvenienceSearch }
     *     
     */
    public void setConvenienceSearch(ConvenienceSearch value) {
        this.convenienceSearch = value;
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
     * Gets the value of the electronicCommerceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicCommerceIndicator() {
        return electronicCommerceIndicator;
    }

    /**
     * Sets the value of the electronicCommerceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicCommerceIndicator(String value) {
        this.electronicCommerceIndicator = value;
    }

    /**
     * Gets the value of the commentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommentDetails }
     *     
     */
    public CommentDetails getCommentDetails() {
        return commentDetails;
    }

    /**
     * Sets the value of the commentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentDetails }
     *     
     */
    public void setCommentDetails(CommentDetails value) {
        this.commentDetails = value;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfile }
     *     
     */
    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfile }
     *     
     */
    public void setCustomerProfile(CustomerProfile value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the tpflaOperator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getTpflaOperator() {
        return tpflaOperator;
    }

    /**
     * Sets the value of the tpflaOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setTpflaOperator(Operator value) {
        this.tpflaOperator = value;
    }

    /**
     * Gets the value of the linkShare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkShare() {
        return linkShare;
    }

    /**
     * Sets the value of the linkShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkShare(String value) {
        this.linkShare = value;
    }

    /**
     * Gets the value of the ccscanTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcscanTransactionId() {
        return ccscanTransactionId;
    }

    /**
     * Sets the value of the ccscanTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcscanTransactionId(String value) {
        this.ccscanTransactionId = value;
    }

    /**
     * Gets the value of the systemTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemTrace() {
        return systemTrace;
    }

    /**
     * Sets the value of the systemTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemTrace(String value) {
        this.systemTrace = value;
    }

    /**
     * Gets the value of the visaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaFlag() {
        return visaFlag;
    }

    /**
     * Sets the value of the visaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaFlag(String value) {
        this.visaFlag = value;
    }

    /**
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber(String value) {
        this.visaNumber = value;
    }

    /**
     * Gets the value of the visaDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaDate() {
        return visaDate;
    }

    /**
     * Sets the value of the visaDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaDate(String value) {
        this.visaDate = value;
    }

}
