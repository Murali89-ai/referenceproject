
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASGetStateList</b> object contains the next level List OR Result 
 *             				for given List<br>
 *             				e.g. everything between <GETSTATELIST_Type>...</GETSTATELIST_Type> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETSTATELIST_Type", propOrder = {

})
public class DASGetStateList {

    @XmlElement(name = "STATE_CODE")
    protected String statecode;
    @XmlElement(name = "STATE_NAME")
    protected String statename;

    /**
     * Gets the value of the statecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATECODE() {
        return statecode;
    }

    /**
     * Sets the value of the statecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATECODE(String value) {
        this.statecode = value;
    }

    /**
     * Gets the value of the statename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATENAME() {
        return statename;
    }

    /**
     * Sets the value of the statename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATENAME(String value) {
        this.statename = value;
    }

}
