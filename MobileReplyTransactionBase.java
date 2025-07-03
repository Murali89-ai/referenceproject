
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_reply_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="mobile_reply_transaction_base">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}mobile_transaction_base">
 *       <sequence>
 *         <element name="informational_messages" type="{http://www.westernunion.com/schema/xrsi}informational_messages" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_reply_transaction_base", propOrder = {
    "informationalMessages"
})
public class MobileReplyTransactionBase
    extends MobileTransactionBase
{

    @XmlElement(name = "informational_messages")
    protected InformationalMessages informationalMessages;

    /**
     * Gets the value of the informationalMessages property.
     * 
     * @return
     *     possible object is
     *     {@link InformationalMessages }
     *     
     */
    public InformationalMessages getInformationalMessages() {
        return informationalMessages;
    }

    /**
     * Sets the value of the informationalMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationalMessages }
     *     
     */
    public void setInformationalMessages(InformationalMessages value) {
        this.informationalMessages = value;
    }

}
