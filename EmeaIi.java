
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emea_ii complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="emea_ii">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="frequency_of_transfers_per_year" type="{http://www.westernunion.com/schema/xrsi}frequency_of_transfers" minOccurs="0"/>
 *         <element name="frequency_of_transfers_using_wu" type="{http://www.westernunion.com/schema/xrsi}frequency_of_transfers" minOccurs="0"/>
 *         <element name="sender_gender" type="{http://www.westernunion.com/schema/xrsi}gender" minOccurs="0"/>
 *         <element name="interests" type="{http://www.westernunion.com/schema/xrsi}interests" minOccurs="0"/>
 *         <element name="preferred_mode_to_receive_info" type="{http://www.westernunion.com/schema/xrsi}preferred_mode_to_receive_info" minOccurs="0"/>
 *         <element name="reason_1_for_transfer" type="{http://www.westernunion.com/schema/xrsi}reason_for_transfer" minOccurs="0"/>
 *         <element name="reason_2_for_transfer" type="{http://www.westernunion.com/schema/xrsi}reason_for_transfer" minOccurs="0"/>
 *         <element name="id_on_file" type="{http://www.westernunion.com/schema/xrsi}id_on_file" minOccurs="0"/>
 *         <element name="mobile_phone_number" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.westernunion.com/schema/xrsi}phone">
 *               <minLength value="0"/>
 *               <maxLength value="17"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="date_of_birth_mmddyyyy" type="{http://www.westernunion.com/schema/xrsi}short_date" minOccurs="0"/>
 *         <element name="key_serial_number" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="preferred_language" type="{http://www.westernunion.com/schema/xrsi}preferred_language" minOccurs="0"/>
 *         <element name="card_status" type="{http://www.westernunion.com/schema/xrsi}card_status" minOccurs="0"/>
 *         <element name="enrollment_source" type="{http://www.westernunion.com/schema/xrsi}enrollment_source" minOccurs="0"/>
 *         <element name="marketing_code" type="{http://www.westernunion.com/schema/xrsi}marketing_code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emea_ii", propOrder = {
    "frequencyOfTransfersPerYear",
    "frequencyOfTransfersUsingWu",
    "senderGender",
    "interests",
    "preferredModeToReceiveInfo",
    "reason1ForTransfer",
    "reason2ForTransfer",
    "idOnFile",
    "mobilePhoneNumber",
    "dateOfBirthMmddyyyy",
    "keySerialNumber",
    "preferredLanguage",
    "cardStatus",
    "enrollmentSource",
    "marketingCode"
})
public class EmeaIi {

    @XmlElement(name = "frequency_of_transfers_per_year")
    protected String frequencyOfTransfersPerYear;
    @XmlElement(name = "frequency_of_transfers_using_wu")
    protected String frequencyOfTransfersUsingWu;
    @XmlElement(name = "sender_gender")
    @XmlSchemaType(name = "string")
    protected Gender senderGender;
    protected String interests;
    @XmlElement(name = "preferred_mode_to_receive_info")
    protected String preferredModeToReceiveInfo;
    @XmlElement(name = "reason_1_for_transfer")
    protected String reason1ForTransfer;
    @XmlElement(name = "reason_2_for_transfer")
    protected String reason2ForTransfer;
    @XmlElement(name = "id_on_file")
    protected String idOnFile;
    @XmlElement(name = "mobile_phone_number")
    protected String mobilePhoneNumber;
    @XmlElement(name = "date_of_birth_mmddyyyy")
    protected String dateOfBirthMmddyyyy;
    @XmlElement(name = "key_serial_number")
    protected String keySerialNumber;
    @XmlElement(name = "preferred_language")
    protected String preferredLanguage;
    @XmlElement(name = "card_status")
    protected String cardStatus;
    @XmlElement(name = "enrollment_source")
    protected String enrollmentSource;
    @XmlElement(name = "marketing_code")
    protected String marketingCode;

    /**
     * Gets the value of the frequencyOfTransfersPerYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyOfTransfersPerYear() {
        return frequencyOfTransfersPerYear;
    }

    /**
     * Sets the value of the frequencyOfTransfersPerYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyOfTransfersPerYear(String value) {
        this.frequencyOfTransfersPerYear = value;
    }

    /**
     * Gets the value of the frequencyOfTransfersUsingWu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyOfTransfersUsingWu() {
        return frequencyOfTransfersUsingWu;
    }

    /**
     * Sets the value of the frequencyOfTransfersUsingWu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyOfTransfersUsingWu(String value) {
        this.frequencyOfTransfersUsingWu = value;
    }

    /**
     * Gets the value of the senderGender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getSenderGender() {
        return senderGender;
    }

    /**
     * Sets the value of the senderGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setSenderGender(Gender value) {
        this.senderGender = value;
    }

    /**
     * Gets the value of the interests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterests() {
        return interests;
    }

    /**
     * Sets the value of the interests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterests(String value) {
        this.interests = value;
    }

    /**
     * Gets the value of the preferredModeToReceiveInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredModeToReceiveInfo() {
        return preferredModeToReceiveInfo;
    }

    /**
     * Sets the value of the preferredModeToReceiveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredModeToReceiveInfo(String value) {
        this.preferredModeToReceiveInfo = value;
    }

    /**
     * Gets the value of the reason1ForTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason1ForTransfer() {
        return reason1ForTransfer;
    }

    /**
     * Sets the value of the reason1ForTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason1ForTransfer(String value) {
        this.reason1ForTransfer = value;
    }

    /**
     * Gets the value of the reason2ForTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason2ForTransfer() {
        return reason2ForTransfer;
    }

    /**
     * Sets the value of the reason2ForTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason2ForTransfer(String value) {
        this.reason2ForTransfer = value;
    }

    /**
     * Gets the value of the idOnFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOnFile() {
        return idOnFile;
    }

    /**
     * Sets the value of the idOnFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOnFile(String value) {
        this.idOnFile = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the dateOfBirthMmddyyyy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirthMmddyyyy() {
        return dateOfBirthMmddyyyy;
    }

    /**
     * Sets the value of the dateOfBirthMmddyyyy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirthMmddyyyy(String value) {
        this.dateOfBirthMmddyyyy = value;
    }

    /**
     * Gets the value of the keySerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySerialNumber() {
        return keySerialNumber;
    }

    /**
     * Sets the value of the keySerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySerialNumber(String value) {
        this.keySerialNumber = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the enrollmentSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentSource() {
        return enrollmentSource;
    }

    /**
     * Sets the value of the enrollmentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentSource(String value) {
        this.enrollmentSource = value;
    }

    /**
     * Gets the value of the marketingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCode() {
        return marketingCode;
    }

    /**
     * Sets the value of the marketingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCode(String value) {
        this.marketingCode = value;
    }

}
