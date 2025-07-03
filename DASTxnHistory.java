
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASTxnHistory</b> object contains money transfer transaction history information<br>
 *             				e.g. everything between <GETTRANSACTIONHISTORY>...</GETTRANSACTIONHISTORY> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TXNHISTORY_Type", propOrder = {

})
public class DASTxnHistory {

    @XmlElement(name = "MTCN", required = true)
    protected String mtcn;
    @XmlElement(name = "FILING_DATE_MONTH", required = true)
    protected String filingDateMonth;
    @XmlElement(name = "FILING_DATE_DAY", required = true)
    protected String filingDateDay;
    @XmlElement(name = "FILING_DATE_YEAR", required = true)
    protected String filingDateYear;
    @XmlElement(name = "FILING_TIME_HOUR", required = true)
    protected String filingTimeHour;
    @XmlElement(name = "FILING_TIME_MINUTE", required = true)
    protected String filingTimeMinute;
    @XmlElement(name = "FILING_TIME_SEC", required = true)
    protected String filingTimeSec;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "TERM_ID", required = true)
    protected String termId;
    @XmlElement(name = "ORIG_COUNTRY")
    protected String origCountry;
    @XmlElement(name = "ORIG_CURRENCY")
    protected String origCurrency;
    @XmlElement(name = "DEST_COUNTRY")
    protected String destCountry;
    @XmlElement(name = "DEST_CURRENCY")
    protected String destCurrency;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "AMOUNT", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "TXN_STATUS")
    protected String txnstatus;
    @XmlElement(name = "TXN_TYPE")
    protected String txntype;
    @XmlElement(name = "DLVS_CODE")
    protected String dlvsCode;

    /**
     * Gets the value of the mtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtcn() {
        return mtcn;
    }

    /**
     * Sets the value of the mtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtcn(String value) {
        this.mtcn = value;
    }

    /**
     * Gets the value of the filingDateMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDateMonth() {
        return filingDateMonth;
    }

    /**
     * Sets the value of the filingDateMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDateMonth(String value) {
        this.filingDateMonth = value;
    }

    /**
     * Gets the value of the filingDateDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDateDay() {
        return filingDateDay;
    }

    /**
     * Sets the value of the filingDateDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDateDay(String value) {
        this.filingDateDay = value;
    }

    /**
     * Gets the value of the filingDateYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingDateYear() {
        return filingDateYear;
    }

    /**
     * Sets the value of the filingDateYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingDateYear(String value) {
        this.filingDateYear = value;
    }

    /**
     * Gets the value of the filingTimeHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingTimeHour() {
        return filingTimeHour;
    }

    /**
     * Sets the value of the filingTimeHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingTimeHour(String value) {
        this.filingTimeHour = value;
    }

    /**
     * Gets the value of the filingTimeMinute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingTimeMinute() {
        return filingTimeMinute;
    }

    /**
     * Sets the value of the filingTimeMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingTimeMinute(String value) {
        this.filingTimeMinute = value;
    }

    /**
     * Gets the value of the filingTimeSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingTimeSec() {
        return filingTimeSec;
    }

    /**
     * Sets the value of the filingTimeSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingTimeSec(String value) {
        this.filingTimeSec = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the termId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermId(String value) {
        this.termId = value;
    }

    /**
     * Gets the value of the origCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCountry() {
        return origCountry;
    }

    /**
     * Sets the value of the origCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCountry(String value) {
        this.origCountry = value;
    }

    /**
     * Gets the value of the origCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCurrency() {
        return origCurrency;
    }

    /**
     * Sets the value of the origCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCurrency(String value) {
        this.origCurrency = value;
    }

    /**
     * Gets the value of the destCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCountry() {
        return destCountry;
    }

    /**
     * Sets the value of the destCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCountry(String value) {
        this.destCountry = value;
    }

    /**
     * Gets the value of the destCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCurrency() {
        return destCurrency;
    }

    /**
     * Sets the value of the destCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCurrency(String value) {
        this.destCurrency = value;
    }

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the txnstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnstatus() {
        return txnstatus;
    }

    /**
     * Sets the value of the txnstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnstatus(String value) {
        this.txnstatus = value;
    }

    /**
     * Gets the value of the txntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxntype() {
        return txntype;
    }

    /**
     * Sets the value of the txntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxntype(String value) {
        this.txntype = value;
    }

    /**
     * Gets the value of the dlvsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvsCode() {
        return dlvsCode;
    }

    /**
     * Sets the value of the dlvsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvsCode(String value) {
        this.dlvsCode = value;
    }

}
