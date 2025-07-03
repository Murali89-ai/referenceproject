
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="customer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="user_id" type="{http://www.westernunion.com/schema/xrsi}email" minOccurs="0"/>
 *         <element name="name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         <element name="original_name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         <element name="address" type="{http://www.westernunion.com/schema/xrsi}address" minOccurs="0"/>
 *         <element name="preferred_customer" type="{http://www.westernunion.com/schema/xrsi}preferred_customer" minOccurs="0"/>
 *         <element name="compliance_details" type="{http://www.westernunion.com/schema/xrsi}compliance_details" minOccurs="0"/>
 *         <element name="email" type="{http://www.westernunion.com/schema/xrsi}email" minOccurs="0"/>
 *         <element name="contact_phone" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         <element name="contact_phone_intl" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         <element name="cookie" type="{http://www.westernunion.com/schema/xrsi}cookie" minOccurs="0"/>
 *         <element name="gender" type="{http://www.westernunion.com/schema/xrsi}gender" minOccurs="0"/>
 *         <element name="date_of_birth" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="pc_source" type="{http://www.westernunion.com/schema/xrsi}source_fdi_csc_pos_etc" minOccurs="0"/>
 *         <element name="contact_infos" type="{http://www.westernunion.com/schema/xrsi}contact_infos" minOccurs="0"/>
 *         <element name="language_id" type="{http://www.westernunion.com/schema/xrsi}language_id" minOccurs="0"/>
 *         <element name="place_of_birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unv_buffer" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         <element name="calling_phone" type="{http://www.westernunion.com/schema/xrsi}phone_number" minOccurs="0"/>
 *         <element name="calling_phone_ani" type="{http://www.westernunion.com/schema/xrsi}phone_number" minOccurs="0"/>
 *         <element name="ip_address" type="{http://www.westernunion.com/schema/xrsi}ip_address" minOccurs="0"/>
 *         <element name="mobile_phone" type="{http://www.westernunion.com/schema/xrsi}mobile_phone" minOccurs="0"/>
 *         <element name="company_name" type="{http://www.westernunion.com/schema/xrsi}company_name" minOccurs="0"/>
 *         <element name="sent_by" type="{http://www.westernunion.com/schema/xrsi}sent_by" minOccurs="0"/>
 *         <element name="mobile_details" type="{http://www.westernunion.com/schema/xrsi}mobile_details" minOccurs="0"/>
 *         <element name="company_person" type="{http://www.westernunion.com/schema/xrsi}company_person" minOccurs="0"/>
 *         <element name="software_application" type="{http://www.westernunion.com/schema/xrsi}software_application" minOccurs="0"/>
 *         <element name="notification_preference" type="{http://www.westernunion.com/schema/xrsi}consumer_notification_preference" minOccurs="0"/>
 *         <element name="notification_language" type="{http://www.westernunion.com/schema/xrsi}language_iso_code" minOccurs="0"/>
 *         <element name="notification_phone" type="{http://www.westernunion.com/schema/xrsi}international_phone_number" minOccurs="0"/>
 *         <element name="identities" type="{http://www.westernunion.com/schema/xrsi}channel_customer_identities" minOccurs="0"/>
 *         <element name="security_details" type="{http://www.westernunion.com/schema/xrsi}security_details" minOccurs="0"/>
 *         <element name="activation_status" type="{http://www.westernunion.com/schema/xrsi}customer_activation_status" minOccurs="0"/>
 *         <element name="account_preferences" type="{http://www.westernunion.com/schema/xrsi}account_preferences" minOccurs="0"/>
 *         <element name="targetLocation" type="{http://www.westernunion.com/schema/xrsi}targetLocation" minOccurs="0"/>
 *         <element name="fraud_warning_consent" type="{http://www.westernunion.com/schema/xrsi}fraud_warning_consent" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "userId",
    "name",
    "originalName",
    "address",
    "preferredCustomer",
    "complianceDetails",
    "email",
    "contactPhone",
    "contactPhoneIntl",
    "cookie",
    "gender",
    "dateOfBirth",
    "pcSource",
    "contactInfos",
    "languageId",
    "placeOfBirth",
    "unvBuffer",
    "callingPhone",
    "callingPhoneAni",
    "ipAddress",
    "mobilePhone",
    "companyName",
    "sentBy",
    "mobileDetails",
    "companyPerson",
    "softwareApplication",
    "notificationPreference",
    "notificationLanguage",
    "notificationPhone",
    "identities",
    "securityDetails",
    "activationStatus",
    "accountPreferences",
    "targetLocation",
    "fraudWarningConsent"
})
@XmlSeeAlso({
    Sender.class,
    Receiver.class
})
public class Customer {

