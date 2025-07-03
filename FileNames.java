
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for file_names complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="file_names">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ddl" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="16"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="error_code" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="mexican_db" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
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
@XmlType(name = "file_names", propOrder = {
    "ddl",
    "errorCode",
    "mexicanDb"
})
public class FileNames {

    protected String ddl;
    @XmlElement(name = "error_code")
    protected String errorCode;
    @XmlElement(name = "mexican_db")
    protected String mexicanDb;

    /**
     * Gets the value of the ddl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdl() {
        return ddl;
    }

    /**
     * Sets the value of the ddl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdl(String value) {
        this.ddl = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the mexicanDb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMexicanDb() {
        return mexicanDb;
    }

    /**
     * Sets the value of the mexicanDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMexicanDb(String value) {
        this.mexicanDb = value;
    }

}
