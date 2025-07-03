
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="iso_curr_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="uni_curr_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <sequence maxOccurs="unbounded" minOccurs="0">
 *           <element name="Iso_curr_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *           <element name="Wu_cpc_cd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyInfo", propOrder = {
    "isoCurrCd",
    "uniCurrCd",
    "isoCurrCdAndWuCpcCd"
})
public class CurrencyInfo {

    @XmlElement(name = "iso_curr_cd")
    protected String isoCurrCd;
    @XmlElement(name = "uni_curr_cd")
    protected String uniCurrCd;
    @XmlElementRefs({
        @XmlElementRef(name = "Iso_curr_cd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Wu_cpc_cd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> isoCurrCdAndWuCpcCd;

    /**
     * Gets the value of the isoCurrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCurrCd() {
        return isoCurrCd;
    }

    /**
     * Sets the value of the isoCurrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCurrCd(String value) {
        this.isoCurrCd = value;
    }

    /**
     * Gets the value of the uniCurrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniCurrCd() {
        return uniCurrCd;
    }

    /**
     * Sets the value of the uniCurrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniCurrCd(String value) {
        this.uniCurrCd = value;
    }

    /**
     * Gets the value of the isoCurrCdAndWuCpcCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the isoCurrCdAndWuCpcCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsoCurrCdAndWuCpcCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     * @return
     *     The value of the isoCurrCdAndWuCpcCd property.
     */
    public List<JAXBElement<String>> getIsoCurrCdAndWuCpcCd() {
        if (isoCurrCdAndWuCpcCd == null) {
            isoCurrCdAndWuCpcCd = new ArrayList<>();
        }
        return this.isoCurrCdAndWuCpcCd;
    }

}
