
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for id_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="id_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id_type" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="id_country_of_issue" type="{http://www.westernunion.com/schema/xrsi}id_country_of_issue" minOccurs="0"/>
 *         <element name="id_place_of_issue" type="{http://www.westernunion.com/schema/xrsi}id_country_of_issue" minOccurs="0"/>
 *         <element name="id_number" type="{http://www.westernunion.com/schema/xrsi}id_number" minOccurs="0"/>
 *         <element name="id_issuing_authority" type="{http://www.westernunion.com/schema/xrsi}id_issuing_authority" minOccurs="0"/>
 *         <element name="id_place_state_of_issue" type="{http://www.westernunion.com/schema/xrsi}id_country_of_issue" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "id_details", propOrder = {
    "idType",
    "idCountryOfIssue",
    "idPlaceOfIssue",
    "idNumber",
    "idIssuingAuthority",
    "idPlaceStateOfIssue"
})
public class IdDetails {

    @XmlElement(name = "id_type")
    protected String idType;
    @XmlElement(name = "id_country_of_issue")
    protected String idCountryOfIssue;
    @XmlElement(name = "id_place_of_issue")
    protected String idPlaceOfIssue;
    @XmlElement(name = "id_number")
    protected String idNumber;
    @XmlElement(name = "id_issuing_authority")
    protected String idIssuingAuthority;
    @XmlElement(name = "id_place_state_of_issue")
    protected String idPlaceStateOfIssue;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idCountryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCountryOfIssue() {
        return idCountryOfIssue;
    }

    /**
     * Sets the value of the idCountryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCountryOfIssue(String value) {
        this.idCountryOfIssue = value;
    }

    /**
     * Gets the value of the idPlaceOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPlaceOfIssue() {
        return idPlaceOfIssue;
    }

    /**
     * Sets the value of the idPlaceOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPlaceOfIssue(String value) {
        this.idPlaceOfIssue = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idIssuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdIssuingAuthority() {
        return idIssuingAuthority;
    }

    /**
     * Sets the value of the idIssuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdIssuingAuthority(String value) {
        this.idIssuingAuthority = value;
    }

    /**
     * Gets the value of the idPlaceStateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPlaceStateOfIssue() {
        return idPlaceStateOfIssue;
    }

    /**
     * Sets the value of the idPlaceStateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPlaceStateOfIssue(String value) {
        this.idPlaceStateOfIssue = value;
    }

}
