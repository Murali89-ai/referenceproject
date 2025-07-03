
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for staged_pins complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="staged_pins">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sender_staged_pin" type="{http://www.westernunion.com/schema/xrsi}staged_pin_number" minOccurs="0"/>
 *         <element name="receiver_staged_pin" type="{http://www.westernunion.com/schema/xrsi}staged_pin_number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staged_pins", propOrder = {
    "senderStagedPin",
    "receiverStagedPin"
})
public class StagedPins {

    @XmlElement(name = "sender_staged_pin")
    protected String senderStagedPin;
    @XmlElement(name = "receiver_staged_pin")
    protected String receiverStagedPin;

    /**
     * Gets the value of the senderStagedPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderStagedPin() {
        return senderStagedPin;
    }

    /**
     * Sets the value of the senderStagedPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderStagedPin(String value) {
        this.senderStagedPin = value;
    }

    /**
     * Gets the value of the receiverStagedPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverStagedPin() {
        return receiverStagedPin;
    }

    /**
     * Sets the value of the receiverStagedPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverStagedPin(String value) {
        this.receiverStagedPin = value;
    }

}
