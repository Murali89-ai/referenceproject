
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refund_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="refund_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="refund_type_details" type="{http://www.westernunion.com/schema/xrsi}refund_type_details" minOccurs="0"/>
 *         <element name="refund_amount_details" type="{http://www.westernunion.com/schema/xrsi}refund_amount_details" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refund_details", propOrder = {
    "refundTypeDetails",
    "refundAmountDetails"
})
public class RefundDetails {

    @XmlElement(name = "refund_type_details")
    protected RefundTypeDetails refundTypeDetails;
    @XmlElement(name = "refund_amount_details")
    protected RefundAmountDetails refundAmountDetails;

    /**
     * Gets the value of the refundTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RefundTypeDetails }
     *     
     */
    public RefundTypeDetails getRefundTypeDetails() {
        return refundTypeDetails;
    }

    /**
     * Sets the value of the refundTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundTypeDetails }
     *     
     */
    public void setRefundTypeDetails(RefundTypeDetails value) {
        this.refundTypeDetails = value;
    }

    /**
     * Gets the value of the refundAmountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RefundAmountDetails }
     *     
     */
    public RefundAmountDetails getRefundAmountDetails() {
        return refundAmountDetails;
    }

    /**
     * Sets the value of the refundAmountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundAmountDetails }
     *     
     */
    public void setRefundAmountDetails(RefundAmountDetails value) {
        this.refundAmountDetails = value;
    }

}
