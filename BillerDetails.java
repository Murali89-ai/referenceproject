
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for biller_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="biller_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="32"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="company_name" type="{http://www.westernunion.com/schema/xrsi}qp_company_name" minOccurs="0"/>
 *         <choice>
 *           <element name="account_no" type="{http://www.westernunion.com/schema/xrsi}cpay_account_no" minOccurs="0"/>
 *           <element name="ocr_data" type="{http://www.westernunion.com/schema/xrsi}ocr_data" minOccurs="0"/>
 *         </choice>
 *         <element name="receipt_account_number" type="{http://www.westernunion.com/schema/xrsi}receipt_account_number" minOccurs="0"/>
 *         <element name="data_prompts" type="{http://www.westernunion.com/schema/xrsi}data_prompts" minOccurs="0"/>
 *         <element name="manual_validations" type="{http://www.westernunion.com/schema/xrsi}manual_validations" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "biller_details", propOrder = {
    "id",
    "companyName",
    "accountNo",
    "ocrData",
    "receiptAccountNumber",
    "dataPrompts",
    "manualValidations"
})
public class BillerDetails {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "account_no")
    protected String accountNo;
    @XmlElement(name = "ocr_data")
    protected String ocrData;
    @XmlElement(name = "receipt_account_number")
    protected String receiptAccountNumber;
    @XmlElement(name = "data_prompts")
    protected DataPrompts dataPrompts;
    @XmlElement(name = "manual_validations")
    protected ManualValidations manualValidations;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the ocrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcrData() {
        return ocrData;
    }

    /**
     * Sets the value of the ocrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcrData(String value) {
        this.ocrData = value;
    }

    /**
     * Gets the value of the receiptAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptAccountNumber() {
        return receiptAccountNumber;
    }

    /**
     * Sets the value of the receiptAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptAccountNumber(String value) {
        this.receiptAccountNumber = value;
    }

    /**
     * Gets the value of the dataPrompts property.
     * 
     * @return
     *     possible object is
     *     {@link DataPrompts }
     *     
     */
    public DataPrompts getDataPrompts() {
        return dataPrompts;
    }

    /**
     * Sets the value of the dataPrompts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPrompts }
     *     
     */
    public void setDataPrompts(DataPrompts value) {
        this.dataPrompts = value;
    }

    /**
     * Gets the value of the manualValidations property.
     * 
     * @return
     *     possible object is
     *     {@link ManualValidations }
     *     
     */
    public ManualValidations getManualValidations() {
        return manualValidations;
    }

    /**
     * Sets the value of the manualValidations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualValidations }
     *     
     */
    public void setManualValidations(ManualValidations value) {
        this.manualValidations = value;
    }

}
