
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addl_service_block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="addl_service_block">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addl_service_length" type="{http://www.westernunion.com/schema/xrsi}addl_service_length" minOccurs="0"/>
 *         <element name="addl_service_data_buffer" type="{http://www.westernunion.com/schema/xrsi}addl_service_data_buffer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addl_service_block", propOrder = {
    "addlServiceLength",
    "addlServiceDataBuffer"
})
public class AddlServiceBlock {

    @XmlElement(name = "addl_service_length")
    protected Short addlServiceLength;
    @XmlElement(name = "addl_service_data_buffer")
    protected String addlServiceDataBuffer;

    /**
     * Gets the value of the addlServiceLength property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAddlServiceLength() {
        return addlServiceLength;
    }

    /**
     * Sets the value of the addlServiceLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAddlServiceLength(Short value) {
        this.addlServiceLength = value;
    }

    /**
     * Gets the value of the addlServiceDataBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlServiceDataBuffer() {
        return addlServiceDataBuffer;
    }

    /**
     * Sets the value of the addlServiceDataBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlServiceDataBuffer(String value) {
        this.addlServiceDataBuffer = value;
    }

}
