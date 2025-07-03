
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="sender">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}customer">
 *       <sequence>
 *         <element name="bank_details" type="{http://www.westernunion.com/schema/xrsi}bank_details" minOccurs="0"/>
 *         <element name="encrypted_sender_id" type="{http://www.westernunion.com/schema/xrsi}encrypted_sender_Id" minOccurs="0"/>
 *         <element name="desire_privacy_policy" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="rate_modifier" type="{http://www.westernunion.com/schema/xrsi}rate_modifier" minOccurs="0"/>
 *         <element name="current_location" type="{http://www.westernunion.com/schema/xrsi}current_location" minOccurs="0"/>
 *         <element name="type" type="{http://www.westernunion.com/schema/xrsi}sender_type" minOccurs="0"/>
 *         <group ref="{http://www.westernunion.com/schema/xrsi}sender_details" minOccurs="0"/>
 *         <element name="id_country_of_issue" type="{http://www.westernunion.com/schema/xrsi}id_country_of_issue" minOccurs="0"/>
 *         <element name="receiver_first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="conv_search_flag" type="{http://www.westernunion.com/schema/xrsi}flag_type" minOccurs="0"/>
 *         <element name="sms_notification_flag" type="{http://www.westernunion.com/schema/xrsi}sms_notification" minOccurs="0"/>
 *         <element name="mothers_maiden_name" type="{http://www.westernunion.com/schema/xrsi}mothers_name" minOccurs="0"/>
 *         <element name="payment_link" type="{http://www.westernunion.com/schema/xrsi}payment_link" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sender", propOrder = {
    "bankDetails",
    "encryptedSenderId",
    "desirePrivacyPolicy",
    "rateModifier",
    "currentLocation",
    "type",
    "returnedMailStatus",
    "lastChangeDate",
    "exportStatus",
    "exportDate",
    "dup",
    "deleteCode",
    "addressFlagHHomePPos",
    "phoneType",
    "listingType",
    "employmentType",
    "businessDetails",
    "d2BSmsNotification",
    "idDetails",
    "idCountryOfIssue",
    "receiverFirstName",
    "convSearchFlag",
    "smsNotificationFlag",
    "mothersMaidenName",
    "paymentLink"
})
public class Sender
    extends Customer
{

    @XmlElement(name = "bank_details")
    protected BankDetails bankDetails;
    @XmlElement(name = "encrypted_sender_id")
    protected String encryptedSenderId;
    @XmlElement(name = "desire_privacy_policy")
    @XmlSchemaType(name = "string")
    protected YesNo desirePrivacyPolicy;
    @XmlElement(name = "rate_modifier")
    protected String rateModifier;
    @XmlElement(name = "current_location")
    protected CurrentLocation currentLocation;
    protected String type;
    @XmlElement(name = "returned_mail_status")
    protected String returnedMailStatus;
    @XmlElement(name = "last_change_date")
    protected String lastChangeDate;
    @XmlElement(name = "export_status")
    protected String exportStatus;
    @XmlElement(name = "export_date")
    protected String exportDate;
    protected String dup;
    @XmlElement(name = "delete_code")
    protected String deleteCode;
    @XmlElement(name = "address_flag_h_home_p_pos")
    @XmlSchemaType(name = "string")
    protected AddressType addressFlagHHomePPos;
    @XmlElement(name = "phone_type")
    @XmlSchemaType(name = "string")
    protected PhoneType phoneType;
    @XmlElement(name = "listing_type")
    @XmlSchemaType(name = "string")
    protected ListingType listingType;
    @XmlElement(name = "employment_type")
    @XmlSchemaType(name = "string")
    protected EmploymentType employmentType;
    @XmlElement(name = "business_details")
    protected BusinessDetails businessDetails;
    @XmlElement(name = "d2b_sms_notification")
    @XmlSchemaType(name = "string")
    protected SmsNotification d2BSmsNotification;
    @XmlElement(name = "id_details")
    protected IdDetails idDetails;
    @XmlElement(name = "id_country_of_issue")
    protected String idCountryOfIssue;
    @XmlElement(name = "receiver_first_name")
    protected String receiverFirstName;
    @XmlElement(name = "conv_search_flag")
    protected String convSearchFlag;
    @XmlElement(name = "sms_notification_flag")
    @XmlSchemaType(name = "string")
    protected SmsNotification smsNotificationFlag;
    @XmlElement(name = "mothers_maiden_name")
    protected String mothersMaidenName;
    @XmlElement(name = "payment_link")
    protected String paymentLink;

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
     * Gets the value of the encryptedSenderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedSenderId() {
        return encryptedSenderId;
    }

    /**
     * Sets the value of the encryptedSenderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedSenderId(String value) {
        this.encryptedSenderId = value;
    }

    /**
     * Gets the value of the desirePrivacyPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDesirePrivacyPolicy() {
        return desirePrivacyPolicy;
    }

    /**
     * Sets the value of the desirePrivacyPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDesirePrivacyPolicy(YesNo value) {
        this.desirePrivacyPolicy = value;
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
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentLocation }
     *     
     */
    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentLocation }
     *     
     */
    public void setCurrentLocation(CurrentLocation value) {
        this.currentLocation = value;
    }

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
     * Gets the value of the returnedMailStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnedMailStatus() {
        return returnedMailStatus;
    }

    /**
     * Sets the value of the returnedMailStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnedMailStatus(String value) {
        this.returnedMailStatus = value;
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
     * Gets the value of the exportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportStatus() {
        return exportStatus;
    }

    /**
     * Sets the value of the exportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportStatus(String value) {
        this.exportStatus = value;
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
     * Gets the value of the dup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDup() {
        return dup;
    }

    /**
     * Sets the value of the dup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDup(String value) {
        this.dup = value;
    }

    /**
     * Gets the value of the deleteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteCode() {
        return deleteCode;
    }

    /**
     * Sets the value of the deleteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteCode(String value) {
        this.deleteCode = value;
    }

    /**
     * Gets the value of the addressFlagHHomePPos property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddressFlagHHomePPos() {
        return addressFlagHHomePPos;
    }

    /**
     * Sets the value of the addressFlagHHomePPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddressFlagHHomePPos(AddressType value) {
        this.addressFlagHHomePPos = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhoneType(PhoneType value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingType }
     *     
     */
    public ListingType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingType }
     *     
     */
    public void setListingType(ListingType value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the employmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentType }
     *     
     */
    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    /**
     * Sets the value of the employmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentType }
     *     
     */
    public void setEmploymentType(EmploymentType value) {
        this.employmentType = value;
    }

    /**
     * Gets the value of the businessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDetails }
     *     
     */
    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    /**
     * Sets the value of the businessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDetails }
     *     
     */
    public void setBusinessDetails(BusinessDetails value) {
        this.businessDetails = value;
    }

    /**
     * Gets the value of the d2BSmsNotification property.
     * 
     * @return
     *     possible object is
     *     {@link SmsNotification }
     *     
     */
    public SmsNotification getD2BSmsNotification() {
        return d2BSmsNotification;
    }

    /**
     * Sets the value of the d2BSmsNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsNotification }
     *     
     */
    public void setD2BSmsNotification(SmsNotification value) {
        this.d2BSmsNotification = value;
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
     * Gets the value of the idCountryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCountryOfIssue() {
        return idCountryOfIssue;
    }

    /**
     * Sets the value of the idCountryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCountryOfIssue(String value) {
        this.idCountryOfIssue = value;
    }

    /**
     * Gets the value of the receiverFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    /**
     * Sets the value of the receiverFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverFirstName(String value) {
        this.receiverFirstName = value;
    }

    /**
     * Gets the value of the convSearchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvSearchFlag() {
        return convSearchFlag;
    }

    /**
     * Sets the value of the convSearchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvSearchFlag(String value) {
        this.convSearchFlag = value;
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
     * Gets the value of the mothersMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    /**
     * Sets the value of the mothersMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersMaidenName(String value) {
        this.mothersMaidenName = value;
    }

    /**
     * Gets the value of the paymentLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentLink() {
        return paymentLink;
    }

    /**
     * Sets the value of the paymentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentLink(String value) {
        this.paymentLink = value;
    }

}
