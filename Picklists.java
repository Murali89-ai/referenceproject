
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="picklists">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mobile_sender_names" type="{http://www.westernunion.com/schema/xrsi}picklist_mobile_sender_names" minOccurs="0"/>
 *         <element name="origination" type="{http://www.westernunion.com/schema/xrsi}picklist_origination" minOccurs="0"/>
 *         <element name="destination" type="{http://www.westernunion.com/schema/xrsi}picklist_destination" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklists", propOrder = {
    "mobileSenderNames",
    "origination",
    "destination"
})
public class Picklists {

    @XmlElement(name = "mobile_sender_names")
    protected PicklistMobileSenderNames mobileSenderNames;
    protected PicklistOrigination origination;
    protected PicklistDestination destination;

    /**
     * Gets the value of the mobileSenderNames property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistMobileSenderNames }
     *     
     */
    public PicklistMobileSenderNames getMobileSenderNames() {
        return mobileSenderNames;
    }

    /**
     * Sets the value of the mobileSenderNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistMobileSenderNames }
     *     
     */
    public void setMobileSenderNames(PicklistMobileSenderNames value) {
        this.mobileSenderNames = value;
    }

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistOrigination }
     *     
     */
    public PicklistOrigination getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistOrigination }
     *     
     */
    public void setOrigination(PicklistOrigination value) {
        this.origination = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistDestination }
     *     
     */
    public PicklistDestination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistDestination }
     *     
     */
    public void setDestination(PicklistDestination value) {
        this.destination = value;
    }

}
