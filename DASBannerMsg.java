
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASBannerMsg</b> object contains one banner message<br>
 *             				and is currently used for WU (Global)and WU Agent Specific
 *             				banner messages.
 *             				e.g. everything between <GETWUBANNERMSGS>...</GETWUBANNERMSGS> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BANNERMESSAGE_Type", propOrder = {

})
public class DASBannerMsg {

    @XmlElement(name = "ERR_CODE")
    protected String templateIndex;
    @XmlElement(name = "ERR_MESSAGE")
    protected String bannerMessage;

    /**
     * Gets the value of the templateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateIndex() {
        return templateIndex;
    }

    /**
     * Sets the value of the templateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateIndex(String value) {
        this.templateIndex = value;
    }

    /**
     * Gets the value of the bannerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBannerMessage() {
        return bannerMessage;
    }

    /**
     * Sets the value of the bannerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBannerMessage(String value) {
        this.bannerMessage = value;
    }

}
