
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for credit_debit_cards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="credit_debit_cards">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="credit_debit_card" type="{http://www.westernunion.com/schema/xrsi}credit_debit_card" maxOccurs="10"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_debit_cards", propOrder = {
    "creditDebitCard"
})
public class CreditDebitCards {

    @XmlElement(name = "credit_debit_card", required = true)
    protected List<CreditDebitCard> creditDebitCard;

    /**
     * Gets the value of the creditDebitCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the creditDebitCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditDebitCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditDebitCard }
     * 
     * 
     * @return
     *     The value of the creditDebitCard property.
     */
    public List<CreditDebitCard> getCreditDebitCard() {
        if (creditDebitCard == null) {
            creditDebitCard = new ArrayList<>();
        }
        return this.creditDebitCard;
    }

}
