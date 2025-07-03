
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monthly_record_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="monthly_record_details">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="monthly_record" type="{http://www.westernunion.com/schema/xrsi}monthly_record" maxOccurs="13"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monthly_record_details", propOrder = {
    "monthlyRecord"
})
public class MonthlyRecordDetails
    extends CollectionBase
{

    @XmlElement(name = "monthly_record", required = true)
    protected List<MonthlyRecord> monthlyRecord;

    /**
     * Gets the value of the monthlyRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the monthlyRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthlyRecord }
     * 
     * 
     * @return
     *     The value of the monthlyRecord property.
     */
    public List<MonthlyRecord> getMonthlyRecord() {
        if (monthlyRecord == null) {
            monthlyRecord = new ArrayList<>();
        }
        return this.monthlyRecord;
    }

}
