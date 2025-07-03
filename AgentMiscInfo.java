
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentMiscInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentMiscInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cashcd_allow" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="debitcd_allow" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="ylwphn_allow" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="et_sgoff_time" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="et_sched_time" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="product_data" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="privacy_flags" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="privacy_data" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="audit_enab_key" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="audit_temp_key" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <choice maxOccurs="unbounded">
 *           <element name="template_id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *           <element name="country_code" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *           <element name="netid" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         </choice>
 *         <element name="agent_rep_prefix" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="pcs_ledger" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="tzone" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="daylight" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="ruc" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="iroc_flag" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="iroc" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="fusion_allow" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="sw_border" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="etch_flag" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="sds_upd_comp" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="rate_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="rate_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="cty_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="cty_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="fif_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="fif_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="erc_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="erc_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qqc_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qqc_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="mex_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="mex_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="sup_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="sup_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dsv_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dsv_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="loc_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="loc_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="tmp_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="tmp_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="bnk_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="bnk_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="ckw_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="ckw_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="var_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="var_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="mrl_init" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="mrl_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="global_level" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="carrier_vsn" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentMiscInfo", propOrder = {
    "cashcdAllow",
    "debitcdAllow",
    "ylwphnAllow",
    "etSgoffTime",
    "etSchedTime",
    "productData",
    "privacyFlags",
    "privacyData",
    "auditEnabKey",
    "auditTempKey",
    "templateIdOrCountryCodeOrNetid",
    "agentRepPrefix",
    "pcsLedger",
    "tzone",
    "daylight",
    "ruc",
    "irocFlag",
    "iroc",
    "fusionAllow",
    "swBorder",
    "etchFlag",
    "sdsUpdComp",
    "rateInit",
    "rateName",
    "ctyInit",
    "ctyName",
    "fifInit",
    "fifName",
    "ercInit",
    "ercName",
    "qqcInit",
    "qqcName",
    "mexInit",
    "mexName",
    "supInit",
    "supName",
    "dsvInit",
    "dsvName",
    "locInit",
    "locName",
    "tmpInit",
    "tmpName",
    "bnkInit",
    "bnkName",
    "ckwInit",
    "ckwName",
    "varInit",
    "varName",
    "mrlInit",
    "mrlName",
    "globalLevel",
    "carrierVsn"
})
public class AgentMiscInfo {

