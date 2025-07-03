
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent_referral_data_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="agent_referral_data_details">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="agent_referral_data" type="{http://www.westernunion.com/schema/xrsi}agent_referral_data" maxOccurs="9" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent_referral_data_details", propOrder = {
    "agentReferralData"
})
public class AgentReferralDataDetails
    extends CollectionBase
{

    @XmlElement(name = "agent_referral_data")
    protected List<AgentReferralData> agentReferralData;

    /**
     * Gets the value of the agentReferralData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agentReferralData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentReferralData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentReferralData }
     * 
     * 
     * @return
     *     The value of the agentReferralData property.
     */
    public List<AgentReferralData> getAgentReferralData() {
        if (agentReferralData == null) {
            agentReferralData = new ArrayList<>();
        }
        return this.agentReferralData;
    }

}
