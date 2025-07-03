
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact_info_type_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="contact_info_type_base">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="contact_info_type" type="{http://www.westernunion.com/schema/xrsi}contact_info_type" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact_info_type_base")
@XmlSeeAlso({
    ContactInfo.class
})
public class ContactInfoTypeBase {

    @XmlAttribute(name = "contact_info_type")
    protected ContactInfoType contactInfoType;

    /**
     * Gets the value of the contactInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfoType() {
        return contactInfoType;
    }

    /**
     * Sets the value of the contactInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfoType(ContactInfoType value) {
        this.contactInfoType = value;
    }

}
