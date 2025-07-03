
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DLLVersions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DLLVersions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element name="SequenceNumber" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="RecIndex" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DLLVersions", propOrder = {
    "sequenceNumberAndRecIndex"
})
public class DLLVersions {

    @XmlElementRefs({
        @XmlElementRef(name = "SequenceNumber", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RecIndex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> sequenceNumberAndRecIndex;

    /**
     * Gets the value of the sequenceNumberAndRecIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sequenceNumberAndRecIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceNumberAndRecIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     * @return
     *     The value of the sequenceNumberAndRecIndex property.
     */
    public List<JAXBElement<String>> getSequenceNumberAndRecIndex() {
        if (sequenceNumberAndRecIndex == null) {
            sequenceNumberAndRecIndex = new ArrayList<>();
        }
        return this.sequenceNumberAndRecIndex;
    }

}
