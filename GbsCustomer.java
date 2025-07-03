
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gbs_customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="gbs_customer">
 *   <complexContent>
 *     <extension base="{http://www.westernunion.com/schema/xrsi}channel_customer">
 *       <sequence>
 *         <element name="bank_account" type="{http://www.westernunion.com/schema/xrsi}gbs_bank_details" minOccurs="0"/>
 *         <element name="wallet_details" type="{http://www.westernunion.com/schema/xrsi}wallet_details" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gbs_customer", propOrder = {
    "bankAccount",
    "walletDetails"
})
public class GbsCustomer
    extends ChannelCustomer
{

    @XmlElement(name = "bank_account")
    protected GbsBankDetails bankAccount;
    @XmlElement(name = "wallet_details")
    protected WalletDetails walletDetails;

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link GbsBankDetails }
     *     
     */
    public GbsBankDetails getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GbsBankDetails }
     *     
     */
    public void setBankAccount(GbsBankDetails value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the walletDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WalletDetails }
     *     
     */
    public WalletDetails getWalletDetails() {
        return walletDetails;
    }

    /**
     * Sets the value of the walletDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletDetails }
     *     
     */
    public void setWalletDetails(WalletDetails value) {
        this.walletDetails = value;
    }

}
