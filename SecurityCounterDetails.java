
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for security_counter_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="security_counter_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="security_counter" type="{http://www.westernunion.com/schema/xrsi}security_counter" maxOccurs="10"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security_counter_details", propOrder = {
    "securityCounter"
})
public class SecurityCounterDetails {

    @XmlElement(name = "security_counter", required = true)
    protected List<SecurityCounter> securityCounter;

    /**
     * Gets the value of the securityCounter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the securityCounter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityCounter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityCounter }
     * 
     * 
     * @return
     *     The value of the securityCounter property.
     */
    public List<SecurityCounter> getSecurityCounter() {
        if (securityCounter == null) {
            securityCounter = new ArrayList<>();
        }
        return this.securityCounter;
    }

}
