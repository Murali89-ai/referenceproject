
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TemplateInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="T_INDEX" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="SUB_INDEX" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="DESCRIPTION" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateInfo", propOrder = {
    "tindex",
    "subindex",
    "description"
})
public class TemplateInfo {

    @XmlElement(name = "T_INDEX")
    protected String tindex;
    @XmlElement(name = "SUB_INDEX")
    protected String subindex;
    @XmlElement(name = "DESCRIPTION")
    protected String description;

    /**
     * Gets the value of the tindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTINDEX() {
        return tindex;
    }

    /**
     * Sets the value of the tindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTINDEX(String value) {
        this.tindex = value;
    }

    /**
     * Gets the value of the subindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBINDEX() {
        return subindex;
    }

    /**
     * Sets the value of the subindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBINDEX(String value) {
        this.subindex = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

}
