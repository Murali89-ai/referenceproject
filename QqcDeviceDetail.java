
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_device_detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="qqc_device_detail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="status" type="{http://www.westernunion.com/schema/xrsi}qqc_device_status" minOccurs="0"/>
 *         <element name="route" type="{http://www.westernunion.com/schema/xrsi}qqc_device_route" minOccurs="0"/>
 *         <element name="draft_form" type="{http://www.westernunion.com/schema/xrsi}qqc_device_draft_form" minOccurs="0"/>
 *         <element name="route_type" type="{http://www.westernunion.com/schema/xrsi}qqc_device_route_type" minOccurs="0"/>
 *         <element name="last_ack_date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="total_ack" type="{http://www.westernunion.com/schema/xrsi}qqc_device_total_ack_nack" minOccurs="0"/>
 *         <element name="total_nack" type="{http://www.westernunion.com/schema/xrsi}qqc_device_total_ack_nack" minOccurs="0"/>
 *         <element name="cons_nack" type="{http://www.westernunion.com/schema/xrsi}qqc_device_total_ack_nack" minOccurs="0"/>
 *         <element name="curr_out" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="equipment_type" type="{http://www.westernunion.com/schema/xrsi}qqc_device_equipment_type" minOccurs="0"/>
 *         <element name="max_del_conn" type="{http://www.westernunion.com/schema/xrsi}qqc_device_max_del_con" minOccurs="0"/>
 *         <element name="equipment_prot" type="{http://www.westernunion.com/schema/xrsi}qqc_device_equipment_prot" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qqc_device_detail", propOrder = {
    "status",
    "route",
    "draftForm",
    "routeType",
    "lastAckDate",
    "totalAck",
    "totalNack",
    "consNack",
    "currOut",
    "equipmentType",
    "maxDelConn",
    "equipmentProt"
})
public class QqcDeviceDetail {

    protected String status;
    protected String route;
    @XmlElement(name = "draft_form")
    protected String draftForm;
    @XmlElement(name = "route_type")
    protected String routeType;
    @XmlElement(name = "last_ack_date")
    protected String lastAckDate;
    @XmlElement(name = "total_ack")
    protected String totalAck;
    @XmlElement(name = "total_nack")
    protected String totalNack;
    @XmlElement(name = "cons_nack")
    protected String consNack;
    @XmlElement(name = "curr_out")
    @XmlSchemaType(name = "string")
    protected YesNo currOut;
    @XmlElement(name = "equipment_type")
    protected String equipmentType;
    @XmlElement(name = "max_del_conn")
    protected String maxDelConn;
    @XmlElement(name = "equipment_prot")
    protected String equipmentProt;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the draftForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftForm() {
        return draftForm;
    }

    /**
     * Sets the value of the draftForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftForm(String value) {
        this.draftForm = value;
    }

    /**
     * Gets the value of the routeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteType() {
        return routeType;
    }

    /**
     * Sets the value of the routeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteType(String value) {
        this.routeType = value;
    }

    /**
     * Gets the value of the lastAckDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAckDate() {
        return lastAckDate;
    }

    /**
     * Sets the value of the lastAckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAckDate(String value) {
        this.lastAckDate = value;
    }

    /**
     * Gets the value of the totalAck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAck() {
        return totalAck;
    }

    /**
     * Sets the value of the totalAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAck(String value) {
        this.totalAck = value;
    }

    /**
     * Gets the value of the totalNack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNack() {
        return totalNack;
    }

    /**
     * Sets the value of the totalNack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNack(String value) {
        this.totalNack = value;
    }

    /**
     * Gets the value of the consNack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsNack() {
        return consNack;
    }

    /**
     * Sets the value of the consNack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsNack(String value) {
        this.consNack = value;
    }

    /**
     * Gets the value of the currOut property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCurrOut() {
        return currOut;
    }

    /**
     * Sets the value of the currOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCurrOut(YesNo value) {
        this.currOut = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the maxDelConn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDelConn() {
        return maxDelConn;
    }

    /**
     * Sets the value of the maxDelConn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDelConn(String value) {
        this.maxDelConn = value;
    }

    /**
     * Gets the value of the equipmentProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentProt() {
        return equipmentProt;
    }

    /**
     * Sets the value of the equipmentProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentProt(String value) {
        this.equipmentProt = value;
    }

}
