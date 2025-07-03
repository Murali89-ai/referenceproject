
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ani_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ani_info">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ani" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="ani_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ani_info", propOrder = {
    "ani",
    "aniCount"
})
public class AniInfo {

    protected BigInteger ani;
    @XmlElement(name = "ani_count")
    protected BigInteger aniCount;

    /**
     * Gets the value of the ani property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAni() {
        return ani;
    }

    /**
     * Sets the value of the ani property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAni(BigInteger value) {
        this.ani = value;
    }

    /**
     * Gets the value of the aniCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAniCount() {
        return aniCount;
    }

    /**
     * Sets the value of the aniCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAniCount(BigInteger value) {
        this.aniCount = value;
    }

}
