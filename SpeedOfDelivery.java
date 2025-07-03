
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for speed_of_delivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="speed_of_delivery">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="taxes" type="{http://www.westernunion.com/schema/xrsi}taxes" minOccurs="0"/>
 *         <element name="originators_principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="destination_principal_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="gross_total_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="charges" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="speed_of_delivery_code" type="{http://www.westernunion.com/schema/xrsi}delivery_service_code" minOccurs="0"/>
 *         <element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="payment_type" type="{http://www.westernunion.com/schema/xrsi}payment_type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "speed_of_delivery", propOrder = {
    "taxes",
    "originatorsPrincipalAmount",
    "destinationPrincipalAmount",
    "grossTotalAmount",
    "charges",
    "speedOfDeliveryCode",
    "exchangeRate",
    "paymentType"
})
public class SpeedOfDelivery {

    protected Taxes taxes;
    @XmlElement(name = "originators_principal_amount")
    protected Long originatorsPrincipalAmount;
    @XmlElement(name = "destination_principal_amount")
    protected Long destinationPrincipalAmount;
    @XmlElement(name = "gross_total_amount")
    protected Long grossTotalAmount;
    protected Long charges;
    @XmlElement(name = "speed_of_delivery_code")
    protected String speedOfDeliveryCode;
    @XmlElement(name = "exchange_rate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "payment_type")
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link Taxes }
     *     
     */
    public Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxes }
     *     
     */
    public void setTaxes(Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the originatorsPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginatorsPrincipalAmount() {
        return originatorsPrincipalAmount;
    }

    /**
     * Sets the value of the originatorsPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginatorsPrincipalAmount(Long value) {
        this.originatorsPrincipalAmount = value;
    }

    /**
     * Gets the value of the destinationPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationPrincipalAmount() {
        return destinationPrincipalAmount;
    }

    /**
     * Sets the value of the destinationPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationPrincipalAmount(Long value) {
        this.destinationPrincipalAmount = value;
    }

    /**
     * Gets the value of the grossTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossTotalAmount() {
        return grossTotalAmount;
    }

    /**
     * Sets the value of the grossTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossTotalAmount(Long value) {
        this.grossTotalAmount = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCharges(Long value) {
        this.charges = value;
    }

    /**
     * Gets the value of the speedOfDeliveryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedOfDeliveryCode() {
        return speedOfDeliveryCode;
    }

    /**
     * Sets the value of the speedOfDeliveryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedOfDeliveryCode(String value) {
        this.speedOfDeliveryCode = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

}
