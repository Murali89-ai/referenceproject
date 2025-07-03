
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_weekly_operation_hours complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="qqc_weekly_operation_hours">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sunday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         <element name="monday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         <element name="tuesday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         <element name="wednesday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         <element name="thursday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         <element name="friday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         <element name="saturday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *         <element name="holiday" type="{http://www.westernunion.com/schema/xrsi}qqc_operation_hours" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qqc_weekly_operation_hours", propOrder = {
    "sunday",
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "holiday"
})
public class QqcWeeklyOperationHours {

    protected QqcOperationHours sunday;
    protected QqcOperationHours monday;
    protected QqcOperationHours tuesday;
    protected QqcOperationHours wednesday;
    protected QqcOperationHours thursday;
    protected QqcOperationHours friday;
    protected QqcOperationHours saturday;
    protected QqcOperationHours holiday;

    /**
     * Gets the value of the sunday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getSunday() {
        return sunday;
    }

    /**
     * Sets the value of the sunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setSunday(QqcOperationHours value) {
        this.sunday = value;
    }

    /**
     * Gets the value of the monday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getMonday() {
        return monday;
    }

    /**
     * Sets the value of the monday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setMonday(QqcOperationHours value) {
        this.monday = value;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getTuesday() {
        return tuesday;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setTuesday(QqcOperationHours value) {
        this.tuesday = value;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getWednesday() {
        return wednesday;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setWednesday(QqcOperationHours value) {
        this.wednesday = value;
    }

    /**
     * Gets the value of the thursday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getThursday() {
        return thursday;
    }

    /**
     * Sets the value of the thursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setThursday(QqcOperationHours value) {
        this.thursday = value;
    }

    /**
     * Gets the value of the friday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getFriday() {
        return friday;
    }

    /**
     * Sets the value of the friday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setFriday(QqcOperationHours value) {
        this.friday = value;
    }

    /**
     * Gets the value of the saturday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getSaturday() {
        return saturday;
    }

    /**
     * Sets the value of the saturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setSaturday(QqcOperationHours value) {
        this.saturday = value;
    }

    /**
     * Gets the value of the holiday property.
     * 
     * @return
     *     possible object is
     *     {@link QqcOperationHours }
     *     
     */
    public QqcOperationHours getHoliday() {
        return holiday;
    }

    /**
     * Sets the value of the holiday property.
     * 
     * @param value
     *     allowed object is
     *     {@link QqcOperationHours }
     *     
     */
    public void setHoliday(QqcOperationHours value) {
        this.holiday = value;
    }

}
