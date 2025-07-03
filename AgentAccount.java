
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="agent_account">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="general_name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         <element name="address" type="{http://www.westernunion.com/schema/xrsi}address" minOccurs="0"/>
 *         <element name="code" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="defined_data" maxOccurs="3" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="99"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="authorization_code" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="5"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="authorization_text" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="73"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="databases" type="{http://www.westernunion.com/schema/xrsi}databases" minOccurs="0"/>
 *         <element name="phone" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         <element name="phone2" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="contact_name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         <element name="contact_phone" type="{http://www.westernunion.com/schema/xrsi}phone" minOccurs="0"/>
 *         <element name="memo" type="{http://www.westernunion.com/schema/xrsi}agent_memo" minOccurs="0"/>
 *         <element name="network_id" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="agent_account_tables" type="{http://www.westernunion.com/schema/xrsi}table_names" minOccurs="0"/>
 *         <element name="terminal_id" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent_account", propOrder = {
    "id",
    "generalName",
    "address",
    "code",
    "definedData",
    "authorizationCode",
    "authorizationText",
    "databases",
    "phone",
    "phone2",
    "status",
    "contactName",
    "contactPhone",
    "memo",
    "networkId",
    "agentAccountTables",
    "terminalId"
})
@XmlSeeAlso({
    RemoteAccount.class
})
public class AgentAccount {

    protected String id;
    @XmlElement(name = "general_name")
    protected GeneralName generalName;
    protected Address address;
    protected String code;
    @XmlElement(name = "defined_data")
    protected List<String> definedData;
    @XmlElement(name = "authorization_code")
    protected String authorizationCode;
    @XmlElement(name = "authorization_text")
    protected String authorizationText;
    protected Databases databases;
    protected String phone;
    protected String phone2;
    protected String status;
    @XmlElement(name = "contact_name")
    protected GeneralName contactName;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    protected String memo;
    @XmlElement(name = "network_id")
    protected String networkId;
    @XmlElement(name = "agent_account_tables")
    protected TableNames agentAccountTables;
    @XmlElement(name = "terminal_id")
    protected String terminalId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the generalName property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getGeneralName() {
        return generalName;
    }

    /**
     * Sets the value of the generalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setGeneralName(GeneralName value) {
        this.generalName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the definedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the definedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the definedData property.
     */
    public List<String> getDefinedData() {
        if (definedData == null) {
            definedData = new ArrayList<>();
        }
        return this.definedData;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the authorizationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationText() {
        return authorizationText;
    }

    /**
     * Sets the value of the authorizationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationText(String value) {
        this.authorizationText = value;
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
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setContactName(GeneralName value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the agentAccountTables property.
     * 
     * @return
     *     possible object is
     *     {@link TableNames }
     *     
     */
    public TableNames getAgentAccountTables() {
        return agentAccountTables;
    }

    /**
     * Sets the value of the agentAccountTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableNames }
     *     
     */
    public void setAgentAccountTables(TableNames value) {
        this.agentAccountTables = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

}
