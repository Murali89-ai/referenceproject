
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for general_name complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="general_name">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}name_type_base">
 *       <sequence>
 *         <element name="name_raw" type="{http://www.westernunion.com/schema/xrsi}name_raw" minOccurs="0"/>
 *         <element name="name_prefix" type="{http://www.westernunion.com/schema/xrsi}name_prefix" minOccurs="0"/>
 *         <group ref="{http://www.westernunion.com/schema/xrsi}name_group" minOccurs="0"/>
 *         <element name="complete_name" type="{http://www.westernunion.com/schema/xrsi}complete_name" minOccurs="0"/>
 *         <element name="is_name_verified" type="{http://www.westernunion.com/schema/xrsi}is_name_verified" minOccurs="0"/>
 *         <element name="name_suffix" type="{http://www.westernunion.com/schema/xrsi}name_suffix" minOccurs="0"/>
 *         <element name="secondary_given_name" type="{http://www.westernunion.com/schema/xrsi}first_name" minOccurs="0"/>
 *         <element name="secondary_paternal_name" type="{http://www.westernunion.com/schema/xrsi}paternal_name" minOccurs="0"/>
 *         <element name="secondary_maternal_name" type="{http://www.westernunion.com/schema/xrsi}maternal_name" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "general_name", propOrder = {
    "nameRaw",
    "namePrefix",
    "firstName",
    "middleName",
    "lastName",
    "businessName",
    "attention",
    "givenName",
    "paternalName",
    "maternalName",
    "completeName",
    "isNameVerified",
    "nameSuffix",
    "secondaryGivenName",
    "secondaryPaternalName",
    "secondaryMaternalName"
})
public class GeneralName
    extends NameTypeBase
{

    @XmlElement(name = "name_raw")
    protected String nameRaw;
    @XmlElement(name = "name_prefix")
    @XmlSchemaType(name = "string")
    protected NamePrefix namePrefix;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "middle_name")
    protected String middleName;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "business_name")
    protected String businessName;
    protected String attention;
    @XmlElement(name = "given_name")
    protected String givenName;
    @XmlElement(name = "paternal_name")
    protected String paternalName;
    @XmlElement(name = "maternal_name")
    protected String maternalName;
    @XmlElement(name = "complete_name")
    protected String completeName;
    @XmlElement(name = "is_name_verified")
    protected String isNameVerified;
    @XmlElement(name = "name_suffix")
    @XmlSchemaType(name = "string")
    protected NameSuffix nameSuffix;
    @XmlElement(name = "secondary_given_name")
    protected String secondaryGivenName;
    @XmlElement(name = "secondary_paternal_name")
    protected String secondaryPaternalName;
    @XmlElement(name = "secondary_maternal_name")
    protected String secondaryMaternalName;

    /**
     * Gets the value of the nameRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRaw() {
        return nameRaw;
    }

    /**
     * Sets the value of the nameRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRaw(String value) {
        this.nameRaw = value;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix }
     *     
     */
    public NamePrefix getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix }
     *     
     */
    public void setNamePrefix(NamePrefix value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
     * Gets the value of the attention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttention() {
        return attention;
    }

    /**
     * Sets the value of the attention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttention(String value) {
        this.attention = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the paternalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaternalName() {
        return paternalName;
    }

    /**
     * Sets the value of the paternalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaternalName(String value) {
        this.paternalName = value;
    }

    /**
     * Gets the value of the maternalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaternalName() {
        return maternalName;
    }

    /**
     * Sets the value of the maternalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaternalName(String value) {
        this.maternalName = value;
    }

    /**
     * Gets the value of the completeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteName() {
        return completeName;
    }

    /**
     * Sets the value of the completeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteName(String value) {
        this.completeName = value;
    }

    /**
     * Gets the value of the isNameVerified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNameVerified() {
        return isNameVerified;
    }

    /**
     * Sets the value of the isNameVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNameVerified(String value) {
        this.isNameVerified = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffix }
     *     
     */
    public NameSuffix getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffix }
     *     
     */
    public void setNameSuffix(NameSuffix value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the secondaryGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryGivenName() {
        return secondaryGivenName;
    }

    /**
     * Sets the value of the secondaryGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryGivenName(String value) {
        this.secondaryGivenName = value;
    }

    /**
     * Gets the value of the secondaryPaternalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryPaternalName() {
        return secondaryPaternalName;
    }

    /**
     * Sets the value of the secondaryPaternalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryPaternalName(String value) {
        this.secondaryPaternalName = value;
    }

    /**
     * Gets the value of the secondaryMaternalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryMaternalName() {
        return secondaryMaternalName;
    }

    /**
     * Sets the value of the secondaryMaternalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryMaternalName(String value) {
        this.secondaryMaternalName = value;
    }

}
