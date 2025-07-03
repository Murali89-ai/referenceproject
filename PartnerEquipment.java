
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_equipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="partner_equipment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sender_equipment" type="{http://www.westernunion.com/schema/xrsi}mobile_gwp_gbs_device" minOccurs="0"/>
 *         <element name="receiver_equipment" type="{http://www.westernunion.com/schema/xrsi}mobile_gwp_gbs_device" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partner_equipment", propOrder = {
    "senderEquipment",
    "receiverEquipment"
})
public class PartnerEquipment {

    @XmlElement(name = "sender_equipment")
    protected MobileGwpGbsDevice senderEquipment;
    @XmlElement(name = "receiver_equipment")
    protected MobileGwpGbsDevice receiverEquipment;

    /**
     * Gets the value of the senderEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link MobileGwpGbsDevice }
     *     
     */
    public MobileGwpGbsDevice getSenderEquipment() {
        return senderEquipment;
    }

    /**
     * Sets the value of the senderEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileGwpGbsDevice }
     *     
     */
    public void setSenderEquipment(MobileGwpGbsDevice value) {
        this.senderEquipment = value;
    }

    /**
     * Gets the value of the receiverEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link MobileGwpGbsDevice }
     *     
     */
    public MobileGwpGbsDevice getReceiverEquipment() {
        return receiverEquipment;
    }

    /**
     * Sets the value of the receiverEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileGwpGbsDevice }
     *     
     */
    public void setReceiverEquipment(MobileGwpGbsDevice value) {
        this.receiverEquipment = value;
    }

}
