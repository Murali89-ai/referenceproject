
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delivery_services complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="delivery_services">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.westernunion.com/schema/xrsi}delivery_service_code" minOccurs="0"/>
 *         <element name="routing_code" type="{http://www.westernunion.com/schema/xrsi}route_designator" minOccurs="0"/>
 *         <element name="information" type="{http://www.westernunion.com/schema/xrsi}delivery_information" minOccurs="0"/>
 *         <element name="flags" type="{http://www.westernunion.com/schema/xrsi}delivery_service_flags" minOccurs="0"/>
 *         <element name="phone_delivery_available" type="{http://www.westernunion.com/schema/xrsi}phone_delivery" minOccurs="0"/>
 *         <element name="physical_delivery_available" type="{http://www.westernunion.com/schema/xrsi}phy_delivery" minOccurs="0"/>
 *         <element name="test_question_available" type="{http://www.westernunion.com/schema/xrsi}test_question" minOccurs="0"/>
 *         <element name="phone_notification" type="{http://www.westernunion.com/schema/xrsi}phone_notification" minOccurs="0"/>
 *         <element name="identification_question" type="{http://www.westernunion.com/schema/xrsi}identification_question" minOccurs="0"/>
 *         <element name="message" type="{http://www.westernunion.com/schema/xrsi}message_details" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delivery_services", propOrder = {
    "code",
    "routingCode",
    "information",
    "flags",
    "phoneDeliveryAvailable",
    "physicalDeliveryAvailable",
    "testQuestionAvailable",
    "phoneNotification",
    "identificationQuestion",
    "message"
})
public class DeliveryServices {

    protected String code;
    @XmlElement(name = "routing_code")
    protected String routingCode;
    protected String information;
    protected String flags;
    @XmlElement(name = "phone_delivery_available")
    @XmlSchemaType(name = "string")
    protected YesNo phoneDeliveryAvailable;
    @XmlElement(name = "physical_delivery_available")
    @XmlSchemaType(name = "string")
    protected YesNo physicalDeliveryAvailable;
    @XmlElement(name = "test_question_available")
    protected String testQuestionAvailable;
    @XmlElement(name = "phone_notification")
    protected PhoneNotification phoneNotification;
    @XmlElement(name = "identification_question")
    protected IdentificationQuestion identificationQuestion;
    protected MessageDetails message;

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
     * Gets the value of the routingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * Sets the value of the routingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlags(String value) {
        this.flags = value;
    }

    /**
     * Gets the value of the phoneDeliveryAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPhoneDeliveryAvailable() {
        return phoneDeliveryAvailable;
    }

    /**
     * Sets the value of the phoneDeliveryAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPhoneDeliveryAvailable(YesNo value) {
        this.phoneDeliveryAvailable = value;
    }

    /**
     * Gets the value of the physicalDeliveryAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPhysicalDeliveryAvailable() {
        return physicalDeliveryAvailable;
    }

    /**
     * Sets the value of the physicalDeliveryAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPhysicalDeliveryAvailable(YesNo value) {
        this.physicalDeliveryAvailable = value;
    }

    /**
     * Gets the value of the testQuestionAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestQuestionAvailable() {
        return testQuestionAvailable;
    }

    /**
     * Sets the value of the testQuestionAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestQuestionAvailable(String value) {
        this.testQuestionAvailable = value;
    }

    /**
     * Gets the value of the phoneNotification property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNotification }
     *     
     */
    public PhoneNotification getPhoneNotification() {
        return phoneNotification;
    }

    /**
     * Sets the value of the phoneNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNotification }
     *     
     */
    public void setPhoneNotification(PhoneNotification value) {
        this.phoneNotification = value;
    }

    /**
     * Gets the value of the identificationQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationQuestion }
     *     
     */
    public IdentificationQuestion getIdentificationQuestion() {
        return identificationQuestion;
    }

    /**
     * Sets the value of the identificationQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationQuestion }
     *     
     */
    public void setIdentificationQuestion(IdentificationQuestion value) {
        this.identificationQuestion = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDetails }
     *     
     */
    public MessageDetails getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDetails }
     *     
     */
    public void setMessage(MessageDetails value) {
        this.message = value;
    }

}
