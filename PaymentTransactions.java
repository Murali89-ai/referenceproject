
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment_transactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="payment_transactions">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="payment_transaction" type="{http://www.westernunion.com/schema/xrsi}payment_transaction" maxOccurs="10" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_transactions", propOrder = {
    "paymentTransaction"
})
public class PaymentTransactions
    extends CollectionBase
{

    @XmlElement(name = "payment_transaction")
    protected List<PaymentTransaction> paymentTransaction;

    /**
     * Gets the value of the paymentTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the paymentTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction }
     * 
     * 
     * @return
     *     The value of the paymentTransaction property.
     */
    public List<PaymentTransaction> getPaymentTransaction() {
        if (paymentTransaction == null) {
            paymentTransaction = new ArrayList<>();
        }
        return this.paymentTransaction;
    }

}
