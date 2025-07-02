
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additional_buffer_charges_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="additional_buffer_charges_type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="split_pay_cash_amt" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="split_pay_card_amt" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="split_pay_fixed_cash_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="split_pay_adjusted_card_amt" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additional_buffer_charges_type", propOrder = {
    "splitPayCashAmt",
    "splitPayCardAmt",
    "splitPayFixedCashFlag",
    "splitPayAdjustedCardAmt"
})
public class AdditionalBufferChargesType {

    @XmlElement(name = "split_pay_cash_amt")
    protected Long splitPayCashAmt;
    @XmlElement(name = "split_pay_card_amt")
    protected Long splitPayCardAmt;
    @XmlElement(name = "split_pay_fixed_cash_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag splitPayFixedCashFlag;
    @XmlElement(name = "split_pay_adjusted_card_amt")
    protected Long splitPayAdjustedCardAmt;

    /**
     * Gets the value of the splitPayCashAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSplitPayCashAmt() {
        return splitPayCashAmt;
    }

    /**
     * Sets the value of the splitPayCashAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSplitPayCashAmt(Long value) {
        this.splitPayCashAmt = value;
    }

    /**
     * Gets the value of the splitPayCardAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSplitPayCardAmt() {
        return splitPayCardAmt;
    }

    /**
     * Sets the value of the splitPayCardAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSplitPayCardAmt(Long value) {
        this.splitPayCardAmt = value;
    }

    /**
     * Gets the value of the splitPayFixedCashFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getSplitPayFixedCashFlag() {
        return splitPayFixedCashFlag;
    }

    /**
     * Sets the value of the splitPayFixedCashFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setSplitPayFixedCashFlag(YesNoFlag value) {
        this.splitPayFixedCashFlag = value;
    }

    /**
     * Gets the value of the splitPayAdjustedCardAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSplitPayAdjustedCardAmt() {
        return splitPayAdjustedCardAmt;
    }

    /**
     * Sets the value of the splitPayAdjustedCardAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSplitPayAdjustedCardAmt(Long value) {
        this.splitPayAdjustedCardAmt = value;
    }

}
