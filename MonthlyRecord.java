
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monthly_record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="monthly_record">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="date" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="message_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="charge_back_count" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="charge_back_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monthly_record", propOrder = {
    "date",
    "messageCount",
    "amount",
    "chargeBackCount",
    "chargeBackAmount"
})
public class MonthlyRecord {

    protected String date;
    @XmlElement(name = "message_count")
    protected BigInteger messageCount;
    protected Long amount;
    @XmlElement(name = "charge_back_count")
    protected BigInteger chargeBackCount;
    @XmlElement(name = "charge_back_amount")
    protected Long chargeBackAmount;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the messageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageCount() {
        return messageCount;
    }

    /**
     * Sets the value of the messageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageCount(BigInteger value) {
        this.messageCount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the chargeBackCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeBackCount() {
        return chargeBackCount;
    }

    /**
     * Sets the value of the chargeBackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeBackCount(BigInteger value) {
        this.chargeBackCount = value;
    }

    /**
     * Gets the value of the chargeBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChargeBackAmount() {
        return chargeBackAmount;
    }

    /**
     * Sets the value of the chargeBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChargeBackAmount(Long value) {
        this.chargeBackAmount = value;
    }

}
