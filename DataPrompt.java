
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for data_prompt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="data_prompt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.westernunion.com/schema/xrsi}data_prompt_id" minOccurs="0"/>
 *         <choice>
 *           <element name="response" type="{http://www.westernunion.com/schema/xrsi}data_prompt_response" minOccurs="0"/>
 *           <element name="ocr_data" type="{http://www.westernunion.com/schema/xrsi}ocr_data" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_prompt", propOrder = {
    "id",
    "response",
    "ocrData"
})
public class DataPrompt {

    protected String id;
    protected String response;
    @XmlElement(name = "ocr_data")
    protected String ocrData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * Gets the value of the ocrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcrData() {
        return ocrData;
    }

    /**
     * Sets the value of the ocrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcrData(String value) {
        this.ocrData = value;
    }

}
