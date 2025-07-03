
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_transaction_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gbs_transaction_base">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}gwp_gbs_transaction_base">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_transaction_base")
@XmlSeeAlso({
    GbsReplyTransactionBase.class,
    GbsRequestTransactionBase.class
})
public class GbsTransactionBase
    extends GwpGbsTransactionBase
{


}
