
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowedFunctions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AllowedFunctions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="wmo_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="mod_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="wca_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="ret_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="rsd_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="can_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="ldu_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="gdu_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="cin_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="pcs_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="adi_allow" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="stgd_only" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowedFunctions", propOrder = {
    "wmoAllow",
    "modAllow",
    "wcaAllow",
    "retAllow",
    "rsdAllow",
    "canAllow",
    "lduAllow",
    "gduAllow",
    "cinAllow",
    "pcsAllow",
    "adiAllow",
    "stgdOnly"
})
public class AllowedFunctions {

    @XmlElement(name = "wmo_allow")
    protected String wmoAllow;
    @XmlElement(name = "mod_allow")
    protected String modAllow;
    @XmlElement(name = "wca_allow")
    protected String wcaAllow;
    @XmlElement(name = "ret_allow")
    protected String retAllow;
    @XmlElement(name = "rsd_allow")
    protected String rsdAllow;
    @XmlElement(name = "can_allow")
    protected String canAllow;
    @XmlElement(name = "ldu_allow")
    protected String lduAllow;
    @XmlElement(name = "gdu_allow")
    protected String gduAllow;
    @XmlElement(name = "cin_allow")
    protected String cinAllow;
    @XmlElement(name = "pcs_allow")
    protected String pcsAllow;
    @XmlElement(name = "adi_allow")
    protected String adiAllow;
    @XmlElement(name = "stgd_only")
    protected String stgdOnly;

    /**
     * Gets the value of the wmoAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmoAllow() {
        return wmoAllow;
    }

    /**
     * Sets the value of the wmoAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmoAllow(String value) {
        this.wmoAllow = value;
    }

    /**
     * Gets the value of the modAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModAllow() {
        return modAllow;
    }

    /**
     * Sets the value of the modAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModAllow(String value) {
        this.modAllow = value;
    }

    /**
     * Gets the value of the wcaAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWcaAllow() {
        return wcaAllow;
    }

    /**
     * Sets the value of the wcaAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWcaAllow(String value) {
        this.wcaAllow = value;
    }

    /**
     * Gets the value of the retAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetAllow() {
        return retAllow;
    }

    /**
     * Sets the value of the retAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetAllow(String value) {
        this.retAllow = value;
    }

    /**
     * Gets the value of the rsdAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsdAllow() {
        return rsdAllow;
    }

    /**
     * Sets the value of the rsdAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsdAllow(String value) {
        this.rsdAllow = value;
    }

    /**
     * Gets the value of the canAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanAllow() {
        return canAllow;
    }

    /**
     * Sets the value of the canAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanAllow(String value) {
        this.canAllow = value;
    }

    /**
     * Gets the value of the lduAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLduAllow() {
        return lduAllow;
    }

    /**
     * Sets the value of the lduAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLduAllow(String value) {
        this.lduAllow = value;
    }

    /**
     * Gets the value of the gduAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGduAllow() {
        return gduAllow;
    }

    /**
     * Sets the value of the gduAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGduAllow(String value) {
        this.gduAllow = value;
    }

    /**
     * Gets the value of the cinAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCinAllow() {
        return cinAllow;
    }

    /**
     * Sets the value of the cinAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCinAllow(String value) {
        this.cinAllow = value;
    }

    /**
     * Gets the value of the pcsAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcsAllow() {
        return pcsAllow;
    }

    /**
     * Sets the value of the pcsAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcsAllow(String value) {
        this.pcsAllow = value;
    }

    /**
     * Gets the value of the adiAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdiAllow() {
        return adiAllow;
    }

    /**
     * Sets the value of the adiAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdiAllow(String value) {
        this.adiAllow = value;
    }

    /**
     * Gets the value of the stgdOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStgdOnly() {
        return stgdOnly;
    }

    /**
     * Sets the value of the stgdOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStgdOnly(String value) {
        this.stgdOnly = value;
    }

}
