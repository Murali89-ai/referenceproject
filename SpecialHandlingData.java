
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for special_handling_data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="special_handling_data">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="item_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="operator_id" type="{http://www.westernunion.com/schema/xrsi}operator" minOccurs="0"/>
 *         <element name="site_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="term_id" type="{http://www.westernunion.com/schema/xrsi}terminal" minOccurs="0"/>
 *         <element name="spec_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="acct_no" type="{http://www.westernunion.com/schema/xrsi}agent_account" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "special_handling_data", propOrder = {
    "itemNbr",
    "dtime",
    "operatorId",
    "siteId",
    "termId",
    "specType",
    "acctNo"
})
public class SpecialHandlingData {

    @XmlElement(name = "item_nbr")
    protected String itemNbr;
    protected String dtime;
    @XmlElement(name = "operator_id")
    protected Operator operatorId;
    @XmlElement(name = "site_id")
    protected String siteId;
    @XmlElement(name = "term_id")
    protected Terminal termId;
    @XmlElement(name = "spec_type")
    protected String specType;
    @XmlElement(name = "acct_no")
    protected AgentAccount acctNo;

    /**
     * Gets the value of the itemNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNbr() {
        return itemNbr;
    }

    /**
     * Sets the value of the itemNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNbr(String value) {
        this.itemNbr = value;
    }

    /**
     * Gets the value of the dtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtime() {
        return dtime;
    }

    /**
     * Sets the value of the dtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtime(String value) {
        this.dtime = value;
    }

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperatorId(Operator value) {
        this.operatorId = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the termId property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTermId(Terminal value) {
        this.termId = value;
    }

    /**
     * Gets the value of the specType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecType() {
        return specType;
    }

    /**
     * Sets the value of the specType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecType(String value) {
        this.specType = value;
    }

    /**
     * Gets the value of the acctNo property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAccount }
     *     
     */
    public AgentAccount getAcctNo() {
        return acctNo;
    }

    /**
     * Sets the value of the acctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAccount }
     *     
     */
    public void setAcctNo(AgentAccount value) {
        this.acctNo = value;
    }

}
