
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>XRSIDasReply</b> object contains the Data Reply details <br>
 *             				i.e. everything between <das-reply>...</das-reply> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "h2h-das-reply", propOrder = {
    "mtml"
})
public class XRSIDasReply
    extends ReplyTransactionBase
{

    @XmlElement(name = "MTML", required = true)
    protected DASMtml mtml;

    /**
     * Gets the value of the mtml property.
     * 
     * @return
     *     possible object is
     *     {@link DASMtml }
     *     
     */
    public DASMtml getMTML() {
        return mtml;
    }

    /**
     * Sets the value of the mtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASMtml }
     *     
     */
    public void setMTML(DASMtml value) {
        this.mtml = value;
    }

}
