
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_payment_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="cpay_payment_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="origination" type="{http://www.westernunion.com/schema/xrsi}cpay_origination" minOccurs="0"/>
 *         <element name="fees" type="{http://www.westernunion.com/schema/xrsi}cpay_fees" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_payment_details", propOrder = {
    "origination",
    "fees"
})
public class CpayPaymentDetails {

    protected CpayOrigination origination;
    protected CpayFees fees;

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link CpayOrigination }
     *     
     */
    public CpayOrigination getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpayOrigination }
     *     
     */
    public void setOrigination(CpayOrigination value) {
        this.origination = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link CpayFees }
     *     
     */
    public CpayFees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpayFees }
     *     
     */
    public void setFees(CpayFees value) {
        this.fees = value;
    }

}
