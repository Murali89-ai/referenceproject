
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_compliance_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="channel_compliance_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id_documents" type="{http://www.westernunion.com/schema/xrsi}id_documents" minOccurs="0"/>
 *         <element name="banking_regulations_data" type="{http://www.westernunion.com/schema/xrsi}banking_regulations_data" minOccurs="0"/>
 *         <element name="compliance_comments" type="{http://www.westernunion.com/schema/xrsi}compliance_comments" minOccurs="0"/>
 *         <element name="nationality" type="{http://www.westernunion.com/schema/xrsi}nationality" minOccurs="0"/>
 *         <element name="social_security_no" type="{http://www.westernunion.com/schema/xrsi}social_security_no" minOccurs="0"/>
 *         <element name="country_of_residence" type="{http://www.westernunion.com/schema/xrsi}country_iso_code" minOccurs="0"/>
 *         <element name="permanent_address" type="{http://www.westernunion.com/schema/xrsi}address" minOccurs="0"/>
 *         <element name="address_verified" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="sender_receiver_relationship" type="{http://www.westernunion.com/schema/xrsi}sender_receiver_relationship" minOccurs="0"/>
 *         <element name="source_of_funds" type="{http://www.westernunion.com/schema/xrsi}source_of_funds" minOccurs="0"/>
 *         <element name="check_box" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="documents_verified" type="{http://www.westernunion.com/schema/xrsi}documents_verified" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel_compliance_details", propOrder = {
    "idDocuments",
    "bankingRegulationsData",
    "complianceComments",
    "nationality",
    "socialSecurityNo",
    "countryOfResidence",
    "permanentAddress",
    "addressVerified",
    "senderReceiverRelationship",
    "sourceOfFunds",
    "checkBox",
    "documentsVerified"
})
@XmlSeeAlso({
    MobileComplianceDetails.class
})
public class ChannelComplianceDetails {

    @XmlElement(name = "id_documents")
    protected IdDocuments idDocuments;
    @XmlElement(name = "banking_regulations_data")
    protected String bankingRegulationsData;
    @XmlElement(name = "compliance_comments")
    protected String complianceComments;
    protected String nationality;
    @XmlElement(name = "social_security_no")
    protected String socialSecurityNo;
    @XmlElement(name = "country_of_residence")
    protected String countryOfResidence;
    @XmlElement(name = "permanent_address")
    protected Address permanentAddress;
    @XmlElement(name = "address_verified")
    @XmlSchemaType(name = "string")
    protected YesNo addressVerified;
    @XmlElement(name = "sender_receiver_relationship")
    protected String senderReceiverRelationship;
    @XmlElement(name = "source_of_funds")
    protected String sourceOfFunds;
    @XmlElement(name = "check_box")
    @XmlSchemaType(name = "string")
    protected YesNo checkBox;
    @XmlElement(name = "documents_verified")
    @XmlSchemaType(name = "string")
    protected YesNo documentsVerified;

    /**
     * Gets the value of the idDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link IdDocuments }
     *     
     */
    public IdDocuments getIdDocuments() {
        return idDocuments;
    }

    /**
     * Sets the value of the idDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDocuments }
     *     
     */
    public void setIdDocuments(IdDocuments value) {
        this.idDocuments = value;
    }

    /**
     * Gets the value of the bankingRegulationsData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankingRegulationsData() {
        return bankingRegulationsData;
    }

    /**
     * Sets the value of the bankingRegulationsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankingRegulationsData(String value) {
        this.bankingRegulationsData = value;
    }

    /**
     * Gets the value of the complianceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceComments() {
        return complianceComments;
    }

    /**
     * Sets the value of the complianceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceComments(String value) {
        this.complianceComments = value;
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
     * Gets the value of the socialSecurityNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    /**
     * Sets the value of the socialSecurityNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNo(String value) {
        this.socialSecurityNo = value;
    }

    /**
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the permanentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Sets the value of the permanentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPermanentAddress(Address value) {
        this.permanentAddress = value;
    }

    /**
     * Gets the value of the addressVerified property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAddressVerified() {
        return addressVerified;
    }

    /**
     * Sets the value of the addressVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAddressVerified(YesNo value) {
        this.addressVerified = value;
    }

    /**
     * Gets the value of the senderReceiverRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderReceiverRelationship() {
        return senderReceiverRelationship;
    }

    /**
     * Sets the value of the senderReceiverRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderReceiverRelationship(String value) {
        this.senderReceiverRelationship = value;
    }

    /**
     * Gets the value of the sourceOfFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfFunds() {
        return sourceOfFunds;
    }

    /**
     * Sets the value of the sourceOfFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfFunds(String value) {
        this.sourceOfFunds = value;
    }

    /**
     * Gets the value of the checkBox property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCheckBox() {
        return checkBox;
    }

    /**
     * Sets the value of the checkBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCheckBox(YesNo value) {
        this.checkBox = value;
    }

    /**
     * Gets the value of the documentsVerified property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDocumentsVerified() {
        return documentsVerified;
    }

    /**
     * Sets the value of the documentsVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDocumentsVerified(YesNo value) {
        this.documentsVerified = value;
    }

}
