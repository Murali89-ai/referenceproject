
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASATMLocInfo</b> object contains the US ATM Location information 
 *             				by City and State for US locations<br>
 *             				e.g. everything between <GETATMLOCATIONS>...</GETATMLOCATIONS> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMLOCINFO_Type", propOrder = {

})
public class DASATMLocInfo {

    @XmlElement(name = "STATE_CODE", required = true)
    protected String stateCode;
    @XmlElement(name = "CITY", required = true)
    protected String city;
    @XmlElement(name = "ATM_LOC")
    protected String atmLocation;

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the atmLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMLocation() {
        return atmLocation;
    }

    /**
     * Sets the value of the atmLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMLocation(String value) {
        this.atmLocation = value;
    }

}
