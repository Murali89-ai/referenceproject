
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_taxes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="channel_taxes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tax_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="tax_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="municipal_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="state_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="county_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="tax_worksheet" type="{http://www.westernunion.com/schema/xrsi}tax_worksheet" minOccurs="0"/>
 *         <element name="client_tax" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="VET" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_taxes", propOrder = {
    "taxAmount",
    "taxRate",
    "municipalTax",
    "stateTax",
    "countyTax",
    "taxWorksheet",
    "clientTax",
    "vet"
})
public class ChannelTaxes {

    @XmlElement(name = "tax_amount")
    protected Long taxAmount;
    @XmlElement(name = "tax_rate")
    protected BigDecimal taxRate;
    @XmlElement(name = "municipal_tax")
    protected Long municipalTax;
    @XmlElement(name = "state_tax")
    protected Long stateTax;
    @XmlElement(name = "county_tax")
    protected Long countyTax;
    @XmlElement(name = "tax_worksheet")
    protected String taxWorksheet;
    @XmlElement(name = "client_tax")
    protected Long clientTax;
    @XmlElement(name = "VET")
    protected BigDecimal vet;

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the municipalTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMunicipalTax() {
        return municipalTax;
    }

    /**
     * Sets the value of the municipalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMunicipalTax(Long value) {
        this.municipalTax = value;
    }

    /**
     * Gets the value of the stateTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStateTax() {
        return stateTax;
    }

    /**
     * Sets the value of the stateTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStateTax(Long value) {
        this.stateTax = value;
    }

    /**
     * Gets the value of the countyTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountyTax() {
        return countyTax;
    }

    /**
     * Sets the value of the countyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountyTax(Long value) {
        this.countyTax = value;
    }

    /**
     * Gets the value of the taxWorksheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxWorksheet() {
        return taxWorksheet;
    }

    /**
     * Sets the value of the taxWorksheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxWorksheet(String value) {
        this.taxWorksheet = value;
    }

    /**
     * Gets the value of the clientTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientTax() {
        return clientTax;
    }

    /**
     * Sets the value of the clientTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientTax(Long value) {
        this.clientTax = value;
    }

    /**
     * Gets the value of the vet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVET() {
        return vet;
    }

    /**
     * Sets the value of the vet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVET(BigDecimal value) {
        this.vet = value;
    }

}
