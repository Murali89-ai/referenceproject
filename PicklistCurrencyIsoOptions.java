
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_currency_iso_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="picklist_currency_iso_options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="currency_iso_code" type="{http://www.westernunion.com/schema/xrsi}currency_iso_code" maxOccurs="4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_currency_iso_options", propOrder = {
    "currencyIsoCode"
})
public class PicklistCurrencyIsoOptions {

    @XmlElement(name = "currency_iso_code", required = true)
    protected List<String> currencyIsoCode;

    /**
     * Gets the value of the currencyIsoCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the currencyIsoCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyIsoCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the currencyIsoCode property.
     */
    public List<String> getCurrencyIsoCode() {
        if (currencyIsoCode == null) {
            currencyIsoCode = new ArrayList<>();
        }
        return this.currencyIsoCode;
    }

}
