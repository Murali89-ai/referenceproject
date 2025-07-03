
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for curr_conversions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="curr_conversions">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="curr_conversion" type="{http://www.westernunion.com/schema/xrsi}curr_conversion" maxOccurs="8"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curr_conversions", propOrder = {
    "currConversion"
})
public class CurrConversions
    extends CollectionBase
{

    @XmlElement(name = "curr_conversion", required = true)
    protected List<CurrConversion> currConversion;

    /**
     * Gets the value of the currConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the currConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrConversion }
     * 
     * 
     * @return
     *     The value of the currConversion property.
     */
    public List<CurrConversion> getCurrConversion() {
        if (currConversion == null) {
            currConversion = new ArrayList<>();
        }
        return this.currConversion;
    }

}
