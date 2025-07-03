
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receiver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="receiver">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}customer">
 *       <sequence>
 *         <element name="type" type="{http://www.westernunion.com/schema/xrsi}receiver_type" minOccurs="0"/>
 *         <element name="receiver_index_no" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <group ref="{http://www.westernunion.com/schema/xrsi}single_find_receiver" minOccurs="0"/>
 *         <element name="rcv_altphone_code" type="{http://www.westernunion.com/schema/xrsi}rcv_phone_code" minOccurs="0"/>
 *         <element name="rcv_altphone_number" type="{http://www.westernunion.com/schema/xrsi}rcv_phone_number" minOccurs="0"/>
 *         <element name="reason_for_sending" type="{http://www.westernunion.com/schema/xrsi}reason_for_sending" minOccurs="0"/>
 *         <element name="skip_address_validation" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="id_details" type="{http://www.westernunion.com/schema/xrsi}id_details" minOccurs="0"/>
 *         <element name="sms_notification_flag" type="{http://www.westernunion.com/schema/xrsi}sms_notification" minOccurs="0"/>
 *         <element name="cash_to_mobile" type="{http://www.westernunion.com/schema/xrsi}cash_to_mobile" minOccurs="0"/>
 *         <element name="sender_relation_receiver" type="{http://www.westernunion.com/schema/xrsi}sender_relation_receiver" minOccurs="0"/>
 *         <element name="special_license_number" type="{http://www.westernunion.com/schema/xrsi}special_license_number" minOccurs="0"/>
 *         <element name="receiver_family" type="{http://www.westernunion.com/schema/xrsi}receiver_family" minOccurs="0"/>
 *         <element name="receiver_cookie" type="{http://www.westernunion.com/schema/xrsi}receiver_cookie" minOccurs="0"/>
 *         <element name="receiver_nationality" type="{http://www.westernunion.com/schema/xrsi}country_iso_code" minOccurs="0"/>
 *         <element name="national_id_no" type="{http://www.westernunion.com/schema/xrsi}national_id_no" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiver", propOrder = {
    "type",
    "receiverIndexNo",
    "numberTransactionsSent",
    "numberOfTimesChanged",
    "nonPermanentChangeCount",
    "noSend",
    "lastSendDate",
    "firstSendDate",
    "lastChangeSource",
    "lastChangeDate",
    "firstUse",
    "expirationDate",
    "dateAdded",
    "exportDate",
    "enrollingAgentAccount",
    "debtorAccountNumber",
    "update",
    "modificationsAtPosAllowed",
    "bankDetails",
    "walletDetails",
    "rcvAltphoneCode",
    "rcvAltphoneNumber",
    "reasonForSending",
    "skipAddressValidation",
    "idDetails",
    "smsNotificationFlag",
    "cashToMobile",
    "senderRelationReceiver",
    "specialLicenseNumber",
    "receiverFamily",
    "receiverCookie",
    "receiverNationality",
    "nationalIdNo"
})
public class Receiver
    extends Customer
{

    protected String type;
    @XmlElement(name = "receiver_index_no")
    protected BigInteger receiverIndexNo;
    @XmlElement(name = "number_transactions_sent")
    protected String numberTransactionsSent;
    @XmlElement(name = "number_of_times_changed")
    protected String numberOfTimesChanged;
    @XmlElement(name = "non_permanent_change_count")
    protected BigInteger nonPermanentChangeCount;
    @XmlElement(name = "no_send")
    protected String noSend;
    @XmlElement(name = "last_send_date")
    protected String lastSendDate;
    @XmlElement(name = "first_send_date")
    protected String firstSendDate;
    @XmlElement(name = "last_change_source")
    protected String lastChangeSource;
    @XmlElement(name = "last_change_date")
    protected String lastChangeDate;
    @XmlElement(name = "first_use")
    @XmlSchemaType(name = "string")
    protected YesNo firstUse;
    @XmlElement(name = "expiration_date")
    protected String expirationDate;
    @XmlElement(name = "date_added")
    protected String dateAdded;
    @XmlElement(name = "export_date")
    protected String exportDate;
    @XmlElement(name = "enrolling_agent_account")
    protected String enrollingAgentAccount;
    @XmlElement(name = "debtor_account_number")
    protected String debtorAccountNumber;
    protected String update;
    @XmlElement(name = "modifications_at_pos_allowed")
    @XmlSchemaType(name = "string")
    protected YesNo modificationsAtPosAllowed;
    @XmlElement(name = "bank_details")
    protected BankDetails bankDetails;
    @XmlElement(name = "wallet_details")
    protected WalletDetails walletDetails;
    @XmlElement(name = "rcv_altphone_code")
    protected BigInteger rcvAltphoneCode;
    @XmlElement(name = "rcv_altphone_number")
    protected String rcvAltphoneNumber;
    @XmlElement(name = "reason_for_sending")
    protected String reasonForSending;
    @XmlElement(name = "skip_address_validation")
    @XmlSchemaType(name = "string")
    protected YesNo skipAddressValidation;
    @XmlElement(name = "id_details")
    protected IdDetails idDetails;
    @XmlElement(name = "sms_notification_flag")
    @XmlSchemaType(name = "string")
    protected SmsNotification smsNotificationFlag;
    @XmlElement(name = "cash_to_mobile")
    protected CashToMobile cashToMobile;
    @XmlElement(name = "sender_relation_receiver")
    protected String senderRelationReceiver;
    @XmlElement(name = "special_license_number")
    protected String specialLicenseNumber;
    @XmlElement(name = "receiver_family")
    protected String receiverFamily;
    @XmlElement(name = "receiver_cookie")
    protected String receiverCookie;
    @XmlElement(name = "receiver_nationality")
    protected String receiverNationality;
    @XmlElement(name = "national_id_no")
    protected String nationalIdNo;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the receiverIndexNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReceiverIndexNo() {
        return receiverIndexNo;
    }

    /**
     * Sets the value of the receiverIndexNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReceiverIndexNo(BigInteger value) {
        this.receiverIndexNo = value;
    }

    /**
     * Gets the value of the numberTransactionsSent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberTransactionsSent() {
        return numberTransactionsSent;
    }

    /**
     * Sets the value of the numberTransactionsSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberTransactionsSent(String value) {
        this.numberTransactionsSent = value;
    }

    /**
     * Gets the value of the numberOfTimesChanged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfTimesChanged() {
        return numberOfTimesChanged;
    }

    /**
     * Sets the value of the numberOfTimesChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfTimesChanged(String value) {
        this.numberOfTimesChanged = value;
    }

    /**
     * Gets the value of the nonPermanentChangeCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonPermanentChangeCount() {
        return nonPermanentChangeCount;
    }

    /**
     * Sets the value of the nonPermanentChangeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonPermanentChangeCount(BigInteger value) {
        this.nonPermanentChangeCount = value;
    }

    /**
     * Gets the value of the noSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSend() {
        return noSend;
    }

    /**
     * Sets the value of the noSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSend(String value) {
        this.noSend = value;
    }

    /**
     * Gets the value of the lastSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSendDate() {
        return lastSendDate;
    }

    /**
     * Sets the value of the lastSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSendDate(String value) {
        this.lastSendDate = value;
    }

    /**
     * Gets the value of the firstSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSendDate() {
        return firstSendDate;
    }

    /**
     * Sets the value of the firstSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSendDate(String value) {
        this.firstSendDate = value;
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
     * Gets the value of the lastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Sets the value of the lastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangeDate(String value) {
        this.lastChangeDate = value;
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
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAdded(String value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the exportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDate() {
        return exportDate;
    }

    /**
     * Sets the value of the exportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportDate(String value) {
        this.exportDate = value;
    }

    /**
     * Gets the value of the enrollingAgentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollingAgentAccount() {
        return enrollingAgentAccount;
    }

    /**
     * Sets the value of the enrollingAgentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollingAgentAccount(String value) {
        this.enrollingAgentAccount = value;
    }

    /**
     * Gets the value of the debtorAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorAccountNumber() {
        return debtorAccountNumber;
    }

    /**
     * Sets the value of the debtorAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorAccountNumber(String value) {
        this.debtorAccountNumber = value;
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
     * Gets the value of the modificationsAtPosAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getModificationsAtPosAllowed() {
        return modificationsAtPosAllowed;
    }

    /**
     * Sets the value of the modificationsAtPosAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setModificationsAtPosAllowed(YesNo value) {
        this.modificationsAtPosAllowed = value;
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
     * Gets the value of the rcvAltphoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRcvAltphoneCode() {
        return rcvAltphoneCode;
    }

    /**
     * Sets the value of the rcvAltphoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRcvAltphoneCode(BigInteger value) {
        this.rcvAltphoneCode = value;
    }

    /**
     * Gets the value of the rcvAltphoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvAltphoneNumber() {
        return rcvAltphoneNumber;
    }

    /**
     * Sets the value of the rcvAltphoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvAltphoneNumber(String value) {
        this.rcvAltphoneNumber = value;
    }

    /**
     * Gets the value of the reasonForSending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForSending() {
        return reasonForSending;
    }

    /**
     * Sets the value of the reasonForSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForSending(String value) {
        this.reasonForSending = value;
    }

    /**
     * Gets the value of the skipAddressValidation property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSkipAddressValidation() {
        return skipAddressValidation;
    }

    /**
     * Sets the value of the skipAddressValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSkipAddressValidation(YesNo value) {
        this.skipAddressValidation = value;
    }

    /**
     * Gets the value of the idDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IdDetails }
     *     
     */
    public IdDetails getIdDetails() {
        return idDetails;
    }

    /**
     * Sets the value of the idDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDetails }
     *     
     */
    public void setIdDetails(IdDetails value) {
        this.idDetails = value;
    }

    /**
     * Gets the value of the smsNotificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link SmsNotification }
     *     
     */
    public SmsNotification getSmsNotificationFlag() {
        return smsNotificationFlag;
    }

    /**
     * Sets the value of the smsNotificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsNotification }
     *     
     */
    public void setSmsNotificationFlag(SmsNotification value) {
        this.smsNotificationFlag = value;
    }

    /**
     * Gets the value of the cashToMobile property.
     * 
     * @return
     *     possible object is
     *     {@link CashToMobile }
     *     
     */
    public CashToMobile getCashToMobile() {
        return cashToMobile;
    }

    /**
     * Sets the value of the cashToMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashToMobile }
     *     
     */
    public void setCashToMobile(CashToMobile value) {
        this.cashToMobile = value;
    }

    /**
     * Gets the value of the senderRelationReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderRelationReceiver() {
        return senderRelationReceiver;
    }

    /**
     * Sets the value of the senderRelationReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderRelationReceiver(String value) {
        this.senderRelationReceiver = value;
    }

    /**
     * Gets the value of the specialLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialLicenseNumber() {
        return specialLicenseNumber;
    }

    /**
     * Sets the value of the specialLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialLicenseNumber(String value) {
        this.specialLicenseNumber = value;
    }

    /**
     * Gets the value of the receiverFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverFamily() {
        return receiverFamily;
    }

    /**
     * Sets the value of the receiverFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverFamily(String value) {
        this.receiverFamily = value;
    }

    /**
     * Gets the value of the receiverCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCookie() {
        return receiverCookie;
    }

    /**
     * Sets the value of the receiverCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCookie(String value) {
        this.receiverCookie = value;
    }

    /**
     * Gets the value of the receiverNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverNationality() {
        return receiverNationality;
    }

    /**
     * Sets the value of the receiverNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverNationality(String value) {
        this.receiverNationality = value;
    }

    /**
     * Gets the value of the nationalIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalIdNo() {
        return nationalIdNo;
    }

    /**
     * Sets the value of the nationalIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalIdNo(String value) {
        this.nationalIdNo = value;
    }

}
