
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASReqFilters</b> object contains the Data Context details <br>
 *             				i.e. everything between <filters>...</filters> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filters_type", propOrder = {
    "dasQueryFilter1",
    "dasQueryFilter2",
    "dasQueryFilter3",
    "dasQueryFilter4",
    "dasQueryFilter5",
    "dasQueryFilter6",
    "dasQueryFilter7",
    "dasQueryFilter8",
    "dasQueryFilter9",
    "dasQueryFilter10"
})
public class DASReqFilters {

    @XmlElement(name = "queryfilter1")
    protected String dasQueryFilter1;
    @XmlElement(name = "queryfilter2")
    protected String dasQueryFilter2;
    @XmlElement(name = "queryfilter3")
    protected String dasQueryFilter3;
    @XmlElement(name = "queryfilter4")
    protected String dasQueryFilter4;
    @XmlElement(name = "queryfilter5")
    protected String dasQueryFilter5;
    @XmlElement(name = "queryfilter6")
    protected String dasQueryFilter6;
    @XmlElement(name = "queryfilter7")
    protected String dasQueryFilter7;
    @XmlElement(name = "queryfilter8")
    protected String dasQueryFilter8;
    @XmlElement(name = "queryfilter9")
    protected String dasQueryFilter9;
    @XmlElement(name = "queryfilter10")
    protected String dasQueryFilter10;

    /**
     * Gets the value of the dasQueryFilter1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter1() {
        return dasQueryFilter1;
    }

    /**
     * Sets the value of the dasQueryFilter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter1(String value) {
        this.dasQueryFilter1 = value;
    }

    /**
     * Gets the value of the dasQueryFilter2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter2() {
        return dasQueryFilter2;
    }

    /**
     * Sets the value of the dasQueryFilter2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter2(String value) {
        this.dasQueryFilter2 = value;
    }

    /**
     * Gets the value of the dasQueryFilter3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter3() {
        return dasQueryFilter3;
    }

    /**
     * Sets the value of the dasQueryFilter3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter3(String value) {
        this.dasQueryFilter3 = value;
    }

    /**
     * Gets the value of the dasQueryFilter4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter4() {
        return dasQueryFilter4;
    }

    /**
     * Sets the value of the dasQueryFilter4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter4(String value) {
        this.dasQueryFilter4 = value;
    }

    /**
     * Gets the value of the dasQueryFilter5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter5() {
        return dasQueryFilter5;
    }

    /**
     * Sets the value of the dasQueryFilter5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter5(String value) {
        this.dasQueryFilter5 = value;
    }

    /**
     * Gets the value of the dasQueryFilter6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter6() {
        return dasQueryFilter6;
    }

    /**
     * Sets the value of the dasQueryFilter6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter6(String value) {
        this.dasQueryFilter6 = value;
    }

    /**
     * Gets the value of the dasQueryFilter7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter7() {
        return dasQueryFilter7;
    }

    /**
     * Sets the value of the dasQueryFilter7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter7(String value) {
        this.dasQueryFilter7 = value;
    }

    /**
     * Gets the value of the dasQueryFilter8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter8() {
        return dasQueryFilter8;
    }

    /**
     * Sets the value of the dasQueryFilter8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter8(String value) {
        this.dasQueryFilter8 = value;
    }

    /**
     * Gets the value of the dasQueryFilter9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter9() {
        return dasQueryFilter9;
    }

    /**
     * Sets the value of the dasQueryFilter9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter9(String value) {
        this.dasQueryFilter9 = value;
    }

    /**
     * Gets the value of the dasQueryFilter10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDASQueryFilter10() {
        return dasQueryFilter10;
    }

    /**
     * Sets the value of the dasQueryFilter10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDASQueryFilter10(String value) {
        this.dasQueryFilter10 = value;
    }

}
