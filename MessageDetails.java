
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="message_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="message_details" type="{http://www.westernunion.com/schema/xrsi}messages" minOccurs="0"/>
 *         <element name="base_word_limit" type="{http://www.westernunion.com/schema/xrsi}message_word_limit" minOccurs="0"/>
 *         <element name="incr_word_limit" type="{http://www.westernunion.com/schema/xrsi}message_word_limit" minOccurs="0"/>
 *         <element name="lines" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message_details", propOrder = {
    "messageDetails",
    "baseWordLimit",
    "incrWordLimit",
    "lines"
})
public class MessageDetails {

    @XmlElement(name = "message_details")
    protected Messages messageDetails;
    @XmlElement(name = "base_word_limit")
    protected String baseWordLimit;
    @XmlElement(name = "incr_word_limit")
    protected String incrWordLimit;
    protected BigInteger lines;

    /**
     * Gets the value of the messageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessageDetails() {
        return messageDetails;
    }

    /**
     * Sets the value of the messageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessageDetails(Messages value) {
        this.messageDetails = value;
    }

    /**
     * Gets the value of the baseWordLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseWordLimit() {
        return baseWordLimit;
    }

    /**
     * Sets the value of the baseWordLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseWordLimit(String value) {
        this.baseWordLimit = value;
    }

    /**
     * Gets the value of the incrWordLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrWordLimit() {
        return incrWordLimit;
    }

    /**
     * Sets the value of the incrWordLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrWordLimit(String value) {
        this.incrWordLimit = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLines(BigInteger value) {
        this.lines = value;
    }

}
