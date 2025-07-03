
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="channel_customer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.westernunion.com/schema/xrsi}channel_general_name" minOccurs="0"/>
 *         <element name="address" type="{http://www.westernunion.com/schema/xrsi}iso_address" minOccurs="0"/>
 *         <element name="preferred_customer" type="{http://www.westernunion.com/schema/xrsi}preferred_customer" minOccurs="0"/>
 *         <element name="compliance_details" type="{http://www.westernunion.com/schema/xrsi}channel_compliance_details" minOccurs="0"/>
 *         <element name="email" type="{http://www.westernunion.com/schema/xrsi}email" minOccurs="0"/>
 *         <element name="contact_phone" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         <element name="mobile_phone" type="{http://www.westernunion.com/schema/xrsi}mobile_phone" minOccurs="0"/>
 *         <element name="gender" type="{http://www.westernunion.com/schema/xrsi}gender" minOccurs="0"/>
 *         <element name="date_of_birth" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="language_iso_code" type="{http://www.westernunion.com/schema/xrsi}language_iso_code" minOccurs="0"/>
 *         <element name="place_of_birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="employer_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="queue_allowed" type="{http://www.westernunion.com/schema/xrsi}queue_allowed" minOccurs="0"/>
 *         <element name="notification_preference" type="{http://www.westernunion.com/schema/xrsi}consumer_notification_preference" minOccurs="0"/>
 *         <element name="notification_language" type="{http://www.westernunion.com/schema/xrsi}language_iso_code" minOccurs="0"/>
 *         <element name="notification_phone" type="{http://www.westernunion.com/schema/xrsi}international_phone_number" minOccurs="0"/>
 *         <element name="identities" type="{http://www.westernunion.com/schema/xrsi}channel_customer_identities" minOccurs="0"/>
 *         <element name="credit_debit_cards" type="{http://www.westernunion.com/schema/xrsi}credit_debit_cards" minOccurs="0"/>
 *         <element name="security_details" type="{http://www.westernunion.com/schema/xrsi}security_details" minOccurs="0"/>
 *         <element name="activation_status" type="{http://www.westernunion.com/schema/xrsi}customer_activation_status" minOccurs="0"/>
 *         <element name="account_preferences" type="{http://www.westernunion.com/schema/xrsi}account_preferences" minOccurs="0"/>
 *         <element name="additional_phones" type="{http://www.westernunion.com/schema/xrsi}additional_phones" minOccurs="0"/>
 *         <element name="request_code" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_customer", propOrder = {
    "name",
    "address",
    "preferredCustomer",
    "complianceDetails",
    "email",
    "contactPhone",
    "mobilePhone",
    "gender",
    "dateOfBirth",
    "languageIsoCode",
    "placeOfBirth",
    "occupation",
    "employerName",
    "queueAllowed",
    "notificationPreference",
    "notificationLanguage",
    "notificationPhone",
    "identities",
    "creditDebitCards",
    "securityDetails",
    "activationStatus",
    "accountPreferences",
    "additionalPhones",
    "requestCode"
})
@XmlSeeAlso({
    MobileCustomer.class,
    GatewayCustomer.class,
    GbsCustomer.class
})
public class ChannelCustomer {

    protected ChannelGeneralName name;
    protected IsoAddress address;
    @XmlElement(name = "preferred_customer")
    protected PreferredCustomer preferredCustomer;
    @XmlElement(name = "compliance_details")
    protected ChannelComplianceDetails complianceDetails;
    protected String email;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    @XmlElement(name = "mobile_phone")
    protected MobilePhone mobilePhone;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "date_of_birth")
    protected String dateOfBirth;
    @XmlElement(name = "language_iso_code")
    protected String languageIsoCode;
    @XmlElement(name = "place_of_birth")
    protected String placeOfBirth;
    protected String occupation;
    @XmlElement(name = "employer_name")
    protected String employerName;
    @XmlElement(name = "queue_allowed")
    @XmlSchemaType(name = "string")
    protected YesNo queueAllowed;
    @XmlElement(name = "notification_preference")
    @XmlSchemaType(name = "string")
    protected ConsumerNotificationPreference notificationPreference;
    @XmlElement(name = "notification_language")
    protected String notificationLanguage;
    @XmlElement(name = "notification_phone")
    protected InternationalPhoneNumber notificationPhone;
    protected ChannelCustomerIdentities identities;
    @XmlElement(name = "credit_debit_cards")
    protected CreditDebitCards creditDebitCards;
    @XmlElement(name = "security_details")
    protected SecurityDetails securityDetails;
    @XmlElement(name = "activation_status")
    @XmlSchemaType(name = "string")
    protected CustomerActivationStatus activationStatus;
    @XmlElement(name = "account_preferences")
    protected AccountPreferences accountPreferences;
    @XmlElement(name = "additional_phones")
    protected AdditionalPhones additionalPhones;
    @XmlElement(name = "request_code")
    protected String requestCode;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link IsoAddress }
     *     
     */
    public IsoAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoAddress }
     *     
     */
    public void setAddress(IsoAddress value) {
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
     *     {@link ChannelComplianceDetails }
     *     
     */
    public ChannelComplianceDetails getComplianceDetails() {
        return complianceDetails;
    }

    /**
     * Sets the value of the complianceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelComplianceDetails }
     *     
     */
    public void setComplianceDetails(ChannelComplianceDetails value) {
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
     * Gets the value of the languageIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageIsoCode() {
        return languageIsoCode;
    }

    /**
     * Sets the value of the languageIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageIsoCode(String value) {
        this.languageIsoCode = value;
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
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the employerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Sets the value of the employerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerName(String value) {
        this.employerName = value;
    }

    /**
     * Gets the value of the queueAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getQueueAllowed() {
        return queueAllowed;
    }

    /**
     * Sets the value of the queueAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setQueueAllowed(YesNo value) {
        this.queueAllowed = value;
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
     * Gets the value of the creditDebitCards property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCards }
     *     
     */
    public CreditDebitCards getCreditDebitCards() {
        return creditDebitCards;
    }

    /**
     * Sets the value of the creditDebitCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCards }
     *     
     */
    public void setCreditDebitCards(CreditDebitCards value) {
        this.creditDebitCards = value;
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
     * Gets the value of the additionalPhones property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPhones }
     *     
     */
    public AdditionalPhones getAdditionalPhones() {
        return additionalPhones;
    }

    /**
     * Sets the value of the additionalPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPhones }
     *     
     */
    public void setAdditionalPhones(AdditionalPhones value) {
        this.additionalPhones = value;
    }

    /**
     * Gets the value of the requestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCode() {
        return requestCode;
    }

    /**
     * Sets the value of the requestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCode(String value) {
        this.requestCode = value;
    }

}
