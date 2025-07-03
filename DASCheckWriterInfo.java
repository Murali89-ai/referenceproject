
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASCheckWriterInfo</b> object contains the location information for 
 *             				for one chech writer (e.g. Casino) location where money can be sent.
 *             				e.g. everything between <GETCHECKWRITERLIST>...</GETCHECKWRITERLIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHECKWRITER_Type", propOrder = {

})
public class DASCheckWriterInfo {

    @XmlElement(name = "CKW_ID", required = true)
    protected String checkWriterID;
    @XmlElement(name = "NOTE")
    protected String note;
    @XmlElement(name = "CASINO", required = true)
    protected String casinoName;
    @XmlElement(name = "STREET", required = true)
    protected String street;
    @XmlElement(name = "CITY", namespace = "http://www.westernunion.com/schema/xrsi", required = true)
    protected String city;
    @XmlElement(name = "STATE", required = true)
    protected String state;

    /**
     * Gets the value of the checkWriterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckWriterID() {
        return checkWriterID;
    }

    /**
     * Sets the value of the checkWriterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckWriterID(String value) {
        this.checkWriterID = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the casinoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasinoName() {
        return casinoName;
    }

    /**
     * Sets the value of the casinoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasinoName(String value) {
        this.casinoName = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
