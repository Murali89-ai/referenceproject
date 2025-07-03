
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASAccountTableInfo</b> object contains information for one 
 *             				account table<br>
 *             				e.g. everything between <GETACCOUNTTABLEINFO>...</GETACCOUNTTABLEINFO> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNTTABLEINFO_Type", propOrder = {

})
public class DASAccountTableInfo {

    @XmlElement(name = "ACCOUNT", required = true)
    protected String accountNum;
    @XmlElement(name = "ISO_COUNTRY_CD", required = true)
    protected String isoCountryCode;
    @XmlElement(name = "CURRENCY_CD", required = true)
    protected String isoCurrencyCode;
    @XmlElement(name = "CT1_TABLE")
    protected String countryTableSuffix;
    @XmlElement(name = "RAT_TABLE")
    protected String rateTableSuffix;
    @XmlElement(name = "DSV_TABLE")
    protected String deliveryTableSuffix;
    @XmlElement(name = "TMP_TABLE")
    protected String templateTableSuffix;
    @XmlElement(name = "ERC_TABLE")
    protected String errorCodeTableSuffix;
    @XmlElement(name = "QQC_TABLE")
    protected String quickCollectTableSuffix;
    @XmlElement(name = "MEX_TABLE")
    protected String mexicanCityStateTableSuffix;
    @XmlElement(name = "FIF_TABLE")
    protected String foreignInformationTableSuffix;
    @XmlElement(name = "BNK_TABLE")
    protected String atmBankTableSuffix;
    @XmlElement(name = "SUP_TABLE")
    protected String supplyOrderTableSuffix;
    @XmlElement(name = "CKW_TABLE")
    protected String checkwritertableSuffix;

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

    /**
     * Gets the value of the isoCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountryCode() {
        return isoCountryCode;
    }

    /**
     * Sets the value of the isoCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountryCode(String value) {
        this.isoCountryCode = value;
    }

    /**
     * Gets the value of the isoCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCurrencyCode() {
        return isoCurrencyCode;
    }

    /**
     * Sets the value of the isoCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCurrencyCode(String value) {
        this.isoCurrencyCode = value;
    }

    /**
     * Gets the value of the countryTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTableSuffix() {
        return countryTableSuffix;
    }

    /**
     * Sets the value of the countryTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTableSuffix(String value) {
        this.countryTableSuffix = value;
    }

    /**
     * Gets the value of the rateTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTableSuffix() {
        return rateTableSuffix;
    }

    /**
     * Sets the value of the rateTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTableSuffix(String value) {
        this.rateTableSuffix = value;
    }

    /**
     * Gets the value of the deliveryTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTableSuffix() {
        return deliveryTableSuffix;
    }

    /**
     * Sets the value of the deliveryTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTableSuffix(String value) {
        this.deliveryTableSuffix = value;
    }

    /**
     * Gets the value of the templateTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateTableSuffix() {
        return templateTableSuffix;
    }

    /**
     * Sets the value of the templateTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateTableSuffix(String value) {
        this.templateTableSuffix = value;
    }

    /**
     * Gets the value of the errorCodeTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCodeTableSuffix() {
        return errorCodeTableSuffix;
    }

    /**
     * Sets the value of the errorCodeTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCodeTableSuffix(String value) {
        this.errorCodeTableSuffix = value;
    }

    /**
     * Gets the value of the quickCollectTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickCollectTableSuffix() {
        return quickCollectTableSuffix;
    }

    /**
     * Sets the value of the quickCollectTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickCollectTableSuffix(String value) {
        this.quickCollectTableSuffix = value;
    }

    /**
     * Gets the value of the mexicanCityStateTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMexicanCityStateTableSuffix() {
        return mexicanCityStateTableSuffix;
    }

    /**
     * Sets the value of the mexicanCityStateTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMexicanCityStateTableSuffix(String value) {
        this.mexicanCityStateTableSuffix = value;
    }

    /**
     * Gets the value of the foreignInformationTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignInformationTableSuffix() {
        return foreignInformationTableSuffix;
    }

    /**
     * Sets the value of the foreignInformationTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignInformationTableSuffix(String value) {
        this.foreignInformationTableSuffix = value;
    }

    /**
     * Gets the value of the atmBankTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmBankTableSuffix() {
        return atmBankTableSuffix;
    }

    /**
     * Sets the value of the atmBankTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmBankTableSuffix(String value) {
        this.atmBankTableSuffix = value;
    }

    /**
     * Gets the value of the supplyOrderTableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyOrderTableSuffix() {
        return supplyOrderTableSuffix;
    }

    /**
     * Sets the value of the supplyOrderTableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyOrderTableSuffix(String value) {
        this.supplyOrderTableSuffix = value;
    }

    /**
     * Gets the value of the checkwritertableSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckwritertableSuffix() {
        return checkwritertableSuffix;
    }

    /**
     * Sets the value of the checkwritertableSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckwritertableSuffix(String value) {
        this.checkwritertableSuffix = value;
    }

}
