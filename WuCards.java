
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wu_cards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="wu_cards">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="wu_card" type="{http://www.westernunion.com/schema/xrsi}wu_card" maxOccurs="10"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wu_cards", propOrder = {
    "wuCard"
})
public class WuCards
    extends CollectionBase
{

    @XmlElement(name = "wu_card", required = true)
    protected List<WuCard> wuCard;

    /**
     * Gets the value of the wuCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wuCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWuCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WuCard }
     * 
     * 
     * @return
     *     The value of the wuCard property.
     */
    public List<WuCard> getWuCard() {
        if (wuCard == null) {
            wuCard = new ArrayList<>();
        }
        return this.wuCard;
    }

}
