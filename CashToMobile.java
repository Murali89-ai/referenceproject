
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cash_to_mobile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="cash_to_mobile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sp_id_sp_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Receiving_Agent_Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_sms_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_selected_language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reciever_selected_language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="receiver_sms_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cash_to_mobile", propOrder = {
    "spIdSpName",
    "receivingAgentAccount",
    "senderSmsFlag",
    "senderSelectedLanguage",
    "recieverSelectedLanguage",
    "receiverSmsFlag"
})
public class CashToMobile {

    @XmlElement(name = "sp_id_sp_name")
    protected String spIdSpName;
    @XmlElement(name = "Receiving_Agent_Account")
    protected String receivingAgentAccount;
    @XmlElement(name = "sender_sms_flag")
    protected String senderSmsFlag;
    @XmlElement(name = "sender_selected_language")
    protected String senderSelectedLanguage;
    @XmlElement(name = "reciever_selected_language")
    protected String recieverSelectedLanguage;
    @XmlElement(name = "receiver_sms_flag")
    protected String receiverSmsFlag;

    /**
     * Gets the value of the spIdSpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpIdSpName() {
        return spIdSpName;
    }

    /**
     * Sets the value of the spIdSpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpIdSpName(String value) {
        this.spIdSpName = value;
    }

    /**
     * Gets the value of the receivingAgentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingAgentAccount() {
        return receivingAgentAccount;
    }

    /**
     * Sets the value of the receivingAgentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingAgentAccount(String value) {
        this.receivingAgentAccount = value;
    }

    /**
     * Gets the value of the senderSmsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderSmsFlag() {
        return senderSmsFlag;
    }

    /**
     * Sets the value of the senderSmsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderSmsFlag(String value) {
        this.senderSmsFlag = value;
    }

    /**
     * Gets the value of the senderSelectedLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderSelectedLanguage() {
        return senderSelectedLanguage;
    }

    /**
     * Sets the value of the senderSelectedLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderSelectedLanguage(String value) {
        this.senderSelectedLanguage = value;
    }

    /**
     * Gets the value of the recieverSelectedLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieverSelectedLanguage() {
        return recieverSelectedLanguage;
    }

    /**
     * Sets the value of the recieverSelectedLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieverSelectedLanguage(String value) {
        this.recieverSelectedLanguage = value;
    }

    /**
     * Gets the value of the receiverSmsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverSmsFlag() {
        return receiverSmsFlag;
    }

    /**
     * Sets the value of the receiverSmsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverSmsFlag(String value) {
        this.receiverSmsFlag = value;
    }

}
