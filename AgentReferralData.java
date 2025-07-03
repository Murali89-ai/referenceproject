
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_referral_data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="agent_referral_data">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="menu_number" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="agent" type="{http://www.westernunion.com/schema/xrsi}agent_account" minOccurs="0"/>
 *         <element name="weekday_hours" type="{http://www.westernunion.com/schema/xrsi}hours" minOccurs="0"/>
 *         <element name="saturday_hours" type="{http://www.westernunion.com/schema/xrsi}hours" minOccurs="0"/>
 *         <element name="sunday_hours" type="{http://www.westernunion.com/schema/xrsi}hours" minOccurs="0"/>
 *         <element name="physdel_weekday_hours" type="{http://www.westernunion.com/schema/xrsi}hours" minOccurs="0"/>
 *         <element name="physdel_saturday_hours" type="{http://www.westernunion.com/schema/xrsi}hours" minOccurs="0"/>
 *         <element name="physdel_sunday_hours" type="{http://www.westernunion.com/schema/xrsi}hours" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent_referral_data", propOrder = {
    "menuNumber",
    "agent",
    "weekdayHours",
    "saturdayHours",
    "sundayHours",
    "physdelWeekdayHours",
    "physdelSaturdayHours",
    "physdelSundayHours"
})
public class AgentReferralData {

    @XmlElement(name = "menu_number")
    protected BigInteger menuNumber;
    protected AgentAccount agent;
    @XmlElement(name = "weekday_hours")
    protected String weekdayHours;
    @XmlElement(name = "saturday_hours")
    protected String saturdayHours;
    @XmlElement(name = "sunday_hours")
    protected String sundayHours;
    @XmlElement(name = "physdel_weekday_hours")
    protected String physdelWeekdayHours;
    @XmlElement(name = "physdel_saturday_hours")
    protected String physdelSaturdayHours;
    @XmlElement(name = "physdel_sunday_hours")
    protected String physdelSundayHours;

    /**
     * Gets the value of the menuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMenuNumber() {
        return menuNumber;
    }

    /**
     * Sets the value of the menuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMenuNumber(BigInteger value) {
        this.menuNumber = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAccount }
     *     
     */
    public AgentAccount getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAccount }
     *     
     */
    public void setAgent(AgentAccount value) {
        this.agent = value;
    }

    /**
     * Gets the value of the weekdayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekdayHours() {
        return weekdayHours;
    }

    /**
     * Sets the value of the weekdayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekdayHours(String value) {
        this.weekdayHours = value;
    }

    /**
     * Gets the value of the saturdayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturdayHours() {
        return saturdayHours;
    }

    /**
     * Sets the value of the saturdayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturdayHours(String value) {
        this.saturdayHours = value;
    }

    /**
     * Gets the value of the sundayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSundayHours() {
        return sundayHours;
    }

    /**
     * Sets the value of the sundayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSundayHours(String value) {
        this.sundayHours = value;
    }

    /**
     * Gets the value of the physdelWeekdayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysdelWeekdayHours() {
        return physdelWeekdayHours;
    }

    /**
     * Sets the value of the physdelWeekdayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysdelWeekdayHours(String value) {
        this.physdelWeekdayHours = value;
    }

    /**
     * Gets the value of the physdelSaturdayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysdelSaturdayHours() {
        return physdelSaturdayHours;
    }

    /**
     * Sets the value of the physdelSaturdayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysdelSaturdayHours(String value) {
        this.physdelSaturdayHours = value;
    }

    /**
     * Gets the value of the physdelSundayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysdelSundayHours() {
        return physdelSundayHours;
    }

    /**
     * Sets the value of the physdelSundayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysdelSundayHours(String value) {
        this.physdelSundayHours = value;
    }

}
