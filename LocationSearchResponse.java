
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LocationSearchResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="map" type="{http://www.westernunion.com/schema/xrsi}map" minOccurs="0"/>
 *         <element name="matchedAddress" type="{http://www.westernunion.com/schema/xrsi}matchedAddress" minOccurs="0"/>
 *         <element name="resultCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="group" type="{http://www.westernunion.com/schema/xrsi}group" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="businessData" type="{http://www.westernunion.com/schema/xrsi}businessData" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="candidates" type="{http://www.westernunion.com/schema/xrsi}candidates" minOccurs="0"/>
 *         <element name="stateUrl" type="{http://www.westernunion.com/schema/xrsi}stateUrl" minOccurs="0"/>
 *         <element name="errorMessage" type="{http://www.westernunion.com/schema/xrsi}errorMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="distanceUnit" default="MILE">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="KM"/>
 *             <enumeration value="MILE"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSearchResponse", propOrder = {
    "map",
    "matchedAddress",
    "resultCount",
    "pageCount",
    "group",
    "businessData",
    "candidates",
    "stateUrl",
    "errorMessage"
})
public class LocationSearchResponse {

    protected Map map;
    protected MatchedAddress matchedAddress;
    protected BigInteger resultCount;
    protected BigInteger pageCount;
    protected List<Group> group;
    protected List<BusinessData> businessData;
    protected Candidates candidates;
    protected StateUrl stateUrl;
    protected List<ErrorMessage> errorMessage;
    @XmlAttribute(name = "distanceUnit")
    protected String distanceUnit;

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setMap(Map value) {
        this.map = value;
    }

    /**
     * Gets the value of the matchedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MatchedAddress }
     *     
     */
    public MatchedAddress getMatchedAddress() {
        return matchedAddress;
    }

    /**
     * Sets the value of the matchedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchedAddress }
     *     
     */
    public void setMatchedAddress(MatchedAddress value) {
        this.matchedAddress = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultCount(BigInteger value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageCount(BigInteger value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     * @return
     *     The value of the group property.
     */
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<>();
        }
        return this.group;
    }

    /**
     * Gets the value of the businessData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the businessData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessData }
     * 
     * 
     * @return
     *     The value of the businessData property.
     */
    public List<BusinessData> getBusinessData() {
        if (businessData == null) {
            businessData = new ArrayList<>();
        }
        return this.businessData;
    }

    /**
     * Gets the value of the candidates property.
     * 
     * @return
     *     possible object is
     *     {@link Candidates }
     *     
     */
    public Candidates getCandidates() {
        return candidates;
    }

    /**
     * Sets the value of the candidates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Candidates }
     *     
     */
    public void setCandidates(Candidates value) {
        this.candidates = value;
    }

    /**
     * Gets the value of the stateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link StateUrl }
     *     
     */
    public StateUrl getStateUrl() {
        return stateUrl;
    }

    /**
     * Sets the value of the stateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateUrl }
     *     
     */
    public void setStateUrl(StateUrl value) {
        this.stateUrl = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessage }
     * 
     * 
     * @return
     *     The value of the errorMessage property.
     */
    public List<ErrorMessage> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<>();
        }
        return this.errorMessage;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnit() {
        if (distanceUnit == null) {
            return "MILE";
        } else {
            return distanceUnit;
        }
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
    }

}
