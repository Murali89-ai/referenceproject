
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner_notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="partner_notification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="notification_requested" type="{http://www.westernunion.com/schema/xrsi}notification_requested" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partner_notification", propOrder = {
    "notificationRequested"
})
public class PartnerNotification {

    @XmlElement(name = "notification_requested")
    @XmlSchemaType(name = "string")
    protected NotificationRequested notificationRequested;

    /**
     * Gets the value of the notificationRequested property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationRequested }
     *     
     */
    public NotificationRequested getNotificationRequested() {
        return notificationRequested;
    }

    /**
     * Sets the value of the notificationRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationRequested }
     *     
     */
    public void setNotificationRequested(NotificationRequested value) {
        this.notificationRequested = value;
    }

}
