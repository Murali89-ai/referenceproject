
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for picklist_first_name_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="picklist_first_name_options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="first_name" type="{http://www.westernunion.com/schema/xrsi}first_name" maxOccurs="4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "picklist_first_name_options", propOrder = {
    "firstName"
})
public class PicklistFirstNameOptions {

    @XmlElement(name = "first_name", required = true)
    protected List<String> firstName;

    /**
     * Gets the value of the firstName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the firstName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the firstName property.
     */
    public List<String> getFirstName() {
        if (firstName == null) {
            firstName = new ArrayList<>();
        }
        return this.firstName;
    }

}
