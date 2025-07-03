
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cpay_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="cpay_transaction_base">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="partner" type="{http://www.westernunion.com/schema/xrsi}cpay_partner"/>
 *         <element name="device" type="{http://www.westernunion.com/schema/xrsi}terminal"/>
 *         <element name="operator" type="{http://www.westernunion.com/schema/xrsi}operator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cpay_transaction_base", propOrder = {
    "partner",
    "device",
    "operator"
})
@XmlSeeAlso({
    CpayRequestTransactionBase.class,
    CpayReplyTransactionBase.class
})
public class CpayTransactionBase {

    @XmlElement(required = true)
    protected CpayPartner partner;
    @XmlElement(required = true)
    protected Terminal device;
    @XmlElement(required = true)
    protected Operator operator;

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link CpayPartner }
     *     
     */
    public CpayPartner getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpayPartner }
     *     
     */
    public void setPartner(CpayPartner value) {
        this.partner = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setDevice(Terminal value) {
        this.device = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

}
