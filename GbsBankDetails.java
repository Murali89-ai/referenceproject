
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_bank_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gbs_bank_details">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}bank_details">
 *       <sequence>
 *         <element name="pin_verification_time" type="{http://www.westernunion.com/schema/xrsi}pin_verification_time" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_bank_details", propOrder = {
    "pinVerificationTime"
})
public class GbsBankDetails
    extends BankDetails
{

    @XmlElement(name = "pin_verification_time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pinVerificationTime;

    /**
     * Gets the value of the pinVerificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPinVerificationTime() {
        return pinVerificationTime;
    }

    /**
     * Sets the value of the pinVerificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPinVerificationTime(XMLGregorianCalendar value) {
        this.pinVerificationTime = value;
    }

}
