
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for request_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="request_transaction_base">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}transaction_base">
 *       <sequence>
 *         <element name="agent_account" type="{http://www.westernunion.com/schema/xrsi}agent_account" minOccurs="0"/>
 *         <element name="operator" type="{http://www.westernunion.com/schema/xrsi}operator" minOccurs="0"/>
 *         <element name="terminal" type="{http://www.westernunion.com/schema/xrsi}terminal" minOccurs="0"/>
 *         <element name="foreign-system-reference-no" type="{http://www.westernunion.com/schema/xrsi}reference_no" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request_transaction_base", propOrder = {
    "agentAccount",
    "operator",
    "terminal",
    "foreignSystemReferenceNo"
})
@XmlSeeAlso({
    StoreRequestTransactionBase.class,
    XRSIDasRequest.class
})
public class RequestTransactionBase
    extends TransactionBase
{

    @XmlElement(name = "agent_account")
    protected AgentAccount agentAccount;
    protected Operator operator;
    protected Terminal terminal;
    @XmlElement(name = "foreign-system-reference-no")
    protected String foreignSystemReferenceNo;

    /**
     * Gets the value of the agentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAccount }
     *     
     */
    public AgentAccount getAgentAccount() {
        return agentAccount;
    }

    /**
     * Sets the value of the agentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAccount }
     *     
     */
    public void setAgentAccount(AgentAccount value) {
        this.agentAccount = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTerminal(Terminal value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the foreignSystemReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignSystemReferenceNo() {
        return foreignSystemReferenceNo;
    }

    /**
     * Sets the value of the foreignSystemReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignSystemReferenceNo(String value) {
        this.foreignSystemReferenceNo = value;
    }

}
