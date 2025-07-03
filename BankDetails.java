
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bank_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="bank_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.westernunion.com/schema/xrsi}bank_name" minOccurs="0"/>
 *         <element name="account_number" type="{http://www.westernunion.com/schema/xrsi}bank_name" minOccurs="0"/>
 *         <element name="routing_number" type="{http://www.westernunion.com/schema/xrsi}bank_routing_number" minOccurs="0"/>
 *         <element name="account_type" type="{http://www.westernunion.com/schema/xrsi}bank_account_type" minOccurs="0"/>
 *         <element name="state_country" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}state_province">
 *               <minLength value="0"/>
 *               <maxLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="comments" type="{http://www.westernunion.com/schema/xrsi}comments" minOccurs="0"/>
 *         <element name="phone_number" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         <element name="rcv_financial_id" type="{http://www.westernunion.com/schema/xrsi}rcv_financial_id" minOccurs="0"/>
 *         <element name="bank_number" type="{http://www.westernunion.com/schema/xrsi}bank_number" minOccurs="0"/>
 *         <element name="branch_number" type="{http://www.westernunion.com/schema/xrsi}branch_number" minOccurs="0"/>
 *         <element name="bank_location" type="{http://www.westernunion.com/schema/xrsi}bank_location" minOccurs="0"/>
 *         <element name="branch_code" type="{http://www.westernunion.com/schema/xrsi}branch_code" minOccurs="0"/>
 *         <element name="bic" type="{http://www.westernunion.com/schema/xrsi}bic" minOccurs="0"/>
 *         <element name="bank_code" type="{http://www.westernunion.com/schema/xrsi}bank_code" minOccurs="0"/>
 *         <element name="sort_code" type="{http://www.westernunion.com/schema/xrsi}sort_code" minOccurs="0"/>
 *         <element name="account_prefix" type="{http://www.westernunion.com/schema/xrsi}account_prefix" minOccurs="0"/>
 *         <element name="account_suffix" type="{http://www.westernunion.com/schema/xrsi}account_suffix" minOccurs="0"/>
 *         <element name="bank_area" type="{http://www.westernunion.com/schema/xrsi}bank_area" minOccurs="0"/>
 *         <element name="bank_account_holder" type="{http://www.westernunion.com/schema/xrsi}bank_account_holder" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bank_details", propOrder = {
    "name",
    "accountNumber",
    "routingNumber",
    "accountType",
    "stateCountry",
    "comments",
    "phoneNumber",
    "rcvFinancialId",
    "bankNumber",
    "branchNumber",
    "bankLocation",
    "branchCode",
    "bic",
    "bankCode",
    "sortCode",
    "accountPrefix",
    "accountSuffix",
    "bankArea",
    "bankAccountHolder"
})
@XmlSeeAlso({
    GbsBankDetails.class
})
public class BankDetails {

    protected String name;
    @XmlElement(name = "account_number")
    protected String accountNumber;
    @XmlElement(name = "routing_number")
    protected String routingNumber;
    @XmlElement(name = "account_type")
    protected String accountType;
    @XmlElement(name = "state_country")
    protected String stateCountry;
    protected String comments;
    @XmlElement(name = "phone_number")
    protected String phoneNumber;
    @XmlElement(name = "rcv_financial_id")
    protected String rcvFinancialId;
    @XmlElement(name = "bank_number")
    protected String bankNumber;
    @XmlElement(name = "branch_number")
    protected String branchNumber;
    @XmlElement(name = "bank_location")
    protected String bankLocation;
    @XmlElement(name = "branch_code")
    protected String branchCode;
    protected String bic;
    @XmlElement(name = "bank_code")
    protected String bankCode;
    @XmlElement(name = "sort_code")
    protected String sortCode;
    @XmlElement(name = "account_prefix")
    protected String accountPrefix;
    @XmlElement(name = "account_suffix")
    protected String accountSuffix;
    @XmlElement(name = "bank_area")
    protected String bankArea;
    @XmlElement(name = "bank_account_holder")
    protected String bankAccountHolder;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the stateCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCountry() {
        return stateCountry;
    }

    /**
     * Sets the value of the stateCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCountry(String value) {
        this.stateCountry = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the rcvFinancialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvFinancialId() {
        return rcvFinancialId;
    }

    /**
     * Sets the value of the rcvFinancialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvFinancialId(String value) {
        this.rcvFinancialId = value;
    }

    /**
     * Gets the value of the bankNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * Sets the value of the bankNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNumber(String value) {
        this.bankNumber = value;
    }

    /**
     * Gets the value of the branchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNumber() {
        return branchNumber;
    }

    /**
     * Sets the value of the branchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNumber(String value) {
        this.branchNumber = value;
    }

    /**
     * Gets the value of the bankLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankLocation() {
        return bankLocation;
    }

    /**
     * Sets the value of the bankLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankLocation(String value) {
        this.bankLocation = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the sortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortCode() {
        return sortCode;
    }

    /**
     * Sets the value of the sortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortCode(String value) {
        this.sortCode = value;
    }

    /**
     * Gets the value of the accountPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrefix() {
        return accountPrefix;
    }

    /**
     * Sets the value of the accountPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrefix(String value) {
        this.accountPrefix = value;
    }

    /**
     * Gets the value of the accountSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSuffix() {
        return accountSuffix;
    }

    /**
     * Sets the value of the accountSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSuffix(String value) {
        this.accountSuffix = value;
    }

    /**
     * Gets the value of the bankArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankArea() {
        return bankArea;
    }

    /**
     * Sets the value of the bankArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankArea(String value) {
        this.bankArea = value;
    }

    /**
     * Gets the value of the bankAccountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountHolder() {
        return bankAccountHolder;
    }

    /**
     * Sets the value of the bankAccountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountHolder(String value) {
        this.bankAccountHolder = value;
    }

}
