
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_origination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="picklist_origination">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="country_iso_codes" type="{http://www.westernunion.com/schema/xrsi}picklist_country_iso_options" minOccurs="0"/>
 *         <element name="currency_iso_codes" type="{http://www.westernunion.com/schema/xrsi}picklist_currency_iso_options" minOccurs="0"/>
 *         <element name="principal_amounts" type="{http://www.westernunion.com/schema/xrsi}picklist_principal_amount_options" minOccurs="0"/>
 *         <element name="dates" type="{http://www.westernunion.com/schema/xrsi}picklist_date_options" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_origination", propOrder = {
    "countryIsoCodes",
    "currencyIsoCodes",
    "principalAmounts",
    "dates"
})
public class PicklistOrigination {

    @XmlElement(name = "country_iso_codes")
    protected PicklistCountryIsoOptions countryIsoCodes;
    @XmlElement(name = "currency_iso_codes")
    protected PicklistCurrencyIsoOptions currencyIsoCodes;
    @XmlElement(name = "principal_amounts")
    protected PicklistPrincipalAmountOptions principalAmounts;
    protected PicklistDateOptions dates;

    /**
     * Gets the value of the countryIsoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistCountryIsoOptions }
     *     
     */
    public PicklistCountryIsoOptions getCountryIsoCodes() {
        return countryIsoCodes;
    }

    /**
     * Sets the value of the countryIsoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistCountryIsoOptions }
     *     
     */
    public void setCountryIsoCodes(PicklistCountryIsoOptions value) {
        this.countryIsoCodes = value;
    }

    /**
     * Gets the value of the currencyIsoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistCurrencyIsoOptions }
     *     
     */
    public PicklistCurrencyIsoOptions getCurrencyIsoCodes() {
        return currencyIsoCodes;
    }

    /**
     * Sets the value of the currencyIsoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistCurrencyIsoOptions }
     *     
     */
    public void setCurrencyIsoCodes(PicklistCurrencyIsoOptions value) {
        this.currencyIsoCodes = value;
    }

    /**
     * Gets the value of the principalAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistPrincipalAmountOptions }
     *     
     */
    public PicklistPrincipalAmountOptions getPrincipalAmounts() {
        return principalAmounts;
    }

    /**
     * Sets the value of the principalAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistPrincipalAmountOptions }
     *     
     */
    public void setPrincipalAmounts(PicklistPrincipalAmountOptions value) {
        this.principalAmounts = value;
    }

    /**
     * Gets the value of the dates property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistDateOptions }
     *     
     */
    public PicklistDateOptions getDates() {
        return dates;
    }

    /**
     * Sets the value of the dates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistDateOptions }
     *     
     */
    public void setDates(PicklistDateOptions value) {
        this.dates = value;
    }

}
