
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_customer_identity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="channel_customer_identity">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}channel_customer_identity_base">
 *       <sequence>
 *         <element name="type" type="{http://www.westernunion.com/schema/xrsi}channel_customer_identity_type"/>
 *         <element name="data" type="{http://www.westernunion.com/schema/xrsi}channel_customer_identity_data"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_customer_identity", propOrder = {
    "type",
    "data"
})
public class ChannelCustomerIdentity
    extends ChannelCustomerIdentityBase
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ChannelCustomerIdentityType type;
    @XmlElement(required = true)
    protected String data;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelCustomerIdentityType }
     *     
     */
    public ChannelCustomerIdentityType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelCustomerIdentityType }
     *     
     */
    public void setType(ChannelCustomerIdentityType value) {
        this.type = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

}
