
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for price_quotes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="price_quotes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="price_quote" type="{http://www.westernunion.com/schema/xrsi}price_quote" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "price_quotes", propOrder = {
    "priceQuote"
})
public class PriceQuotes {

    @XmlElement(name = "price_quote")
    protected List<PriceQuote> priceQuote;

    /**
     * Gets the value of the priceQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the priceQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceQuote }
     * 
     * 
     * @return
     *     The value of the priceQuote property.
     */
    public List<PriceQuote> getPriceQuote() {
        if (priceQuote == null) {
            priceQuote = new ArrayList<>();
        }
        return this.priceQuote;
    }

}
