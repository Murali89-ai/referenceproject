
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASRequest</b> object contains the MTML Request details <br>
 *             				i.e. everything between <REQUEST>...</REQUEST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQUESTType", propOrder = {
    "dasReqDataContext"
})
public class DASRequest {

    @XmlElement(name = "DATA_CONTEXT", required = true)
    protected DASReqDataContext dasReqDataContext;
    @XmlAttribute(name = "HOST")
    protected String host;
    @XmlAttribute(name = "CLIENT")
    protected String client;
    @XmlAttribute(name = "TYPE")
    protected String type;

    /**
     * Gets the value of the dasReqDataContext property.
     * 
     * @return
     *     possible object is
     *     {@link DASReqDataContext }
     *     
     */
    public DASReqDataContext getDASReqDataContext() {
        return dasReqDataContext;
    }

    /**
     * Sets the value of the dasReqDataContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASReqDataContext }
     *     
     */
    public void setDASReqDataContext(DASReqDataContext value) {
        this.dasReqDataContext = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the adaptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the adaptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
