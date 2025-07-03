
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for database complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="database">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mex_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="erc_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="tmp_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dsv_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="fif_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="cty_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="ckw_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qqc_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="pc_short_dll_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dll_version" type="{http://www.westernunion.com/schema/xrsi}dll_version" minOccurs="0"/>
 *         <element name="pc_full_dll_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="country_currency_info" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "database", propOrder = {
    "mexName",
    "ercName",
    "tmpName",
    "dsvName",
    "fifName",
    "ctyName",
    "ckwName",
    "qqcName",
    "pcShortDllName",
    "dllVersion",
    "pcFullDllName",
    "countryCurrencyInfo"
})
public class Database {

    @XmlElement(name = "mex_name")
    protected String mexName;
    @XmlElement(name = "erc_name")
    protected String ercName;
    @XmlElement(name = "tmp_name")
    protected String tmpName;
    @XmlElement(name = "dsv_name")
    protected String dsvName;
    @XmlElement(name = "fif_name")
    protected String fifName;
    @XmlElement(name = "cty_name")
    protected String ctyName;
    @XmlElement(name = "ckw_name")
    protected String ckwName;
    @XmlElement(name = "qqc_name")
    protected String qqcName;
    @XmlElement(name = "pc_short_dll_name")
    protected String pcShortDllName;
    @XmlElement(name = "dll_version")
    protected String dllVersion;
    @XmlElement(name = "pc_full_dll_name")
    protected String pcFullDllName;
    @XmlElement(name = "country_currency_info")
    protected CountryCurrencyInfo countryCurrencyInfo;

    /**
     * Gets the value of the mexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMexName() {
        return mexName;
    }

    /**
     * Sets the value of the mexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMexName(String value) {
        this.mexName = value;
    }

    /**
     * Gets the value of the ercName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErcName() {
        return ercName;
    }

    /**
     * Sets the value of the ercName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErcName(String value) {
        this.ercName = value;
    }

    /**
     * Gets the value of the tmpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpName() {
        return tmpName;
    }

    /**
     * Sets the value of the tmpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpName(String value) {
        this.tmpName = value;
    }

    /**
     * Gets the value of the dsvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsvName() {
        return dsvName;
    }

    /**
     * Sets the value of the dsvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsvName(String value) {
        this.dsvName = value;
    }

    /**
     * Gets the value of the fifName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFifName() {
        return fifName;
    }

    /**
     * Sets the value of the fifName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFifName(String value) {
        this.fifName = value;
    }

    /**
     * Gets the value of the ctyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtyName() {
        return ctyName;
    }

    /**
     * Sets the value of the ctyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtyName(String value) {
        this.ctyName = value;
    }

    /**
     * Gets the value of the ckwName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkwName() {
        return ckwName;
    }

    /**
     * Sets the value of the ckwName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkwName(String value) {
        this.ckwName = value;
    }

    /**
     * Gets the value of the qqcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqcName() {
        return qqcName;
    }

    /**
     * Sets the value of the qqcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqcName(String value) {
        this.qqcName = value;
    }

    /**
     * Gets the value of the pcShortDllName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcShortDllName() {
        return pcShortDllName;
    }

    /**
     * Sets the value of the pcShortDllName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcShortDllName(String value) {
        this.pcShortDllName = value;
    }

    /**
     * Gets the value of the dllVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDllVersion() {
        return dllVersion;
    }

    /**
     * Sets the value of the dllVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDllVersion(String value) {
        this.dllVersion = value;
    }

    /**
     * Gets the value of the pcFullDllName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcFullDllName() {
        return pcFullDllName;
    }

    /**
     * Sets the value of the pcFullDllName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcFullDllName(String value) {
        this.pcFullDllName = value;
    }

    /**
     * Gets the value of the countryCurrencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getCountryCurrencyInfo() {
        return countryCurrencyInfo;
    }

    /**
     * Sets the value of the countryCurrencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setCountryCurrencyInfo(CountryCurrencyInfo value) {
        this.countryCurrencyInfo = value;
    }

}
