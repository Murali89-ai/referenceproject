
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fx_options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="fx_options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="payer_fx_delivery" type="{http://www.westernunion.com/schema/xrsi}payer_fx_delivery" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fx_options", propOrder = {
    "payerFxDelivery"
})
public class FxOptions {

    @XmlElement(name = "payer_fx_delivery")
    protected List<PayerFxDelivery> payerFxDelivery;

    /**
     * Gets the value of the payerFxDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the payerFxDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayerFxDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayerFxDelivery }
     * 
     * 
     * @return
     *     The value of the payerFxDelivery property.
     */
    public List<PayerFxDelivery> getPayerFxDelivery() {
        if (payerFxDelivery == null) {
            payerFxDelivery = new ArrayList<>();
        }
        return this.payerFxDelivery;
    }

}
