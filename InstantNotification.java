
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instant_notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="instant_notification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addl_service_charges" type="{http://www.westernunion.com/schema/xrsi}universal_buffer" minOccurs="0"/>
 *         <element name="addl_service_block" type="{http://www.westernunion.com/schema/xrsi}addl_service_block" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instant_notification", propOrder = {
    "addlServiceCharges",
    "addlServiceBlock"
})
public class InstantNotification {

    @XmlElement(name = "addl_service_charges")
    protected String addlServiceCharges;
    @XmlElement(name = "addl_service_block")
    protected AddlServiceBlock addlServiceBlock;

    /**
     * Gets the value of the addlServiceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlServiceCharges() {
        return addlServiceCharges;
    }

    /**
     * Sets the value of the addlServiceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlServiceCharges(String value) {
        this.addlServiceCharges = value;
    }

    /**
     * Gets the value of the addlServiceBlock property.
     * 
     * @return
     *     possible object is
     *     {@link AddlServiceBlock }
     *     
     */
    public AddlServiceBlock getAddlServiceBlock() {
        return addlServiceBlock;
    }

    /**
     * Sets the value of the addlServiceBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlServiceBlock }
     *     
     */
    public void setAddlServiceBlock(AddlServiceBlock value) {
        this.addlServiceBlock = value;
    }

}
