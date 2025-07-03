
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wu_product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="wu_product">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.westernunion.com/schema/xrsi}wu_product_name" minOccurs="0"/>
 *         <element name="code" type="{http://www.westernunion.com/schema/xrsi}wu_product_code" minOccurs="0"/>
 *         <element name="type" type="{http://www.westernunion.com/schema/xrsi}transaction_type" minOccurs="0"/>
 *         <element name="location" type="{http://www.westernunion.com/schema/xrsi}epl_location" minOccurs="0"/>
 *         <element name="routing_code" type="{http://www.westernunion.com/schema/xrsi}route_designator" minOccurs="0"/>
 *         <element name="identification_question" type="{http://www.westernunion.com/schema/xrsi}identification_question" minOccurs="0"/>
 *         <element name="directed_service_flag" type="{http://www.westernunion.com/schema/xrsi}directed_service_flag" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wu_product", propOrder = {
    "name",
    "code",
    "type",
    "location",
    "routingCode",
    "identificationQuestion",
    "directedServiceFlag"
})
public class WuProduct {

    protected String name;
    protected String code;
    @XmlSchemaType(name = "string")
    protected TransactionType type;
    protected String location;
    @XmlElement(name = "routing_code")
    protected String routingCode;
    @XmlElement(name = "identification_question")
    protected IdentificationQuestion identificationQuestion;
    @XmlElement(name = "directed_service_flag")
    @XmlSchemaType(name = "string")
    protected DirectedServiceFlag directedServiceFlag;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setType(TransactionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the directedServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link DirectedServiceFlag }
     *     
     */
    public DirectedServiceFlag getDirectedServiceFlag() {
        return directedServiceFlag;
    }

    /**
     * Sets the value of the directedServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectedServiceFlag }
     *     
     */
    public void setDirectedServiceFlag(DirectedServiceFlag value) {
        this.directedServiceFlag = value;
    }

}
