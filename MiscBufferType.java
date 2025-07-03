
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for misc_buffer_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="misc_buffer_type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sender_pc_source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_last_chg_src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_del_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_issue_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="receiver_pc_source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="receiver_last_chg_src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="receiver_expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_expire_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_addr_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_class_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sender_market_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="receiver_no_send" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="last_modification_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cash_amt_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         <element name="card_amt_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         <element name="prepaid_card_no" type="{http://www.westernunion.com/schema/xrsi}wu_prepaid_card_number" minOccurs="0"/>
 *         <element name="qqc_receiver_name" type="{http://www.westernunion.com/schema/xrsi}qp_company_name" minOccurs="0"/>
 *         <element name="split_pay_date_time" type="{http://www.westernunion.com/schema/xrsi}split_pay_date_time" minOccurs="0"/>
 *         <element name="payee_name" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="split_pay_mismatch_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "misc_buffer_type", propOrder = {
    "senderPcSource",
    "senderLastChgSrc",
    "senderDelCode",
    "senderIssueStatus",
    "receiverPcSource",
    "receiverLastChgSrc",
    "receiverExpireDate",
    "senderExpireDate",
    "senderAddrFlag",
    "senderClassCode",
    "senderMarketCode",
    "receiverNoSend",
    "lastModificationTime",
    "cashAmtMtcn",
    "cardAmtMtcn",
    "prepaidCardNo",
    "qqcReceiverName",
    "splitPayDateTime",
    "payeeName",
    "splitPayMismatchFlag"
})
public class MiscBufferType {

    @XmlElement(name = "sender_pc_source")
    protected String senderPcSource;
    @XmlElement(name = "sender_last_chg_src")
    protected String senderLastChgSrc;
    @XmlElement(name = "sender_del_code")
    protected String senderDelCode;
    @XmlElement(name = "sender_issue_status")
    protected String senderIssueStatus;
    @XmlElement(name = "receiver_pc_source")
    protected String receiverPcSource;
    @XmlElement(name = "receiver_last_chg_src")
    protected String receiverLastChgSrc;
    @XmlElement(name = "receiver_expire_date")
    protected String receiverExpireDate;
    @XmlElement(name = "sender_expire_date")
    protected String senderExpireDate;
    @XmlElement(name = "sender_addr_flag")
    protected String senderAddrFlag;
    @XmlElement(name = "sender_class_code")
    protected String senderClassCode;
    @XmlElement(name = "sender_market_code")
    protected String senderMarketCode;
    @XmlElement(name = "receiver_no_send")
    protected String receiverNoSend;
    @XmlElement(name = "last_modification_time")
    protected String lastModificationTime;
    @XmlElement(name = "cash_amt_mtcn")
    protected String cashAmtMtcn;
    @XmlElement(name = "card_amt_mtcn")
    protected String cardAmtMtcn;
    @XmlElement(name = "prepaid_card_no")
    protected String prepaidCardNo;
    @XmlElement(name = "qqc_receiver_name")
    protected String qqcReceiverName;
    @XmlElement(name = "split_pay_date_time")
    protected String splitPayDateTime;
    @XmlElement(name = "payee_name")
    protected String payeeName;
    @XmlElement(name = "split_pay_mismatch_flag")
    @XmlSchemaType(name = "string")
    protected YesNo splitPayMismatchFlag;

