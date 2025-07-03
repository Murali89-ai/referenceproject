
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASReqDataContext</b> object contains the Data Context details <br>
 *             				i.e. everything between <DATA_CONTEXT>...</DATA_CONTEXT> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REQ_DATA_CONTEXT_Type", propOrder = {
    "dasQueryData"
})
public class DASReqDataContext {

    @XmlElement(name = "QUERYDATA", required = true)
    protected DASReqQueryData dasQueryData;

    /**
     * Gets the value of the dasQueryData property.
     * 
     * @return
     *     possible object is
     *     {@link DASReqQueryData }
     *     
     */
    public DASReqQueryData getDASQueryData() {
        return dasQueryData;
    }

    /**
     * Sets the value of the dasQueryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASReqQueryData }
     *     
     */
    public void setDASQueryData(DASReqQueryData value) {
        this.dasQueryData = value;
    }

}
