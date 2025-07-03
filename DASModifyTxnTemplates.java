
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASModifyTxnTemplates</b> object contains template data for
 *             				modify transaction.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MODIFYTRANSACTIONTEMPLATE_Type", propOrder = {

})
public class DASModifyTxnTemplates {

    @XmlElement(name = "CATEGORY", namespace = "http://www.westernunion.com/schema/xrsi", required = true)
    protected String category;
    @XmlElement(name = "T_INDEX", namespace = "http://www.westernunion.com/schema/xrsi", required = true)
    protected String templateIndex;
    @XmlElement(name = "DESCRIPTION", namespace = "http://www.westernunion.com/schema/xrsi", required = true)
    protected String templateLineData;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
