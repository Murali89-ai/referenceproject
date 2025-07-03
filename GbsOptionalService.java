
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_optional_service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gbs_optional_service">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.westernunion.com/schema/xrsi}wu_product_name" minOccurs="0"/>
 *         <element name="code" type="{http://www.westernunion.com/schema/xrsi}wu_product_code" minOccurs="0"/>
 *         <element name="surcharge" type="{http://www.westernunion.com/schema/xrsi}charges" minOccurs="0"/>
 *         <element name="discount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="discounted_surcharge" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="promotion" type="{http://www.westernunion.com/schema/xrsi}channel_promotion" minOccurs="0"/>
 *         <element name="taxes" type="{http://www.westernunion.com/schema/xrsi}channel_taxes" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_optional_service", propOrder = {
    "name",
    "code",
    "surcharge",
    "discount",
    "discountedSurcharge",
    "promotion",
    "taxes"
})
public class GbsOptionalService {

    protected String name;
    protected String code;
    protected String surcharge;
    protected Long discount;
    @XmlElement(name = "discounted_surcharge")
    protected Long discountedSurcharge;
    protected ChannelPromotion promotion;
    protected ChannelTaxes taxes;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurcharge(String value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscount(Long value) {
        this.discount = value;
    }

    /**
     * Gets the value of the discountedSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountedSurcharge() {
        return discountedSurcharge;
    }

    /**
     * Sets the value of the discountedSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountedSurcharge(Long value) {
        this.discountedSurcharge = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelPromotion }
     *     
     */
    public ChannelPromotion getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelPromotion }
     *     
     */
    public void setPromotion(ChannelPromotion value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelTaxes }
     *     
     */
    public ChannelTaxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelTaxes }
     *     
     */
    public void setTaxes(ChannelTaxes value) {
        this.taxes = value;
    }

}
