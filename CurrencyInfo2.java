
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currency_info2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="currency_info2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="currency_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="currency_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="equivalence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prefix_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="suffix_format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="decimal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="currency_regime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="major_unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="minor_unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="major_unit_plural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="minor_unit_plural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="services" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="division" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="min_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="max_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="exchange_rate" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="rounding_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fix_on_receive" type="{http://www.westernunion.com/schema/xrsi}fix_on_receive" minOccurs="0"/>
 *         <element name="cpc_code" type="{http://www.westernunion.com/schema/xrsi}cpc_code" minOccurs="0"/>
 *         <element name="status" type="{http://www.westernunion.com/schema/xrsi}export_status" minOccurs="0"/>
 *         <element name="max_payout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="test_question" type="{http://www.westernunion.com/schema/xrsi}test_question" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "currency_info2", propOrder = {
    "currencyCd",
    "currencyName",
    "equivalence",
    "prefixFormat",
    "format",
    "suffixFormat",
    "decimal",
    "currencyRegime",
    "majorUnit",
    "minorUnit",
    "majorUnitPlural",
    "minorUnitPlural",
    "services",
    "division",
    "minAmount",
    "maxAmount",
    "exchangeRate",
    "roundingIndicator",
    "fixOnReceive",
    "cpcCode",
    "status",
    "maxPayout",
    "testQuestion"
})
public class CurrencyInfo2 {

    @XmlElement(name = "currency_cd", required = true)
    protected String currencyCd;
    @XmlElement(name = "currency_name", required = true)
    protected String currencyName;
    protected String equivalence;
    @XmlElement(name = "prefix_format")
    protected String prefixFormat;
    protected String format;
    @XmlElement(name = "suffix_format")
    protected String suffixFormat;
    protected Integer decimal;
    @XmlElement(name = "currency_regime")
    protected String currencyRegime;
    @XmlElement(name = "major_unit", required = true)
    protected String majorUnit;
    @XmlElement(name = "minor_unit")
    protected String minorUnit;
    @XmlElement(name = "major_unit_plural")
    protected String majorUnitPlural;
    @XmlElement(name = "minor_unit_plural")
    protected String minorUnitPlural;
    protected String services;
    protected Integer division;
    @XmlElement(name = "min_amount")
    protected BigDecimal minAmount;
    @XmlElement(name = "max_amount")
    protected BigDecimal maxAmount;
    @XmlElement(name = "exchange_rate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "rounding_indicator")
    protected String roundingIndicator;
    @XmlElement(name = "fix_on_receive")
    protected String fixOnReceive;
    @XmlElement(name = "cpc_code")
    protected String cpcCode;
    protected String status;
    @XmlElement(name = "max_payout")
    protected BigDecimal maxPayout;
    @XmlElement(name = "test_question")
    protected String testQuestion;

    /**
     * Gets the value of the currencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCd() {
        return currencyCd;
    }

    /**
     * Sets the value of the currencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCd(String value) {
        this.currencyCd = value;
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
     * Gets the value of the equivalence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalence() {
        return equivalence;
    }

    /**
     * Sets the value of the equivalence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalence(String value) {
        this.equivalence = value;
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
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDivision(Integer value) {
        this.division = value;
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
     * Gets the value of the roundingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundingIndicator() {
        return roundingIndicator;
    }

    /**
     * Sets the value of the roundingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundingIndicator(String value) {
        this.roundingIndicator = value;
    }

    /**
     * Gets the value of the fixOnReceive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixOnReceive() {
        return fixOnReceive;
    }

    /**
     * Sets the value of the fixOnReceive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixOnReceive(String value) {
        this.fixOnReceive = value;
    }

    /**
     * Gets the value of the cpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpcCode() {
        return cpcCode;
    }

    /**
     * Sets the value of the cpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpcCode(String value) {
        this.cpcCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the maxPayout property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPayout() {
        return maxPayout;
    }

    /**
     * Sets the value of the maxPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPayout(BigDecimal value) {
        this.maxPayout = value;
    }

    /**
     * Gets the value of the testQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestQuestion() {
        return testQuestion;
    }

    /**
     * Sets the value of the testQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestQuestion(String value) {
        this.testQuestion = value;
    }

}
