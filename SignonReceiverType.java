
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signon_receiver_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="signon_receiver_type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.westernunion.com/schema/xrsi}receiver_type_code" minOccurs="0"/>
 *         <element name="description" type="{http://www.westernunion.com/schema/xrsi}receiver_type_description" minOccurs="0"/>
 *         <element name="screen_code" type="{http://www.westernunion.com/schema/xrsi}receiver_screen_code" minOccurs="0"/>
 *         <element name="enrollment_rate" type="{http://www.westernunion.com/schema/xrsi}enrollment_rate" minOccurs="0"/>
 *         <element name="enroll_without_transaction" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="enroll_with_transaction" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="discount_on_first_transaction" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="display_table" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signon_receiver_type", propOrder = {
    "code",
    "description",
    "screenCode",
    "enrollmentRate",
    "enrollWithoutTransaction",
    "enrollWithTransaction",
    "discountOnFirstTransaction",
    "displayTable"
})
public class SignonReceiverType {

    protected String code;
    protected String description;
    @XmlElement(name = "screen_code")
    protected String screenCode;
    @XmlElement(name = "enrollment_rate")
    protected String enrollmentRate;
    @XmlElement(name = "enroll_without_transaction")
    @XmlSchemaType(name = "string")
    protected YesNo enrollWithoutTransaction;
    @XmlElement(name = "enroll_with_transaction")
    @XmlSchemaType(name = "string")
    protected YesNo enrollWithTransaction;
    @XmlElement(name = "discount_on_first_transaction")
    @XmlSchemaType(name = "string")
    protected YesNo discountOnFirstTransaction;
    @XmlElement(name = "display_table")
    @XmlSchemaType(name = "string")
    protected YesNo displayTable;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the screenCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenCode() {
        return screenCode;
    }

    /**
     * Sets the value of the screenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenCode(String value) {
        this.screenCode = value;
    }

    /**
     * Gets the value of the enrollmentRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentRate() {
        return enrollmentRate;
    }

    /**
     * Sets the value of the enrollmentRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentRate(String value) {
        this.enrollmentRate = value;
    }

    /**
     * Gets the value of the enrollWithoutTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getEnrollWithoutTransaction() {
        return enrollWithoutTransaction;
    }

    /**
     * Sets the value of the enrollWithoutTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setEnrollWithoutTransaction(YesNo value) {
        this.enrollWithoutTransaction = value;
    }

    /**
     * Gets the value of the enrollWithTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getEnrollWithTransaction() {
        return enrollWithTransaction;
    }

    /**
     * Sets the value of the enrollWithTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setEnrollWithTransaction(YesNo value) {
        this.enrollWithTransaction = value;
    }

    /**
     * Gets the value of the discountOnFirstTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDiscountOnFirstTransaction() {
        return discountOnFirstTransaction;
    }

    /**
     * Sets the value of the discountOnFirstTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDiscountOnFirstTransaction(YesNo value) {
        this.discountOnFirstTransaction = value;
    }

    /**
     * Gets the value of the displayTable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDisplayTable() {
        return displayTable;
    }

    /**
     * Sets the value of the displayTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDisplayTable(YesNo value) {
        this.displayTable = value;
    }

}
