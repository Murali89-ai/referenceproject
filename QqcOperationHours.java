
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_operation_hours complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="qqc_operation_hours">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="opening" type="{http://www.westernunion.com/schema/xrsi}qqc_hours" minOccurs="0"/>
 *         <element name="closing" type="{http://www.westernunion.com/schema/xrsi}qqc_hours" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qqc_operation_hours", propOrder = {
    "opening",
    "closing"
})
public class QqcOperationHours {

    protected String opening;
    protected String closing;

    /**
     * Gets the value of the opening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpening() {
        return opening;
    }

    /**
     * Sets the value of the opening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpening(String value) {
        this.opening = value;
    }

    /**
     * Gets the value of the closing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosing() {
        return closing;
    }

    /**
     * Sets the value of the closing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosing(String value) {
        this.closing = value;
    }

}
