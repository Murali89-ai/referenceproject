
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="mobile_phone">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="phone_number" type="{http://www.westernunion.com/schema/xrsi}international_phone_number" minOccurs="0"/>
 *         <element name="identity" type="{http://www.westernunion.com/schema/xrsi}mobile_phone_identity" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_phone", propOrder = {
    "phoneNumber",
    "identity"
})
@XmlSeeAlso({
    PhoneWithType.class
})
public class MobilePhone {

    @XmlElement(name = "phone_number")
    protected InternationalPhoneNumber phoneNumber;
    protected MobilePhoneIdentity identity;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public InternationalPhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPhoneNumber }
     *     
     */
    public void setPhoneNumber(InternationalPhoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePhoneIdentity }
     *     
     */
    public MobilePhoneIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePhoneIdentity }
     *     
     */
    public void setIdentity(MobilePhoneIdentity value) {
        this.identity = value;
    }

}
