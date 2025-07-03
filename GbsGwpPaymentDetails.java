
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_gwp_payment_details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gbs_gwp_payment_details">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}channel_payment_details">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_gwp_payment_details")
@XmlSeeAlso({
    GatewayPaymentDetails.class,
    GbsPaymentDetails.class
})
public class GbsGwpPaymentDetails
    extends ChannelPaymentDetails
{


}
