
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saturn_fields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="saturn_fields">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="saturn_exception_flag" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght12" minOccurs="0"/>
 *         <element name="saturn_rate_code" type="{http://www.westernunion.com/schema/xrsi}visa_flag" minOccurs="0"/>
 *         <element name="saturn_rate_date" type="{http://www.westernunion.com/schema/xrsi}date_time" minOccurs="0"/>
 *         <element name="saturn_create_date_account" type="{http://www.westernunion.com/schema/xrsi}date_time" minOccurs="0"/>
 *         <element name="saturn_create_date_customer" type="{http://www.westernunion.com/schema/xrsi}date_time" minOccurs="0"/>
 *         <element name="saturn_channel_product" type="{http://www.westernunion.com/schema/xrsi}saturn_channel_product" minOccurs="0"/>
 *         <element name="saturn_score" type="{http://www.westernunion.com/schema/xrsi}saturn_score" minOccurs="0"/>
 *         <element name="saturn_s_packet_flag" type="{http://www.westernunion.com/schema/xrsi}saturn_score" minOccurs="0"/>
 *         <element name="saturn_pre_auth_timestamp" type="{http://www.westernunion.com/schema/xrsi}date_time" minOccurs="0"/>
 *         <element name="sender_main_phone_number" type="{http://www.westernunion.com/schema/xrsi}mobile_number" minOccurs="0"/>
 *         <element name="saturn_blaze_response_code" type="{http://www.westernunion.com/schema/xrsi}saturn_blaze_response_code" minOccurs="0"/>
 *         <element name="saturn_resp_post_auth" type="{http://www.westernunion.com/schema/xrsi}saturn_blaze_response_code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saturn_fields", propOrder = {
    "saturnExceptionFlag",
    "saturnRateCode",
    "saturnRateDate",
    "saturnCreateDateAccount",
    "saturnCreateDateCustomer",
    "saturnChannelProduct",
    "saturnScore",
    "saturnSPacketFlag",
    "saturnPreAuthTimestamp",
    "senderMainPhoneNumber",
    "saturnBlazeResponseCode",
    "saturnRespPostAuth"
})
public class SaturnFields {

    @XmlElement(name = "saturn_exception_flag")
    protected String saturnExceptionFlag;
    @XmlElement(name = "saturn_rate_code")
    protected String saturnRateCode;
    @XmlElement(name = "saturn_rate_date")
    protected String saturnRateDate;
    @XmlElement(name = "saturn_create_date_account")
    protected String saturnCreateDateAccount;
    @XmlElement(name = "saturn_create_date_customer")
    protected String saturnCreateDateCustomer;
    @XmlElement(name = "saturn_channel_product")
    protected String saturnChannelProduct;
    @XmlElement(name = "saturn_score")
    protected String saturnScore;
    @XmlElement(name = "saturn_s_packet_flag")
    protected String saturnSPacketFlag;
    @XmlElement(name = "saturn_pre_auth_timestamp")
    protected String saturnPreAuthTimestamp;
    @XmlElement(name = "sender_main_phone_number")
    protected String senderMainPhoneNumber;
    @XmlElement(name = "saturn_blaze_response_code")
    protected String saturnBlazeResponseCode;
    @XmlElement(name = "saturn_resp_post_auth")
    protected String saturnRespPostAuth;

    /**
     * Gets the value of the saturnExceptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnExceptionFlag() {
        return saturnExceptionFlag;
    }

    /**
     * Sets the value of the saturnExceptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnExceptionFlag(String value) {
        this.saturnExceptionFlag = value;
    }

    /**
     * Gets the value of the saturnRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnRateCode() {
        return saturnRateCode;
    }

    /**
     * Sets the value of the saturnRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnRateCode(String value) {
        this.saturnRateCode = value;
    }

    /**
     * Gets the value of the saturnRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnRateDate() {
        return saturnRateDate;
    }

    /**
     * Sets the value of the saturnRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnRateDate(String value) {
        this.saturnRateDate = value;
    }

    /**
     * Gets the value of the saturnCreateDateAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnCreateDateAccount() {
        return saturnCreateDateAccount;
    }

    /**
     * Sets the value of the saturnCreateDateAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnCreateDateAccount(String value) {
        this.saturnCreateDateAccount = value;
    }

    /**
     * Gets the value of the saturnCreateDateCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnCreateDateCustomer() {
        return saturnCreateDateCustomer;
    }

    /**
     * Sets the value of the saturnCreateDateCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnCreateDateCustomer(String value) {
        this.saturnCreateDateCustomer = value;
    }

    /**
     * Gets the value of the saturnChannelProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnChannelProduct() {
        return saturnChannelProduct;
    }

    /**
     * Sets the value of the saturnChannelProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnChannelProduct(String value) {
        this.saturnChannelProduct = value;
    }

    /**
     * Gets the value of the saturnScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnScore() {
        return saturnScore;
    }

    /**
     * Sets the value of the saturnScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnScore(String value) {
        this.saturnScore = value;
    }

    /**
     * Gets the value of the saturnSPacketFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnSPacketFlag() {
        return saturnSPacketFlag;
    }

    /**
     * Sets the value of the saturnSPacketFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnSPacketFlag(String value) {
        this.saturnSPacketFlag = value;
    }

    /**
     * Gets the value of the saturnPreAuthTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnPreAuthTimestamp() {
        return saturnPreAuthTimestamp;
    }

    /**
     * Sets the value of the saturnPreAuthTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnPreAuthTimestamp(String value) {
        this.saturnPreAuthTimestamp = value;
    }

    /**
     * Gets the value of the senderMainPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMainPhoneNumber() {
        return senderMainPhoneNumber;
    }

    /**
     * Sets the value of the senderMainPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMainPhoneNumber(String value) {
        this.senderMainPhoneNumber = value;
    }

    /**
     * Gets the value of the saturnBlazeResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnBlazeResponseCode() {
        return saturnBlazeResponseCode;
    }

    /**
     * Sets the value of the saturnBlazeResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnBlazeResponseCode(String value) {
        this.saturnBlazeResponseCode = value;
    }

    /**
     * Gets the value of the saturnRespPostAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturnRespPostAuth() {
        return saturnRespPostAuth;
    }

    /**
     * Sets the value of the saturnRespPostAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturnRespPostAuth(String value) {
        this.saturnRespPostAuth = value;
    }

}
