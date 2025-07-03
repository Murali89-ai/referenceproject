
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="cub">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="web_cub" type="{http://www.westernunion.com/schema/xrsi}web_cub" minOccurs="0"/>
 *         <element name="cub_buffer" type="{http://www.westernunion.com/schema/xrsi}popup_buffer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cub", propOrder = {
    "webCub",
    "cubBuffer"
})
public class Cub {

    @XmlElement(name = "web_cub")
    protected WebCub webCub;
    @XmlElement(name = "cub_buffer")
    protected String cubBuffer;

    /**
     * Gets the value of the webCub property.
     * 
     * @return
     *     possible object is
     *     {@link WebCub }
     *     
     */
    public WebCub getWebCub() {
        return webCub;
    }

    /**
     * Sets the value of the webCub property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebCub }
     *     
     */
    public void setWebCub(WebCub value) {
        this.webCub = value;
    }

    /**
     * Gets the value of the cubBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubBuffer() {
        return cubBuffer;
    }

    /**
     * Sets the value of the cubBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubBuffer(String value) {
        this.cubBuffer = value;
    }

}
