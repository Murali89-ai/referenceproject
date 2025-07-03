
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bingo_card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="bingo_card">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="number" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="5"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="coordinates_a_thru_p" type="{http://www.westernunion.com/schema/xrsi}bingo_coordinates" minOccurs="0"/>
 *         <element name="coordinates_1_thru_15" type="{http://www.westernunion.com/schema/xrsi}bingo_coordinates" minOccurs="0"/>
 *         <element name="bingo_number" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="override" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="ani" type="{http://www.westernunion.com/schema/xrsi}received_ani" minOccurs="0"/>
 *         <element name="stuff_vru_conn_id" type="{http://www.westernunion.com/schema/xrsi}stuff_vru_conn_id" minOccurs="0"/>
 *         <element name="sin" type="{http://www.westernunion.com/schema/xrsi}sin" minOccurs="0"/>
 *         <element name="code_word" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="16"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="commercial_authorized_sender" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="25"/>
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
@XmlType(name = "bingo_card", propOrder = {
    "number",
    "coordinatesAThruP",
    "coordinates1Thru15",
    "bingoNumber",
    "override",
    "ani",
    "stuffVruConnId",
    "sin",
    "codeWord",
    "commercialAuthorizedSender"
})
public class BingoCard {

    protected String number;
    @XmlElement(name = "coordinates_a_thru_p")
    protected String coordinatesAThruP;
    @XmlElement(name = "coordinates_1_thru_15")
    protected String coordinates1Thru15;
    @XmlElement(name = "bingo_number")
    protected String bingoNumber;
    @XmlSchemaType(name = "string")
    protected YesNo override;
    protected String ani;
    @XmlElement(name = "stuff_vru_conn_id")
    protected String stuffVruConnId;
    protected String sin;
    @XmlElement(name = "code_word")
    protected String codeWord;
    @XmlElement(name = "commercial_authorized_sender")
    protected String commercialAuthorizedSender;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the coordinatesAThruP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatesAThruP() {
        return coordinatesAThruP;
    }

    /**
     * Sets the value of the coordinatesAThruP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatesAThruP(String value) {
        this.coordinatesAThruP = value;
    }

    /**
     * Gets the value of the coordinates1Thru15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinates1Thru15() {
        return coordinates1Thru15;
    }

    /**
     * Sets the value of the coordinates1Thru15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinates1Thru15(String value) {
        this.coordinates1Thru15 = value;
    }

    /**
     * Gets the value of the bingoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBingoNumber() {
        return bingoNumber;
    }

    /**
     * Sets the value of the bingoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBingoNumber(String value) {
        this.bingoNumber = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setOverride(YesNo value) {
        this.override = value;
    }

    /**
     * Gets the value of the ani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAni() {
        return ani;
    }

    /**
     * Sets the value of the ani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAni(String value) {
        this.ani = value;
    }

    /**
     * Gets the value of the stuffVruConnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStuffVruConnId() {
        return stuffVruConnId;
    }

    /**
     * Sets the value of the stuffVruConnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStuffVruConnId(String value) {
        this.stuffVruConnId = value;
    }

    /**
     * Gets the value of the sin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSin() {
        return sin;
    }

    /**
     * Sets the value of the sin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSin(String value) {
        this.sin = value;
    }

    /**
     * Gets the value of the codeWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeWord() {
        return codeWord;
    }

    /**
     * Sets the value of the codeWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeWord(String value) {
        this.codeWord = value;
    }

    /**
     * Gets the value of the commercialAuthorizedSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialAuthorizedSender() {
        return commercialAuthorizedSender;
    }

    /**
     * Sets the value of the commercialAuthorizedSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialAuthorizedSender(String value) {
        this.commercialAuthorizedSender = value;
    }

}
