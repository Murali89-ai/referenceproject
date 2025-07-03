
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_void_payments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="cpay_void_payments">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="void_payment" type="{http://www.westernunion.com/schema/xrsi}void_payment" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_void_payments", propOrder = {
    "voidPayment"
})
public class CpayVoidPayments {

    @XmlElement(name = "void_payment")
    protected VoidPayment voidPayment;

    /**
     * Gets the value of the voidPayment property.
     * 
     * @return
     *     possible object is
     *     {@link VoidPayment }
     *     
     */
    public VoidPayment getVoidPayment() {
        return voidPayment;
    }

    /**
     * Sets the value of the voidPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidPayment }
     *     
     */
    public void setVoidPayment(VoidPayment value) {
        this.voidPayment = value;
    }

}
