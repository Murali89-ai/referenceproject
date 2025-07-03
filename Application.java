
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for application complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="application">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sw_version_no" type="{http://www.westernunion.com/schema/xrsi}count" minOccurs="0"/>
 *         <element name="account_mom_eid_number" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="pcs_terminal_id" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="pc_infrastructure" type="{http://www.westernunion.com/schema/xrsi}pc_infrastructure" minOccurs="0"/>
 *         <element name="sds_update_completion" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="security_counters" type="{http://www.westernunion.com/schema/xrsi}security_counter_details" minOccurs="0"/>
 *         <element name="security_signature" type="{http://www.westernunion.com/schema/xrsi}security_signature" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "application", propOrder = {
    "swVersionNo",
    "accountMomEidNumber",
    "pcsTerminalId",
    "pcInfrastructure",
    "sdsUpdateCompletion",
    "securityCounters",
    "securitySignature"
})
public class Application {

    @XmlElement(name = "sw_version_no")
    protected BigInteger swVersionNo;
    @XmlElement(name = "account_mom_eid_number")
    protected String accountMomEidNumber;
    @XmlElement(name = "pcs_terminal_id")
    protected String pcsTerminalId;
    @XmlElement(name = "pc_infrastructure")
    protected String pcInfrastructure;
    @XmlElement(name = "sds_update_completion")
    @XmlSchemaType(name = "string")
    protected YesNo sdsUpdateCompletion;
    @XmlElement(name = "security_counters")
    protected SecurityCounterDetails securityCounters;
    @XmlElement(name = "security_signature")
    protected String securitySignature;

    /**
     * Gets the value of the swVersionNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwVersionNo() {
        return swVersionNo;
    }

    /**
     * Sets the value of the swVersionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwVersionNo(BigInteger value) {
        this.swVersionNo = value;
    }

    /**
     * Gets the value of the accountMomEidNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMomEidNumber() {
        return accountMomEidNumber;
    }

    /**
     * Sets the value of the accountMomEidNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMomEidNumber(String value) {
        this.accountMomEidNumber = value;
    }

    /**
     * Gets the value of the pcsTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcsTerminalId() {
        return pcsTerminalId;
    }

    /**
     * Sets the value of the pcsTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcsTerminalId(String value) {
        this.pcsTerminalId = value;
    }

    /**
     * Gets the value of the pcInfrastructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcInfrastructure() {
        return pcInfrastructure;
    }

    /**
     * Sets the value of the pcInfrastructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcInfrastructure(String value) {
        this.pcInfrastructure = value;
    }

    /**
     * Gets the value of the sdsUpdateCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSdsUpdateCompletion() {
        return sdsUpdateCompletion;
    }

    /**
     * Sets the value of the sdsUpdateCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSdsUpdateCompletion(YesNo value) {
        this.sdsUpdateCompletion = value;
    }

    /**
     * Gets the value of the securityCounters property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCounterDetails }
     *     
     */
    public SecurityCounterDetails getSecurityCounters() {
        return securityCounters;
    }

    /**
     * Sets the value of the securityCounters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCounterDetails }
     *     
     */
    public void setSecurityCounters(SecurityCounterDetails value) {
        this.securityCounters = value;
    }

    /**
     * Gets the value of the securitySignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritySignature() {
        return securitySignature;
    }

    /**
     * Sets the value of the securitySignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritySignature(String value) {
        this.securitySignature = value;
    }

}
