
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentAddress">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddressLine1" type="{http://www.westernunion.com/schema/xrsi}address_line_long" minOccurs="0"/>
 *         <element name="AddressLine2" type="{http://www.westernunion.com/schema/xrsi}address_line_long" minOccurs="0"/>
 *         <element name="City" type="{http://www.westernunion.com/schema/xrsi}city" minOccurs="0"/>
 *         <element name="State" type="{http://www.westernunion.com/schema/xrsi}state_province" minOccurs="0"/>
 *         <element name="PostalZipCode" type="{http://www.westernunion.com/schema/xrsi}postal_code" minOccurs="0"/>
 *         <element name="StateZip" type="{http://www.westernunion.com/schema/xrsi}state_zip" minOccurs="0"/>
 *         <element name="ISOCountryCode" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentAddress", propOrder = {
    "addressLine1",
    "addressLine2",
    "city",
    "state",
    "postalZipCode",
    "stateZip",
    "isoCountryCode"
})
public class AgentAddress {

    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "PostalZipCode")
    protected String postalZipCode;
    @XmlElement(name = "StateZip")
    protected String stateZip;
    @XmlElement(name = "ISOCountryCode")
    protected CountryCurrencyInfo isoCountryCode;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalZipCode() {
        return postalZipCode;
    }

    /**
     * Sets the value of the postalZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalZipCode(String value) {
        this.postalZipCode = value;
    }

    /**
     * Gets the value of the stateZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateZip() {
        return stateZip;
    }

    /**
     * Sets the value of the stateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateZip(String value) {
        this.stateZip = value;
    }

    /**
     * Gets the value of the isoCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getISOCountryCode() {
        return isoCountryCode;
    }

    /**
     * Sets the value of the isoCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setISOCountryCode(CountryCurrencyInfo value) {
        this.isoCountryCode = value;
    }

}
