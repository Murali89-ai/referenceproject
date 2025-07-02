
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for account_preferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="account_preferences">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="news_setting" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="opt_out_marketing" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="direct_mail" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="message" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="mobile_phone" type="{http://www.westernunion.com/schema/xrsi}mobile_phone_type" minOccurs="0"/>
 *         <element name="email" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="telephone_call" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_preferences", propOrder = {
    "newsSetting",
    "optOutMarketing",
    "directMail",
    "message",
    "mobilePhone",
    "email",
    "telephoneCall"
})
public class AccountPreferences {

    @XmlElement(name = "news_setting")
    @XmlSchemaType(name = "string")
    protected YesNo newsSetting;
    @XmlElement(name = "opt_out_marketing")
    @XmlSchemaType(name = "string")
    protected YesNo optOutMarketing;
    @XmlElement(name = "direct_mail")
    @XmlSchemaType(name = "string")
    protected YesNo directMail;
    @XmlSchemaType(name = "string")
    protected YesNo message;
    @XmlElement(name = "mobile_phone")
    @XmlSchemaType(name = "string")
    protected MobilePhoneType mobilePhone;
    @XmlSchemaType(name = "string")
    protected YesNo email;
    @XmlElement(name = "telephone_call")
    @XmlSchemaType(name = "string")
    protected YesNo telephoneCall;

    /**
     * Gets the value of the newsSetting property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getNewsSetting() {
        return newsSetting;
    }

    /**
     * Sets the value of the newsSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setNewsSetting(YesNo value) {
        this.newsSetting = value;
    }

    /**
     * Gets the value of the optOutMarketing property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getOptOutMarketing() {
        return optOutMarketing;
    }

    /**
     * Sets the value of the optOutMarketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setOptOutMarketing(YesNo value) {
        this.optOutMarketing = value;
    }

    /**
     * Gets the value of the directMail property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDirectMail() {
        return directMail;
    }

    /**
     * Sets the value of the directMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDirectMail(YesNo value) {
        this.directMail = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setMessage(YesNo value) {
        this.message = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePhoneType }
     *     
     */
    public MobilePhoneType getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePhoneType }
     *     
     */
    public void setMobilePhone(MobilePhoneType value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setEmail(YesNo value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephoneCall property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getTelephoneCall() {
        return telephoneCall;
    }

    /**
     * Sets the value of the telephoneCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setTelephoneCall(YesNo value) {
        this.telephoneCall = value;
    }

}