    @XmlElement(name = "cashcd_allow")
    protected String cashcdAllow;
    @XmlElement(name = "debitcd_allow")
    protected String debitcdAllow;
    @XmlElement(name = "ylwphn_allow")
    protected String ylwphnAllow;
    @XmlElement(name = "et_sgoff_time")
    protected String etSgoffTime;
    @XmlElement(name = "et_sched_time")
    protected String etSchedTime;
    @XmlElement(name = "product_data")
    protected String productData;
    @XmlElement(name = "privacy_flags")
    protected String privacyFlags;
    @XmlElement(name = "privacy_data")
    protected String privacyData;
    @XmlElement(name = "audit_enab_key")
    protected String auditEnabKey;
    @XmlElement(name = "audit_temp_key")
    protected String auditTempKey;
    @XmlElementRefs({
        @XmlElementRef(name = "template_id", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "country_code", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "netid", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> templateIdOrCountryCodeOrNetid;
    @XmlElement(name = "agent_rep_prefix")
    protected String agentRepPrefix;
    @XmlElement(name = "pcs_ledger")
    protected String pcsLedger;
    protected String tzone;
    protected String daylight;
    protected String ruc;
    @XmlElement(name = "iroc_flag")
    protected String irocFlag;
    protected String iroc;
    @XmlElement(name = "fusion_allow")
    protected String fusionAllow;
    @XmlElement(name = "sw_border")
    protected String swBorder;
    @XmlElement(name = "etch_flag")
    protected String etchFlag;
    @XmlElement(name = "sds_upd_comp")
    protected String sdsUpdComp;
    @XmlElement(name = "rate_init")
    protected String rateInit;
    @XmlElement(name = "rate_name")
    protected String rateName;
    @XmlElement(name = "cty_init")
    protected String ctyInit;
    @XmlElement(name = "cty_name")
    protected String ctyName;
    @XmlElement(name = "fif_init")
    protected String fifInit;
    @XmlElement(name = "fif_name")
    protected String fifName;
    @XmlElement(name = "erc_init")
    protected String ercInit;
    @XmlElement(name = "erc_name")
    protected String ercName;
    @XmlElement(name = "qqc_init")
    protected String qqcInit;
    @XmlElement(name = "qqc_name")
    protected String qqcName;
    @XmlElement(name = "mex_init")
    protected String mexInit;
    @XmlElement(name = "mex_name")
    protected String mexName;
    @XmlElement(name = "sup_init")
    protected String supInit;
    @XmlElement(name = "sup_name")
    protected String supName;
    @XmlElement(name = "dsv_init")
    protected String dsvInit;
    @XmlElement(name = "dsv_name")
    protected String dsvName;
    @XmlElement(name = "loc_init")
    protected String locInit;
    @XmlElement(name = "loc_name")
    protected String locName;
    @XmlElement(name = "tmp_init")
    protected String tmpInit;
    @XmlElement(name = "tmp_name")
    protected String tmpName;
    @XmlElement(name = "bnk_init")
    protected String bnkInit;
    @XmlElement(name = "bnk_name")
    protected String bnkName;
    @XmlElement(name = "ckw_init")
    protected String ckwInit;
    @XmlElement(name = "ckw_name")
    protected String ckwName;
    @XmlElement(name = "var_init")
    protected String varInit;
    @XmlElement(name = "var_name")
    protected String varName;
    @XmlElement(name = "mrl_init")
    protected String mrlInit;
    @XmlElement(name = "mrl_name")
    protected String mrlName;
    @XmlElement(name = "global_level")
    protected String globalLevel;
    @XmlElement(name = "carrier_vsn")
    protected String carrierVsn;

    /**
     * Gets the value of the cashcdAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashcdAllow() {
        return cashcdAllow;
    }

    /**
     * Sets the value of the cashcdAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashcdAllow(String value) {
        this.cashcdAllow = value;
    }

    /**
     * Gets the value of the debitcdAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitcdAllow() {
        return debitcdAllow;
    }

    /**
     * Sets the value of the debitcdAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitcdAllow(String value) {
        this.debitcdAllow = value;
    }

    /**
     * Gets the value of the ylwphnAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYlwphnAllow() {
        return ylwphnAllow;
    }

    /**
     * Sets the value of the ylwphnAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYlwphnAllow(String value) {
        this.ylwphnAllow = value;
    }

    /**
     * Gets the value of the etSgoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtSgoffTime() {
        return etSgoffTime;
    }

    /**
     * Sets the value of the etSgoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtSgoffTime(String value) {
        this.etSgoffTime = value;
    }

    /**
     * Gets the value of the etSchedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtSchedTime() {
        return etSchedTime;
    }

    /**
     * Sets the value of the etSchedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtSchedTime(String value) {
        this.etSchedTime = value;
    }

    /**
     * Gets the value of the productData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductData() {
        return productData;
    }

    /**
     * Sets the value of the productData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductData(String value) {
        this.productData = value;
    }

    /**
     * Gets the value of the privacyFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyFlags() {
        return privacyFlags;
    }

    /**
     * Sets the value of the privacyFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyFlags(String value) {
        this.privacyFlags = value;
    }

    /**
     * Gets the value of the privacyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyData() {
        return privacyData;
    }

    /**
     * Sets the value of the privacyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyData(String value) {
        this.privacyData = value;
    }

    /**
     * Gets the value of the auditEnabKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditEnabKey() {
        return auditEnabKey;
    }

    /**
     * Sets the value of the auditEnabKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditEnabKey(String value) {
        this.auditEnabKey = value;
    }

    /**
     * Gets the value of the auditTempKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditTempKey() {
        return auditTempKey;
    }

    /**
     * Sets the value of the auditTempKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditTempKey(String value) {
        this.auditTempKey = value;
    }

    /**
     * Gets the value of the templateIdOrCountryCodeOrNetid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the templateIdOrCountryCodeOrNetid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateIdOrCountryCodeOrNetid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     * @return
     *     The value of the templateIdOrCountryCodeOrNetid property.
     */
    public List<JAXBElement<String>> getTemplateIdOrCountryCodeOrNetid() {
        if (templateIdOrCountryCodeOrNetid == null) {
            templateIdOrCountryCodeOrNetid = new ArrayList<>();
        }
        return this.templateIdOrCountryCodeOrNetid;
    }

    /**
     * Gets the value of the agentRepPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRepPrefix() {
        return agentRepPrefix;
    }

    /**
     * Sets the value of the agentRepPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRepPrefix(String value) {
        this.agentRepPrefix = value;
    }

    /**
     * Gets the value of the pcsLedger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcsLedger() {
        return pcsLedger;
    }

    /**
     * Sets the value of the pcsLedger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcsLedger(String value) {
        this.pcsLedger = value;
    }

    /**
     * Gets the value of the tzone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzone() {
        return tzone;
    }

    /**
     * Sets the value of the tzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzone(String value) {
        this.tzone = value;
    }

    /**
     * Gets the value of the daylight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylight() {
        return daylight;
    }

    /**
     * Sets the value of the daylight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylight(String value) {
        this.daylight = value;
    }

    /**
     * Gets the value of the ruc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Sets the value of the ruc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Gets the value of the irocFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrocFlag() {
        return irocFlag;
    }

    /**
     * Sets the value of the irocFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrocFlag(String value) {
        this.irocFlag = value;
    }

    /**
     * Gets the value of the iroc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIroc() {
        return iroc;
    }

    /**
     * Sets the value of the iroc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIroc(String value) {
        this.iroc = value;
    }

    /**
     * Gets the value of the fusionAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFusionAllow() {
        return fusionAllow;
    }

    /**
     * Sets the value of the fusionAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFusionAllow(String value) {
        this.fusionAllow = value;
    }

    /**
     * Gets the value of the swBorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwBorder() {
        return swBorder;
    }

    /**
     * Sets the value of the swBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwBorder(String value) {
        this.swBorder = value;
    }

    /**
     * Gets the value of the etchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtchFlag() {
        return etchFlag;
    }

    /**
     * Sets the value of the etchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtchFlag(String value) {
        this.etchFlag = value;
    }

    /**
     * Gets the value of the sdsUpdComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdsUpdComp() {
        return sdsUpdComp;
    }

    /**
     * Sets the value of the sdsUpdComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdsUpdComp(String value) {
        this.sdsUpdComp = value;
    }

    /**
     * Gets the value of the rateInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateInit() {
        return rateInit;
    }

    /**
     * Sets the value of the rateInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateInit(String value) {
        this.rateInit = value;
    }

    /**
     * Gets the value of the rateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateName() {
        return rateName;
    }

    /**
     * Sets the value of the rateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateName(String value) {
        this.rateName = value;
    }

    /**
     * Gets the value of the ctyInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtyInit() {
        return ctyInit;
    }

    /**
     * Sets the value of the ctyInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtyInit(String value) {
        this.ctyInit = value;
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
     * Gets the value of the fifInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFifInit() {
        return fifInit;
    }

    /**
     * Sets the value of the fifInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFifInit(String value) {
        this.fifInit = value;
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
     * Gets the value of the ercInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErcInit() {
        return ercInit;
    }

    /**
     * Sets the value of the ercInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErcInit(String value) {
        this.ercInit = value;
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
     * Gets the value of the qqcInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqcInit() {
        return qqcInit;
    }

    /**
     * Sets the value of the qqcInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqcInit(String value) {
        this.qqcInit = value;
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
     * Gets the value of the mexInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMexInit() {
        return mexInit;
    }

    /**
     * Sets the value of the mexInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMexInit(String value) {
        this.mexInit = value;
    }

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
     * Gets the value of the supInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupInit() {
        return supInit;
    }

    /**
     * Sets the value of the supInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupInit(String value) {
        this.supInit = value;
    }

    /**
     * Gets the value of the supName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupName() {
        return supName;
    }

    /**
     * Sets the value of the supName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupName(String value) {
        this.supName = value;
    }

    /**
     * Gets the value of the dsvInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsvInit() {
        return dsvInit;
    }

    /**
     * Sets the value of the dsvInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsvInit(String value) {
        this.dsvInit = value;
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
     * Gets the value of the locInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocInit() {
        return locInit;
    }

    /**
     * Sets the value of the locInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocInit(String value) {
        this.locInit = value;
    }

    /**
     * Gets the value of the locName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocName() {
        return locName;
    }

    /**
     * Sets the value of the locName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocName(String value) {
        this.locName = value;
    }

    /**
     * Gets the value of the tmpInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpInit() {
        return tmpInit;
    }

    /**
     * Sets the value of the tmpInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpInit(String value) {
        this.tmpInit = value;
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
     * Gets the value of the bnkInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkInit() {
        return bnkInit;
    }

    /**
     * Sets the value of the bnkInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkInit(String value) {
        this.bnkInit = value;
    }

    /**
     * Gets the value of the bnkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnkName() {
        return bnkName;
    }

    /**
     * Sets the value of the bnkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnkName(String value) {
        this.bnkName = value;
    }

    /**
     * Gets the value of the ckwInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkwInit() {
        return ckwInit;
    }

    /**
     * Sets the value of the ckwInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkwInit(String value) {
        this.ckwInit = value;
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
     * Gets the value of the varInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarInit() {
        return varInit;
    }

    /**
     * Sets the value of the varInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarInit(String value) {
        this.varInit = value;
    }

    /**
     * Gets the value of the varName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarName() {
        return varName;
    }

    /**
     * Sets the value of the varName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarName(String value) {
        this.varName = value;
    }

    /**
     * Gets the value of the mrlInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrlInit() {
        return mrlInit;
    }

    /**
     * Sets the value of the mrlInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrlInit(String value) {
        this.mrlInit = value;
    }

    /**
     * Gets the value of the mrlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrlName() {
        return mrlName;
    }

    /**
     * Sets the value of the mrlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrlName(String value) {
        this.mrlName = value;
    }

    /**
     * Gets the value of the globalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalLevel() {
        return globalLevel;
    }

    /**
     * Sets the value of the globalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalLevel(String value) {
        this.globalLevel = value;
    }

    /**
     * Gets the value of the carrierVsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierVsn() {
        return carrierVsn;
    }

    /**
     * Sets the value of the carrierVsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierVsn(String value) {
        this.carrierVsn = value;
    }

}
