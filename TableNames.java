
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for table_names complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="table_names">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="template" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="delivery_service" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="country_info" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="country" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ckw" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="qqc" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="sup" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table_names", propOrder = {
    "template",
    "deliveryService",
    "countryInfo",
    "country",
    "ckw",
    "qqc",
    "sup"
})
public class TableNames {

    protected String template;
    @XmlElement(name = "delivery_service")
    protected String deliveryService;
    @XmlElement(name = "country_info")
    protected String countryInfo;
    protected String country;
    protected String ckw;
    protected String qqc;
    protected String sup;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

    /**
     * Gets the value of the deliveryService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryService() {
        return deliveryService;
    }

    /**
     * Sets the value of the deliveryService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryService(String value) {
        this.deliveryService = value;
    }

    /**
     * Gets the value of the countryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryInfo() {
        return countryInfo;
    }

    /**
     * Sets the value of the countryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryInfo(String value) {
        this.countryInfo = value;
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
     * Gets the value of the ckw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkw() {
        return ckw;
    }

    /**
     * Sets the value of the ckw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkw(String value) {
        this.ckw = value;
    }

    /**
     * Gets the value of the qqc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqc() {
        return qqc;
    }

    /**
     * Sets the value of the qqc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqc(String value) {
        this.qqc = value;
    }

    /**
     * Gets the value of the sup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSup() {
        return sup;
    }

    /**
     * Sets the value of the sup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSup(String value) {
        this.sup = value;
    }

}
