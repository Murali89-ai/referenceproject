
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_referral_search_keys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="agent_referral_search_keys">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="area_code" type="{http://www.westernunion.com/schema/xrsi}city_code" minOccurs="0"/>
 *         <element name="nnx_exchange" type="{http://www.westernunion.com/schema/xrsi}nnx_exchange" minOccurs="0"/>
 *         <element name="city" type="{http://www.westernunion.com/schema/xrsi}city" minOccurs="0"/>
 *         <element name="state" type="{http://www.westernunion.com/schema/xrsi}state_province" minOccurs="0"/>
 *         <element name="time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="weekdays" type="{http://www.westernunion.com/schema/xrsi}days" minOccurs="0"/>
 *         <element name="saturday" type="{http://www.westernunion.com/schema/xrsi}days" minOccurs="0"/>
 *         <element name="sunday" type="{http://www.westernunion.com/schema/xrsi}days" minOccurs="0"/>
 *         <element name="agent_functions" type="{http://www.westernunion.com/schema/xrsi}agent_functions" minOccurs="0"/>
 *         <element name="search_level" type="{http://www.westernunion.com/schema/xrsi}search_level" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent_referral_search_keys", propOrder = {
    "areaCode",
    "nnxExchange",
    "city",
    "state",
    "time",
    "weekdays",
    "saturday",
    "sunday",
    "agentFunctions",
    "searchLevel"
})
public class AgentReferralSearchKeys {

    @XmlElement(name = "area_code")
    protected String areaCode;
    @XmlElement(name = "nnx_exchange")
    protected String nnxExchange;
    protected String city;
    protected String state;
    protected String time;
    protected String weekdays;
    protected String saturday;
    protected String sunday;
    @XmlElement(name = "agent_functions")
    protected AgentFunctions agentFunctions;
    @XmlElement(name = "search_level")
    protected String searchLevel;

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the nnxExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNnxExchange() {
        return nnxExchange;
    }

    /**
     * Sets the value of the nnxExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNnxExchange(String value) {
        this.nnxExchange = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the weekdays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekdays() {
        return weekdays;
    }

    /**
     * Sets the value of the weekdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekdays(String value) {
        this.weekdays = value;
    }

    /**
     * Gets the value of the saturday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturday() {
        return saturday;
    }

    /**
     * Sets the value of the saturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturday(String value) {
        this.saturday = value;
    }

    /**
     * Gets the value of the sunday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunday() {
        return sunday;
    }

    /**
     * Sets the value of the sunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunday(String value) {
        this.sunday = value;
    }

    /**
     * Gets the value of the agentFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link AgentFunctions }
     *     
     */
    public AgentFunctions getAgentFunctions() {
        return agentFunctions;
    }

    /**
     * Sets the value of the agentFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentFunctions }
     *     
     */
    public void setAgentFunctions(AgentFunctions value) {
        this.agentFunctions = value;
    }

    /**
     * Gets the value of the searchLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchLevel() {
        return searchLevel;
    }

    /**
     * Sets the value of the searchLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchLevel(String value) {
        this.searchLevel = value;
    }

}
