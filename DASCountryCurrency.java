
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASISOCurrency</b> object contains information for one 
 *             				ISO Currency.<br>
 *             				e.g. everything between <GETCOUNTRIESCURRENCIES>...</GETCOUNTRIESCURRENCIES> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COUNTRY_CURRENCY_Type", propOrder = {

})
public class DASCountryCurrency {

    @XmlElement(name = "COUNTRY_LONG")
    protected String countrylong;
    @XmlElement(name = "ISO_COUNTRY_NUM_CD")
    protected String isocountrynumcd;
    @XmlElement(name = "ISO_COUNTRY_CD")
    protected String equivalanceEnglish;
    @XmlElement(name = "CURRENCY_CD")
    protected String prefixFormat;
    @XmlElement(name = "DISP_CURRENCY_CD")
    protected String displayCurrency;
    @XmlElement(name = "ISO_CURRENCY_NUM_CD")
    protected String format;
    @XmlElement(name = "CURRENCY_NAME")
    protected String suffixFormat;

    /**
     * Gets the value of the countrylong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYLONG() {
        return countrylong;
    }

    /**
     * Sets the value of the countrylong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYLONG(String value) {
        this.countrylong = value;
    }

    /**
     * Gets the value of the isocountrynumcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCOUNTRYNUMCD() {
        return isocountrynumcd;
    }

    /**
     * Sets the value of the isocountrynumcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCOUNTRYNUMCD(String value) {
        this.isocountrynumcd = value;
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
     * Gets the value of the displayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCurrency() {
        return displayCurrency;
    }

    /**
     * Sets the value of the displayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCurrency(String value) {
        this.displayCurrency = value;
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

}
