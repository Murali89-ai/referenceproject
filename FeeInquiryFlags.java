
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fee_inquiry_flags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="fee_inquiry_flags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="phone_delivery_flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="test_question_flag" type="{http://www.westernunion.com/schema/xrsi}test_question_flag" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fee_inquiry_flags", propOrder = {
    "phoneDeliveryFlag",
    "testQuestionFlag"
})
public class FeeInquiryFlags {

    @XmlElement(name = "phone_delivery_flag")
    protected Boolean phoneDeliveryFlag;
    @XmlElement(name = "test_question_flag")
    protected String testQuestionFlag;

    /**
     * Gets the value of the phoneDeliveryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhoneDeliveryFlag() {
        return phoneDeliveryFlag;
    }

    /**
     * Sets the value of the phoneDeliveryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhoneDeliveryFlag(Boolean value) {
        this.phoneDeliveryFlag = value;
    }

    /**
     * Gets the value of the testQuestionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestQuestionFlag() {
        return testQuestionFlag;
    }

    /**
     * Sets the value of the testQuestionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestQuestionFlag(String value) {
        this.testQuestionFlag = value;
    }

}
