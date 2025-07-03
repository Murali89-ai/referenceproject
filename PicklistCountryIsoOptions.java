
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_country_iso_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="picklist_country_iso_options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="country_iso_code" type="{http://www.westernunion.com/schema/xrsi}country_iso_code" maxOccurs="4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_country_iso_options", propOrder = {
    "countryIsoCode"
})
public class PicklistCountryIsoOptions {

    @XmlElement(name = "country_iso_code", required = true)
    protected List<String> countryIsoCode;

    /**
     * Gets the value of the countryIsoCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the countryIsoCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryIsoCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the countryIsoCode property.
     */
    public List<String> getCountryIsoCode() {
        if (countryIsoCode == null) {
            countryIsoCode = new ArrayList<>();
        }
        return this.countryIsoCode;
    }

}
