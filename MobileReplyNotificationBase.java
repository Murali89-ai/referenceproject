
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mobile_reply_notification_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="mobile_reply_notification_base">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}mobile_notification_base">
 *       <sequence>
 *         <element name="status" type="{http://www.westernunion.com/schema/xrsi}mobile_notification_reply_status"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobile_reply_notification_base", propOrder = {
    "status"
})
public class MobileReplyNotificationBase
    extends MobileNotificationBase
{

    @XmlElement(required = true)
    protected MobileNotificationReplyStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MobileNotificationReplyStatus }
     *     
     */
    public MobileNotificationReplyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileNotificationReplyStatus }
     *     
     */
    public void setStatus(MobileNotificationReplyStatus value) {
        this.status = value;
    }

}
