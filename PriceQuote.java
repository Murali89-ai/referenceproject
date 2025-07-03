
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for price_quote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="price_quote">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="agent_account" type="{http://www.westernunion.com/schema/xrsi}agent_account" minOccurs="0"/>
 *         <element name="channel" type="{http://www.westernunion.com/schema/xrsi}channel" minOccurs="0"/>
 *         <element name="wu_product" type="{http://www.westernunion.com/schema/xrsi}wu_product" minOccurs="0"/>
 *         <element name="payment_details" type="{http://www.westernunion.com/schema/xrsi}channel_payment_details" minOccurs="0"/>
 *         <element name="client_id" type="{http://www.westernunion.com/schema/xrsi}client_record_key" minOccurs="0"/>
 *         <element name="agent_id" type="{http://www.westernunion.com/schema/xrsi}client_record_key" minOccurs="0"/>
 *         <element name="svc_indicator" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "price_quote", propOrder = {
    "agentAccount",
    "channel",
    "wuProduct",
    "paymentDetails",
    "clientId",
    "agentId",
    "svcIndicator"
})
public class PriceQuote {

    @XmlElement(name = "agent_account")
    protected AgentAccount agentAccount;
    protected Channel channel;
    @XmlElement(name = "wu_product")
    protected WuProduct wuProduct;
    @XmlElement(name = "payment_details")
    protected ChannelPaymentDetails paymentDetails;
    @XmlElement(name = "client_id")
    protected String clientId;
    @XmlElement(name = "agent_id")
    protected String agentId;
    @XmlElement(name = "svc_indicator")
    protected String svcIndicator;

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
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link Channel }
     *     
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel }
     *     
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the wuProduct property.
     * 
     * @return
     *     possible object is
     *     {@link WuProduct }
     *     
     */
    public WuProduct getWuProduct() {
        return wuProduct;
    }

    /**
     * Sets the value of the wuProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link WuProduct }
     *     
     */
    public void setWuProduct(WuProduct value) {
        this.wuProduct = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelPaymentDetails }
     *     
     */
    public ChannelPaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelPaymentDetails }
     *     
     */
    public void setPaymentDetails(ChannelPaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the svcIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcIndicator() {
        return svcIndicator;
    }

    /**
     * Sets the value of the svcIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcIndicator(String value) {
        this.svcIndicator = value;
    }

}
