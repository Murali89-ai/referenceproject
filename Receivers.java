
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="receivers">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="receiver" type="{http://www.westernunion.com/schema/xrsi}receiver" maxOccurs="9" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivers", propOrder = {
    "receiver"
})
public class Receivers
    extends CollectionBase
{

    protected List<Receiver> receiver;

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Receiver }
     * 
     * 
     * @return
     *     The value of the receiver property.
     */
    public List<Receiver> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<>();
        }
        return this.receiver;
    }

}
