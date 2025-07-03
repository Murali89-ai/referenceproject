
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sender_info_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="sender_info_details">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="sender_info" type="{http://www.westernunion.com/schema/xrsi}sender_info" maxOccurs="15" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sender_info_details", propOrder = {
    "senderInfo"
})
public class SenderInfoDetails
    extends CollectionBase
{

    @XmlElement(name = "sender_info")
    protected List<SenderInfo> senderInfo;

    /**
     * Gets the value of the senderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the senderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSenderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SenderInfo }
     * 
     * 
     * @return
     *     The value of the senderInfo property.
     */
    public List<SenderInfo> getSenderInfo() {
        if (senderInfo == null) {
            senderInfo = new ArrayList<>();
        }
        return this.senderInfo;
    }

}
