
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for df_fields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="df_fields">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="pds_required_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="df_transaction_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="reprint_more_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="partner_marketing_languages" type="{http://www.westernunion.com/schema/xrsi}locale_info" minOccurs="0"/>
 *         <element name="customer_preferred_language" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="2"/>
 *               <maxLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="consumer_bureau_info" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <all>
 *                   <element name="federal" type="{http://www.westernunion.com/schema/xrsi}bureau_info_federal" minOccurs="0"/>
 *                   <element name="state" type="{http://www.westernunion.com/schema/xrsi}bureau_info_state" minOccurs="0"/>
 *                 </all>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="pay_side_tax" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="pay_side_charges" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="amount_to_receiver" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="available_for_pickup" type="{http://www.westernunion.com/schema/xrsi}date" minOccurs="0"/>
 *         <element name="time_available" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="country_timezone" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="delay_hours" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="delivery_service_name" type="{http://www.westernunion.com/schema/xrsi}spare" minOccurs="0"/>
 *         <element name="available_for_pickup_est" type="{http://www.westernunion.com/schema/xrsi}est" minOccurs="0"/>
 *         <element name="payout_amount_LRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payout_amount_USD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="exchange_rate_LRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="exchange_rate_USD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "df_fields", propOrder = {

})
public class DfFields {

    @XmlElement(name = "pds_required_flag")
    @XmlSchemaType(name = "string")
    protected YesNo pdsRequiredFlag;
    @XmlElement(name = "df_transaction_flag")
    @XmlSchemaType(name = "string")
    protected YesNo dfTransactionFlag;
    @XmlElement(name = "reprint_more_flag")
    @XmlSchemaType(name = "string")
    protected YesNo reprintMoreFlag;
    @XmlElement(name = "partner_marketing_languages")
    protected LocaleInfo partnerMarketingLanguages;
    @XmlElement(name = "customer_preferred_language")
    protected String customerPreferredLanguage;
    @XmlElement(name = "consumer_bureau_info")
    protected ConsumerBureauInfo consumerBureauInfo;
    @XmlElement(name = "pay_side_tax")
    protected BigDecimal paySideTax;
    @XmlElement(name = "pay_side_charges")
    protected BigDecimal paySideCharges;
    @XmlElement(name = "amount_to_receiver")
    protected BigDecimal amountToReceiver;
    @XmlElement(name = "available_for_pickup")
    protected String availableForPickup;
    @XmlElement(name = "time_available")
    protected String timeAvailable;
    @XmlElement(name = "country_timezone")
    protected String countryTimezone;
    @XmlElement(name = "delay_hours")
    protected String delayHours;
    @XmlElement(name = "delivery_service_name")
    protected String deliveryServiceName;
    @XmlElement(name = "available_for_pickup_est")
    protected String availableForPickupEst;
    @XmlElement(name = "payout_amount_LRD")
    protected String payoutAmountLRD;
    @XmlElement(name = "payout_amount_USD")
    protected String payoutAmountUSD;
    @XmlElement(name = "exchange_rate_LRD")
    protected String exchangeRateLRD;
    @XmlElement(name = "exchange_rate_USD")
    protected String exchangeRateUSD;

    /**
     * Gets the value of the pdsRequiredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPdsRequiredFlag() {
        return pdsRequiredFlag;
    }

    /**
     * Sets the value of the pdsRequiredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPdsRequiredFlag(YesNo value) {
        this.pdsRequiredFlag = value;
    }

    /**
     * Gets the value of the dfTransactionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDfTransactionFlag() {
        return dfTransactionFlag;
    }

    /**
     * Sets the value of the dfTransactionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDfTransactionFlag(YesNo value) {
        this.dfTransactionFlag = value;
    }

    /**
     * Gets the value of the reprintMoreFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getReprintMoreFlag() {
        return reprintMoreFlag;
    }

    /**
     * Sets the value of the reprintMoreFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setReprintMoreFlag(YesNo value) {
        this.reprintMoreFlag = value;
    }

    /**
     * Gets the value of the partnerMarketingLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleInfo }
     *     
     */
    public LocaleInfo getPartnerMarketingLanguages() {
        return partnerMarketingLanguages;
    }

    /**
     * Sets the value of the partnerMarketingLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleInfo }
     *     
     */
    public void setPartnerMarketingLanguages(LocaleInfo value) {
        this.partnerMarketingLanguages = value;
    }

