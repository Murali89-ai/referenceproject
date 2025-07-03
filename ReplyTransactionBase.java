
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reply_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="reply_transaction_base">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}transaction_base">
 *       <sequence>
 *         <element name="terminal" type="{http://www.westernunion.com/schema/xrsi}terminal" minOccurs="0"/>
 *         <element name="advisory_text" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="80"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reply_transaction_base", propOrder = {
    "terminal",
    "advisoryText"
})
@XmlSeeAlso({
    XRSIDasReply.class
})
public class ReplyTransactionBase
    extends TransactionBase
{

    protected Terminal terminal;
    @XmlElement(name = "advisory_text")
    protected String advisoryText;

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTerminal(Terminal value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the advisoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryText() {
        return advisoryText;
    }

    /**
     * Sets the value of the advisoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryText(String value) {
        this.advisoryText = value;
    }

}
