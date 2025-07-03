
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refund_type_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="refund_type_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="refund_type" type="{http://www.westernunion.com/schema/xrsi}refund_type" maxOccurs="8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refund_type_details", propOrder = {
    "refundType"
})
public class RefundTypeDetails {

    @XmlElement(name = "refund_type")
    protected List<String> refundType;

    /**
     * Gets the value of the refundType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refundType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the refundType property.
     */
    public List<String> getRefundType() {
        if (refundType == null) {
            refundType = new ArrayList<>();
        }
        return this.refundType;
    }

}
