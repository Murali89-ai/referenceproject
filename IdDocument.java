
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for id_document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="id_document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.westernunion.com/schema/xrsi}id_document_type"/>
 *         <element name="data" type="{http://www.westernunion.com/schema/xrsi}id_document_type_data"/>
 *         <element name="issue_date" type="{http://www.westernunion.com/schema/xrsi}id_issue_date" minOccurs="0"/>
 *         <element name="issue_place" type="{http://www.westernunion.com/schema/xrsi}city" minOccurs="0"/>
 *         <element name="issue_country" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="expiration_date" type="{http://www.westernunion.com/schema/xrsi}id_expiration_date" minOccurs="0"/>
 *         <element name="id_expires" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "id_document", propOrder = {
    "type",
    "data",
    "issueDate",
    "issuePlace",
    "issueCountry",
    "expirationDate",
    "idExpires"
})
public class IdDocument {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected IdDocumentType type;
    @XmlElement(required = true)
    protected String data;
    @XmlElement(name = "issue_date")
    protected String issueDate;
    @XmlElement(name = "issue_place")
    protected String issuePlace;
    @XmlElement(name = "issue_country")
    protected CountryCurrencyInfo issueCountry;
    @XmlElement(name = "expiration_date")
    protected String expirationDate;
    @XmlElement(name = "id_expires")
    @XmlSchemaType(name = "string")
    protected YesNo idExpires;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link IdDocumentType }
     *     
     */
    public IdDocumentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDocumentType }
     *     
     */
    public void setType(IdDocumentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuePlace() {
        return issuePlace;
    }

    /**
     * Sets the value of the issuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuePlace(String value) {
        this.issuePlace = value;
    }

    /**
     * Gets the value of the issueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getIssueCountry() {
        return issueCountry;
    }

    /**
     * Sets the value of the issueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setIssueCountry(CountryCurrencyInfo value) {
        this.issueCountry = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the idExpires property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getIdExpires() {
        return idExpires;
    }

    /**
     * Sets the value of the idExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setIdExpires(YesNo value) {
        this.idExpires = value;
    }

}
