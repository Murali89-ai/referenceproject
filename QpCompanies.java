
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qp_companies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="qp_companies">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="qp_company" type="{http://www.westernunion.com/schema/xrsi}qp_company" maxOccurs="10"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qp_companies", propOrder = {
    "qpCompany"
})
public class QpCompanies
    extends CollectionBase
{

    @XmlElement(name = "qp_company", required = true)
    protected List<QpCompany> qpCompany;

    /**
     * Gets the value of the qpCompany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qpCompany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQpCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QpCompany }
     * 
     * 
     * @return
     *     The value of the qpCompany property.
     */
    public List<QpCompany> getQpCompany() {
        if (qpCompany == null) {
            qpCompany = new ArrayList<>();
        }
        return this.qpCompany;
    }

}
