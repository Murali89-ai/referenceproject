
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ani_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ani_details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ani_info" type="{http://www.westernunion.com/schema/xrsi}ani_info" maxOccurs="15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ani_details", propOrder = {
    "aniInfo"
})
public class AniDetails {

    @XmlElement(name = "ani_info")
    protected List<AniInfo> aniInfo;

    /**
     * Gets the value of the aniInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the aniInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAniInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AniInfo }
     * 
     * 
     * @return
     *     The value of the aniInfo property.
     */
    public List<AniInfo> getAniInfo() {
        if (aniInfo == null) {
            aniInfo = new ArrayList<>();
        }
        return this.aniInfo;
    }

}