    /**
     * Gets the value of the senderPcSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPcSource() {
        return senderPcSource;
    }

    /**
     * Sets the value of the senderPcSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPcSource(String value) {
        this.senderPcSource = value;
    }

    /**
     * Gets the value of the senderLastChgSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderLastChgSrc() {
        return senderLastChgSrc;
    }

    /**
     * Sets the value of the senderLastChgSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderLastChgSrc(String value) {
        this.senderLastChgSrc = value;
    }

    /**
     * Gets the value of the senderDelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderDelCode() {
        return senderDelCode;
    }

    /**
     * Sets the value of the senderDelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderDelCode(String value) {
        this.senderDelCode = value;
    }

    /**
     * Gets the value of the senderIssueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderIssueStatus() {
        return senderIssueStatus;
    }

    /**
     * Sets the value of the senderIssueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderIssueStatus(String value) {
        this.senderIssueStatus = value;
    }

    /**
     * Gets the value of the receiverPcSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPcSource() {
        return receiverPcSource;
    }

    /**
     * Sets the value of the receiverPcSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPcSource(String value) {
        this.receiverPcSource = value;
    }

    /**
     * Gets the value of the receiverLastChgSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverLastChgSrc() {
        return receiverLastChgSrc;
    }

    /**
     * Sets the value of the receiverLastChgSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverLastChgSrc(String value) {
        this.receiverLastChgSrc = value;
    }

    /**
     * Gets the value of the receiverExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverExpireDate() {
        return receiverExpireDate;
    }

    /**
     * Sets the value of the receiverExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverExpireDate(String value) {
        this.receiverExpireDate = value;
    }

    /**
     * Gets the value of the senderExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderExpireDate() {
        return senderExpireDate;
    }

    /**
     * Sets the value of the senderExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderExpireDate(String value) {
        this.senderExpireDate = value;
    }

    /**
     * Gets the value of the senderAddrFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddrFlag() {
        return senderAddrFlag;
    }

    /**
     * Sets the value of the senderAddrFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddrFlag(String value) {
        this.senderAddrFlag = value;
    }

    /**
     * Gets the value of the senderClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderClassCode() {
        return senderClassCode;
    }

    /**
     * Sets the value of the senderClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderClassCode(String value) {
        this.senderClassCode = value;
    }

    /**
     * Gets the value of the senderMarketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMarketCode() {
        return senderMarketCode;
    }

    /**
     * Sets the value of the senderMarketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMarketCode(String value) {
        this.senderMarketCode = value;
    }

    /**
     * Gets the value of the receiverNoSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverNoSend() {
        return receiverNoSend;
    }

    /**
     * Sets the value of the receiverNoSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverNoSend(String value) {
        this.receiverNoSend = value;
    }

    /**
     * Gets the value of the lastModificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModificationTime() {
        return lastModificationTime;
    }

    /**
     * Sets the value of the lastModificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationTime(String value) {
        this.lastModificationTime = value;
    }

    /**
     * Gets the value of the cashAmtMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAmtMtcn() {
        return cashAmtMtcn;
    }

    /**
     * Sets the value of the cashAmtMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAmtMtcn(String value) {
        this.cashAmtMtcn = value;
    }

    /**
     * Gets the value of the cardAmtMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAmtMtcn() {
        return cardAmtMtcn;
    }

    /**
     * Sets the value of the cardAmtMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAmtMtcn(String value) {
        this.cardAmtMtcn = value;
    }

    /**
     * Gets the value of the prepaidCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidCardNo() {
        return prepaidCardNo;
    }

    /**
     * Sets the value of the prepaidCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidCardNo(String value) {
        this.prepaidCardNo = value;
    }

    /**
     * Gets the value of the qqcReceiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqcReceiverName() {
        return qqcReceiverName;
    }

    /**
     * Sets the value of the qqcReceiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqcReceiverName(String value) {
        this.qqcReceiverName = value;
    }

    /**
     * Gets the value of the splitPayDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitPayDateTime() {
        return splitPayDateTime;
    }

    /**
     * Sets the value of the splitPayDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitPayDateTime(String value) {
        this.splitPayDateTime = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the splitPayMismatchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSplitPayMismatchFlag() {
        return splitPayMismatchFlag;
    }

    /**
     * Sets the value of the splitPayMismatchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSplitPayMismatchFlag(YesNo value) {
        this.splitPayMismatchFlag = value;
    }

}
