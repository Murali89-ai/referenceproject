
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fee_inquiry_message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="fee_inquiry_message">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tolls" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="base_message_charge" type="{http://www.westernunion.com/schema/xrsi}message_charge" minOccurs="0"/>
 *         <element name="base_message_limit" type="{http://www.westernunion.com/schema/xrsi}message_limit" minOccurs="0"/>
 *         <element name="incremental_message_charge" type="{http://www.westernunion.com/schema/xrsi}message_charge" minOccurs="0"/>
 *         <element name="incremental_message_limit" type="{http://www.westernunion.com/schema/xrsi}message_limit" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fee_inquiry_message", propOrder = {
    "tolls",
    "baseMessageCharge",
    "baseMessageLimit",
    "incrementalMessageCharge",
    "incrementalMessageLimit"
})
public class FeeInquiryMessage {

    protected String tolls;
    @XmlElement(name = "base_message_charge")
    protected String baseMessageCharge;
    @XmlElement(name = "base_message_limit")
    protected String baseMessageLimit;
    @XmlElement(name = "incremental_message_charge")
    protected String incrementalMessageCharge;
    @XmlElement(name = "incremental_message_limit")
    protected String incrementalMessageLimit;

    /**
     * Gets the value of the tolls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTolls() {
        return tolls;
    }

    /**
     * Sets the value of the tolls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolls(String value) {
        this.tolls = value;
    }

    /**
     * Gets the value of the baseMessageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMessageCharge() {
        return baseMessageCharge;
    }

    /**
     * Sets the value of the baseMessageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMessageCharge(String value) {
        this.baseMessageCharge = value;
    }

    /**
     * Gets the value of the baseMessageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMessageLimit() {
        return baseMessageLimit;
    }

    /**
     * Sets the value of the baseMessageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMessageLimit(String value) {
        this.baseMessageLimit = value;
    }

    /**
     * Gets the value of the incrementalMessageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementalMessageCharge() {
        return incrementalMessageCharge;
    }

    /**
     * Sets the value of the incrementalMessageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementalMessageCharge(String value) {
        this.incrementalMessageCharge = value;
    }

    /**
     * Gets the value of the incrementalMessageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementalMessageLimit() {
        return incrementalMessageLimit;
    }

    /**
     * Sets the value of the incrementalMessageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementalMessageLimit(String value) {
        this.incrementalMessageLimit = value;
    }

}
