
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for data_prompts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="data_prompts">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="data_prompt" type="{http://www.westernunion.com/schema/xrsi}data_prompt" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_prompts", propOrder = {
    "dataPrompt"
})
public class DataPrompts {

    @XmlElement(name = "data_prompt")
    protected List<DataPrompt> dataPrompt;

    /**
     * Gets the value of the dataPrompt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataPrompt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPrompt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPrompt }
     * 
     * 
     * @return
     *     The value of the dataPrompt property.
     */
    public List<DataPrompt> getDataPrompt() {
        if (dataPrompt == null) {
            dataPrompt = new ArrayList<>();
        }
        return this.dataPrompt;
    }

}
