
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delivery_service_record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="delivery_service_record">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="network_id" type="{http://www.westernunion.com/schema/xrsi}network_id" minOccurs="0"/>
 *         <element name="delivery_service_code" type="{http://www.westernunion.com/schema/xrsi}delivery_service_code" minOccurs="0"/>
 *         <element name="routing_code" type="{http://www.westernunion.com/schema/xrsi}route_designator" minOccurs="0"/>
 *         <element name="delivery_serice_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="delivery_service_charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delivery_service_record", propOrder = {
    "networkId",
    "deliveryServiceCode",
    "routingCode",
    "deliverySericeName",
    "deliveryServiceCharges"
})
public class DeliveryServiceRecord {

    @XmlElement(name = "network_id")
    protected String networkId;
    @XmlElement(name = "delivery_service_code")
    protected String deliveryServiceCode;
    @XmlElement(name = "routing_code")
    protected String routingCode;
    @XmlElement(name = "delivery_serice_name")
    protected String deliverySericeName;
    @XmlElement(name = "delivery_service_charges")
    protected Long deliveryServiceCharges;

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the deliveryServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceCode() {
        return deliveryServiceCode;
    }

    /**
     * Sets the value of the deliveryServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceCode(String value) {
        this.deliveryServiceCode = value;
    }

    /**
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the deliverySericeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverySericeName() {
        return deliverySericeName;
    }

    /**
     * Sets the value of the deliverySericeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverySericeName(String value) {
        this.deliverySericeName = value;
    }

    /**
     * Gets the value of the deliveryServiceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliveryServiceCharges() {
        return deliveryServiceCharges;
    }

    /**
     * Sets the value of the deliveryServiceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliveryServiceCharges(Long value) {
        this.deliveryServiceCharges = value;
    }

}
