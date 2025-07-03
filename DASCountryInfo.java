
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASCountryInfo</b> object contains textual Country information.<br>
 *             				e.g. everything between <GETCOUNTRYINFO>...</GETCOUNTRYINFO> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COUNTRYINFO_Type", propOrder = {

})
public class DASCountryInfo {

    @XmlElement(name = "REC_NUMBER", required = true)
    protected String lineNumber;
    @XmlElement(name = "INFO")
    protected String countryInfoLine;

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the countryInfoLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryInfoLine() {
        return countryInfoLine;
    }

    /**
     * Sets the value of the countryInfoLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryInfoLine(String value) {
        this.countryInfoLine = value;
    }

}
