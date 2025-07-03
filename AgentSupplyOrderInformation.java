
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_supply_order_information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="agent_supply_order_information">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="item_code" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="item_name" type="{http://www.westernunion.com/schema/xrsi}name_base" minOccurs="0"/>
 *         <element name="quantity_description" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="units" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent_supply_order_information", propOrder = {
    "itemCode",
    "itemName",
    "quantityDescription",
    "units"
})
public class AgentSupplyOrderInformation {

    @XmlElement(name = "item_code")
    protected String itemCode;
    @XmlElement(name = "item_name")
    protected String itemName;
    @XmlElement(name = "quantity_description")
    protected String quantityDescription;
    protected String units;

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the quantityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityDescription() {
        return quantityDescription;
    }

    /**
     * Sets the value of the quantityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityDescription(String value) {
        this.quantityDescription = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

}
