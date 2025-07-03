
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for continuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="continuation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="uniqueField" type="{http://www.w3.org/2001/XMLSchema}string" default="ID" />
 *       <attribute name="startAt" type="{http://www.w3.org/2001/XMLSchema}string" default="1" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "continuation")
public class Continuation {

    @XmlAttribute(name = "uniqueField")
    protected String uniqueField;
    @XmlAttribute(name = "startAt")
    protected String startAt;

    /**
     * Gets the value of the uniqueField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueField() {
        if (uniqueField == null) {
            return "ID";
        } else {
            return uniqueField;
        }
    }

    /**
     * Sets the value of the uniqueField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueField(String value) {
        this.uniqueField = value;
    }

    /**
     * Gets the value of the startAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAt() {
        if (startAt == null) {
            return "1";
        } else {
            return startAt;
        }
    }

    /**
     * Sets the value of the startAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAt(String value) {
        this.startAt = value;
    }

}
