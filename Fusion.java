
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="fusion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="speed_of_delivery" type="{http://www.westernunion.com/schema/xrsi}speed_of_delivery" minOccurs="0"/>
 *         <element name="fusion_screen" type="{http://www.westernunion.com/schema/xrsi}fusion_screen" minOccurs="0"/>
 *         <element name="routing" type="{http://www.westernunion.com/schema/xrsi}routing" minOccurs="0"/>
 *         <element name="fusion_status" type="{http://www.westernunion.com/schema/xrsi}fusion_status" minOccurs="0"/>
 *         <element name="account_number" type="{http://www.westernunion.com/schema/xrsi}bank_account_number" minOccurs="0"/>
 *         <element name="ap_attrib_buf" type="{http://www.westernunion.com/schema/xrsi}additional_processing_attribute_buffer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fusion", propOrder = {
    "speedOfDelivery",
    "fusionScreen",
    "routing",
    "fusionStatus",
    "accountNumber",
    "apAttribBuf"
})
public class Fusion {

    @XmlElement(name = "speed_of_delivery")
    protected SpeedOfDelivery speedOfDelivery;
    @XmlElement(name = "fusion_screen")
    @XmlSchemaType(name = "string")
    protected FusionScreen fusionScreen;
    protected Routing routing;
    @XmlElement(name = "fusion_status")
    protected String fusionStatus;
    @XmlElement(name = "account_number")
    protected String accountNumber;
    @XmlElement(name = "ap_attrib_buf")
    protected String apAttribBuf;

    /**
     * Gets the value of the speedOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedOfDelivery }
     *     
     */
    public SpeedOfDelivery getSpeedOfDelivery() {
        return speedOfDelivery;
    }

    /**
     * Sets the value of the speedOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedOfDelivery }
     *     
     */
    public void setSpeedOfDelivery(SpeedOfDelivery value) {
        this.speedOfDelivery = value;
    }

    /**
     * Gets the value of the fusionScreen property.
     * 
     * @return
     *     possible object is
     *     {@link FusionScreen }
     *     
     */
    public FusionScreen getFusionScreen() {
        return fusionScreen;
    }

    /**
     * Sets the value of the fusionScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link FusionScreen }
     *     
     */
    public void setFusionScreen(FusionScreen value) {
        this.fusionScreen = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link Routing }
     *     
     */
    public Routing getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routing }
     *     
     */
    public void setRouting(Routing value) {
        this.routing = value;
    }

    /**
     * Gets the value of the fusionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFusionStatus() {
        return fusionStatus;
    }

    /**
     * Sets the value of the fusionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFusionStatus(String value) {
        this.fusionStatus = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the apAttribBuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApAttribBuf() {
        return apAttribBuf;
    }

    /**
     * Sets the value of the apAttribBuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApAttribBuf(String value) {
        this.apAttribBuf = value;
    }

}
