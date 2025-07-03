
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="contact_info">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}contact_info_type_base">
 *       <sequence>
 *         <element name="address" type="{http://www.westernunion.com/schema/xrsi}address" minOccurs="0"/>
 *         <element name="preferred_language" type="{http://www.westernunion.com/schema/xrsi}language_id" minOccurs="0"/>
 *         <element name="phone" type="{http://www.westernunion.com/schema/xrsi}international_phone_number" minOccurs="0"/>
 *         <element name="mobile_phone" type="{http://www.westernunion.com/schema/xrsi}international_phone_number" minOccurs="0"/>
 *         <element name="email_address" type="{http://www.westernunion.com/schema/xrsi}email" minOccurs="0"/>
 *         <element name="preferred_notification_method" type="{http://www.westernunion.com/schema/xrsi}preferred_notification_method" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact_info", propOrder = {
    "address",
    "preferredLanguage",
    "phone",
    "mobilePhone",
    "emailAddress",
    "preferredNotificationMethod"
})
public class ContactInfo
    extends ContactInfoTypeBase
{

    protected Address address;
    @XmlElement(name = "preferred_language")
    protected String preferredLanguage;
    protected InternationalPhoneNumber phone;
    @XmlElement(name = "mobile_phone")
    protected InternationalPhoneNumber mobilePhone;
    @XmlElement(name = "email_address")
    protected String emailAddress;
    @XmlElement(name = "preferred_notification_method")
    @XmlSchemaType(name = "string")
    protected PreferredNotificationMethod preferredNotificationMethod;

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
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setPhone(InternationalPhoneNumber value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setMobilePhone(InternationalPhoneNumber value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the preferredNotificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredNotificationMethod }
     *     
     */
    public PreferredNotificationMethod getPreferredNotificationMethod() {
        return preferredNotificationMethod;
    }

    /**
     * Sets the value of the preferredNotificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredNotificationMethod }
     *     
     */
    public void setPreferredNotificationMethod(PreferredNotificationMethod value) {
        this.preferredNotificationMethod = value;
    }

}