    @XmlElement(name = "user_id")
    protected String userId;
    protected GeneralName name;
    @XmlElement(name = "original_name")
    protected GeneralName originalName;
    protected Address address;
    @XmlElement(name = "preferred_customer")
    protected PreferredCustomer preferredCustomer;
    @XmlElement(name = "compliance_details")
    protected ComplianceDetails complianceDetails;
    protected String email;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    @XmlElement(name = "contact_phone_intl")
    protected String contactPhoneIntl;
    protected String cookie;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "date_of_birth")
    protected String dateOfBirth;
    @XmlElement(name = "pc_source")
    protected String pcSource;
    @XmlElement(name = "contact_infos")
    protected ContactInfos contactInfos;
    @XmlElement(name = "language_id")
    protected String languageId;
    @XmlElement(name = "place_of_birth")
    protected String placeOfBirth;
    @XmlElement(name = "unv_buffer")
    protected String unvBuffer;
    @XmlElement(name = "calling_phone")
    protected String callingPhone;
    @XmlElement(name = "calling_phone_ani")
    protected String callingPhoneAni;
    @XmlElement(name = "ip_address")
    protected String ipAddress;
    @XmlElement(name = "mobile_phone")
    protected MobilePhone mobilePhone;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "sent_by")
    protected String sentBy;
    @XmlElement(name = "mobile_details")
    protected MobileDetails mobileDetails;
    @XmlElement(name = "company_person")
    protected String companyPerson;
    @XmlElement(name = "software_application")
    protected SoftwareApplication softwareApplication;
    @XmlElement(name = "notification_preference")
    @XmlSchemaType(name = "string")
    protected ConsumerNotificationPreference notificationPreference;
    @XmlElement(name = "notification_language")
    protected String notificationLanguage;
    @XmlElement(name = "notification_phone")
    protected InternationalPhoneNumber notificationPhone;
    protected ChannelCustomerIdentities identities;
    @XmlElement(name = "security_details")
    protected SecurityDetails securityDetails;
    @XmlElement(name = "activation_status")
    @XmlSchemaType(name = "string")
    protected CustomerActivationStatus activationStatus;
    @XmlElement(name = "account_preferences")
    protected AccountPreferences accountPreferences;
    protected TargetLocation targetLocation;
    @XmlElement(name = "fraud_warning_consent")
    @XmlSchemaType(name = "string")
    protected FraudWarningConsent fraudWarningConsent;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setName(GeneralName value) {
        this.name = value;
    }

    /**
     * Gets the value of the originalName property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getOriginalName() {
        return originalName;
    }

    /**
     * Sets the value of the originalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setOriginalName(GeneralName value) {
        this.originalName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the preferredCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCustomer }
     *     
     */
    public PreferredCustomer getPreferredCustomer() {
        return preferredCustomer;
    }

    /**
     * Sets the value of the preferredCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCustomer }
     *     
     */
    public void setPreferredCustomer(PreferredCustomer value) {
        this.preferredCustomer = value;
    }

    /**
     * Gets the value of the complianceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceDetails }
     *     
     */
    public ComplianceDetails getComplianceDetails() {
        return complianceDetails;
    }

    /**
     * Sets the value of the complianceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceDetails }
     *     
     */
    public void setComplianceDetails(ComplianceDetails value) {
        this.complianceDetails = value;
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
     * Gets the value of the contactPhoneIntl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoneIntl() {
        return contactPhoneIntl;
    }

    /**
     * Sets the value of the contactPhoneIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoneIntl(String value) {
        this.contactPhoneIntl = value;
    }

    /**
     * Gets the value of the cookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * Sets the value of the cookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookie(String value) {
        this.cookie = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the pcSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcSource() {
        return pcSource;
    }

    /**
     * Sets the value of the pcSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcSource(String value) {
        this.pcSource = value;
    }

    /**
     * Gets the value of the contactInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfos }
     *     
     */
    public ContactInfos getContactInfos() {
        return contactInfos;
    }

    /**
     * Sets the value of the contactInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfos }
     *     
     */
    public void setContactInfos(ContactInfos value) {
        this.contactInfos = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageId(String value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the unvBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnvBuffer() {
        return unvBuffer;
    }

    /**
     * Sets the value of the unvBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnvBuffer(String value) {
        this.unvBuffer = value;
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
     * Gets the value of the callingPhoneAni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPhoneAni() {
        return callingPhoneAni;
    }

    /**
     * Sets the value of the callingPhoneAni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPhoneAni(String value) {
        this.callingPhoneAni = value;
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
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePhone }
     *     
     */
    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePhone }
     *     
     */
    public void setMobilePhone(MobilePhone value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the sentBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentBy() {
        return sentBy;
    }

    /**
     * Sets the value of the sentBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentBy(String value) {
        this.sentBy = value;
    }

    /**
     * Gets the value of the mobileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDetails }
     *     
     */
    public MobileDetails getMobileDetails() {
        return mobileDetails;
    }

    /**
     * Sets the value of the mobileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDetails }
     *     
     */
    public void setMobileDetails(MobileDetails value) {
        this.mobileDetails = value;
    }

    /**
     * Gets the value of the companyPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPerson() {
        return companyPerson;
    }

    /**
     * Sets the value of the companyPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPerson(String value) {
        this.companyPerson = value;
    }

    /**
     * Gets the value of the softwareApplication property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareApplication }
     *     
     */
    public SoftwareApplication getSoftwareApplication() {
        return softwareApplication;
    }

    /**
     * Sets the value of the softwareApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareApplication }
     *     
     */
    public void setSoftwareApplication(SoftwareApplication value) {
        this.softwareApplication = value;
    }

    /**
     * Gets the value of the notificationPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerNotificationPreference }
     *     
     */
    public ConsumerNotificationPreference getNotificationPreference() {
        return notificationPreference;
    }

    /**
     * Sets the value of the notificationPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerNotificationPreference }
     *     
     */
    public void setNotificationPreference(ConsumerNotificationPreference value) {
        this.notificationPreference = value;
    }

    /**
     * Gets the value of the notificationLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationLanguage() {
        return notificationLanguage;
    }

    /**
     * Sets the value of the notificationLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationLanguage(String value) {
        this.notificationLanguage = value;
    }

    /**
     * Gets the value of the notificationPhone property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getNotificationPhone() {
        return notificationPhone;
    }

    /**
     * Sets the value of the notificationPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setNotificationPhone(InternationalPhoneNumber value) {
        this.notificationPhone = value;
    }

    /**
     * Gets the value of the identities property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelCustomerIdentities }
     *     
     */
    public ChannelCustomerIdentities getIdentities() {
        return identities;
    }

    /**
     * Sets the value of the identities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelCustomerIdentities }
     *     
     */
    public void setIdentities(ChannelCustomerIdentities value) {
        this.identities = value;
    }

    /**
     * Gets the value of the securityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDetails }
     *     
     */
    public SecurityDetails getSecurityDetails() {
        return securityDetails;
    }

    /**
     * Sets the value of the securityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDetails }
     *     
     */
    public void setSecurityDetails(SecurityDetails value) {
        this.securityDetails = value;
    }

    /**
     * Gets the value of the activationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerActivationStatus }
     *     
     */
    public CustomerActivationStatus getActivationStatus() {
        return activationStatus;
    }

    /**
     * Sets the value of the activationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerActivationStatus }
     *     
     */
    public void setActivationStatus(CustomerActivationStatus value) {
        this.activationStatus = value;
    }

    /**
     * Gets the value of the accountPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPreferences }
     *     
     */
    public AccountPreferences getAccountPreferences() {
        return accountPreferences;
    }

    /**
     * Sets the value of the accountPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPreferences }
     *     
     */
    public void setAccountPreferences(AccountPreferences value) {
        this.accountPreferences = value;
    }

    /**
     * Gets the value of the targetLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TargetLocation }
     *     
     */
    public TargetLocation getTargetLocation() {
        return targetLocation;
    }

    /**
     * Sets the value of the targetLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetLocation }
     *     
     */
    public void setTargetLocation(TargetLocation value) {
        this.targetLocation = value;
    }

    /**
     * Gets the value of the fraudWarningConsent property.
     * 
     * @return
     *     possible object is
     *     {@link FraudWarningConsent }
     *     
     */
    public FraudWarningConsent getFraudWarningConsent() {
        return fraudWarningConsent;
    }

    /**
     * Sets the value of the fraudWarningConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudWarningConsent }
     *     
     */
    public void setFraudWarningConsent(FraudWarningConsent value) {
        this.fraudWarningConsent = value;
    }

}
