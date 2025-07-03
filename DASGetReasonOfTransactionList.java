
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASGetReasonOfTransactionList</b> object contains the next level List OR Result 
 *             				for given List<br>
 *             				e.g. everything between <GETREASONOFTRANSACTION>...</GETREASONOFTRANSACTION> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETREASONOFTRANSACTION_Type", propOrder = {

})
public class DASGetReasonOfTransactionList {

    @XmlElement(name = "REASON_CODE")
    protected String reasoncode;
    @XmlElement(name = "REASON_DESC")
    protected String reasondesc;
    @XmlElement(name = "RECEIPT_DESC")
    protected String receiptdesc;

    /**
     * Gets the value of the reasoncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASONCODE() {
        return reasoncode;
    }

    /**
     * Sets the value of the reasoncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASONCODE(String value) {
        this.reasoncode = value;
    }

    /**
     * Gets the value of the reasondesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASONDESC() {
        return reasondesc;
    }

    /**
     * Sets the value of the reasondesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASONDESC(String value) {
        this.reasondesc = value;
    }

    /**
     * Gets the value of the receiptdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIPTDESC() {
        return receiptdesc;
    }

    /**
     * Sets the value of the receiptdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIPTDESC(String value) {
        this.receiptdesc = value;
    }

}
