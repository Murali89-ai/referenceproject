
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additional_pay_info_buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="additional_pay_info_buffer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="buffer_data" type="{http://www.westernunion.com/schema/xrsi}popup_buffer" minOccurs="0"/>
 *         <element name="payment_info" type="{http://www.westernunion.com/schema/xrsi}payment_info" maxOccurs="9" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additional_pay_info_buffer", propOrder = {
    "bufferData",
    "paymentInfo"
})
public class AdditionalPayInfoBuffer {

    @XmlElement(name = "buffer_data")
    protected String bufferData;
    @XmlElement(name = "payment_info")
    protected List<PaymentInfo> paymentInfo;

    /**
     * Gets the value of the bufferData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBufferData() {
        return bufferData;
    }

    /**
     * Sets the value of the bufferData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBufferData(String value) {
        this.bufferData = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the paymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInfo }
     * 
     * 
     * @return
     *     The value of the paymentInfo property.
     */
    public List<PaymentInfo> getPaymentInfo() {
        if (paymentInfo == null) {
            paymentInfo = new ArrayList<>();
        }
        return this.paymentInfo;
    }

}
