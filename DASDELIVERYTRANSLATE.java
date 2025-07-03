
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASDELIVERYTRANSLATE_Type</b> object contains the DASDELIVERYTRANSLATE_Type details 
 *             				for one City/State combination.<br>
 *             				e.g. everything between <GETCITYSTATELIST>...</GETCITYSTATELIST> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DASDELIVERYTRANSLATE_Type", propOrder = {

})
public class DASDELIVERYTRANSLATE {

    @XmlElement(name = "ENGLISH_MESSAGE", required = true)
    protected String englishmessage;
    @XmlElement(name = "TRANSL_MESSAGE", required = true)
    protected String translmessage;

    /**
     * Gets the value of the englishmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENGLISHMESSAGE() {
        return englishmessage;
    }

    /**
     * Sets the value of the englishmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENGLISHMESSAGE(String value) {
        this.englishmessage = value;
    }

    /**
     * Gets the value of the translmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSLMESSAGE() {
        return translmessage;
    }

    /**
     * Sets the value of the translmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSLMESSAGE(String value) {
        this.translmessage = value;
    }

}
