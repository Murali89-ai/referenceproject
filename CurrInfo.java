
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for curr_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="curr_info">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="country_currency_info" type="{http://www.westernunion.com/schema/xrsi}country_currency_info" minOccurs="0"/>
 *         <element name="account" type="{http://www.westernunion.com/schema/xrsi}agent_account" minOccurs="0"/>
 *         <element name="send_limit1" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="pay_limit1" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="send_limit2" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="pay_limit2" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curr_info", propOrder = {
    "countryCurrencyInfo",
    "account",
    "sendLimit1",
    "payLimit1",
    "sendLimit2",
    "payLimit2",
    "template"
})
public class CurrInfo {

    @XmlElement(name = "country_currency_info")
    protected CountryCurrencyInfo countryCurrencyInfo;
    protected AgentAccount account;
    @XmlElement(name = "send_limit1")
    protected Long sendLimit1;
    @XmlElement(name = "pay_limit1")
    protected Long payLimit1;
    @XmlElement(name = "send_limit2")
    protected Long sendLimit2;
    @XmlElement(name = "pay_limit2")
    protected Long payLimit2;
    protected String template;

    /**
     * Gets the value of the countryCurrencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public CountryCurrencyInfo getCountryCurrencyInfo() {
        return countryCurrencyInfo;
    }

    /**
     * Sets the value of the countryCurrencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCurrencyInfo }
     *     
     */
    public void setCountryCurrencyInfo(CountryCurrencyInfo value) {
        this.countryCurrencyInfo = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAccount }
     *     
     */
    public AgentAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAccount }
     *     
     */
    public void setAccount(AgentAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the sendLimit1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSendLimit1() {
        return sendLimit1;
    }

    /**
     * Sets the value of the sendLimit1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSendLimit1(Long value) {
        this.sendLimit1 = value;
    }

    /**
     * Gets the value of the payLimit1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayLimit1() {
        return payLimit1;
    }

    /**
     * Sets the value of the payLimit1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayLimit1(Long value) {
        this.payLimit1 = value;
    }

    /**
     * Gets the value of the sendLimit2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSendLimit2() {
        return sendLimit2;
    }

    /**
     * Sets the value of the sendLimit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSendLimit2(Long value) {
        this.sendLimit2 = value;
    }

    /**
     * Gets the value of the payLimit2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayLimit2() {
        return payLimit2;
    }

    /**
     * Sets the value of the payLimit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayLimit2(Long value) {
        this.payLimit2 = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

}
