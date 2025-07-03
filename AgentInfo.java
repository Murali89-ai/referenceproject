
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgentNameType" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="AccountName" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="AccountNumber" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="AccountClass" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="AgentAddress" type="{http://www.westernunion.com/schema/xrsi}AgentAddress" minOccurs="0"/>
 *         <element name="AllowedFunctions" type="{http://www.westernunion.com/schema/xrsi}AllowedFunctions" minOccurs="0"/>
 *         <element name="databases" type="{http://www.westernunion.com/schema/xrsi}databases" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentInfo", propOrder = {
    "agentNameType",
    "accountName",
    "accountNumber",
    "accountClass",
    "agentAddress",
    "allowedFunctions",
    "databases"
})
public class AgentInfo {

    @XmlElement(name = "AgentNameType")
    protected String agentNameType;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AccountClass")
    protected String accountClass;
    @XmlElement(name = "AgentAddress")
    protected AgentAddress agentAddress;
    @XmlElement(name = "AllowedFunctions")
    protected AllowedFunctions allowedFunctions;
    protected Databases databases;

    /**
     * Gets the value of the agentNameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentNameType() {
        return agentNameType;
    }

    /**
     * Sets the value of the agentNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentNameType(String value) {
        this.agentNameType = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
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
     * Gets the value of the accountClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountClass() {
        return accountClass;
    }

    /**
     * Sets the value of the accountClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountClass(String value) {
        this.accountClass = value;
    }

    /**
     * Gets the value of the agentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAddress }
     *     
     */
    public AgentAddress getAgentAddress() {
        return agentAddress;
    }

    /**
     * Sets the value of the agentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAddress }
     *     
     */
    public void setAgentAddress(AgentAddress value) {
        this.agentAddress = value;
    }

    /**
     * Gets the value of the allowedFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedFunctions }
     *     
     */
    public AllowedFunctions getAllowedFunctions() {
        return allowedFunctions;
    }

    /**
     * Sets the value of the allowedFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedFunctions }
     *     
     */
    public void setAllowedFunctions(AllowedFunctions value) {
        this.allowedFunctions = value;
    }

    /**
     * Gets the value of the databases property.
     * 
     * @return
     *     possible object is
     *     {@link Databases }
     *     
     */
    public Databases getDatabases() {
        return databases;
    }

    /**
     * Sets the value of the databases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Databases }
     *     
     */
    public void setDatabases(Databases value) {
        this.databases = value;
    }

}
