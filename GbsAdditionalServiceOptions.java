
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_additional_service_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gbs_additional_service_options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="additional_service_option" type="{http://www.westernunion.com/schema/xrsi}gbs_optional_service" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_additional_service_options", propOrder = {
    "additionalServiceOption"
})
public class GbsAdditionalServiceOptions {

    @XmlElement(name = "additional_service_option", required = true)
    protected List<GbsOptionalService> additionalServiceOption;

    /**
     * Gets the value of the additionalServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the additionalServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GbsOptionalService }
     * 
     * 
     * @return
     *     The value of the additionalServiceOption property.
     */
    public List<GbsOptionalService> getAdditionalServiceOption() {
        if (additionalServiceOption == null) {
            additionalServiceOption = new ArrayList<>();
        }
        return this.additionalServiceOption;
    }

}
