
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_destination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="picklist_destination">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="country_iso_codes" type="{http://www.westernunion.com/schema/xrsi}picklist_country_iso_options" minOccurs="0"/>
 *         <element name="currency_iso_codes" type="{http://www.westernunion.com/schema/xrsi}picklist_currency_iso_options" minOccurs="0"/>
 *         <element name="expected_payout_amounts" type="{http://www.westernunion.com/schema/xrsi}picklist_expected_payout_amount_options" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_destination", propOrder = {
    "countryIsoCodes",
    "currencyIsoCodes",
    "expectedPayoutAmounts"
})
public class PicklistDestination {

    @XmlElement(name = "country_iso_codes")
    protected PicklistCountryIsoOptions countryIsoCodes;
    @XmlElement(name = "currency_iso_codes")
    protected PicklistCurrencyIsoOptions currencyIsoCodes;
    @XmlElement(name = "expected_payout_amounts")
    protected PicklistExpectedPayoutAmountOptions expectedPayoutAmounts;

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
     * Gets the value of the expectedPayoutAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistExpectedPayoutAmountOptions }
     *     
     */
    public PicklistExpectedPayoutAmountOptions getExpectedPayoutAmounts() {
        return expectedPayoutAmounts;
    }

    /**
     * Sets the value of the expectedPayoutAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistExpectedPayoutAmountOptions }
     *     
     */
    public void setExpectedPayoutAmounts(PicklistExpectedPayoutAmountOptions value) {
        this.expectedPayoutAmounts = value;
    }

}
