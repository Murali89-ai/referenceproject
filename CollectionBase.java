
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collection_base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="collection_base">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="more" type="{http://www.westernunion.com/schema/xrsi}yes_no" />
 *       <attribute name="context" type="{http://www.westernunion.com/schema/xrsi}context" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_base")
@XmlSeeAlso({
    CurrencyDatabase.class,
    Senders.class,
    Receivers.class,
    WuCards.class,
    Drafts.class,
    Systems.class,
    QpCompanies.class,
    PaymentTransactions.class,
    Checks.class,
    Messages.class,
    CountryInfoMessages.class,
    MonthlyRecordDetails.class,
    CcmtTransactionDetails.class,
    CommentDetails.class,
    MultipleTransactionRetrieval.class,
    CurrConversions.class,
    SpecialHandlingDataDetails.class,
    SenderInfoDetails.class,
    PayComments.class,
    AgentReferralDataDetails.class,
    OfacMessage.class,
    QqcDeviceDetails.class,
    GbsPaymentTransactions.class,
    PaymentTransactionsSearch.class
})
public class CollectionBase {

    @XmlAttribute(name = "more")
    protected YesNo more;
    @XmlAttribute(name = "context")
    protected String context;

    /**
     * Gets the value of the more property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getMore() {
        return more;
    }

    /**
     * Sets the value of the more property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setMore(YesNo value) {
        this.more = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

}
