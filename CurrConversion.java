
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for curr_conversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="curr_conversion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="network_exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="destination_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="service_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curr_conversion", propOrder = {
    "networkExchangeRate",
    "destinationAmount",
    "serviceName"
})
public class CurrConversion {

    @XmlElement(name = "network_exchange_rate")
    protected BigDecimal networkExchangeRate;
    @XmlElement(name = "destination_amount")
    protected Long destinationAmount;
    @XmlElement(name = "service_name")
    protected String serviceName;

    /**
     * Gets the value of the networkExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetworkExchangeRate() {
        return networkExchangeRate;
    }

    /**
     * Sets the value of the networkExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetworkExchangeRate(BigDecimal value) {
        this.networkExchangeRate = value;
    }

    /**
     * Gets the value of the destinationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationAmount() {
        return destinationAmount;
    }

    /**
     * Sets the value of the destinationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationAmount(Long value) {
        this.destinationAmount = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

}
