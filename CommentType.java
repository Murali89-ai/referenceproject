
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comment_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="comment_type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.westernunion.com/schema/xrsi}comment_lookup_type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comment_type", propOrder = {
    "type"
})
public class CommentType {

    @XmlSchemaType(name = "string")
    protected CommentLookupType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CommentLookupType }
     *     
     */
    public CommentLookupType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentLookupType }
     *     
     */
    public void setType(CommentLookupType value) {
        this.type = value;
    }

}
