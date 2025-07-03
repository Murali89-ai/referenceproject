
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pin_debit_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="pin_debit_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="available" type="{http://www.westernunion.com/schema/xrsi}pin_debit_flag" minOccurs="0"/>
 *         <element name="pinpad_params" type="{http://www.westernunion.com/schema/xrsi}pinpad_params" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pin_debit_details", propOrder = {
    "available",
    "pinpadParams"
})
public class PinDebitDetails {

    protected String available;
    @XmlElement(name = "pinpad_params")
    protected PinpadParams pinpadParams;

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailable(String value) {
        this.available = value;
    }

    /**
     * Gets the value of the pinpadParams property.
     * 
     * @return
     *     possible object is
     *     {@link PinpadParams }
     *     
     */
    public PinpadParams getPinpadParams() {
        return pinpadParams;
    }

    /**
     * Sets the value of the pinpadParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinpadParams }
     *     
     */
    public void setPinpadParams(PinpadParams value) {
        this.pinpadParams = value;
    }

}
