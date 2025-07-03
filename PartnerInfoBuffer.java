
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_info_buffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="partner_info_buffer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="state_license_number" type="{http://www.westernunion.com/schema/xrsi}state_license_number" minOccurs="0"/>
 *         <element name="action_indicator" type="{http://www.westernunion.com/schema/xrsi}action_indicator" minOccurs="0"/>
 *         <element name="partner_notification" type="{http://www.westernunion.com/schema/xrsi}partner_notification" minOccurs="0"/>
 *         <element name="memo_text" type="{http://www.westernunion.com/schema/xrsi}memo_text" minOccurs="0"/>
 *         <element name="partner_branded" type="{http://www.westernunion.com/schema/xrsi}partner_branded" minOccurs="0"/>
 *         <element name="partner_financials_flag" type="{http://www.westernunion.com/schema/xrsi}partner_financials_flag" minOccurs="0"/>
 *         <element name="cloud_pricing_enabled" type="{http://www.westernunion.com/schema/xrsi}cloud_pricing_enabled" minOccurs="0"/>
 *         <element name="hosted_partner_buffer" type="{http://www.westernunion.com/schema/xrsi}hosted_partner_buffer" minOccurs="0"/>
 *         <element name="IdDoc_upload_required" type="{http://www.westernunion.com/schema/xrsi}IdDoc_upload_required" minOccurs="0"/>
 *         <element name="partner_advisory_note" type="{http://www.westernunion.com/schema/xrsi}partner_advisory_note" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partner_info_buffer", propOrder = {
    "stateLicenseNumber",
    "actionIndicator",
    "partnerNotification",
    "memoText",
    "partnerBranded",
    "partnerFinancialsFlag",
    "cloudPricingEnabled",
    "hostedPartnerBuffer",
    "idDocUploadRequired",
    "partnerAdvisoryNote"
})
public class PartnerInfoBuffer {

    @XmlElement(name = "state_license_number")
    protected String stateLicenseNumber;
    @XmlElement(name = "action_indicator")
    @XmlSchemaType(name = "string")
    protected ActionIndicator actionIndicator;
    @XmlElement(name = "partner_notification")
    protected PartnerNotification partnerNotification;
    @XmlElement(name = "memo_text")
    protected String memoText;
    @XmlElement(name = "partner_branded")
    protected PartnerBranded partnerBranded;
    @XmlElement(name = "partner_financials_flag")
    @XmlSchemaType(name = "string")
    protected PartnerFinancialsFlag partnerFinancialsFlag;
    @XmlElement(name = "cloud_pricing_enabled")
    @XmlSchemaType(name = "string")
    protected CloudPricingEnabled cloudPricingEnabled;
    @XmlElement(name = "hosted_partner_buffer")
    protected HostedPartnerBuffer hostedPartnerBuffer;
    @XmlElement(name = "IdDoc_upload_required")
    @XmlSchemaType(name = "string")
    protected IdDocUploadRequired idDocUploadRequired;
    @XmlElement(name = "partner_advisory_note")
    protected PartnerAdvisoryNote partnerAdvisoryNote;

    /**
     * Gets the value of the stateLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateLicenseNumber() {
        return stateLicenseNumber;
    }

    /**
     * Sets the value of the stateLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateLicenseNumber(String value) {
        this.stateLicenseNumber = value;
    }

    /**
     * Gets the value of the actionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ActionIndicator }
     *     
     */
    public ActionIndicator getActionIndicator() {
        return actionIndicator;
    }

    /**
     * Sets the value of the actionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionIndicator }
     *     
     */
    public void setActionIndicator(ActionIndicator value) {
        this.actionIndicator = value;
    }

    /**
     * Gets the value of the partnerNotification property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerNotification }
     *     
     */
    public PartnerNotification getPartnerNotification() {
        return partnerNotification;
    }

    /**
     * Sets the value of the partnerNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerNotification }
     *     
     */
    public void setPartnerNotification(PartnerNotification value) {
        this.partnerNotification = value;
    }

    /**
     * Gets the value of the memoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoText() {
        return memoText;
    }

    /**
     * Sets the value of the memoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoText(String value) {
        this.memoText = value;
    }

    /**
     * Gets the value of the partnerBranded property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerBranded }
     *     
     */
    public PartnerBranded getPartnerBranded() {
        return partnerBranded;
    }

    /**
     * Sets the value of the partnerBranded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerBranded }
     *     
     */
    public void setPartnerBranded(PartnerBranded value) {
        this.partnerBranded = value;
    }

    /**
     * Gets the value of the partnerFinancialsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerFinancialsFlag }
     *     
     */
    public PartnerFinancialsFlag getPartnerFinancialsFlag() {
        return partnerFinancialsFlag;
    }

    /**
     * Sets the value of the partnerFinancialsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerFinancialsFlag }
     *     
     */
    public void setPartnerFinancialsFlag(PartnerFinancialsFlag value) {
        this.partnerFinancialsFlag = value;
    }

    /**
     * Gets the value of the cloudPricingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link CloudPricingEnabled }
     *     
     */
    public CloudPricingEnabled getCloudPricingEnabled() {
        return cloudPricingEnabled;
    }

    /**
     * Sets the value of the cloudPricingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloudPricingEnabled }
     *     
     */
    public void setCloudPricingEnabled(CloudPricingEnabled value) {
        this.cloudPricingEnabled = value;
    }

    /**
     * Gets the value of the hostedPartnerBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link HostedPartnerBuffer }
     *     
     */
    public HostedPartnerBuffer getHostedPartnerBuffer() {
        return hostedPartnerBuffer;
    }

    /**
     * Sets the value of the hostedPartnerBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostedPartnerBuffer }
     *     
     */
    public void setHostedPartnerBuffer(HostedPartnerBuffer value) {
        this.hostedPartnerBuffer = value;
    }

    /**
     * Gets the value of the idDocUploadRequired property.
     * 
     * @return
     *     possible object is
     *     {@link IdDocUploadRequired }
     *     
     */
    public IdDocUploadRequired getIdDocUploadRequired() {
        return idDocUploadRequired;
    }

    /**
     * Sets the value of the idDocUploadRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDocUploadRequired }
     *     
     */
    public void setIdDocUploadRequired(IdDocUploadRequired value) {
        this.idDocUploadRequired = value;
    }

    /**
     * Gets the value of the partnerAdvisoryNote property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerAdvisoryNote }
     *     
     */
    public PartnerAdvisoryNote getPartnerAdvisoryNote() {
        return partnerAdvisoryNote;
    }

    /**
     * Sets the value of the partnerAdvisoryNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerAdvisoryNote }
     *     
     */
    public void setPartnerAdvisoryNote(PartnerAdvisoryNote value) {
        this.partnerAdvisoryNote = value;
    }

}
