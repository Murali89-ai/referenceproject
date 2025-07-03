
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compliance_address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="compliance_address">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addr_line1" type="{http://www.westernunion.com/schema/xrsi}address_line_short" minOccurs="0"/>
 *         <element name="addr_line2" type="{http://www.westernunion.com/schema/xrsi}address_line_short" minOccurs="0"/>
 *         <element name="city" type="{http://www.westernunion.com/schema/xrsi}Ccity" minOccurs="0"/>
 *         <element name="state_name" type="{http://www.westernunion.com/schema/xrsi}state_name" minOccurs="0"/>
 *         <element name="state_code" type="{http://www.westernunion.com/schema/xrsi}state_code" minOccurs="0"/>
 *         <element name="postal_code" type="{http://www.westernunion.com/schema/xrsi}Cpostal_code" minOccurs="0"/>
 *         <element name="country" type="{http://www.westernunion.com/schema/xrsi}country_name" minOccurs="0"/>
 *         <element name="zip" type="{http://www.westernunion.com/schema/xrsi}state_zip" minOccurs="0"/>
 *         <element name="street" type="{http://www.westernunion.com/schema/xrsi}CStreet" minOccurs="0"/>
 *         <element name="district" type="{http://www.westernunion.com/schema/xrsi}district" minOccurs="0"/>
 *         <element name="email" type="{http://www.westernunion.com/schema/xrsi}email" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compliance_address", propOrder = {
    "addrLine1",
    "addrLine2",
    "city",
    "stateName",
    "stateCode",
    "postalCode",
    "country",
    "zip",
    "street",
    "district",
    "email"
})
public class ComplianceAddress {

    @XmlElement(name = "addr_line1")
    protected String addrLine1;
    @XmlElement(name = "addr_line2")
    protected String addrLine2;
    protected String city;
    @XmlElement(name = "state_name")
    protected String stateName;
    @XmlElement(name = "state_code")
    protected String stateCode;
    @XmlElement(name = "postal_code")
    protected String postalCode;
    protected String country;
    protected String zip;
    protected String street;
    protected String district;
    protected String email;

    /**
     * Gets the value of the addrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine1() {
        return addrLine1;
    }

    /**
     * Sets the value of the addrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine1(String value) {
        this.addrLine1 = value;
    }

    /**
     * Gets the value of the addrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine2() {
        return addrLine2;
    }

    /**
     * Sets the value of the addrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine2(String value) {
        this.addrLine2 = value;
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
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
