
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tax_worksheet_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="tax_worksheet_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="locality_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="client_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="taxserver_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="taxserver_sw_versionno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="taxserver_update_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="total_client_sales_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="client_state_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="client_county_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="client_city_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="client_secondary_county_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="client_secondary_city_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FIPS_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="out_of_city_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="completion_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tax_worksheet_details", propOrder = {
    "localityId",
    "productId",
    "clientId",
    "taxserverId",
    "taxserverSwVersionno",
    "taxserverUpdateNo",
    "totalClientSalesTax",
    "clientStateTax",
    "clientCountyTax",
    "clientCityTax",
    "clientSecondaryCountyTax",
    "clientSecondaryCityTax",
    "countryName",
    "fipsCode",
    "outOfCityIndicator",
    "completionCode",
    "principal"
})
public class TaxWorksheetDetails {

    @XmlElement(name = "locality_id")
    protected String localityId;
    @XmlElement(name = "product_id")
    protected String productId;
    @XmlElement(name = "client_id")
    protected String clientId;
    @XmlElement(name = "taxserver_id")
    protected String taxserverId;
    @XmlElement(name = "taxserver_sw_versionno")
    protected String taxserverSwVersionno;
    @XmlElement(name = "taxserver_update_no")
    protected String taxserverUpdateNo;
    @XmlElement(name = "total_client_sales_tax")
    protected String totalClientSalesTax;
    @XmlElement(name = "client_state_tax")
    protected String clientStateTax;
    @XmlElement(name = "client_county_tax")
    protected String clientCountyTax;
    @XmlElement(name = "client_city_tax")
    protected String clientCityTax;
    @XmlElement(name = "client_secondary_county_tax")
    protected String clientSecondaryCountyTax;
    @XmlElement(name = "client_secondary_city_tax")
    protected String clientSecondaryCityTax;
    @XmlElement(name = "country_name")
    protected String countryName;
    @XmlElement(name = "FIPS_code")
    protected String fipsCode;
    @XmlElement(name = "out_of_city_indicator")
    protected String outOfCityIndicator;
    @XmlElement(name = "completion_code")
    protected String completionCode;
    protected String principal;

    /**
     * Gets the value of the localityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalityId() {
        return localityId;
    }

    /**
     * Sets the value of the localityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalityId(String value) {
        this.localityId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the taxserverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxserverId() {
        return taxserverId;
    }

    /**
     * Sets the value of the taxserverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxserverId(String value) {
        this.taxserverId = value;
    }

    /**
     * Gets the value of the taxserverSwVersionno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxserverSwVersionno() {
        return taxserverSwVersionno;
    }

    /**
     * Sets the value of the taxserverSwVersionno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxserverSwVersionno(String value) {
        this.taxserverSwVersionno = value;
    }

    /**
     * Gets the value of the taxserverUpdateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxserverUpdateNo() {
        return taxserverUpdateNo;
    }

    /**
     * Sets the value of the taxserverUpdateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxserverUpdateNo(String value) {
        this.taxserverUpdateNo = value;
    }

    /**
     * Gets the value of the totalClientSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalClientSalesTax() {
        return totalClientSalesTax;
    }

    /**
     * Sets the value of the totalClientSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalClientSalesTax(String value) {
        this.totalClientSalesTax = value;
    }

    /**
     * Gets the value of the clientStateTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientStateTax() {
        return clientStateTax;
    }

    /**
     * Sets the value of the clientStateTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientStateTax(String value) {
        this.clientStateTax = value;
    }

    /**
     * Gets the value of the clientCountyTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCountyTax() {
        return clientCountyTax;
    }

    /**
     * Sets the value of the clientCountyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCountyTax(String value) {
        this.clientCountyTax = value;
    }

    /**
     * Gets the value of the clientCityTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCityTax() {
        return clientCityTax;
    }

    /**
     * Sets the value of the clientCityTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCityTax(String value) {
        this.clientCityTax = value;
    }

    /**
     * Gets the value of the clientSecondaryCountyTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecondaryCountyTax() {
        return clientSecondaryCountyTax;
    }

    /**
     * Sets the value of the clientSecondaryCountyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecondaryCountyTax(String value) {
        this.clientSecondaryCountyTax = value;
    }

    /**
     * Gets the value of the clientSecondaryCityTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSecondaryCityTax() {
        return clientSecondaryCityTax;
    }

    /**
     * Sets the value of the clientSecondaryCityTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSecondaryCityTax(String value) {
        this.clientSecondaryCityTax = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the fipsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIPSCode() {
        return fipsCode;
    }

    /**
     * Sets the value of the fipsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIPSCode(String value) {
        this.fipsCode = value;
    }

    /**
     * Gets the value of the outOfCityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfCityIndicator() {
        return outOfCityIndicator;
    }

    /**
     * Sets the value of the outOfCityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfCityIndicator(String value) {
        this.outOfCityIndicator = value;
    }

    /**
     * Gets the value of the completionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionCode() {
        return completionCode;
    }

    /**
     * Sets the value of the completionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionCode(String value) {
        this.completionCode = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

}
