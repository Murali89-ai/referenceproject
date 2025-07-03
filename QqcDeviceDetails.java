
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_device_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="qqc_device_details">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}collection_base">
 *       <sequence>
 *         <element name="device_detail" type="{http://www.westernunion.com/schema/xrsi}qqc_device_detail" maxOccurs="4" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qqc_device_details", propOrder = {
    "deviceDetail"
})
public class QqcDeviceDetails
    extends CollectionBase
{

    @XmlElement(name = "device_detail")
    protected List<QqcDeviceDetail> deviceDetail;

    /**
     * Gets the value of the deviceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the deviceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QqcDeviceDetail }
     * 
     * 
     * @return
     *     The value of the deviceDetail property.
     */
    public List<QqcDeviceDetail> getDeviceDetail() {
        if (deviceDetail == null) {
            deviceDetail = new ArrayList<>();
        }
        return this.deviceDetail;
    }

}
