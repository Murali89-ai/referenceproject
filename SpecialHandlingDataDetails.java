
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for special_handling_data_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="special_handling_data_details">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="special_handling_data" type="{http://www.westernunion.com/schema/xrsi}special_handling_data" maxOccurs="10" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "special_handling_data_details", propOrder = {
    "specialHandlingData"
})
public class SpecialHandlingDataDetails
    extends CollectionBase
{

    @XmlElement(name = "special_handling_data")
    protected List<SpecialHandlingData> specialHandlingData;

    /**
     * Gets the value of the specialHandlingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the specialHandlingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingData }
     * 
     * 
     * @return
     *     The value of the specialHandlingData property.
     */
    public List<SpecialHandlingData> getSpecialHandlingData() {
        if (specialHandlingData == null) {
            specialHandlingData = new ArrayList<>();
        }
        return this.specialHandlingData;
    }

}
