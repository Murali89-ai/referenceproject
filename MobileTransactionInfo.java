
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_transaction_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="mobile_transaction_info">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mobile_sender" type="{http://www.westernunion.com/schema/xrsi}mobile_customer" minOccurs="0"/>
 *         <element name="mobile_receiver" type="{http://www.westernunion.com/schema/xrsi}mobile_customer" minOccurs="0"/>
 *         <element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}mobile_payment_details" minOccurs="0"/>
 *         <element name="comment" type="{http://www.westernunion.com/schema/xrsi}comment" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_transaction_info", propOrder = {
    "mobileSender",
    "mobileReceiver",
    "paymentDetails",
    "comment"
})
public class MobileTransactionInfo {

    @XmlElement(name = "mobile_sender")
    protected MobileCustomer mobileSender;
    @XmlElement(name = "mobile_receiver")
    protected MobileCustomer mobileReceiver;
    @XmlElement(name = "payment_details")
    protected MobilePaymentDetails paymentDetails;
    protected Comment comment;

    /**
     * Gets the value of the mobileSender property.
     * 
     * @return
     *     possible object is
     *     {@link MobileCustomer }
     *     
     */
    public MobileCustomer getMobileSender() {
        return mobileSender;
    }

    /**
     * Sets the value of the mobileSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCustomer }
     *     
     */
    public void setMobileSender(MobileCustomer value) {
        this.mobileSender = value;
    }

    /**
     * Gets the value of the mobileReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link MobileCustomer }
     *     
     */
    public MobileCustomer getMobileReceiver() {
        return mobileReceiver;
    }

    /**
     * Sets the value of the mobileReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileCustomer }
     *     
     */
    public void setMobileReceiver(MobileCustomer value) {
        this.mobileReceiver = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePaymentDetails }
     *     
     */
    public MobilePaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePaymentDetails }
     *     
     */
    public void setPaymentDetails(MobilePaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

}
