
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txn_availability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="txn_availability">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="date_of_availability" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="20"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="time_zone" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="9"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="availability_in_est" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="20"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txn_availability", propOrder = {
    "dateOfAvailability",
    "timeZone",
    "availabilityInEst"
})
public class TxnAvailability {

    @XmlElement(name = "date_of_availability")
    protected String dateOfAvailability;
    @XmlElement(name = "time_zone")
    protected String timeZone;
    @XmlElement(name = "availability_in_est")
    protected String availabilityInEst;

    /**
     * Gets the value of the dateOfAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfAvailability() {
        return dateOfAvailability;
    }

    /**
     * Sets the value of the dateOfAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfAvailability(String value) {
        this.dateOfAvailability = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the availabilityInEst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityInEst() {
        return availabilityInEst;
    }

    /**
     * Sets the value of the availabilityInEst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityInEst(String value) {
        this.availabilityInEst = value;
    }

}
