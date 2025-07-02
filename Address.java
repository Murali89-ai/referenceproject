
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="address">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addr_line1" type="{http://www.westernunion.com/schema/xrsi}address_line_long" minOccurs="0"/>
 *         <element name="addr_line2" type="{http://www.westernunion.com/schema/xrsi}address_line_long" minOccurs="0"/>
 *         <element name="city" type="{http://www.westernunion.com/schema/xrsi}city" minOccurs="0"/>
 *         <element name="state" type="{http://www.westernunion.com/schema/xrsi}state_province" minOccurs="0"/>
 *         <element name="postal_code" type="{http://www.westernunion.com/schema/xrsi}postal_code" minOccurs="0"/>
 *         <choice>
 *           <element name="country_code" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         </choice>
 *         <element name="local_area" type="{http://www.westernunion.com/schema/xrsi}local_area" minOccurs="0"/>
 *         <element name="locale" type="{http://www.westernunion.com/schema/xrsi}local_area" minOccurs="0"/>
 *         <element name="city_code" type="{http://www.westernunion.com/schema/xrsi}city_code" minOccurs="0"/>
 *         <element name="state_zip" type="{http://www.westernunion.com/schema/xrsi}state_zip" minOccurs="0"/>
 *         <element name="address_type" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="business_name" type="{http://www.westernunion.com/schema/xrsi}delivery_name" minOccurs="0"/>
 *         <element name="street" type="{http://www.westernunion.com/schema/xrsi}TStreet" minOccurs="0"/>
 *         <element name="local_delivery_area" type="{http://www.westernunion.com/schema/xrsi}TLocalDeliveryArea" minOccurs="0"/>
 *         <element name="receiver_telephone" type="{http://www.westernunion.com/schema/xrsi}rcv_phone_number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "addrLine1",
    "addrLine2",
    "city",
    "state",
    "postalCode",
    "countryCode",
    "localArea",
    "locale",
    "cityCode",
    "stateZip",
    "addressType",
    "businessName",
    "street",
    "localDeliveryArea",
    "receiverTelephone"
})
public class Address {

    @XmlElement(name = "addr_line1")
    protected String addrLine1;
    @XmlElement(name = "addr_line2")
    protected String addrLine2;
    protected String city;
    protected String state;
    @XmlElement(name = "postal_code")
    protected String postalCode;
    @XmlElement(name = "country_code")
    protected CountryCurrencyInfo countryCode;
    @XmlElement(name = "local_area")
    protected String localArea;
    protected String locale;
    @XmlElement(name = "city_code")
    protected String cityCode;
    @XmlElement(name = "state_zip")
    protected String stateZip;
    @XmlElement(name = "address_type")
    protected String addressType;
    @XmlElement(name = "business_name")
    protected String businessName;
    protected String street;
    @XmlElement(name = "local_delivery_area")
    protected String localDeliveryArea;
    @XmlElement(name = "receiver_telephone")
    protected String receiverTelephone;

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setCountryCode(CountryCurrencyInfo value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the localArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalArea() {
        return localArea;
    }

    /**
     * Sets the value of the localArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalArea(String value) {
        this.localArea = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
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
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
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
     * Gets the value of the localDeliveryArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDeliveryArea() {
        return localDeliveryArea;
    }

    /**
     * Sets the value of the localDeliveryArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDeliveryArea(String value) {
        this.localDeliveryArea = value;
    }

    /**
     * Gets the value of the receiverTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverTelephone() {
        return receiverTelephone;
    }

    /**
     * Sets the value of the receiverTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverTelephone(String value) {
        this.receiverTelephone = value;
    }

}
