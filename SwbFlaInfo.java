
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for swb_fla_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="swb_fla_info">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="swb_operator_id" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fla_name" type="{http://www.westernunion.com/schema/xrsi}general_name" minOccurs="0"/>
 *         <element name="password" type="{http://www.westernunion.com/schema/xrsi}password_long" minOccurs="0"/>
 *         <element name="read_privacynotice_flag" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Y"/>
 *               <enumeration value="N"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fla_certification_flag" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Y"/>
 *               <enumeration value="N"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "swb_fla_info", propOrder = {
    "swbOperatorId",
    "flaName",
    "password",
    "readPrivacynoticeFlag",
    "flaCertificationFlag"
})
public class SwbFlaInfo {

    @XmlElement(name = "swb_operator_id")
    protected String swbOperatorId;
    @XmlElement(name = "fla_name")
    protected GeneralName flaName;
    protected String password;
    @XmlElement(name = "read_privacynotice_flag")
    protected String readPrivacynoticeFlag;
    @XmlElement(name = "fla_certification_flag")
    protected String flaCertificationFlag;

    /**
     * Gets the value of the swbOperatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwbOperatorId() {
        return swbOperatorId;
    }

    /**
     * Sets the value of the swbOperatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwbOperatorId(String value) {
        this.swbOperatorId = value;
    }

    /**
     * Gets the value of the flaName property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralName }
     *     
     */
    public GeneralName getFlaName() {
        return flaName;
    }

    /**
     * Sets the value of the flaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralName }
     *     
     */
    public void setFlaName(GeneralName value) {
        this.flaName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the readPrivacynoticeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadPrivacynoticeFlag() {
        return readPrivacynoticeFlag;
    }

    /**
     * Sets the value of the readPrivacynoticeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadPrivacynoticeFlag(String value) {
        this.readPrivacynoticeFlag = value;
    }

    /**
     * Gets the value of the flaCertificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlaCertificationFlag() {
        return flaCertificationFlag;
    }

    /**
     * Sets the value of the flaCertificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaCertificationFlag(String value) {
        this.flaCertificationFlag = value;
    }

}
