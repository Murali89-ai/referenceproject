
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_branded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="partner_branded">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="principal_amount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="fx_spread" type="{http://www.westernunion.com/schema/xrsi}fx_spread" minOccurs="0"/>
 *         <element name="partner_buffer" type="{http://www.westernunion.com/schema/xrsi}partner_buffer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partner_branded", propOrder = {
    "principalAmount",
    "exchangeRate",
    "fxSpread",
    "partnerBuffer"
})
public class PartnerBranded {

    @XmlElement(name = "principal_amount")
    protected BigDecimal principalAmount;
    @XmlElement(name = "exchange_rate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "fx_spread")
    protected String fxSpread;
    @XmlElement(name = "partner_buffer")
    protected String partnerBuffer;

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalAmount(BigDecimal value) {
        this.principalAmount = value;
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
     * Gets the value of the fxSpread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxSpread() {
        return fxSpread;
    }

    /**
     * Sets the value of the fxSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxSpread(String value) {
        this.fxSpread = value;
    }

    /**
     * Gets the value of the partnerBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerBuffer() {
        return partnerBuffer;
    }

    /**
     * Sets the value of the partnerBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerBuffer(String value) {
        this.partnerBuffer = value;
    }

}
