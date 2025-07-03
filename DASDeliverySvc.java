
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASDeliverySvc</b> object contains the information for one Delivery Service.<br>
 *             				e.g. everything between <GETDELIVERYSERVICES>...</GETDELIVERYSERVICES> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DELIVERYSERVICE_Type", propOrder = {

})
public class DASDeliverySvc {

    @XmlElement(name = "DESTINATION_CODE")
    protected String destinationCode;
    @XmlElement(name = "SVC_CODE", required = true)
    protected String serviceCode;
    @XmlElement(name = "SVC_NAME", required = true)
    protected String serviceName;
    @XmlElement(name = "ROUTE")
    protected String route;
    @XmlElement(name = "BANNER")
    protected String banner;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "TEMPLT", required = true)
    protected String templateKey;
    @XmlElement(name = "CTRY_VIEW_FILTER")
    protected String countryFilter;
    @XmlElement(name = "EXCL_FLAGS")
    protected String exclusionFlags;
    @XmlElement(name = "SOURCE_MIN_CURRENCY")
    protected BigDecimal sourceMinCurrency;
    @XmlElement(name = "SOURCE_MAX_CURRENCY")
    protected BigDecimal sourceMaxCurrency;
    @XmlElement(name = "SOURCE_CURRENCY_INCR")
    protected BigDecimal sourceIncrCurrency;
    @XmlElement(name = "DEST_MIN_CURRENCY")
    protected BigDecimal destMinCurrency;
    @XmlElement(name = "DEST_MAX_CURRENCY")
    protected BigDecimal destMaxCurrency;
    @XmlElement(name = "DEST_CURRENCY_INCR")
    protected BigDecimal destIncrCurrency;

    /**
     * Gets the value of the destinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * Sets the value of the destinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanner(String value) {
        this.banner = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the templateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateKey() {
        return templateKey;
    }

    /**
     * Sets the value of the templateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateKey(String value) {
        this.templateKey = value;
    }

    /**
     * Gets the value of the countryFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryFilter() {
        return countryFilter;
    }

    /**
     * Sets the value of the countryFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryFilter(String value) {
        this.countryFilter = value;
    }

    /**
     * Gets the value of the exclusionFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionFlags() {
        return exclusionFlags;
    }

    /**
     * Sets the value of the exclusionFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionFlags(String value) {
        this.exclusionFlags = value;
    }

    /**
     * Gets the value of the sourceMinCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceMinCurrency() {
        return sourceMinCurrency;
    }

    /**
     * Sets the value of the sourceMinCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceMinCurrency(BigDecimal value) {
        this.sourceMinCurrency = value;
    }

    /**
     * Gets the value of the sourceMaxCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceMaxCurrency() {
        return sourceMaxCurrency;
    }

    /**
     * Sets the value of the sourceMaxCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceMaxCurrency(BigDecimal value) {
        this.sourceMaxCurrency = value;
    }

    /**
     * Gets the value of the sourceIncrCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceIncrCurrency() {
        return sourceIncrCurrency;
    }

    /**
     * Sets the value of the sourceIncrCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceIncrCurrency(BigDecimal value) {
        this.sourceIncrCurrency = value;
    }

    /**
     * Gets the value of the destMinCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDestMinCurrency() {
        return destMinCurrency;
    }

    /**
     * Sets the value of the destMinCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDestMinCurrency(BigDecimal value) {
        this.destMinCurrency = value;
    }

    /**
     * Gets the value of the destMaxCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDestMaxCurrency() {
        return destMaxCurrency;
    }

    /**
     * Sets the value of the destMaxCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDestMaxCurrency(BigDecimal value) {
        this.destMaxCurrency = value;
    }

    /**
     * Gets the value of the destIncrCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDestIncrCurrency() {
        return destIncrCurrency;
    }

    /**
     * Sets the value of the destIncrCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDestIncrCurrency(BigDecimal value) {
        this.destIncrCurrency = value;
    }

}
