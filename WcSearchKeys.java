
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wc_search_keys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="wc_search_keys">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sender" type="{http://www.westernunion.com/schema/xrsi}sender" minOccurs="0"/>
 *         <element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" minOccurs="0"/>
 *         <element name="expected_amount_start_range" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="expected_amount_end" type="{http://www.westernunion.com/schema/xrsi}amount" minOccurs="0"/>
 *         <element name="start_date_range" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}date">
 *               <minLength value="0"/>
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="end_date_range" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}date">
 *               <minLength value="0"/>
 *               <maxLength value="6"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="recording_account_number" type="{http://www.westernunion.com/schema/xrsi}recording_account_number" minOccurs="0"/>
 *         <element name="wu_card_number" type="{http://www.westernunion.com/schema/xrsi}wu_card_number" minOccurs="0"/>
 *         <element name="mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         <element name="search_parameters" type="{http://www.westernunion.com/schema/xrsi}search_parameters" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wc_search_keys", propOrder = {
    "sender",
    "receiver",
    "expectedAmountStartRange",
    "expectedAmountEnd",
    "startDateRange",
    "endDateRange",
    "recordingAccountNumber",
    "wuCardNumber",
    "mtcn",
    "searchParameters"
})
public class WcSearchKeys {

    protected Sender sender;
    protected Receiver receiver;
    @XmlElement(name = "expected_amount_start_range")
    protected Long expectedAmountStartRange;
    @XmlElement(name = "expected_amount_end")
    protected Long expectedAmountEnd;
    @XmlElement(name = "start_date_range")
    protected String startDateRange;
    @XmlElement(name = "end_date_range")
    protected String endDateRange;
    @XmlElement(name = "recording_account_number")
    protected String recordingAccountNumber;
    @XmlElement(name = "wu_card_number")
    protected String wuCardNumber;
    protected String mtcn;
    @XmlElement(name = "search_parameters")
    protected String searchParameters;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the expectedAmountStartRange property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpectedAmountStartRange() {
        return expectedAmountStartRange;
    }

    /**
     * Sets the value of the expectedAmountStartRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpectedAmountStartRange(Long value) {
        this.expectedAmountStartRange = value;
    }

    /**
     * Gets the value of the expectedAmountEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpectedAmountEnd() {
        return expectedAmountEnd;
    }

    /**
     * Sets the value of the expectedAmountEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpectedAmountEnd(Long value) {
        this.expectedAmountEnd = value;
    }

    /**
     * Gets the value of the startDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateRange() {
        return startDateRange;
    }

    /**
     * Sets the value of the startDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateRange(String value) {
        this.startDateRange = value;
    }

    /**
     * Gets the value of the endDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateRange() {
        return endDateRange;
    }

    /**
     * Sets the value of the endDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateRange(String value) {
        this.endDateRange = value;
    }

    /**
     * Gets the value of the recordingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingAccountNumber() {
        return recordingAccountNumber;
    }

    /**
     * Sets the value of the recordingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingAccountNumber(String value) {
        this.recordingAccountNumber = value;
    }

    /**
     * Gets the value of the wuCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWuCardNumber() {
        return wuCardNumber;
    }

    /**
     * Sets the value of the wuCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWuCardNumber(String value) {
        this.wuCardNumber = value;
    }

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
     * Gets the value of the searchParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchParameters() {
        return searchParameters;
    }

    /**
     * Sets the value of the searchParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchParameters(String value) {
        this.searchParameters = value;
    }

}
