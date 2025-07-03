
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Carrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Carrier">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rank" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="phone" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="baud_rate" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="data_bits" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="parity" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="stop_bits" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="log_pswd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="conn_time" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="retries" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carrier", propOrder = {
    "rank",
    "name",
    "phone",
    "baudRate",
    "dataBits",
    "parity",
    "stopBits",
    "logPswd",
    "connTime",
    "retries"
})
public class Carrier {

    protected String rank;
    protected String name;
    protected String phone;
    @XmlElement(name = "baud_rate")
    protected String baudRate;
    @XmlElement(name = "data_bits")
    protected String dataBits;
    protected String parity;
    @XmlElement(name = "stop_bits")
    protected String stopBits;
    @XmlElement(name = "log_pswd")
    protected String logPswd;
    @XmlElement(name = "conn_time")
    protected String connTime;
    protected String retries;

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the baudRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaudRate() {
        return baudRate;
    }

    /**
     * Sets the value of the baudRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaudRate(String value) {
        this.baudRate = value;
    }

    /**
     * Gets the value of the dataBits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataBits() {
        return dataBits;
    }

    /**
     * Sets the value of the dataBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataBits(String value) {
        this.dataBits = value;
    }

    /**
     * Gets the value of the parity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParity() {
        return parity;
    }

    /**
     * Sets the value of the parity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParity(String value) {
        this.parity = value;
    }

    /**
     * Gets the value of the stopBits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopBits() {
        return stopBits;
    }

    /**
     * Sets the value of the stopBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopBits(String value) {
        this.stopBits = value;
    }

    /**
     * Gets the value of the logPswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogPswd() {
        return logPswd;
    }

    /**
     * Sets the value of the logPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogPswd(String value) {
        this.logPswd = value;
    }

    /**
     * Gets the value of the connTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnTime() {
        return connTime;
    }

    /**
     * Sets the value of the connTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnTime(String value) {
        this.connTime = value;
    }

    /**
     * Gets the value of the retries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetries() {
        return retries;
    }

    /**
     * Sets the value of the retries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetries(String value) {
        this.retries = value;
    }

}
