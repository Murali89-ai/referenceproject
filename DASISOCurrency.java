
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASISOCurrency</b> object contains information for one 
 *             				ISO Currency.<br>
 *             				e.g. everything between <GETDESTINATIONCURRENCIES>...</GETDESTINATIONCURRENCIES> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISOCURRENCY_Type", propOrder = {

})
public class DASISOCurrency {

    @XmlElement(name = "CURRENCY_CD", required = true)
    protected String currencycd;
    @XmlElement(name = "DISP_CURRENCY_CD")
    protected String dispcurrencycd;
    @XmlElement(name = "CURRENCY_NAME", required = true)
    protected String currencyName;
    @XmlElement(name = "EQUIVALENCE")
    protected String equivalanceEnglish;
    @XmlElement(name = "PREFIX_FORMAT")
    protected String prefixFormat;
    @XmlElement(name = "FORMAT")
    protected String format;
    @XmlElement(name = "SUFFIX_FORMAT")
    protected String suffixFormat;
    @XmlElement(name = "DECIMAL")
    protected Integer decimal;
    @XmlElement(name = "CURRENCY_REGIME")
    protected String currencyRegime;
    @XmlElement(name = "MAJOR_UNIT", required = true)
    protected String majorUnit;
    @XmlElement(name = "MINOR_UNIT")
    protected String minorUnit;
    @XmlElement(name = "MAJOR_UNIT_PLURAL")
    protected String majorUnitPlural;
    @XmlElement(name = "MINOR_UNIT_PLURAL")
    protected String minorUnitPlural;
    @XmlElement(name = "SERVICES")
    protected String services;
    @XmlElement(name = "DIVISION")
    protected Integer scalingFactor;
    @XmlElement(name = "MIN_AMOUNT")
    protected BigDecimal minAmount;
    @XmlElement(name = "MAX_AMOUNT")
    protected BigDecimal maxAmount;
    @XmlElement(name = "FRAUD_LIMIT")
    protected BigDecimal fraudLimit;
    @XmlElement(name = "CONSUMER_LIMIT")
    protected BigDecimal consumerLimit;

    /**
     * Gets the value of the currencycd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYCD() {
        return currencycd;
    }

    /**
     * Sets the value of the currencycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYCD(String value) {
        this.currencycd = value;
    }

    /**
     * Gets the value of the dispcurrencycd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPCURRENCYCD() {
        return dispcurrencycd;
    }

    /**
     * Sets the value of the dispcurrencycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPCURRENCYCD(String value) {
        this.dispcurrencycd = value;
    }

    /**
     * Gets the value of the currencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the value of the currencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    /**
     * Gets the value of the equivalanceEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalanceEnglish() {
        return equivalanceEnglish;
    }

    /**
     * Sets the value of the equivalanceEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalanceEnglish(String value) {
        this.equivalanceEnglish = value;
    }

    /**
     * Gets the value of the prefixFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixFormat() {
        return prefixFormat;
    }

    /**
     * Sets the value of the prefixFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixFormat(String value) {
        this.prefixFormat = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the suffixFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixFormat() {
        return suffixFormat;
    }

    /**
     * Sets the value of the suffixFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixFormat(String value) {
        this.suffixFormat = value;
    }

    /**
     * Gets the value of the decimal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimal() {
        return decimal;
    }

    /**
     * Sets the value of the decimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimal(Integer value) {
        this.decimal = value;
    }

    /**
     * Gets the value of the currencyRegime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyRegime() {
        return currencyRegime;
    }

    /**
     * Sets the value of the currencyRegime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyRegime(String value) {
        this.currencyRegime = value;
    }

    /**
     * Gets the value of the majorUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorUnit() {
        return majorUnit;
    }

    /**
     * Sets the value of the majorUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorUnit(String value) {
        this.majorUnit = value;
    }

    /**
     * Gets the value of the minorUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorUnit() {
        return minorUnit;
    }

    /**
     * Sets the value of the minorUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorUnit(String value) {
        this.minorUnit = value;
    }

    /**
     * Gets the value of the majorUnitPlural property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorUnitPlural() {
        return majorUnitPlural;
    }

    /**
     * Sets the value of the majorUnitPlural property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorUnitPlural(String value) {
        this.majorUnitPlural = value;
    }

    /**
     * Gets the value of the minorUnitPlural property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorUnitPlural() {
        return minorUnitPlural;
    }

    /**
     * Sets the value of the minorUnitPlural property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorUnitPlural(String value) {
        this.minorUnitPlural = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Gets the value of the scalingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScalingFactor() {
        return scalingFactor;
    }

    /**
     * Sets the value of the scalingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScalingFactor(Integer value) {
        this.scalingFactor = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmount(BigDecimal value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the fraudLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFraudLimit() {
        return fraudLimit;
    }

    /**
     * Sets the value of the fraudLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFraudLimit(BigDecimal value) {
        this.fraudLimit = value;
    }

    /**
     * Gets the value of the consumerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumerLimit() {
        return consumerLimit;
    }

    /**
     * Sets the value of the consumerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumerLimit(BigDecimal value) {
        this.consumerLimit = value;
    }

}
