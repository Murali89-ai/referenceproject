
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payment_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="payment_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value=""/>
 *     <enumeration value="CreditCard"/>
 *     <enumeration value="DebitCard"/>
 *     <enumeration value="Cash"/>
 *     <enumeration value="ACH"/>
 *     <enumeration value="DebitCardInterchange"/>
 *     <enumeration value="Adjustment"/>
 *     <enumeration value="Reinstate"/>
 *     <enumeration value="Refund"/>
 *     <enumeration value="Cancel"/>
 *     <enumeration value="RetailMoney"/>
 *     <enumeration value="Split"/>
 *     <enumeration value="WUPay"/>
 *     <enumeration value="AC"/>
 *     <enumeration value="Iphone"/>
 *     <enumeration value="BPAY"/>
 *     <enumeration value="PinDebit"/>
 *     <enumeration value="Acculynk"/>
 *     <enumeration value="IBP"/>
 *     <enumeration value="Sofort"/>
 *     <enumeration value="ALL"/>
 *     <enumeration value="iACH"/>
 *     <enumeration value="Trustly"/>
 *     <enumeration value="IDEAL"/>
 *     <enumeration value="ApplePay"/>
 *     <enumeration value="POLI"/>
 *     <enumeration value="PartnerFunds"/>
 *     <enumeration value="FPX"/>
 *     <enumeration value="Paramount"/>
 *     <enumeration value="BankAccount"/>
 *     <enumeration value="ServiPag"/>
 *     <enumeration value="GooglePay"/>
 *     <enumeration value="TapNGo"/>
 *     <enumeration value="DotPay"/>
 *     <enumeration value="PAYID"/>
 *     <enumeration value="IPAY88W"/>
 *     <enumeration value="Plaid"/>
 *     <enumeration value="PayNow"/>
 *     <enumeration value="PayTo"/>
 *     <enumeration value="Khipu"/>
 *     <enumeration value="BB"/>
 *     <enumeration value="C3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "payment_type")
@XmlEnum
public enum PaymentType {

    @XmlEnumValue("")
    EMPTY(""),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    ACH("ACH"),
    @XmlEnumValue("DebitCardInterchange")
    DEBIT_CARD_INTERCHANGE("DebitCardInterchange"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),
    @XmlEnumValue("Reinstate")
    REINSTATE("Reinstate"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("RetailMoney")
    RETAIL_MONEY("RetailMoney"),
    @XmlEnumValue("Split")
    SPLIT("Split"),
    @XmlEnumValue("WUPay")
    WU_PAY("WUPay"),
    AC("AC"),
    @XmlEnumValue("Iphone")
    IPHONE("Iphone"),
    BPAY("BPAY"),
    @XmlEnumValue("PinDebit")
    PIN_DEBIT("PinDebit"),
    @XmlEnumValue("Acculynk")
    ACCULYNK("Acculynk"),
    IBP("IBP"),
    @XmlEnumValue("Sofort")
    SOFORT("Sofort"),
    ALL("ALL"),
    @XmlEnumValue("iACH")
    I_ACH("iACH"),
    @XmlEnumValue("Trustly")
    TRUSTLY("Trustly"),
    IDEAL("IDEAL"),
    @XmlEnumValue("ApplePay")
    APPLE_PAY("ApplePay"),
    POLI("POLI"),
    @XmlEnumValue("PartnerFunds")
    PARTNER_FUNDS("PartnerFunds"),
    FPX("FPX"),
    @XmlEnumValue("Paramount")
    PARAMOUNT("Paramount"),
    @XmlEnumValue("BankAccount")
    BANK_ACCOUNT("BankAccount"),
    @XmlEnumValue("ServiPag")
    SERVI_PAG("ServiPag"),
    @XmlEnumValue("GooglePay")
    GOOGLE_PAY("GooglePay"),
    @XmlEnumValue("TapNGo")
    TAP_N_GO("TapNGo"),
    @XmlEnumValue("DotPay")
    DOT_PAY("DotPay"),
    PAYID("PAYID"),
    @XmlEnumValue("IPAY88W")
    IPAY_88_W("IPAY88W"),
    @XmlEnumValue("Plaid")
    PLAID("Plaid"),
    @XmlEnumValue("PayNow")
    PAY_NOW("PayNow"),
    @XmlEnumValue("PayTo")
    PAY_TO("PayTo"),
    @XmlEnumValue("Khipu")
    KHIPU("Khipu"),
    BB("BB"),
    @XmlEnumValue("C3")
    C_3("C3");
    private final String value;

    PaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentType fromValue(String v) {
        for (PaymentType c: PaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
