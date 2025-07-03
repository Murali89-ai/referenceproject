
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ufo_fields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ufo_fields">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ufo_source" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="ufo_cust_id" type="{http://www.westernunion.com/schema/xrsi}unisys_customer_id" minOccurs="0"/>
 *         <element name="ufo_merchant_id" type="{http://www.westernunion.com/schema/xrsi}routing_number" minOccurs="0"/>
 *         <element name="ufo_cust_rate_code" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_channel_product" type="{http://www.westernunion.com/schema/xrsi}saturn_channel_product" minOccurs="0"/>
 *         <element name="ufo_satdel_timestamp" type="{http://www.westernunion.com/schema/xrsi}date_time" minOccurs="0"/>
 *         <element name="ufo_usd_gross_amount" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_usd_principal" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_bank_card_prod" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_bank_dly_txn_cnt" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_bank_wkl_txn_cnt" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_bank_mtd_txn_cnt" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_bank_ytd_txn_cnt" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_bank_card_ind" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="ufo_bank_card_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="ufo_payee_dly_txn_cnt" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_payee_wkl_txn_cnt" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_payee_mtd_txn_cnt" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_payee_ytd_txn_cnt" type="{http://www.westernunion.com/schema/xrsi}local_amount" minOccurs="0"/>
 *         <element name="ufo_cust_txn_cmpltd" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="ufo_cust_txn_limit" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="ufo_exception_flags" type="{http://www.westernunion.com/schema/xrsi}ufo_exception_flags" minOccurs="0"/>
 *         <element name="ufo_accnt_create_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="ufo_cust_create_date" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="ufo_sender_phone_ind" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_bill_phone_ind" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_sender_name_ind" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_bill_phone_f_ind" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_payee_name_f_ind" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_fdc" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_avs" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *         <element name="ufo_cvvii" type="{http://www.westernunion.com/schema/xrsi}id_type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ufo_fields", propOrder = {
    "ufoSource",
    "ufoCustId",
    "ufoMerchantId",
    "ufoCustRateCode",
    "ufoChannelProduct",
    "ufoSatdelTimestamp",
    "ufoUsdGrossAmount",
    "ufoUsdPrincipal",
    "ufoBankCardProd",
    "ufoBankDlyTxnCnt",
    "ufoBankWklTxnCnt",
    "ufoBankMtdTxnCnt",
    "ufoBankYtdTxnCnt",
    "ufoBankCardInd",
    "ufoBankCardType",
    "ufoPayeeDlyTxnCnt",
    "ufoPayeeWklTxnCnt",
    "ufoPayeeMtdTxnCnt",
    "ufoPayeeYtdTxnCnt",
    "ufoCustTxnCmpltd",
    "ufoCustTxnLimit",
    "ufoExceptionFlags",
    "ufoAccntCreateDate",
    "ufoCustCreateDate",
    "ufoSenderPhoneInd",
    "ufoBillPhoneInd",
    "ufoSenderNameInd",
    "ufoBillPhoneFInd",
    "ufoPayeeNameFInd",
    "ufoFdc",
    "ufoAvs",
    "ufoCvvii"
})
public class UfoFields {

    @XmlElement(name = "ufo_source")
    protected String ufoSource;
    @XmlElement(name = "ufo_cust_id")
    protected String ufoCustId;
    @XmlElement(name = "ufo_merchant_id")
    protected String ufoMerchantId;
    @XmlElement(name = "ufo_cust_rate_code")
    protected String ufoCustRateCode;
    @XmlElement(name = "ufo_channel_product")
    protected String ufoChannelProduct;
    @XmlElement(name = "ufo_satdel_timestamp")
    protected String ufoSatdelTimestamp;
    @XmlElement(name = "ufo_usd_gross_amount")
    protected String ufoUsdGrossAmount;
    @XmlElement(name = "ufo_usd_principal")
    protected String ufoUsdPrincipal;
    @XmlElement(name = "ufo_bank_card_prod")
    protected String ufoBankCardProd;
    @XmlElement(name = "ufo_bank_dly_txn_cnt")
    protected String ufoBankDlyTxnCnt;
    @XmlElement(name = "ufo_bank_wkl_txn_cnt")
    protected String ufoBankWklTxnCnt;
    @XmlElement(name = "ufo_bank_mtd_txn_cnt")
    protected String ufoBankMtdTxnCnt;
    @XmlElement(name = "ufo_bank_ytd_txn_cnt")
    protected String ufoBankYtdTxnCnt;
    @XmlElement(name = "ufo_bank_card_ind")
    protected String ufoBankCardInd;
    @XmlElement(name = "ufo_bank_card_type")
    protected String ufoBankCardType;
    @XmlElement(name = "ufo_payee_dly_txn_cnt")
    protected String ufoPayeeDlyTxnCnt;
    @XmlElement(name = "ufo_payee_wkl_txn_cnt")
    protected String ufoPayeeWklTxnCnt;
    @XmlElement(name = "ufo_payee_mtd_txn_cnt")
    protected String ufoPayeeMtdTxnCnt;
    @XmlElement(name = "ufo_payee_ytd_txn_cnt")
    protected String ufoPayeeYtdTxnCnt;
    @XmlElement(name = "ufo_cust_txn_cmpltd")
    protected String ufoCustTxnCmpltd;
    @XmlElement(name = "ufo_cust_txn_limit")
    protected String ufoCustTxnLimit;
    @XmlElement(name = "ufo_exception_flags")
    protected UfoExceptionFlags ufoExceptionFlags;
    @XmlElement(name = "ufo_accnt_create_date")
    protected String ufoAccntCreateDate;
    @XmlElement(name = "ufo_cust_create_date")
    protected String ufoCustCreateDate;
    @XmlElement(name = "ufo_sender_phone_ind")
    protected String ufoSenderPhoneInd;
    @XmlElement(name = "ufo_bill_phone_ind")
    protected String ufoBillPhoneInd;
    @XmlElement(name = "ufo_sender_name_ind")
    protected String ufoSenderNameInd;
    @XmlElement(name = "ufo_bill_phone_f_ind")
    protected String ufoBillPhoneFInd;
    @XmlElement(name = "ufo_payee_name_f_ind")
    protected String ufoPayeeNameFInd;
    @XmlElement(name = "ufo_fdc")
    protected String ufoFdc;
    @XmlElement(name = "ufo_avs")
    protected String ufoAvs;
    @XmlElement(name = "ufo_cvvii")
    protected String ufoCvvii;

    /**
     * Gets the value of the ufoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoSource() {
        return ufoSource;
    }

    /**
     * Sets the value of the ufoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoSource(String value) {
        this.ufoSource = value;
    }

    /**
     * Gets the value of the ufoCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoCustId() {
        return ufoCustId;
    }

    /**
     * Sets the value of the ufoCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoCustId(String value) {
        this.ufoCustId = value;
    }

    /**
     * Gets the value of the ufoMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoMerchantId() {
        return ufoMerchantId;
    }

    /**
     * Sets the value of the ufoMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoMerchantId(String value) {
        this.ufoMerchantId = value;
    }

    /**
     * Gets the value of the ufoCustRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoCustRateCode() {
        return ufoCustRateCode;
    }

    /**
     * Sets the value of the ufoCustRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoCustRateCode(String value) {
        this.ufoCustRateCode = value;
    }

    /**
     * Gets the value of the ufoChannelProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoChannelProduct() {
        return ufoChannelProduct;
    }

    /**
     * Sets the value of the ufoChannelProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoChannelProduct(String value) {
        this.ufoChannelProduct = value;
    }

    /**
     * Gets the value of the ufoSatdelTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoSatdelTimestamp() {
        return ufoSatdelTimestamp;
    }

    /**
     * Sets the value of the ufoSatdelTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoSatdelTimestamp(String value) {
        this.ufoSatdelTimestamp = value;
    }

    /**
     * Gets the value of the ufoUsdGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoUsdGrossAmount() {
        return ufoUsdGrossAmount;
    }

    /**
     * Sets the value of the ufoUsdGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoUsdGrossAmount(String value) {
        this.ufoUsdGrossAmount = value;
    }

    /**
     * Gets the value of the ufoUsdPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoUsdPrincipal() {
        return ufoUsdPrincipal;
    }

    /**
     * Sets the value of the ufoUsdPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoUsdPrincipal(String value) {
        this.ufoUsdPrincipal = value;
    }

    /**
     * Gets the value of the ufoBankCardProd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBankCardProd() {
        return ufoBankCardProd;
    }

    /**
     * Sets the value of the ufoBankCardProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBankCardProd(String value) {
        this.ufoBankCardProd = value;
    }

    /**
     * Gets the value of the ufoBankDlyTxnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBankDlyTxnCnt() {
        return ufoBankDlyTxnCnt;
    }

    /**
     * Sets the value of the ufoBankDlyTxnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBankDlyTxnCnt(String value) {
        this.ufoBankDlyTxnCnt = value;
    }

    /**
     * Gets the value of the ufoBankWklTxnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBankWklTxnCnt() {
        return ufoBankWklTxnCnt;
    }

    /**
     * Sets the value of the ufoBankWklTxnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBankWklTxnCnt(String value) {
        this.ufoBankWklTxnCnt = value;
    }

    /**
     * Gets the value of the ufoBankMtdTxnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBankMtdTxnCnt() {
        return ufoBankMtdTxnCnt;
    }

    /**
     * Sets the value of the ufoBankMtdTxnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBankMtdTxnCnt(String value) {
        this.ufoBankMtdTxnCnt = value;
    }

    /**
     * Gets the value of the ufoBankYtdTxnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBankYtdTxnCnt() {
        return ufoBankYtdTxnCnt;
    }

    /**
     * Sets the value of the ufoBankYtdTxnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBankYtdTxnCnt(String value) {
        this.ufoBankYtdTxnCnt = value;
    }

    /**
     * Gets the value of the ufoBankCardInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBankCardInd() {
        return ufoBankCardInd;
    }

    /**
     * Sets the value of the ufoBankCardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBankCardInd(String value) {
        this.ufoBankCardInd = value;
    }

    /**
     * Gets the value of the ufoBankCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBankCardType() {
        return ufoBankCardType;
    }

    /**
     * Sets the value of the ufoBankCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBankCardType(String value) {
        this.ufoBankCardType = value;
    }

    /**
     * Gets the value of the ufoPayeeDlyTxnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoPayeeDlyTxnCnt() {
        return ufoPayeeDlyTxnCnt;
    }

    /**
     * Sets the value of the ufoPayeeDlyTxnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoPayeeDlyTxnCnt(String value) {
        this.ufoPayeeDlyTxnCnt = value;
    }

    /**
     * Gets the value of the ufoPayeeWklTxnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoPayeeWklTxnCnt() {
        return ufoPayeeWklTxnCnt;
    }

    /**
     * Sets the value of the ufoPayeeWklTxnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoPayeeWklTxnCnt(String value) {
        this.ufoPayeeWklTxnCnt = value;
    }

    /**
     * Gets the value of the ufoPayeeMtdTxnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoPayeeMtdTxnCnt() {
        return ufoPayeeMtdTxnCnt;
    }

    /**
     * Sets the value of the ufoPayeeMtdTxnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoPayeeMtdTxnCnt(String value) {
        this.ufoPayeeMtdTxnCnt = value;
    }

    /**
     * Gets the value of the ufoPayeeYtdTxnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoPayeeYtdTxnCnt() {
        return ufoPayeeYtdTxnCnt;
    }

    /**
     * Sets the value of the ufoPayeeYtdTxnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoPayeeYtdTxnCnt(String value) {
        this.ufoPayeeYtdTxnCnt = value;
    }

    /**
     * Gets the value of the ufoCustTxnCmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoCustTxnCmpltd() {
        return ufoCustTxnCmpltd;
    }

    /**
     * Sets the value of the ufoCustTxnCmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoCustTxnCmpltd(String value) {
        this.ufoCustTxnCmpltd = value;
    }

    /**
     * Gets the value of the ufoCustTxnLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoCustTxnLimit() {
        return ufoCustTxnLimit;
    }

    /**
     * Sets the value of the ufoCustTxnLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoCustTxnLimit(String value) {
        this.ufoCustTxnLimit = value;
    }

    /**
     * Gets the value of the ufoExceptionFlags property.
     * 
     * @return
     *     possible object is
     *     {@link UfoExceptionFlags }
     *     
     */
    public UfoExceptionFlags getUfoExceptionFlags() {
        return ufoExceptionFlags;
    }

    /**
     * Sets the value of the ufoExceptionFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link UfoExceptionFlags }
     *     
     */
    public void setUfoExceptionFlags(UfoExceptionFlags value) {
        this.ufoExceptionFlags = value;
    }

    /**
     * Gets the value of the ufoAccntCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoAccntCreateDate() {
        return ufoAccntCreateDate;
    }

    /**
     * Sets the value of the ufoAccntCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoAccntCreateDate(String value) {
        this.ufoAccntCreateDate = value;
    }

    /**
     * Gets the value of the ufoCustCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoCustCreateDate() {
        return ufoCustCreateDate;
    }

    /**
     * Sets the value of the ufoCustCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoCustCreateDate(String value) {
        this.ufoCustCreateDate = value;
    }

    /**
     * Gets the value of the ufoSenderPhoneInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoSenderPhoneInd() {
        return ufoSenderPhoneInd;
    }

    /**
     * Sets the value of the ufoSenderPhoneInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoSenderPhoneInd(String value) {
        this.ufoSenderPhoneInd = value;
    }

    /**
     * Gets the value of the ufoBillPhoneInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBillPhoneInd() {
        return ufoBillPhoneInd;
    }

    /**
     * Sets the value of the ufoBillPhoneInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBillPhoneInd(String value) {
        this.ufoBillPhoneInd = value;
    }

    /**
     * Gets the value of the ufoSenderNameInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoSenderNameInd() {
        return ufoSenderNameInd;
    }

    /**
     * Sets the value of the ufoSenderNameInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoSenderNameInd(String value) {
        this.ufoSenderNameInd = value;
    }

    /**
     * Gets the value of the ufoBillPhoneFInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoBillPhoneFInd() {
        return ufoBillPhoneFInd;
    }

    /**
     * Sets the value of the ufoBillPhoneFInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoBillPhoneFInd(String value) {
        this.ufoBillPhoneFInd = value;
    }

    /**
     * Gets the value of the ufoPayeeNameFInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoPayeeNameFInd() {
        return ufoPayeeNameFInd;
    }

    /**
     * Sets the value of the ufoPayeeNameFInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoPayeeNameFInd(String value) {
        this.ufoPayeeNameFInd = value;
    }

    /**
     * Gets the value of the ufoFdc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoFdc() {
        return ufoFdc;
    }

    /**
     * Sets the value of the ufoFdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoFdc(String value) {
        this.ufoFdc = value;
    }

    /**
     * Gets the value of the ufoAvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoAvs() {
        return ufoAvs;
    }

    /**
     * Sets the value of the ufoAvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoAvs(String value) {
        this.ufoAvs = value;
    }

    /**
     * Gets the value of the ufoCvvii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfoCvvii() {
        return ufoCvvii;
    }

    /**
     * Sets the value of the ufoCvvii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfoCvvii(String value) {
        this.ufoCvvii = value;
    }

}
