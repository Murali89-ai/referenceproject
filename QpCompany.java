
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qp_company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="qp_company">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="find_no" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="account_no" type="{http://www.westernunion.com/schema/xrsi}qp_account_no" minOccurs="0"/>
 *         <element name="company_name" type="{http://www.westernunion.com/schema/xrsi}qp_company_name" minOccurs="0"/>
 *         <element name="city_code" type="{http://www.westernunion.com/schema/xrsi}qp_city_code" minOccurs="0"/>
 *         <element name="debtor_account_number" type="{http://www.westernunion.com/schema/xrsi}debtor_account_number" minOccurs="0"/>
 *         <element name="country" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="reference_no" type="{http://www.westernunion.com/schema/xrsi}qp_reference_no" minOccurs="0"/>
 *         <element name="department" type="{http://www.westernunion.com/schema/xrsi}qp_department" maxOccurs="2" minOccurs="0"/>
 *         <element name="rate_modifier" type="{http://www.westernunion.com/schema/xrsi}qp_rate_modifier" minOccurs="0"/>
 *         <element name="addr_line1" type="{http://www.westernunion.com/schema/xrsi}address_line_long" minOccurs="0"/>
 *         <element name="addr_line2" type="{http://www.westernunion.com/schema/xrsi}address_line_long" minOccurs="0"/>
 *         <element name="city" type="{http://www.westernunion.com/schema/xrsi}city" minOccurs="0"/>
 *         <element name="state" type="{http://www.westernunion.com/schema/xrsi}state_province" minOccurs="0"/>
 *         <element name="postal_code" type="{http://www.westernunion.com/schema/xrsi}postal_code" minOccurs="0"/>
 *         <element name="contact_name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         <element name="contact_phone" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         <element name="device_block" type="{http://www.westernunion.com/schema/xrsi}qqc_device_block" minOccurs="0"/>
 *         <element name="type" type="{http://www.westernunion.com/schema/xrsi}receiver_type" minOccurs="0"/>
 *         <element name="address_type" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="commercial_account_id" type="{http://www.westernunion.com/schema/xrsi}info" minOccurs="0"/>
 *         <element name="account_holder_name" type="{http://www.westernunion.com/schema/xrsi}qp_account_holder_name" minOccurs="0"/>
 *         <element name="available_balance" type="{http://www.westernunion.com/schema/xrsi}qp_available_balance" minOccurs="0"/>
 *         <element name="fraud_warning_consent_required" type="{http://www.westernunion.com/schema/xrsi}fraud_warning_consent_required" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qp_company", propOrder = {
    "findNo",
    "accountNo",
    "companyName",
    "cityCode",
    "debtorAccountNumber",
    "country",
    "referenceNo",
    "department",
    "rateModifier",
    "addrLine1",
    "addrLine2",
    "city",
    "state",
    "postalCode",
    "contactName",
    "contactPhone",
    "deviceBlock",
    "type",
    "addressType",
    "commercialAccountId",
    "accountHolderName",
    "availableBalance",
    "fraudWarningConsentRequired"
})
public class QpCompany {

    @XmlElement(name = "find_no")
    protected BigInteger findNo;
    @XmlElement(name = "account_no")
    protected String accountNo;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "city_code")
    protected String cityCode;
    @XmlElement(name = "debtor_account_number")
    protected String debtorAccountNumber;
    protected CountryCurrencyInfo country;
    @XmlElement(name = "reference_no")
    protected String referenceNo;
    protected List<String> department;
    @XmlElement(name = "rate_modifier")
    protected String rateModifier;
    @XmlElement(name = "addr_line1")
    protected String addrLine1;
    @XmlElement(name = "addr_line2")
    protected String addrLine2;
    protected String city;
    protected String state;
    @XmlElement(name = "postal_code")
    protected String postalCode;
    @XmlElement(name = "contact_name")
    protected GeneralName contactName;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    @XmlElement(name = "device_block")
    protected QqcDeviceBlock deviceBlock;
    protected String type;
    @XmlElement(name = "address_type")
    protected String addressType;
    @XmlElement(name = "commercial_account_id")
    protected String commercialAccountId;
    @XmlElement(name = "account_holder_name")
    protected String accountHolderName;
    @XmlElement(name = "available_balance")
    protected String availableBalance;
    @XmlElement(name = "fraud_warning_consent_required")
    @XmlSchemaType(name = "string")
    protected FraudWarningConsentRequired fraudWarningConsentRequired;

    /**
     * Gets the value of the findNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFindNo() {
        return findNo;
    }

    /**
     * Sets the value of the findNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFindNo(BigInteger value) {
        this.findNo = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the debtorAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorAccountNumber() {
        return debtorAccountNumber;
    }

    /**
     * Sets the value of the debtorAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorAccountNumber(String value) {
        this.debtorAccountNumber = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setCountry(CountryCurrencyInfo value) {
        this.country = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the department property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the department property.
     */
    public List<String> getDepartment() {
        if (department == null) {
            department = new ArrayList<>();
        }
        return this.department;
    }

    /**
     * Gets the value of the rateModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateModifier() {
        return rateModifier;
    }

    /**
     * Sets the value of the rateModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateModifier(String value) {
        this.rateModifier = value;
    }

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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setContactName(GeneralName value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the deviceBlock property.
     * 
     * @return
     *     possible object is
     *     {@link QqcDeviceBlock }
     *     
     */
    public QqcDeviceBlock getDeviceBlock() {
        return deviceBlock;
    }

    /**
     * Sets the value of the deviceBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcDeviceBlock }
     *     
     */
    public void setDeviceBlock(QqcDeviceBlock value) {
        this.deviceBlock = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the commercialAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialAccountId() {
        return commercialAccountId;
    }

    /**
     * Sets the value of the commercialAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialAccountId(String value) {
        this.commercialAccountId = value;
    }

    /**
     * Gets the value of the accountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableBalance(String value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the fraudWarningConsentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link FraudWarningConsentRequired }
     *     
     */
    public FraudWarningConsentRequired getFraudWarningConsentRequired() {
        return fraudWarningConsentRequired;
    }

    /**
     * Sets the value of the fraudWarningConsentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudWarningConsentRequired }
     *     
     */
    public void setFraudWarningConsentRequired(FraudWarningConsentRequired value) {
        this.fraudWarningConsentRequired = value;
    }

}
