
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_device_block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="qqc_device_block">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="device_id" type="{http://www.westernunion.com/schema/xrsi}qqc_device_id" minOccurs="0"/>
 *         <element name="device_flag" type="{http://www.westernunion.com/schema/xrsi}device_flag" minOccurs="0"/>
 *         <element name="device_details" type="{http://www.westernunion.com/schema/xrsi}qqc_device_details" minOccurs="0"/>
 *         <element name="opration_hours" type="{http://www.westernunion.com/schema/xrsi}qqc_weekly_operation_hours" minOccurs="0"/>
 *         <element name="ignore_hours" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="timezone" type="{http://www.westernunion.com/schema/xrsi}qqc_timezone" minOccurs="0"/>
 *         <element name="dst_honored" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="clr_time_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="res_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="device_class" type="{http://www.westernunion.com/schema/xrsi}qqc_device_class" minOccurs="0"/>
 *         <element name="db_area" type="{http://www.westernunion.com/schema/xrsi}qqc_db_area" minOccurs="0"/>
 *         <element name="current_ack_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="await_delivery" type="{http://www.westernunion.com/schema/xrsi}qqc_del_await" minOccurs="0"/>
 *         <element name="timestamp_await_delivery" type="{http://www.westernunion.com/schema/xrsi}qqc_timestamp_ad" minOccurs="0"/>
 *         <element name="delivery_in_progress" type="{http://www.westernunion.com/schema/xrsi}qqc_del_ip" minOccurs="0"/>
 *         <element name="timestamp_delivery_inprogress" type="{http://www.westernunion.com/schema/xrsi}qqc_timestamp_dip" minOccurs="0"/>
 *         <element name="delivery_priority" type="{http://www.westernunion.com/schema/xrsi}qqc_delivery_priority" minOccurs="0"/>
 *         <element name="last_nak_reason" type="{http://www.westernunion.com/schema/xrsi}qqc_reason_last_nak" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qqc_device_block", propOrder = {
    "deviceId",
    "deviceFlag",
    "deviceDetails",
    "oprationHours",
    "ignoreHours",
    "timezone",
    "dstHonored",
    "clrTimeFlag",
    "resDate",
    "deviceClass",
    "dbArea",
    "currentAckDate",
    "awaitDelivery",
    "timestampAwaitDelivery",
    "deliveryInProgress",
    "timestampDeliveryInprogress",
    "deliveryPriority",
    "lastNakReason"
})
public class QqcDeviceBlock {

    @XmlElement(name = "device_id")
    protected String deviceId;
    @XmlElement(name = "device_flag")
    protected String deviceFlag;
    @XmlElement(name = "device_details")
    protected QqcDeviceDetails deviceDetails;
    @XmlElement(name = "opration_hours")
    protected QqcWeeklyOperationHours oprationHours;
    @XmlElement(name = "ignore_hours")
    @XmlSchemaType(name = "string")
    protected YesNo ignoreHours;
    protected String timezone;
    @XmlElement(name = "dst_honored")
    @XmlSchemaType(name = "string")
    protected YesNo dstHonored;
    @XmlElement(name = "clr_time_flag")
    @XmlSchemaType(name = "string")
    protected YesNo clrTimeFlag;
    @XmlElement(name = "res_date")
    protected String resDate;
    @XmlElement(name = "device_class")
    protected String deviceClass;
    @XmlElement(name = "db_area")
    protected String dbArea;
    @XmlElement(name = "current_ack_date")
    protected String currentAckDate;
    @XmlElement(name = "await_delivery")
    protected String awaitDelivery;
    @XmlElement(name = "timestamp_await_delivery")
    protected String timestampAwaitDelivery;
    @XmlElement(name = "delivery_in_progress")
    protected String deliveryInProgress;
    @XmlElement(name = "timestamp_delivery_inprogress")
    protected String timestampDeliveryInprogress;
    @XmlElement(name = "delivery_priority")
    protected String deliveryPriority;
    @XmlElement(name = "last_nak_reason")
    protected String lastNakReason;

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the deviceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFlag() {
        return deviceFlag;
    }

