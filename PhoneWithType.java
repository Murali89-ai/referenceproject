
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phone_with_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="phone_with_type">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}mobile_phone">
 *       <attribute name="type" type="{http://www.westernunion.com/schema/xrsi}phone_type" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phone_with_type")
public class PhoneWithType
    extends MobilePhone
{

    @XmlAttribute(name = "type")
    protected PhoneType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setType(PhoneType value) {
        this.type = value;
    }

}
