
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASFlag</b> object contains one basic description line.<br>
 *             				e.g. everything between <GETWUCARDPERCHANGES>...</GETWUCARDPERCHANGES> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESCRIPTION_Type", propOrder = {

})
public class DASFlag {

    @XmlElement(name = "DESCRIPTION", required = true)
    protected String templateLineData;

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
