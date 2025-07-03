
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ufo_exception_flags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ufo_exception_flags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="except_hot_card" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_traffic" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_city" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_scam" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_sports" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_ani" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_avs" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_optval" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_guarantee" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="except_spares" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ufo_exception_flags", propOrder = {
    "exceptHotCard",
    "exceptTraffic",
    "exceptCity",
    "exceptScam",
    "exceptSports",
    "exceptAni",
    "exceptAvs",
    "exceptOptval",
    "exceptGuarantee",
    "exceptSpares"
})
public class UfoExceptionFlags {

    @XmlElement(name = "except_hot_card")
    protected String exceptHotCard;
    @XmlElement(name = "except_traffic")
    protected String exceptTraffic;
    @XmlElement(name = "except_city")
    protected String exceptCity;
    @XmlElement(name = "except_scam")
    protected String exceptScam;
    @XmlElement(name = "except_sports")
    protected String exceptSports;
    @XmlElement(name = "except_ani")
    protected String exceptAni;
    @XmlElement(name = "except_avs")
    protected String exceptAvs;
    @XmlElement(name = "except_optval")
    protected String exceptOptval;
    @XmlElement(name = "except_guarantee")
    protected String exceptGuarantee;
    @XmlElement(name = "except_spares")
    protected String exceptSpares;

    /**
     * Gets the value of the exceptHotCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptHotCard() {
        return exceptHotCard;
    }

    /**
     * Sets the value of the exceptHotCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptHotCard(String value) {
        this.exceptHotCard = value;
    }

    /**
     * Gets the value of the exceptTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptTraffic() {
        return exceptTraffic;
    }

    /**
     * Sets the value of the exceptTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptTraffic(String value) {
        this.exceptTraffic = value;
    }

    /**
     * Gets the value of the exceptCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptCity() {
        return exceptCity;
    }

    /**
     * Sets the value of the exceptCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptCity(String value) {
        this.exceptCity = value;
    }

    /**
     * Gets the value of the exceptScam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptScam() {
        return exceptScam;
    }

    /**
     * Sets the value of the exceptScam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptScam(String value) {
        this.exceptScam = value;
    }

    /**
     * Gets the value of the exceptSports property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptSports() {
        return exceptSports;
    }

    /**
     * Sets the value of the exceptSports property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptSports(String value) {
        this.exceptSports = value;
    }

    /**
     * Gets the value of the exceptAni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptAni() {
        return exceptAni;
    }

    /**
     * Sets the value of the exceptAni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptAni(String value) {
        this.exceptAni = value;
    }

    /**
     * Gets the value of the exceptAvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptAvs() {
        return exceptAvs;
    }

    /**
     * Sets the value of the exceptAvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptAvs(String value) {
        this.exceptAvs = value;
    }

    /**
     * Gets the value of the exceptOptval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptOptval() {
        return exceptOptval;
    }

    /**
     * Sets the value of the exceptOptval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptOptval(String value) {
        this.exceptOptval = value;
    }

    /**
     * Gets the value of the exceptGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptGuarantee() {
        return exceptGuarantee;
    }

    /**
     * Sets the value of the exceptGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptGuarantee(String value) {
        this.exceptGuarantee = value;
    }

    /**
     * Gets the value of the exceptSpares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptSpares() {
        return exceptSpares;
    }

    /**
     * Sets the value of the exceptSpares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptSpares(String value) {
        this.exceptSpares = value;
    }

}
