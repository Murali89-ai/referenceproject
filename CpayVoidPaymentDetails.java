
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_void_payment_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="cpay_void_payment_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="origination" type="{http://www.westernunion.com/schema/xrsi}cpay_void_origination" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_void_payment_details", propOrder = {
    "origination"
})
public class CpayVoidPaymentDetails {

    protected CpayVoidOrigination origination;

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link CpayVoidOrigination }
     *     
     */
    public CpayVoidOrigination getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpayVoidOrigination }
     *     
     */
    public void setOrigination(CpayVoidOrigination value) {
        this.origination = value;
    }

}
