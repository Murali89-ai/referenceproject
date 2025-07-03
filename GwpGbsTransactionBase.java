
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gwp_gbs_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gwp_gbs_transaction_base">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="partner" type="{http://www.westernunion.com/schema/xrsi}channel_partner" minOccurs="0"/>
 *         <element name="device" type="{http://www.westernunion.com/schema/xrsi}gwp_gbs_device" minOccurs="0"/>
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
@XmlType(name = "gwp_gbs_transaction_base", propOrder = {
    "partner",
    "device",
    "externalReferenceNo"
})
@XmlSeeAlso({
    GwpTransactionBase.class,
    GbsTransactionBase.class
})
public class GwpGbsTransactionBase {

    protected ChannelPartner partner;
    protected GwpGbsDevice device;
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
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link GwpGbsDevice }
     *     
     */
    public GwpGbsDevice getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link GwpGbsDevice }
     *     
     */
    public void setDevice(GwpGbsDevice value) {
        this.device = value;
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
