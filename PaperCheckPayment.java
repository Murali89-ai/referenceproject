
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paper_check_payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="paper_check_payment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="check_details" type="{http://www.westernunion.com/schema/xrsi}paper_check_details" minOccurs="0"/>
 *         <element name="payment_amount" type="{http://www.westernunion.com/schema/xrsi}money" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paper_check_payment", propOrder = {
    "checkDetails",
    "paymentAmount"
})
public class PaperCheckPayment {

    @XmlElement(name = "check_details")
    protected PaperCheckDetails checkDetails;
    @XmlElement(name = "payment_amount")
    protected Money paymentAmount;

    /**
     * Gets the value of the checkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCheckDetails }
     *     
     */
    public PaperCheckDetails getCheckDetails() {
        return checkDetails;
    }

    /**
     * Sets the value of the checkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCheckDetails }
     *     
     */
    public void setCheckDetails(PaperCheckDetails value) {
        this.checkDetails = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentAmount(Money value) {
        this.paymentAmount = value;
    }

}