    /**
     * Sets the value of the deviceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFlag(String value) {
        this.deviceFlag = value;
    }

    /**
     * Gets the value of the deviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QqcDeviceDetails }
     *     
     */
    public QqcDeviceDetails getDeviceDetails() {
        return deviceDetails;
    }

    /**
     * Sets the value of the deviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcDeviceDetails }
     *     
     */
    public void setDeviceDetails(QqcDeviceDetails value) {
        this.deviceDetails = value;
    }

    /**
     * Gets the value of the oprationHours property.
     * 
     * @return
     *     possible object is
     *     {@link QqcWeeklyOperationHours }
     *     
     */
    public QqcWeeklyOperationHours getOprationHours() {
        return oprationHours;
    }

    /**
     * Sets the value of the oprationHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcWeeklyOperationHours }
     *     
     */
    public void setOprationHours(QqcWeeklyOperationHours value) {
        this.oprationHours = value;
    }

    /**
     * Gets the value of the ignoreHours property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getIgnoreHours() {
        return ignoreHours;
    }

    /**
     * Sets the value of the ignoreHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setIgnoreHours(YesNo value) {
        this.ignoreHours = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the dstHonored property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDstHonored() {
        return dstHonored;
    }

    /**
     * Sets the value of the dstHonored property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDstHonored(YesNo value) {
        this.dstHonored = value;
    }

    /**
     * Gets the value of the clrTimeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getClrTimeFlag() {
        return clrTimeFlag;
    }

    /**
     * Sets the value of the clrTimeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setClrTimeFlag(YesNo value) {
        this.clrTimeFlag = value;
    }

    /**
     * Gets the value of the resDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResDate() {
        return resDate;
    }

    /**
     * Sets the value of the resDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResDate(String value) {
        this.resDate = value;
    }

    /**
     * Gets the value of the deviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceClass() {
        return deviceClass;
    }

    /**
     * Sets the value of the deviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceClass(String value) {
        this.deviceClass = value;
    }

    /**
     * Gets the value of the dbArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbArea() {
        return dbArea;
    }

    /**
     * Sets the value of the dbArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbArea(String value) {
        this.dbArea = value;
    }

    /**
     * Gets the value of the currentAckDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAckDate() {
        return currentAckDate;
    }

    /**
     * Sets the value of the currentAckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAckDate(String value) {
        this.currentAckDate = value;
    }

    /**
     * Gets the value of the awaitDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwaitDelivery() {
        return awaitDelivery;
    }

    /**
     * Sets the value of the awaitDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwaitDelivery(String value) {
        this.awaitDelivery = value;
    }

    /**
     * Gets the value of the timestampAwaitDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampAwaitDelivery() {
        return timestampAwaitDelivery;
    }

    /**
     * Sets the value of the timestampAwaitDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampAwaitDelivery(String value) {
        this.timestampAwaitDelivery = value;
    }

    /**
     * Gets the value of the deliveryInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInProgress() {
        return deliveryInProgress;
    }

    /**
     * Sets the value of the deliveryInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInProgress(String value) {
        this.deliveryInProgress = value;
    }

    /**
     * Gets the value of the timestampDeliveryInprogress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampDeliveryInprogress() {
        return timestampDeliveryInprogress;
    }

    /**
     * Sets the value of the timestampDeliveryInprogress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampDeliveryInprogress(String value) {
        this.timestampDeliveryInprogress = value;
    }

    /**
     * Gets the value of the deliveryPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPriority() {
        return deliveryPriority;
    }

    /**
     * Sets the value of the deliveryPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPriority(String value) {
        this.deliveryPriority = value;
    }

    /**
     * Gets the value of the lastNakReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNakReason() {
        return lastNakReason;
    }

    /**
     * Sets the value of the lastNakReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNakReason(String value) {
        this.lastNakReason = value;
    }

}
