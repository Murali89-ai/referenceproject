
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASGetMessageList</b> object contains the next level List OR Result 
 *             				for given List<br>
 *             				e.g. everything between <GETMESSAGELIST>...</GETMESSAGELIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETMESSAGELIST_Type", propOrder = {

})
public class DASGetMessageList {

    @XmlElement(name = "MESSAGE_NAME")
    protected String msgname;
    @XmlElement(name = "MESSAGE_TEXT")
    protected String messagetext;

    /**
     * Gets the value of the msgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGNAME() {
        return msgname;
    }

    /**
     * Sets the value of the msgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGNAME(String value) {
        this.msgname = value;
    }

    /**
     * Gets the value of the messagetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGETEXT() {
        return messagetext;
    }

    /**
     * Sets the value of the messagetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGETEXT(String value) {
        this.messagetext = value;
    }

}
