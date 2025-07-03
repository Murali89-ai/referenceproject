
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for store_request_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="store_request_transaction_base">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}request_transaction_base">
 *       <sequence>
 *         <element name="remote_agent_account" type="{http://www.westernunion.com/schema/xrsi}remote_account" minOccurs="0"/>
 *         <element name="remote_operator" type="{http://www.westernunion.com/schema/xrsi}operator" minOccurs="0"/>
 *         <element name="remote_terminal" type="{http://www.westernunion.com/schema/xrsi}terminal" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "store_request_transaction_base", propOrder = {
    "remoteAgentAccount",
    "remoteOperator",
    "remoteTerminal"
})
public class StoreRequestTransactionBase
    extends RequestTransactionBase
{

    @XmlElement(name = "remote_agent_account")
    protected RemoteAccount remoteAgentAccount;
    @XmlElement(name = "remote_operator")
    protected Operator remoteOperator;
    @XmlElement(name = "remote_terminal")
    protected Terminal remoteTerminal;

    /**
     * Gets the value of the remoteAgentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteAccount }
     *     
     */
    public RemoteAccount getRemoteAgentAccount() {
        return remoteAgentAccount;
    }

    /**
     * Sets the value of the remoteAgentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteAccount }
     *     
     */
    public void setRemoteAgentAccount(RemoteAccount value) {
        this.remoteAgentAccount = value;
    }

    /**
     * Gets the value of the remoteOperator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getRemoteOperator() {
        return remoteOperator;
    }

    /**
     * Sets the value of the remoteOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setRemoteOperator(Operator value) {
        this.remoteOperator = value;
    }

    /**
     * Gets the value of the remoteTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getRemoteTerminal() {
        return remoteTerminal;
    }

    /**
     * Sets the value of the remoteTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setRemoteTerminal(Terminal value) {
        this.remoteTerminal = value;
    }

}
