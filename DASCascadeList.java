
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASCascadeList</b> object contains the next level List OR Result 
 *             				for given List<br>
 *             				e.g. everything between <GETCASCADELIST>...</GETCASCADELIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CASCADE_LIST_Type", propOrder = {

})
public class DASCascadeList {

    @XmlElement(name = "LIST_VALUE")
    protected String listvalue;
    @XmlElement(name = "LIST_TEXT")
    protected String listtext;
    @XmlElement(name = "RESULT")
    protected String result;
    @XmlElement(name = "MESSAGE_NAME")
    protected String messagename;

    /**
     * Gets the value of the listvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLISTVALUE() {
        return listvalue;
    }

    /**
     * Sets the value of the listvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLISTVALUE(String value) {
        this.listvalue = value;
    }

    /**
     * Gets the value of the listtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLISTTEXT() {
        return listtext;
    }

    /**
     * Sets the value of the listtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLISTTEXT(String value) {
        this.listtext = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULT() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULT(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the messagename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGENAME() {
        return messagename;
    }

    /**
     * Sets the value of the messagename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGENAME(String value) {
        this.messagename = value;
    }

}
