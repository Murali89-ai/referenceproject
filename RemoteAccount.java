
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remote_account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="remote_account">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}agent_account">
 *       <sequence>
 *         <element name="bingo_card" type="{http://www.westernunion.com/schema/xrsi}bingo_card" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remote_account", propOrder = {
    "bingoCard"
})
public class RemoteAccount
    extends AgentAccount
{

    @XmlElement(name = "bingo_card")
    protected BingoCard bingoCard;

    /**
     * Gets the value of the bingoCard property.
     * 
     * @return
     *     possible object is
     *     {@link BingoCard }
     *     
     */
    public BingoCard getBingoCard() {
        return bingoCard;
    }

    /**
     * Sets the value of the bingoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BingoCard }
     *     
     */
    public void setBingoCard(BingoCard value) {
        this.bingoCard = value;
    }

}
