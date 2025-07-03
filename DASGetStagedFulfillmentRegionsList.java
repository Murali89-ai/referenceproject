
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASGetStagedFulfillmentRegions</b> object contains the next level List OR Result 
 *             				for given List<br>
 *             				e.g. everything between <GETSTAGEDFULFILLMENTREGIONS>...</GETSTAGEDFULFILLMENTREGIONS> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETSTAGEDFULFILLMENTREGIONS_Type", propOrder = {

})
public class DASGetStagedFulfillmentRegionsList {

    @XmlElement(name = "REGION_CODE")
    protected String regioncode;
    @XmlElement(name = "REGION_CURRENCY")
    protected String regioncurrency;
    @XmlElement(name = "CPC_CODE")
    protected String cpccode;
    @XmlElement(name = "SUBREGION_TYPE")
    protected String subregiontype;
    @XmlElement(name = "SUBREGION_VALUE")
    protected String subregionvalue;
    @XmlElement(name = "STAGING_AGENT_ACCOUNT")
    protected String stagingagentaccount;
    @XmlElement(name = "STAGING_PROFILE_ACCOUNT")
    protected String stagingprofileaccount;

    /**
     * Gets the value of the regioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIONCODE() {
        return regioncode;
    }

    /**
     * Sets the value of the regioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIONCODE(String value) {
        this.regioncode = value;
    }

    /**
     * Gets the value of the regioncurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIONCURRENCY() {
        return regioncurrency;
    }

    /**
     * Sets the value of the regioncurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIONCURRENCY(String value) {
        this.regioncurrency = value;
    }

    /**
     * Gets the value of the cpccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPCCODE() {
        return cpccode;
    }

    /**
     * Sets the value of the cpccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPCCODE(String value) {
        this.cpccode = value;
    }

    /**
     * Gets the value of the subregiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBREGIONTYPE() {
        return subregiontype;
    }

    /**
     * Sets the value of the subregiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBREGIONTYPE(String value) {
        this.subregiontype = value;
    }

    /**
     * Gets the value of the subregionvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBREGIONVALUE() {
        return subregionvalue;
    }

    /**
     * Sets the value of the subregionvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBREGIONVALUE(String value) {
        this.subregionvalue = value;
    }

    /**
     * Gets the value of the stagingagentaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAGINGAGENTACCOUNT() {
        return stagingagentaccount;
    }

    /**
     * Sets the value of the stagingagentaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAGINGAGENTACCOUNT(String value) {
        this.stagingagentaccount = value;
    }

    /**
     * Gets the value of the stagingprofileaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAGINGPROFILEACCOUNT() {
        return stagingprofileaccount;
    }

    /**
     * Sets the value of the stagingprofileaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAGINGPROFILEACCOUNT(String value) {
        this.stagingprofileaccount = value;
    }

}
