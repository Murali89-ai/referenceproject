
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hosted_partner_buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="hosted_partner_buffer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="partner_id" type="{http://www.westernunion.com/schema/xrsi}partner_id" minOccurs="0"/>
 *         <element name="location_id" type="{http://www.westernunion.com/schema/xrsi}location_id" minOccurs="0"/>
 *         <element name="partner_device_id" type="{http://www.westernunion.com/schema/xrsi}partner_device_id" minOccurs="0"/>
 *         <element name="ruo" type="{http://www.westernunion.com/schema/xrsi}ruo" minOccurs="0"/>
 *         <element name="product" type="{http://www.westernunion.com/schema/xrsi}product" minOccurs="0"/>
 *         <element name="channel" type="{http://www.westernunion.com/schema/xrsi}channel_buffer" minOccurs="0"/>
 *         <element name="id_application" type="{http://www.westernunion.com/schema/xrsi}id_application" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hosted_partner_buffer", propOrder = {
    "partnerId",
    "locationId",
    "partnerDeviceId",
    "ruo",
    "product",
    "channel",
    "idApplication"
})
public class HostedPartnerBuffer {

    @XmlElement(name = "partner_id")
    protected String partnerId;
    @XmlElement(name = "location_id")
    protected String locationId;
    @XmlElement(name = "partner_device_id")
    protected String partnerDeviceId;
    protected String ruo;
    @XmlSchemaType(name = "string")
    protected Product product;
    @XmlSchemaType(name = "string")
    protected ChannelBuffer channel;
    @XmlElement(name = "id_application")
    protected String idApplication;

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the partnerDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerDeviceId() {
        return partnerDeviceId;
    }

    /**
     * Sets the value of the partnerDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerDeviceId(String value) {
        this.partnerDeviceId = value;
    }

    /**
     * Gets the value of the ruo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuo() {
        return ruo;
    }

    /**
     * Sets the value of the ruo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuo(String value) {
        this.ruo = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelBuffer }
     *     
     */
    public ChannelBuffer getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelBuffer }
     *     
     */
    public void setChannel(ChannelBuffer value) {
        this.channel = value;
    }

    /**
     * Gets the value of the idApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdApplication() {
        return idApplication;
    }

    /**
     * Sets the value of the idApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdApplication(String value) {
        this.idApplication = value;
    }

}