    /**
     * Gets the value of the customerPreferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPreferredLanguage() {
        return customerPreferredLanguage;
    }

    /**
     * Sets the value of the customerPreferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPreferredLanguage(String value) {
        this.customerPreferredLanguage = value;
    }

    /**
     * Gets the value of the consumerBureauInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerBureauInfo }
     *     
     */
    public ConsumerBureauInfo getConsumerBureauInfo() {
        return consumerBureauInfo;
    }

    /**
     * Sets the value of the consumerBureauInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerBureauInfo }
     *     
     */
    public void setConsumerBureauInfo(ConsumerBureauInfo value) {
        this.consumerBureauInfo = value;
    }

    /**
     * Gets the value of the paySideTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaySideTax() {
        return paySideTax;
    }

    /**
     * Sets the value of the paySideTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaySideTax(BigDecimal value) {
        this.paySideTax = value;
    }

    /**
     * Gets the value of the paySideCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaySideCharges() {
        return paySideCharges;
    }

    /**
     * Sets the value of the paySideCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaySideCharges(BigDecimal value) {
        this.paySideCharges = value;
    }

    /**
     * Gets the value of the amountToReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountToReceiver() {
        return amountToReceiver;
    }

    /**
     * Sets the value of the amountToReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountToReceiver(BigDecimal value) {
        this.amountToReceiver = value;
    }

    /**
     * Gets the value of the availableForPickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableForPickup() {
        return availableForPickup;
    }

    /**
     * Sets the value of the availableForPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableForPickup(String value) {
        this.availableForPickup = value;
    }

    /**
     * Gets the value of the timeAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAvailable() {
        return timeAvailable;
    }

    /**
     * Sets the value of the timeAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAvailable(String value) {
        this.timeAvailable = value;
    }

    /**
     * Gets the value of the countryTimezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTimezone() {
        return countryTimezone;
    }

    /**
     * Sets the value of the countryTimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTimezone(String value) {
        this.countryTimezone = value;
    }

    /**
     * Gets the value of the delayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayHours() {
        return delayHours;
    }

    /**
     * Sets the value of the delayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayHours(String value) {
        this.delayHours = value;
    }

    /**
     * Gets the value of the deliveryServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryServiceName() {
        return deliveryServiceName;
    }

    /**
     * Sets the value of the deliveryServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryServiceName(String value) {
        this.deliveryServiceName = value;
    }

    /**
     * Gets the value of the availableForPickupEst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableForPickupEst() {
        return availableForPickupEst;
    }

    /**
     * Sets the value of the availableForPickupEst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableForPickupEst(String value) {
        this.availableForPickupEst = value;
    }

    /**
     * Gets the value of the payoutAmountLRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutAmountLRD() {
        return payoutAmountLRD;
    }

    /**
     * Sets the value of the payoutAmountLRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutAmountLRD(String value) {
        this.payoutAmountLRD = value;
    }

    /**
     * Gets the value of the payoutAmountUSD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutAmountUSD() {
        return payoutAmountUSD;
    }

    /**
     * Sets the value of the payoutAmountUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutAmountUSD(String value) {
        this.payoutAmountUSD = value;
    }

    /**
     * Gets the value of the exchangeRateLRD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateLRD() {
        return exchangeRateLRD;
    }

    /**
     * Sets the value of the exchangeRateLRD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateLRD(String value) {
        this.exchangeRateLRD = value;
    }

    /**
     * Gets the value of the exchangeRateUSD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateUSD() {
        return exchangeRateUSD;
    }

    /**
     * Sets the value of the exchangeRateUSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateUSD(String value) {
        this.exchangeRateUSD = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <all>
     *         <element name="federal" type="{http://www.westernunion.com/schema/xrsi}bureau_info_federal" minOccurs="0"/>
     *         <element name="state" type="{http://www.westernunion.com/schema/xrsi}bureau_info_state" minOccurs="0"/>
     *       </all>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ConsumerBureauInfo {

        protected BureauInfoFederal federal;
        protected BureauInfoState state;

        /**
         * Gets the value of the federal property.
         * 
         * @return
         *     possible object is
         *     {@link BureauInfoFederal }
         *     
         */
        public BureauInfoFederal getFederal() {
            return federal;
        }

        /**
         * Sets the value of the federal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BureauInfoFederal }
         *     
         */
        public void setFederal(BureauInfoFederal value) {
            this.federal = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link BureauInfoState }
         *     
         */
        public BureauInfoState getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link BureauInfoState }
         *     
         */
        public void setState(BureauInfoState value) {
            this.state = value;
        }

    }

}
