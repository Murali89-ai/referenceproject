
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for third_party_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="third_party_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         <element name="address" type="{http://www.westernunion.com/schema/xrsi}compliance_address" minOccurs="0"/>
 *         <element name="pay_wo_id_indicator" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="organization" type="{http://www.westernunion.com/schema/xrsi}organization" minOccurs="0"/>
 *         <element name="identification_number" type="{http://www.westernunion.com/schema/xrsi}id" minOccurs="0"/>
 *         <element name="occupation" type="{http://www.westernunion.com/schema/xrsi}occupation" minOccurs="0"/>
 *         <element name="amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="fx" type="{http://www.westernunion.com/schema/xrsi}fx" minOccurs="0"/>
 *         <element name="flag_pay" type="{http://www.westernunion.com/schema/xrsi}flag_pay" minOccurs="0"/>
 *         <element name="id_details" type="{http://www.westernunion.com/schema/xrsi}id_details" minOccurs="0"/>
 *         <element name="relationship" type="{http://www.westernunion.com/schema/xrsi}relationship" minOccurs="0"/>
 *         <element name="Place_of_Organization" type="{http://www.westernunion.com/schema/xrsi}Place_of_Organization" minOccurs="0"/>
 *         <element name="Date_of_Birth" type="{http://www.westernunion.com/schema/xrsi}Date_of_Birth" minOccurs="0"/>
 *         <element name="Place_of_Birth" type="{http://www.westernunion.com/schema/xrsi}Place_of_Birth" minOccurs="0"/>
 *         <element name="Country_of_Birth" type="{http://www.westernunion.com/schema/xrsi}Country_of_Birth" minOccurs="0"/>
 *         <element name="Nationality" type="{http://www.westernunion.com/schema/xrsi}nationality" minOccurs="0"/>
 *         <element name="Remarks" type="{http://www.westernunion.com/schema/xrsi}Remarks" minOccurs="0"/>
 *         <element name="ID_Expiration_Date" type="{http://www.westernunion.com/schema/xrsi}ID_Expiration_Date" minOccurs="0"/>
 *         <element name="EAS_Consumer_ID_Key" type="{http://www.westernunion.com/schema/xrsi}EAS_Consumer_ID_Key" minOccurs="0"/>
 *         <element name="Consumer_ID_Key" type="{http://www.westernunion.com/schema/xrsi}Consumer_ID_Key" minOccurs="0"/>
 *         <element name="White_List_Key" type="{http://www.westernunion.com/schema/xrsi}White_List_Key" minOccurs="0"/>
 *         <element name="gender" type="{http://www.westernunion.com/schema/xrsi}gender" minOccurs="0"/>
 *         <element name="telephone_number" type="{http://www.westernunion.com/schema/xrsi}Mobile_Phone_Number" minOccurs="0"/>
 *         <element name="tax_id" type="{http://www.westernunion.com/schema/xrsi}third_party_tax_id" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "third_party_details", propOrder = {
    "name",
    "address",
    "payWoIdIndicator",
    "organization",
    "identificationNumber",
    "occupation",
    "amount",
    "fx",
    "flagPay",
    "idDetails",
    "relationship",
    "placeOfOrganization",
    "dateOfBirth",
    "placeOfBirth",
    "countryOfBirth",
    "nationality",
    "remarks",
    "idExpirationDate",
    "easConsumerIDKey",
    "consumerIDKey",
    "whiteListKey",
    "gender",
    "telephoneNumber",
    "taxId"
})
public class ThirdPartyDetails {

    protected GeneralName name;
    protected ComplianceAddress address;
    @XmlElement(name = "pay_wo_id_indicator")
    @XmlSchemaType(name = "string")
    protected YesNo payWoIdIndicator;
    protected String organization;
    @XmlElement(name = "identification_number")
    protected String identificationNumber;
    protected String occupation;
    protected Long amount;
    protected String fx;
    @XmlElement(name = "flag_pay")
    protected String flagPay;
    @XmlElement(name = "id_details")
    protected IdDetails idDetails;
    protected String relationship;
    @XmlElement(name = "Place_of_Organization")
    protected String placeOfOrganization;
    @XmlElement(name = "Date_of_Birth")
    protected String dateOfBirth;
    @XmlElement(name = "Place_of_Birth")
    protected String placeOfBirth;
    @XmlElement(name = "Country_of_Birth")
    protected String countryOfBirth;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "ID_Expiration_Date")
    protected String idExpirationDate;
    @XmlElement(name = "EAS_Consumer_ID_Key")
    protected String easConsumerIDKey;
    @XmlElement(name = "Consumer_ID_Key")
    protected String consumerIDKey;
    @XmlElement(name = "White_List_Key")
    protected String whiteListKey;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlElement(name = "telephone_number")
    protected String telephoneNumber;
    @XmlElement(name = "tax_id")
    protected String taxId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setName(GeneralName value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceAddress }
     *     
     */
    public ComplianceAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceAddress }
     *     
     */
    public void setAddress(ComplianceAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the payWoIdIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPayWoIdIndicator() {
        return payWoIdIndicator;
    }

    /**
     * Sets the value of the payWoIdIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPayWoIdIndicator(YesNo value) {
        this.payWoIdIndicator = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the identificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNumber(String value) {
        this.identificationNumber = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFx() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFx(String value) {
        this.fx = value;
    }

    /**
     * Gets the value of the flagPay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagPay() {
        return flagPay;
    }

    /**
     * Sets the value of the flagPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagPay(String value) {
        this.flagPay = value;
    }

    /**
     * Gets the value of the idDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IdDetails }
     *     
     */
    public IdDetails getIdDetails() {
        return idDetails;
    }

    /**
     * Sets the value of the idDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDetails }
     *     
     */
    public void setIdDetails(IdDetails value) {
        this.idDetails = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the placeOfOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfOrganization() {
        return placeOfOrganization;
    }

    /**
     * Sets the value of the placeOfOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfOrganization(String value) {
        this.placeOfOrganization = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfBirth(String value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the idExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDExpirationDate() {
        return idExpirationDate;
    }

    /**
     * Sets the value of the idExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDExpirationDate(String value) {
        this.idExpirationDate = value;
    }

    /**
     * Gets the value of the easConsumerIDKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEASConsumerIDKey() {
        return easConsumerIDKey;
    }

    /**
     * Sets the value of the easConsumerIDKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEASConsumerIDKey(String value) {
        this.easConsumerIDKey = value;
    }

    /**
     * Gets the value of the consumerIDKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerIDKey() {
        return consumerIDKey;
    }

    /**
     * Sets the value of the consumerIDKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerIDKey(String value) {
        this.consumerIDKey = value;
    }

    /**
     * Gets the value of the whiteListKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhiteListKey() {
        return whiteListKey;
    }

    /**
     * Sets the value of the whiteListKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhiteListKey(String value) {
        this.whiteListKey = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

}
