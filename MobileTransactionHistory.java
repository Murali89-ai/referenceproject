
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_transaction_history complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="mobile_transaction_history">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="recording" type="{http://www.westernunion.com/schema/xrsi}mobile_agent_action" minOccurs="0"/>
 *         <element name="payout" type="{http://www.westernunion.com/schema/xrsi}mobile_agent_action" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_transaction_history", propOrder = {
    "recording",
    "payout"
})
public class MobileTransactionHistory {

    protected MobileAgentAction recording;
    protected MobileAgentAction payout;

    /**
     * Gets the value of the recording property.
     * 
     * @return
     *     possible object is
     *     {@link MobileAgentAction }
     *     
     */
    public MobileAgentAction getRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAgentAction }
     *     
     */
    public void setRecording(MobileAgentAction value) {
        this.recording = value;
    }

    /**
     * Gets the value of the payout property.
     * 
     * @return
     *     possible object is
     *     {@link MobileAgentAction }
     *     
     */
    public MobileAgentAction getPayout() {
        return payout;
    }

    /**
     * Sets the value of the payout property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileAgentAction }
     *     
     */
    public void setPayout(MobileAgentAction value) {
        this.payout = value;
    }

}
