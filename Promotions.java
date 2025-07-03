
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for promotions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="promotions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="promo_code_description" type="{http://www.westernunion.com/schema/xrsi}promo_code_description" minOccurs="0"/>
 *         <element name="promo_sequence_no" type="{http://www.westernunion.com/schema/xrsi}promo_sequence_no" minOccurs="0"/>
 *         <element name="promo_name" type="{http://www.westernunion.com/schema/xrsi}promo_name" minOccurs="0"/>
 *         <element name="promo_message" type="{http://www.westernunion.com/schema/xrsi}message" minOccurs="0"/>
 *         <element name="promo_discount_amount" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="coupons_promotions" type="{http://www.westernunion.com/schema/xrsi}coupons_promotions" minOccurs="0"/>
 *         <element name="redemption_type" type="{http://www.westernunion.com/schema/xrsi}redemption_type" minOccurs="0"/>
 *         <element name="redemption_value" type="{http://www.westernunion.com/schema/xrsi}redemption_value" minOccurs="0"/>
 *         <element name="promotion_error" type="{http://www.westernunion.com/schema/xrsi}promotion_error" minOccurs="0"/>
 *         <element name="apply_discount_for_promo" type="{http://www.westernunion.com/schema/xrsi}apply_discount_for_promo" minOccurs="0"/>
 *         <element name="promo_text" type="{http://www.westernunion.com/schema/xrsi}promo_text" maxOccurs="6" minOccurs="0"/>
 *         <element name="sender_promo_code" type="{http://www.westernunion.com/schema/xrsi}sender_promo_code" minOccurs="0"/>
 *         <element name="promotion_description" type="{http://www.westernunion.com/schema/xrsi}promotion_description" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotions", propOrder = {
    "promoCodeDescription",
    "promoSequenceNo",
    "promoName",
    "promoMessage",
    "promoDiscountAmount",
    "couponsPromotions",
    "redemptionType",
    "redemptionValue",
    "promotionError",
    "applyDiscountForPromo",
    "promoText",
    "senderPromoCode",
    "promotionDescription"
})
public class Promotions {

    @XmlElement(name = "promo_code_description")
    protected String promoCodeDescription;
    @XmlElement(name = "promo_sequence_no")
    protected String promoSequenceNo;
    @XmlElement(name = "promo_name")
    protected String promoName;
    @XmlElement(name = "promo_message")
    protected String promoMessage;
    @XmlElement(name = "promo_discount_amount")
    protected Long promoDiscountAmount;
    @XmlElement(name = "coupons_promotions")
    protected String couponsPromotions;
    @XmlElement(name = "redemption_type")
    protected String redemptionType;
    @XmlElement(name = "redemption_value")
    protected Long redemptionValue;
    @XmlElement(name = "promotion_error")
    protected String promotionError;
    @XmlElement(name = "apply_discount_for_promo")
    @XmlSchemaType(name = "string")
    protected YesNo applyDiscountForPromo;
    @XmlElement(name = "promo_text")
    protected List<String> promoText;
    @XmlElement(name = "sender_promo_code")
    protected String senderPromoCode;
    @XmlElement(name = "promotion_description")
    protected String promotionDescription;

    /**
     * Gets the value of the promoCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCodeDescription() {
        return promoCodeDescription;
    }

    /**
     * Sets the value of the promoCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCodeDescription(String value) {
        this.promoCodeDescription = value;
    }

    /**
     * Gets the value of the promoSequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoSequenceNo() {
        return promoSequenceNo;
    }

    /**
     * Sets the value of the promoSequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoSequenceNo(String value) {
        this.promoSequenceNo = value;
    }

    /**
     * Gets the value of the promoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * Sets the value of the promoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoName(String value) {
        this.promoName = value;
    }

    /**
     * Gets the value of the promoMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoMessage() {
        return promoMessage;
    }

    /**
     * Sets the value of the promoMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoMessage(String value) {
        this.promoMessage = value;
    }

    /**
     * Gets the value of the promoDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromoDiscountAmount() {
        return promoDiscountAmount;
    }

    /**
     * Sets the value of the promoDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromoDiscountAmount(Long value) {
        this.promoDiscountAmount = value;
    }

    /**
     * Gets the value of the couponsPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponsPromotions() {
        return couponsPromotions;
    }

    /**
     * Sets the value of the couponsPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponsPromotions(String value) {
        this.couponsPromotions = value;
    }

    /**
     * Gets the value of the redemptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionType() {
        return redemptionType;
    }

    /**
     * Sets the value of the redemptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionType(String value) {
        this.redemptionType = value;
    }

    /**
     * Gets the value of the redemptionValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRedemptionValue() {
        return redemptionValue;
    }

    /**
     * Sets the value of the redemptionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRedemptionValue(Long value) {
        this.redemptionValue = value;
    }

    /**
     * Gets the value of the promotionError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionError() {
        return promotionError;
    }

    /**
     * Sets the value of the promotionError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionError(String value) {
        this.promotionError = value;
    }

    /**
     * Gets the value of the applyDiscountForPromo property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getApplyDiscountForPromo() {
        return applyDiscountForPromo;
    }

    /**
     * Sets the value of the applyDiscountForPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setApplyDiscountForPromo(YesNo value) {
        this.applyDiscountForPromo = value;
    }

    /**
     * Gets the value of the promoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the promoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromoText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the promoText property.
     */
    public List<String> getPromoText() {
        if (promoText == null) {
            promoText = new ArrayList<>();
        }
        return this.promoText;
    }

    /**
     * Gets the value of the senderPromoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPromoCode() {
        return senderPromoCode;
    }

    /**
     * Sets the value of the senderPromoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPromoCode(String value) {
        this.senderPromoCode = value;
    }

    /**
     * Gets the value of the promotionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionDescription() {
        return promotionDescription;
    }

    /**
     * Sets the value of the promotionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionDescription(String value) {
        this.promotionDescription = value;
    }

}
