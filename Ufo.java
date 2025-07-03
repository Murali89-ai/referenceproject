
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ufo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ufo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ufo_buffer" type="{http://www.westernunion.com/schema/xrsi}popup_buffer" minOccurs="0"/>
 *         <element name="ufo_fields" type="{http://www.westernunion.com/schema/xrsi}ufo_fields" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ufo", propOrder = {
    "ufoBuffer",
    "ufoFields"
})
public class Ufo {

    @XmlElement(name = "ufo_buffer")
    protected String ufoBuffer;
    @XmlElement(name = "ufo_fields")
    protected UfoFields ufoFields;

    /**
     * Gets the value of the ufoBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBuffer() {
        return ufoBuffer;
    }

    /**
     * Sets the value of the ufoBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBuffer(String value) {
        this.ufoBuffer = value;
    }

    /**
     * Gets the value of the ufoFields property.
     * 
     * @return
     *     possible object is
     *     {@link UfoFields }
     *     
     */
    public UfoFields getUfoFields() {
        return ufoFields;
    }

    /**
     * Sets the value of the ufoFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UfoFields }
     *     
     */
    public void setUfoFields(UfoFields value) {
        this.ufoFields = value;
    }

}
