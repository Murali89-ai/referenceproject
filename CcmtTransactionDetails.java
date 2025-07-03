
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ccmt_transaction_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ccmt_transaction_details">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="ccmt_transaction" type="{http://www.westernunion.com/schema/xrsi}ccmt_transaction" maxOccurs="13"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ccmt_transaction_details", propOrder = {
    "ccmtTransaction"
})
public class CcmtTransactionDetails
    extends CollectionBase
{

    @XmlElement(name = "ccmt_transaction", required = true)
    protected List<CcmtTransaction> ccmtTransaction;

    /**
     * Gets the value of the ccmtTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccmtTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcmtTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CcmtTransaction }
     * 
     * 
     * @return
     *     The value of the ccmtTransaction property.
     */
    public List<CcmtTransaction> getCcmtTransaction() {
        if (ccmtTransaction == null) {
            ccmtTransaction = new ArrayList<>();
        }
        return this.ccmtTransaction;
    }

}
