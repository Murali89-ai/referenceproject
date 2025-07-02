
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addl_services_fees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="addl_services_fees">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addl_service_fee" type="{http://www.westernunion.com/schema/xrsi}addl_service_fee" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addl_services_fees", propOrder = {
    "addlServiceFee"
})
public class AddlServicesFees {

    @XmlElement(name = "addl_service_fee")
    protected List<AddlServiceFee> addlServiceFee;

    /**
     * Gets the value of the addlServiceFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addlServiceFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddlServiceFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddlServiceFee }
     * 
     * 
     * @return
     *     The value of the addlServiceFee property.
     */
    public List<AddlServiceFee> getAddlServiceFee() {
        if (addlServiceFee == null) {
            addlServiceFee = new ArrayList<>();
        }
        return this.addlServiceFee;
    }

}
