
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for international_phone_number complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="international_phone_number">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="country_code" type="{http://www.westernunion.com/schema/xrsi}mobile_country_code" minOccurs="0"/>
 *         <element name="national_number" type="{http://www.westernunion.com/schema/xrsi}phone_number" minOccurs="0"/>
 *         <element name="telephone_city_code" type="{http://www.westernunion.com/schema/xrsi}city_code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "international_phone_number", propOrder = {
    "countryCode",
    "nationalNumber",
    "telephoneCityCode"
})
public class InternationalPhoneNumber {

    @XmlElement(name = "country_code")
    protected String countryCode;
    @XmlElement(name = "national_number")
    protected String nationalNumber;
    @XmlElement(name = "telephone_city_code")
    protected String telephoneCityCode;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the nationalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalNumber() {
        return nationalNumber;
    }

    /**
     * Sets the value of the nationalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalNumber(String value) {
        this.nationalNumber = value;
    }

    /**
     * Gets the value of the telephoneCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneCityCode() {
        return telephoneCityCode;
    }

    /**
     * Sets the value of the telephoneCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneCityCode(String value) {
        this.telephoneCityCode = value;
    }

}
