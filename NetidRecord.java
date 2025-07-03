
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetidRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetidRecord">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Foreign_Sys_Id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Network_id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Template_Id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Special_flag1" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Iso_cntry_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="CurrencyInfo" type="{http://www.westernunion.com/schema/xrsi}CurrencyInfo" minOccurs="0"/>
 *         <element name="Ignore_gen3_rules" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Pref_curr" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Ignore_epl_rules" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Cash_only_qqcs_ok" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Eg_functs" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="int_id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Special_flag2" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Def_pay_type" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="main_sub" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Pos_id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="Special_flag3" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetidRecord", propOrder = {
    "foreignSysId",
    "networkId",
    "templateId",
    "specialFlag1",
    "isoCntryCd",
    "currencyInfo",
    "ignoreGen3Rules",
    "prefCurr",
    "ignoreEplRules",
    "cashOnlyQqcsOk",
    "egFuncts",
    "intId",
    "specialFlag2",
    "defPayType",
    "mainSub",
    "posId",
    "specialFlag3"
})
public class NetidRecord {

    @XmlElement(name = "Foreign_Sys_Id")
    protected String foreignSysId;
    @XmlElement(name = "Network_id")
    protected String networkId;
    @XmlElement(name = "Template_Id")
    protected String templateId;
    @XmlElement(name = "Special_flag1")
    protected String specialFlag1;
    @XmlElement(name = "Iso_cntry_cd")
    protected String isoCntryCd;
    @XmlElement(name = "CurrencyInfo")
    protected CurrencyInfo currencyInfo;
    @XmlElement(name = "Ignore_gen3_rules")
    protected String ignoreGen3Rules;
    @XmlElement(name = "Pref_curr")
    protected String prefCurr;
    @XmlElement(name = "Ignore_epl_rules")
    protected String ignoreEplRules;
    @XmlElement(name = "Cash_only_qqcs_ok")
    protected String cashOnlyQqcsOk;
    @XmlElement(name = "Eg_functs")
    protected String egFuncts;
    @XmlElement(name = "int_id")
    protected String intId;
    @XmlElement(name = "Special_flag2")
    protected String specialFlag2;
    @XmlElement(name = "Def_pay_type")
    protected String defPayType;
    @XmlElement(name = "main_sub")
    protected String mainSub;
    @XmlElement(name = "Pos_id")
    protected String posId;
    @XmlElement(name = "Special_flag3")
    protected String specialFlag3;

    /**
     * Gets the value of the foreignSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignSysId() {
        return foreignSysId;
    }

    /**
     * Sets the value of the foreignSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignSysId(String value) {
        this.foreignSysId = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the specialFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFlag1() {
        return specialFlag1;
    }

    /**
     * Sets the value of the specialFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFlag1(String value) {
        this.specialFlag1 = value;
    }

    /**
     * Gets the value of the isoCntryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCntryCd() {
        return isoCntryCd;
    }

    /**
     * Sets the value of the isoCntryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCntryCd(String value) {
        this.isoCntryCd = value;
    }

    /**
     * Gets the value of the currencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyInfo }
     *     
     */
    public CurrencyInfo getCurrencyInfo() {
        return currencyInfo;
    }

    /**
     * Sets the value of the currencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyInfo }
     *     
     */
    public void setCurrencyInfo(CurrencyInfo value) {
        this.currencyInfo = value;
    }

    /**
     * Gets the value of the ignoreGen3Rules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreGen3Rules() {
        return ignoreGen3Rules;
    }

    /**
     * Sets the value of the ignoreGen3Rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreGen3Rules(String value) {
        this.ignoreGen3Rules = value;
    }

    /**
     * Gets the value of the prefCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefCurr() {
        return prefCurr;
    }

    /**
     * Sets the value of the prefCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefCurr(String value) {
        this.prefCurr = value;
    }

    /**
     * Gets the value of the ignoreEplRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreEplRules() {
        return ignoreEplRules;
    }

    /**
     * Sets the value of the ignoreEplRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreEplRules(String value) {
        this.ignoreEplRules = value;
    }

    /**
     * Gets the value of the cashOnlyQqcsOk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashOnlyQqcsOk() {
        return cashOnlyQqcsOk;
    }

    /**
     * Sets the value of the cashOnlyQqcsOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashOnlyQqcsOk(String value) {
        this.cashOnlyQqcsOk = value;
    }

    /**
     * Gets the value of the egFuncts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgFuncts() {
        return egFuncts;
    }

    /**
     * Sets the value of the egFuncts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgFuncts(String value) {
        this.egFuncts = value;
    }

    /**
     * Gets the value of the intId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntId() {
        return intId;
    }

    /**
     * Sets the value of the intId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntId(String value) {
        this.intId = value;
    }

    /**
     * Gets the value of the specialFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFlag2() {
        return specialFlag2;
    }

    /**
     * Sets the value of the specialFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFlag2(String value) {
        this.specialFlag2 = value;
    }

    /**
     * Gets the value of the defPayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefPayType() {
        return defPayType;
    }

    /**
     * Sets the value of the defPayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefPayType(String value) {
        this.defPayType = value;
    }

    /**
     * Gets the value of the mainSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainSub() {
        return mainSub;
    }

    /**
     * Sets the value of the mainSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainSub(String value) {
        this.mainSub = value;
    }

    /**
     * Gets the value of the posId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosId() {
        return posId;
    }

    /**
     * Sets the value of the posId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosId(String value) {
        this.posId = value;
    }

    /**
     * Gets the value of the specialFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFlag3() {
        return specialFlag3;
    }

    /**
     * Sets the value of the specialFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFlag3(String value) {
        this.specialFlag3 = value;
    }

}
