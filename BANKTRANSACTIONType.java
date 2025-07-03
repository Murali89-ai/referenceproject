
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BANK_TRANSACTION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BANK_TRANSACTION_Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="OP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MTCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="FEES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BANK_TRANSACTION_Type", propOrder = {

})
public class BANKTRANSACTIONType {

    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "OP_ID")
    protected String opId;
    @XmlElement(name = "DATE")
    protected String date;
    @XmlElement(name = "TIME")
    protected String time;
    @XmlElement(name = "MTCN")
    protected String mtcn;
    @XmlElement(name = "PRINCIPAL")
    protected BigDecimal principal;
    @XmlElement(name = "FEES")
    protected BigDecimal fees;
    @XmlElement(name = "TOTAL")
    protected BigDecimal total;

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
     * Gets the value of the opId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpId() {
        return opId;
    }

    /**
     * Sets the value of the opId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpId(String value) {
        this.opId = value;
    }

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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the mtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcn() {
        return mtcn;
    }

    /**
     * Sets the value of the mtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcn(String value) {
        this.mtcn = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipal(BigDecimal value) {
        this.principal = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFees(BigDecimal value) {
        this.fees = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

}
