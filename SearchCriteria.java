
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="searchCriteria">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="continuation" type="{http://www.westernunion.com/schema/xrsi}continuation" minOccurs="0"/>
 *         <element name="targetLocation" type="{http://www.westernunion.com/schema/xrsi}targetLocation" minOccurs="0"/>
 *         <element name="faxNumber" type="{http://www.westernunion.com/schema/xrsi}fax" minOccurs="0"/>
 *         <element name="languages" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="refinements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="page_no" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="mask" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="locale" type="{http://www.westernunion.com/schema/xrsi}language_iso_code" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="displayList" default="ReturnList">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="ReturnList"/>
 *             <enumeration value="NoList"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="displayMap" default="NoMap">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="ReturnMap"/>
 *             <enumeration value="NoMap"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="displayPushpins" default="NoPushpins">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="ReturnPushpins"/>
 *             <enumeration value="NoPushpins"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="sort" default="ByDistance">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="ByName"/>
 *             <enumeration value="ByDistance"/>
 *             <enumeration value="BySpecification"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="maximumNumberOfLocations" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="searchRadius" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="maximumCandidates" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCriteria", propOrder = {
    "continuation",
    "targetLocation",
    "faxNumber",
    "languages",
    "refinements",
    "pageNo",
    "mask",
    "locale"
})
public class SearchCriteria {

    protected Continuation continuation;
    protected TargetLocation targetLocation;
    protected Fax faxNumber;
    protected String languages;
    protected Boolean refinements;
    @XmlElement(name = "page_no")
    protected BigInteger pageNo;
    protected String mask;
    protected String locale;
    @XmlAttribute(name = "displayList")
    protected String displayList;
    @XmlAttribute(name = "displayMap")
    protected String displayMap;
    @XmlAttribute(name = "displayPushpins")
    protected String displayPushpins;
    @XmlAttribute(name = "sort")
    protected String sort;
    @XmlAttribute(name = "maximumNumberOfLocations")
    protected String maximumNumberOfLocations;
    @XmlAttribute(name = "searchRadius")
    protected String searchRadius;
    @XmlAttribute(name = "maximumCandidates")
    protected String maximumCandidates;

    /**
     * Gets the value of the continuation property.
     * 
     * @return
     *     possible object is
     *     {@link Continuation }
     *     
     */
    public Continuation getContinuation() {
        return continuation;
    }

    /**
     * Sets the value of the continuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Continuation }
     *     
     */
    public void setContinuation(Continuation value) {
        this.continuation = value;
    }

    /**
     * Gets the value of the targetLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TargetLocation }
     *     
     */
    public TargetLocation getTargetLocation() {
        return targetLocation;
    }

    /**
     * Sets the value of the targetLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetLocation }
     *     
     */
    public void setTargetLocation(TargetLocation value) {
        this.targetLocation = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Fax }
     *     
     */
    public Fax getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fax }
     *     
     */
    public void setFaxNumber(Fax value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguages(String value) {
        this.languages = value;
    }

    /**
     * Gets the value of the refinements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefinements() {
        return refinements;
    }

    /**
     * Sets the value of the refinements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefinements(Boolean value) {
        this.refinements = value;
    }

    /**
     * Gets the value of the pageNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageNo() {
        return pageNo;
    }

    /**
     * Sets the value of the pageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageNo(BigInteger value) {
        this.pageNo = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the displayList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayList() {
        if (displayList == null) {
            return "ReturnList";
        } else {
            return displayList;
        }
    }

    /**
     * Sets the value of the displayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayList(String value) {
        this.displayList = value;
    }

    /**
     * Gets the value of the displayMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayMap() {
        if (displayMap == null) {
            return "NoMap";
        } else {
            return displayMap;
        }
    }

    /**
     * Sets the value of the displayMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayMap(String value) {
        this.displayMap = value;
    }

    /**
     * Gets the value of the displayPushpins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayPushpins() {
        if (displayPushpins == null) {
            return "NoPushpins";
        } else {
            return displayPushpins;
        }
    }

    /**
     * Sets the value of the displayPushpins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayPushpins(String value) {
        this.displayPushpins = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        if (sort == null) {
            return "ByDistance";
        } else {
            return sort;
        }
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
    }

    /**
     * Gets the value of the maximumNumberOfLocations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumNumberOfLocations() {
        return maximumNumberOfLocations;
    }

    /**
     * Sets the value of the maximumNumberOfLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumNumberOfLocations(String value) {
        this.maximumNumberOfLocations = value;
    }

    /**
     * Gets the value of the searchRadius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchRadius() {
        return searchRadius;
    }

    /**
     * Sets the value of the searchRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchRadius(String value) {
        this.searchRadius = value;
    }

    /**
     * Gets the value of the maximumCandidates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCandidates() {
        return maximumCandidates;
    }

    /**
     * Sets the value of the maximumCandidates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCandidates(String value) {
        this.maximumCandidates = value;
    }

}
