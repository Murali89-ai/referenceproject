
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_functions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="agent_functions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="receive_money_order_allowed" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="pay_money_order_allowed" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="receive_message_allowed" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="physical_delivery_allowed" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="flash_cash_allowed" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="special_promo_allowed" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="favorite_agent_allowed" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="send_money_order_allowed" type="{http://www.westernunion.com/schema/xrsi}allow_function" minOccurs="0"/>
 *         <element name="spare1" type="{http://www.westernunion.com/schema/xrsi}spare1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent_functions", propOrder = {
    "receiveMoneyOrderAllowed",
    "payMoneyOrderAllowed",
    "receiveMessageAllowed",
    "physicalDeliveryAllowed",
    "flashCashAllowed",
    "specialPromoAllowed",
    "favoriteAgentAllowed",
    "sendMoneyOrderAllowed",
    "spare1"
})
public class AgentFunctions {

    @XmlElement(name = "receive_money_order_allowed")
    protected String receiveMoneyOrderAllowed;
    @XmlElement(name = "pay_money_order_allowed")
    protected String payMoneyOrderAllowed;
    @XmlElement(name = "receive_message_allowed")
    protected String receiveMessageAllowed;
    @XmlElement(name = "physical_delivery_allowed")
    protected String physicalDeliveryAllowed;
    @XmlElement(name = "flash_cash_allowed")
    protected String flashCashAllowed;
    @XmlElement(name = "special_promo_allowed")
    protected String specialPromoAllowed;
    @XmlElement(name = "favorite_agent_allowed")
    protected String favoriteAgentAllowed;
    @XmlElement(name = "send_money_order_allowed")
    protected String sendMoneyOrderAllowed;
    protected String spare1;

    /**
     * Gets the value of the receiveMoneyOrderAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveMoneyOrderAllowed() {
        return receiveMoneyOrderAllowed;
    }

    /**
     * Sets the value of the receiveMoneyOrderAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveMoneyOrderAllowed(String value) {
        this.receiveMoneyOrderAllowed = value;
    }

    /**
     * Gets the value of the payMoneyOrderAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMoneyOrderAllowed() {
        return payMoneyOrderAllowed;
    }

    /**
     * Sets the value of the payMoneyOrderAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMoneyOrderAllowed(String value) {
        this.payMoneyOrderAllowed = value;
    }

    /**
     * Gets the value of the receiveMessageAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveMessageAllowed() {
        return receiveMessageAllowed;
    }

    /**
     * Sets the value of the receiveMessageAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveMessageAllowed(String value) {
        this.receiveMessageAllowed = value;
    }

    /**
     * Gets the value of the physicalDeliveryAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalDeliveryAllowed() {
        return physicalDeliveryAllowed;
    }

    /**
     * Sets the value of the physicalDeliveryAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalDeliveryAllowed(String value) {
        this.physicalDeliveryAllowed = value;
    }

    /**
     * Gets the value of the flashCashAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashCashAllowed() {
        return flashCashAllowed;
    }

    /**
     * Sets the value of the flashCashAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashCashAllowed(String value) {
        this.flashCashAllowed = value;
    }

    /**
     * Gets the value of the specialPromoAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPromoAllowed() {
        return specialPromoAllowed;
    }

    /**
     * Sets the value of the specialPromoAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPromoAllowed(String value) {
        this.specialPromoAllowed = value;
    }

    /**
     * Gets the value of the favoriteAgentAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavoriteAgentAllowed() {
        return favoriteAgentAllowed;
    }

    /**
     * Sets the value of the favoriteAgentAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavoriteAgentAllowed(String value) {
        this.favoriteAgentAllowed = value;
    }

    /**
     * Gets the value of the sendMoneyOrderAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMoneyOrderAllowed() {
        return sendMoneyOrderAllowed;
    }

    /**
     * Sets the value of the sendMoneyOrderAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMoneyOrderAllowed(String value) {
        this.sendMoneyOrderAllowed = value;
    }

    /**
     * Gets the value of the spare1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare1() {
        return spare1;
    }

    /**
     * Sets the value of the spare1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare1(String value) {
        this.spare1 = value;
    }

}
