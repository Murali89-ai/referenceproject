
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gwp_gbs_reply_notification_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gwp_gbs_reply_notification_base">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="partner" type="{http://www.westernunion.com/schema/xrsi}channel_partner"/>
 *         <element name="external_reference_no" type="{http://www.westernunion.com/schema/xrsi}external_reference_no" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gwp_gbs_reply_notification_base", propOrder = {
    "partner",
    "externalReferenceNo"
})
@XmlSeeAlso({
    GwpReplyNotificationBase.class,
    GbsReplyNotificationBase.class
})
public class GwpGbsReplyNotificationBase {

    @XmlElement(required = true)
    protected ChannelPartner partner;
    @XmlElement(name = "external_reference_no")
    protected String externalReferenceNo;

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelPartner }
     *     
     */
    public ChannelPartner getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelPartner }
     *     
     */
    public void setPartner(ChannelPartner value) {
        this.partner = value;
    }

    /**
     * Gets the value of the externalReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceNo() {
        return externalReferenceNo;
    }

    /**
     * Sets the value of the externalReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceNo(String value) {
        this.externalReferenceNo = value;
    }

}
