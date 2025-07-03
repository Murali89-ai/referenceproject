
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_mobile_sender_names complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="picklist_mobile_sender_names">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="first_names" type="{http://www.westernunion.com/schema/xrsi}picklist_first_name_options" minOccurs="0"/>
 *         <element name="last_names" type="{http://www.westernunion.com/schema/xrsi}picklist_last_name_options" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_mobile_sender_names", propOrder = {
    "firstNames",
    "lastNames"
})
public class PicklistMobileSenderNames {

    @XmlElement(name = "first_names")
    protected PicklistFirstNameOptions firstNames;
    @XmlElement(name = "last_names")
    protected PicklistLastNameOptions lastNames;

    /**
     * Gets the value of the firstNames property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFirstNameOptions }
     *     
     */
    public PicklistFirstNameOptions getFirstNames() {
        return firstNames;
    }

    /**
     * Sets the value of the firstNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFirstNameOptions }
     *     
     */
    public void setFirstNames(PicklistFirstNameOptions value) {
        this.firstNames = value;
    }

    /**
     * Gets the value of the lastNames property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistLastNameOptions }
     *     
     */
    public PicklistLastNameOptions getLastNames() {
        return lastNames;
    }

    /**
     * Sets the value of the lastNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistLastNameOptions }
     *     
     */
    public void setLastNames(PicklistLastNameOptions value) {
        this.lastNames = value;
    }

}
