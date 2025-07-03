
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASRequest</b> object contains the Data Request details <br>
 *             				i.e. everything between <das-request>...</das-request> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "h2h-das-request", propOrder = {
    "foreignRemoteSystem",
    "dasQueryClientID",
    "dasQueryName",
    "dasQueryAgentAccountNumber",
    "dasQueryFSID",
    "dasQueryCounterID",
    "dasQueryDatabaseName",
    "dasQueryTermID",
    "dasReqFilters"
})
public class XRSIDasRequest
    extends RequestTransactionBase
{

    @XmlElement(name = "foreign_remote_system")
    protected ForeignRemoteSystem foreignRemoteSystem;
    @XmlElement(name = "client_id")
    protected String dasQueryClientID;
    @XmlElement(name = "name")
    protected String dasQueryName;
    @XmlElement(name = "account_num")
    protected String dasQueryAgentAccountNumber;
    @XmlElement(name = "fsid")
    protected String dasQueryFSID;
    @XmlElement(name = "counter_id")
    protected String dasQueryCounterID;
    @XmlElement(name = "db_name")
    protected String dasQueryDatabaseName;
    @XmlElement(name = "term_id")
    protected String dasQueryTermID;
    @XmlElement(name = "filters")
    protected DASReqFilters dasReqFilters;

    /**
     * Gets the value of the foreignRemoteSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignRemoteSystem }
     *     
     */
    public ForeignRemoteSystem getForeignRemoteSystem() {
        return foreignRemoteSystem;
    }

    /**
     * Sets the value of the foreignRemoteSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignRemoteSystem }
     *     
     */
    public void setForeignRemoteSystem(ForeignRemoteSystem value) {
        this.foreignRemoteSystem = value;
    }

    /**
     * Gets the value of the dasQueryClientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryClientID() {
        return dasQueryClientID;
    }

    /**
     * Sets the value of the dasQueryClientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryClientID(String value) {
        this.dasQueryClientID = value;
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
     * Gets the value of the dasQueryAgentAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryAgentAccountNumber() {
        return dasQueryAgentAccountNumber;
    }

    /**
     * Sets the value of the dasQueryAgentAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryAgentAccountNumber(String value) {
        this.dasQueryAgentAccountNumber = value;
    }

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
     * Gets the value of the dasQueryDatabaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryDatabaseName() {
        return dasQueryDatabaseName;
    }

    /**
     * Sets the value of the dasQueryDatabaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryDatabaseName(String value) {
        this.dasQueryDatabaseName = value;
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
     * Gets the value of the dasReqFilters property.
     * 
     * @return
     *     possible object is
     *     {@link DASReqFilters }
     *     
     */
    public DASReqFilters getDASReqFilters() {
        return dasReqFilters;
    }

    /**
     * Sets the value of the dasReqFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASReqFilters }
     *     
     */
    public void setDASReqFilters(DASReqFilters value) {
        this.dasReqFilters = value;
    }

}
