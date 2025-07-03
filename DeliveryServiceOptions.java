
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delivery_service_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="delivery_service_options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="delivery_service_record" type="{http://www.westernunion.com/schema/xrsi}delivery_service_record" maxOccurs="3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delivery_service_options", propOrder = {
    "deliveryServiceRecord"
})
public class DeliveryServiceOptions {

    @XmlElement(name = "delivery_service_record")
    protected List<DeliveryServiceRecord> deliveryServiceRecord;

    /**
     * Gets the value of the deliveryServiceRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the deliveryServiceRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryServiceRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryServiceRecord }
     * 
     * 
     * @return
     *     The value of the deliveryServiceRecord property.
     */
    public List<DeliveryServiceRecord> getDeliveryServiceRecord() {
        if (deliveryServiceRecord == null) {
            deliveryServiceRecord = new ArrayList<>();
        }
        return this.deliveryServiceRecord;
    }

}
