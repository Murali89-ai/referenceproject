
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASCompliance</b> object contains one line of the 
 *             				Send or Pay Compliance Template<br>
 *             				e.g. everything between <GETSENDERCOMPLIANCE>...</GETSENDERCOMPLIANCE> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPLIANCE_Type", propOrder = {

})
public class DASCompliance {

    @XmlElement(name = "CATEGORY")
    protected String complianceLevel;
    @XmlElement(name = "T_INDEX")
    protected String templateIndex;
    @XmlElement(name = "DESCRIPTION")
    protected String templateLineData;

    /**
     * Gets the value of the complianceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceLevel() {
        return complianceLevel;
    }

    /**
     * Sets the value of the complianceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceLevel(String value) {
        this.complianceLevel = value;
    }

    /**
     * Gets the value of the templateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateIndex() {
        return templateIndex;
    }

    /**
     * Sets the value of the templateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateIndex(String value) {
        this.templateIndex = value;
    }

    /**
     * Gets the value of the templateLineData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateLineData() {
        return templateLineData;
    }

    /**
     * Sets the value of the templateLineData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateLineData(String value) {
        this.templateLineData = value;
    }

}
