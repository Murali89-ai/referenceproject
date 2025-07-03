
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASReqDataContext</b> object contains the Data Context details <br>
 *             				i.e. everything between <QUERYDATA>...</QUERYDATA> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QUERYDATA_Type", propOrder = {
    "dasQueryClientID",
    "dasQueryName",
    "dasQueryAgentAccountNumber",
    "dasQueryFSID",
    "dasQueryCounterID",
    "dasQueryDatabaseName",
    "dasQueryTermID",
    "dasQueryFilter1",
    "dasQueryFilter2",
    "dasQueryFilter3",
    "dasQueryFilter4",
    "dasQueryFilter5",
    "dasQueryFilter6",
    "dasQueryFilter7",
    "dasQueryFilter8",
    "dasQueryFilter9",
    "dasQueryFilter10"
})
public class DASReqQueryData {

    @XmlElement(name = "CLIENT_ID")
    protected String dasQueryClientID;
    @XmlElement(name = "NAME", required = true)
    protected String dasQueryName;
    @XmlElement(name = "ACCOUNT_NUM", required = true)
    protected String dasQueryAgentAccountNumber;
    @XmlElement(name = "FSID")
    protected String dasQueryFSID;
    @XmlElement(name = "COUNTER_ID")
    protected String dasQueryCounterID;
    @XmlElement(name = "DB_NAME")
    protected String dasQueryDatabaseName;
    @XmlElement(name = "TERM_ID")
    protected String dasQueryTermID;
    @XmlElement(name = "QUERYFILTER1")
    protected String dasQueryFilter1;
    @XmlElement(name = "QUERYFILTER2")
    protected String dasQueryFilter2;
    @XmlElement(name = "QUERYFILTER3")
    protected String dasQueryFilter3;
    @XmlElement(name = "QUERYFILTER4")
    protected String dasQueryFilter4;
    @XmlElement(name = "QUERYFILTER5")
    protected String dasQueryFilter5;
    @XmlElement(name = "QUERYFILTER6")
    protected String dasQueryFilter6;
    @XmlElement(name = "QUERYFILTER7")
    protected String dasQueryFilter7;
    @XmlElement(name = "QUERYFILTER8")
    protected String dasQueryFilter8;
    @XmlElement(name = "QUERYFILTER9")
    protected String dasQueryFilter9;
    @XmlElement(name = "QUERYFILTER10")
    protected String dasQueryFilter10;

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
     * Gets the value of the dasQueryFilter1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter1() {
        return dasQueryFilter1;
    }

    /**
     * Sets the value of the dasQueryFilter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter1(String value) {
        this.dasQueryFilter1 = value;
    }

    /**
     * Gets the value of the dasQueryFilter2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter2() {
        return dasQueryFilter2;
    }

    /**
     * Sets the value of the dasQueryFilter2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter2(String value) {
        this.dasQueryFilter2 = value;
    }

    /**
     * Gets the value of the dasQueryFilter3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter3() {
        return dasQueryFilter3;
    }

    /**
     * Sets the value of the dasQueryFilter3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter3(String value) {
        this.dasQueryFilter3 = value;
    }

    /**
     * Gets the value of the dasQueryFilter4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter4() {
        return dasQueryFilter4;
    }

    /**
     * Sets the value of the dasQueryFilter4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter4(String value) {
        this.dasQueryFilter4 = value;
    }

    /**
     * Gets the value of the dasQueryFilter5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter5() {
        return dasQueryFilter5;
    }

    /**
     * Sets the value of the dasQueryFilter5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter5(String value) {
        this.dasQueryFilter5 = value;
    }

    /**
     * Gets the value of the dasQueryFilter6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter6() {
        return dasQueryFilter6;
    }

    /**
     * Sets the value of the dasQueryFilter6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter6(String value) {
        this.dasQueryFilter6 = value;
    }

    /**
     * Gets the value of the dasQueryFilter7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter7() {
        return dasQueryFilter7;
    }

    /**
     * Sets the value of the dasQueryFilter7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter7(String value) {
        this.dasQueryFilter7 = value;
    }

    /**
     * Gets the value of the dasQueryFilter8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter8() {
        return dasQueryFilter8;
    }

    /**
     * Sets the value of the dasQueryFilter8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter8(String value) {
        this.dasQueryFilter8 = value;
    }

    /**
     * Gets the value of the dasQueryFilter9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter9() {
        return dasQueryFilter9;
    }

    /**
     * Sets the value of the dasQueryFilter9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter9(String value) {
        this.dasQueryFilter9 = value;
    }

    /**
     * Gets the value of the dasQueryFilter10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter10() {
        return dasQueryFilter10;
    }

    /**
     * Sets the value of the dasQueryFilter10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter10(String value) {
        this.dasQueryFilter10 = value;
    }

}
