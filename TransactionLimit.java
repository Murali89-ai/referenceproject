
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transaction_limit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="transaction_limit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.westernunion.com/schema/xrsi}limit_type" minOccurs="0"/>
 *         <element name="limit" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="min_limit" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="max_limit" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="new_user_limit" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_limit", propOrder = {
    "type",
    "limit",
    "minLimit",
    "maxLimit",
    "newUserLimit"
})
public class TransactionLimit {

    protected String type;
    protected BigDecimal limit;
    @XmlElement(name = "min_limit")
    protected BigDecimal minLimit;
    @XmlElement(name = "max_limit")
    protected BigDecimal maxLimit;
    @XmlElement(name = "new_user_limit")
    protected BigDecimal newUserLimit;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimit(BigDecimal value) {
        this.limit = value;
    }

    /**
     * Gets the value of the minLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinLimit() {
        return minLimit;
    }

    /**
     * Sets the value of the minLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinLimit(BigDecimal value) {
        this.minLimit = value;
    }

    /**
     * Gets the value of the maxLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxLimit() {
        return maxLimit;
    }

    /**
     * Sets the value of the maxLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxLimit(BigDecimal value) {
        this.maxLimit = value;
    }

    /**
     * Gets the value of the newUserLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewUserLimit() {
        return newUserLimit;
    }

    /**
     * Sets the value of the newUserLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewUserLimit(BigDecimal value) {
        this.newUserLimit = value;
    }

}
