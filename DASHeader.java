
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASHeader</b> object contains the Header details <br>
 *             				i.e. everything between <HEADER>...</HEADER> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HEADER_Type", propOrder = {

})
public class DASHeader {

    @XmlElement(name = "FSID")
    protected String dasQueryFSID;
    @XmlElement(name = "COUNTER_ID")
    protected String dasQueryCounterID;
    @XmlElement(name = "TERM_ID")
    protected String dasQueryTermID;
    @XmlElement(name = "ACCOUNT_NUM")
    protected String agentAccountNumber;
    @XmlElement(name = "DATA_MORE", defaultValue = "N")
    protected String anyMoreRecords;
    @XmlElement(name = "DATA_NUM_RECS", defaultValue = "0")
    protected String numberRecsReturned;
    @XmlElement(name = "NAME", required = true)
    protected String dasQueryName;
    @XmlElement(name = "ERROR_MSG")
    protected String errorMsg;

    /**
     * Gets the value of the dasQueryFSID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFSID() {
        return dasQueryFSID;
    }

    /**
     * Sets the value of the dasQueryFSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFSID(String value) {
        this.dasQueryFSID = value;
    }

    /**
     * Gets the value of the dasQueryCounterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryCounterID() {
        return dasQueryCounterID;
    }

    /**
     * Sets the value of the dasQueryCounterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryCounterID(String value) {
        this.dasQueryCounterID = value;
    }

    /**
     * Gets the value of the dasQueryTermID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryTermID() {
        return dasQueryTermID;
    }

    /**
     * Sets the value of the dasQueryTermID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryTermID(String value) {
        this.dasQueryTermID = value;
    }

    /**
     * Gets the value of the agentAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentAccountNumber() {
        return agentAccountNumber;
    }

    /**
     * Sets the value of the agentAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentAccountNumber(String value) {
        this.agentAccountNumber = value;
    }

    /**
     * Gets the value of the anyMoreRecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyMoreRecords() {
        return anyMoreRecords;
    }

    /**
     * Sets the value of the anyMoreRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyMoreRecords(String value) {
        this.anyMoreRecords = value;
    }

    /**
     * Gets the value of the numberRecsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public String getNumberRecsReturned() {
        return numberRecsReturned;
    }

    /**
     * Sets the value of the numberRecsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberRecsReturned(String value) {
        this.numberRecsReturned = value;
    }

    /**
     * Gets the value of the dasQueryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryName() {
        return dasQueryName;
    }

    /**
     * Sets the value of the dasQueryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryName(String value) {
        this.dasQueryName = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

}
