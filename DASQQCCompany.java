
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASQQCCompany</b> object contains information for one 
 *             				QQC Company.<br>
 *             				e.g. everything between <GETQQCCOMPANYNAME>...</GETQQCCOMPANYNAME> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QQCCOMPANYNAME_Type", propOrder = {

})
public class DASQQCCompany {

    @XmlElement(name = "CLIENT_ID", required = true)
    protected String clientID;
    @XmlElement(name = "COMPANY_NAME", required = true)
    protected String companyName;
    @XmlElement(name = "COUNTRY")
    protected String cpcCode;
    @XmlElement(name = "ISO_COUNTRY_CD", required = true)
    protected String isoCountryCode;
    @XmlElement(name = "CURRENCY_CD", required = true)
    protected String isoCurrencyCode;
    @XmlElement(name = "AVAILABLE")
    protected String isoAvailable;
    @XmlElement(name = "PREPAID")
    protected String isoPrepaid;
    @XmlElement(name = "PRECONFIG")
    protected String isoPreconfig;
    @XmlElement(name = "ACCT_REQD")
    protected String isoAcctReqd;
    @XmlElement(name = "TEMPLT")
    protected String isoTemplt;
    @XmlElement(name = "MKT_VERTICAL")
    protected String isoMktVertical;
    @XmlElement(name = "CC_FLAG")
    protected String isoCcflag;

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
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
     * Gets the value of the cpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpcCode() {
        return cpcCode;
    }

    /**
     * Sets the value of the cpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpcCode(String value) {
        this.cpcCode = value;
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
     * Gets the value of the isoAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOAvailable() {
        return isoAvailable;
    }

    /**
     * Sets the value of the isoAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOAvailable(String value) {
        this.isoAvailable = value;
    }

    /**
     * Gets the value of the isoPrepaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOPrepaid() {
        return isoPrepaid;
    }

    /**
     * Sets the value of the isoPrepaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOPrepaid(String value) {
        this.isoPrepaid = value;
    }

    /**
     * Gets the value of the isoPreconfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOPreconfig() {
        return isoPreconfig;
    }

    /**
     * Sets the value of the isoPreconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOPreconfig(String value) {
        this.isoPreconfig = value;
    }

    /**
     * Gets the value of the isoAcctReqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOAcctReqd() {
        return isoAcctReqd;
    }

    /**
     * Sets the value of the isoAcctReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOAcctReqd(String value) {
        this.isoAcctReqd = value;
    }

    /**
     * Gets the value of the isoTemplt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOTemplt() {
        return isoTemplt;
    }

    /**
     * Sets the value of the isoTemplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOTemplt(String value) {
        this.isoTemplt = value;
    }

    /**
     * Gets the value of the isoMktVertical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOMktVertical() {
        return isoMktVertical;
    }

    /**
     * Sets the value of the isoMktVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOMktVertical(String value) {
        this.isoMktVertical = value;
    }

    /**
     * Gets the value of the isoCcflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCcflag() {
        return isoCcflag;
    }

    /**
     * Sets the value of the isoCcflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCcflag(String value) {
        this.isoCcflag = value;
    }

}
