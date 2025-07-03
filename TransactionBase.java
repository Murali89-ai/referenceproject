
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="transaction_base">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}gbs_request_transaction_base">
 *       <sequence>
 *         <element name="channel" type="{http://www.westernunion.com/schema/xrsi}channel" minOccurs="0"/>
 *         <element name="security" type="{http://www.westernunion.com/schema/xrsi}security" minOccurs="0"/>
 *         <element name="instant_notification" type="{http://www.westernunion.com/schema/xrsi}instant_notification" minOccurs="0"/>
 *         <element name="domain" type="{http://www.westernunion.com/schema/xrsi}domain" minOccurs="0"/>
 *         <element name="wallet_reference_no" type="{http://www.westernunion.com/schema/xrsi}wallet_reference_no" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_base", propOrder = {
    "channel",
    "security",
    "instantNotification",
    "domain",
    "walletReferenceNo"
})
@XmlSeeAlso({
    ReplyTransactionBase.class,
    RequestTransactionBase.class
})
public class TransactionBase
    extends GbsRequestTransactionBase
{

    protected Channel channel;
    protected Security security;
    @XmlElement(name = "instant_notification")
    protected InstantNotification instantNotification;
    protected String domain;
    @XmlElement(name = "wallet_reference_no")
    protected String walletReferenceNo;

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
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the instantNotification property.
     * 
     * @return
     *     possible object is
     *     {@link InstantNotification }
     *     
     */
    public InstantNotification getInstantNotification() {
        return instantNotification;
    }

    /**
     * Sets the value of the instantNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantNotification }
     *     
     */
    public void setInstantNotification(InstantNotification value) {
        this.instantNotification = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the walletReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletReferenceNo() {
        return walletReferenceNo;
    }

    /**
     * Sets the value of the walletReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletReferenceNo(String value) {
        this.walletReferenceNo = value;
    }

}
