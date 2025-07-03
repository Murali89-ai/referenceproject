
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             				The <b>DASRecord</b> object contains the result records <br>
 *             				i.e. everything between <RECORD>...</RECORD> tags.
 *             			
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RECORDSET_Type", propOrder = {
    "dasOrigCurrencyList",
    "dasMexCityStateInfoList",
    "dasusStateInfoList",
    "dasDeliverySvcList",
    "dasDelivOptTemplate",
    "dasCompliance",
    "daswuBannerMsgList",
    "daswuAgentBannerMsgList",
    "dasDestCurrencyList",
    "dasDestCountryList",
    "dasisoCurrencyList",
    "dasisoCountryList",
    "dasAgentFieldsTemplateList",
    "dasHostRequestTemplateList",
    "dasPrivacyTemplateList",
    "dasCountryInfoList",
    "dasuaTemplateList",
    "dasqqcAccountTemplateList",
    "dasqqcCompanyList",
    "daswuCardDtlsTemplateList",
    "daswuCardPermChanges",
    "dasErrorInfoList",
    "dasTxnHistoryList",
    "dasTxnDetail",
    "dasatmLocationsList",
    "dasd2BBanksList",
    "dasUnivComplTemplates",
    "dasModifyTxnTemplates",
    "dasSupplyOrderList",
    "dasCheckWriterList",
    "dasComboTemplateList",
    "dasAccountTableInfo",
    "dasDestinationCountriesCurrencies",
    "dasBankTransactionData",
    "dasReasonList",
    "dasCityStateList",
    "dasAchBank",
    "dasErrorTranslation",
    "dasdeliverytranslate",
    "dasqqcfieldstemplate",
    "dasReasonCodeList",
    "dasCascadeList",
    "dasGetReasonOfTransactionList",
    "dasGetStagedFulfillmentRegionsList",
    "dasGetMessageList",
    "dasGetStateList"
})
public class DASRecord {

    @XmlElement(name = "GETORIGINATIONCURRENCIES")
    protected List<DASISOCurrency> dasOrigCurrencyList;
    @XmlElement(name = "GETMEXICOCITYSTATE")
    protected List<DASMexCityStateInfo> dasMexCityStateInfoList;
    @XmlElement(name = "GETUSSTATELIST")
    protected List<DASUSStateInfo> dasusStateInfoList;
    @XmlElement(name = "GETDELIVERYSERVICES")
    protected List<DASDeliverySvc> dasDeliverySvcList;
    @XmlElement(name = "GETDELIVERYOPTIONTEMPLATE")
    protected List<DASDelivOptTemplate> dasDelivOptTemplate;
    @XmlElement(name = "GETSENDERCOMPLIANCE")
    protected List<DASCompliance> dasCompliance;
    @XmlElement(name = "GETWUBANNERMSGS")
    protected List<DASBannerMsg> daswuBannerMsgList;
    @XmlElement(name = "GETWUAGENTBANNERMSGS")
    protected List<DASBannerMsg> daswuAgentBannerMsgList;
    @XmlElement(name = "GETDESTINATIONCURRENCIES")
    protected List<DASISOCurrency> dasDestCurrencyList;
    @XmlElement(name = "GETDESTINATIONCOUNTRIES")
    protected List<DASISOCountry> dasDestCountryList;
    @XmlElement(name = "GETISOCURRENCIES")
    protected List<DASISOCurrency> dasisoCurrencyList;
    @XmlElement(name = "GETISOCOUNTRIES")
    protected List<DASISOCountry> dasisoCountryList;
    @XmlElement(name = "GETAGENTFIELDSTEMPLATE")
    protected List<DASTemplateLine> dasAgentFieldsTemplateList;
    @XmlElement(name = "GETHOSTREQUESTTEMPLATE")
    protected List<DASTemplateLine> dasHostRequestTemplateList;
    @XmlElement(name = "GETPRIVACYTEMPLATE")
    protected List<DASTemplateLine> dasPrivacyTemplateList;
    @XmlElement(name = "GETCOUNTRYINFO")
    protected List<DASCountryInfo> dasCountryInfoList;
    @XmlElement(name = "GETUNIVERSALADDRESSTEMPLATE")
    protected List<DASTemplateLine> dasuaTemplateList;
    @XmlElement(name = "GETQQCACCOUNTTEMPLATE")
    protected List<DASTemplateLine> dasqqcAccountTemplateList;
    @XmlElement(name = "GETQQCCOMPANYNAME")
    protected List<DASQQCCompany> dasqqcCompanyList;
    @XmlElement(name = "GETWUCARDDETAILSTEMPLATE")
    protected List<DASTemplateLine> daswuCardDtlsTemplateList;
    @XmlElement(name = "GETWUCARDPERCHANGES")
    protected DASFlag daswuCardPermChanges;
    @XmlElement(name = "GETERRORMESSAGESINFO")
    protected List<DASErrorInfo> dasErrorInfoList;
    @XmlElement(name = "GETTRANSACTIONHISTORY")
    protected List<DASTxnHistory> dasTxnHistoryList;
    @XmlElement(name = "GETTRANSACTIONDETAIL")
    protected DASTxnDetail dasTxnDetail;
    @XmlElement(name = "GETATMLOCATIONS")
    protected List<DASATMLocInfo> dasatmLocationsList;
    @XmlElement(name = "GETBANKLIST")
    protected List<DASBankInfo> dasd2BBanksList;
    @XmlElement(name = "GETUNIVERSALCOMPLIANCETEMPLATE")
    protected List<DASCompliance> dasUnivComplTemplates;
    @XmlElement(name = "GETMODIFYTRANSACTIONTEMPLATE")
    protected List<DASModifyTxnTemplates> dasModifyTxnTemplates;
    @XmlElement(name = "GETSUPPLYORDERLIST")
    protected List<DASSupplyItemInfo> dasSupplyOrderList;
    @XmlElement(name = "GETCHECKWRITERLIST")
    protected List<DASCheckWriterInfo> dasCheckWriterList;
    @XmlElement(name = "GETCOMBOLISTTEMPLATE")
    protected List<DASTemplateLine> dasComboTemplateList;
    @XmlElement(name = "GETACCOUNTTABLEINFO")
    protected List<DASAccountTableInfo> dasAccountTableInfo;
    @XmlElement(name = "GETCOUNTRIESCURRENCIES")
    protected List<DASCountryCurrency> dasDestinationCountriesCurrencies;
    @XmlElement(name = "GETBANKTRANSACTIONDATA")
    protected List<BANKTRANSACTIONType> dasBankTransactionData;
    @XmlElement(name = "GETREASONLIST")
    protected List<DASReasonList> dasReasonList;
    @XmlElement(name = "GETCITYSTATELIST")
    protected List<DASCityStateInfo> dasCityStateList;
    @XmlElement(name = "GETACHSTATUS")
    protected List<DASACHBankData> dasAchBank;
    @XmlElement(name = "GETERRORTRANSLATIONS")
    protected List<DASErrorTranslation> dasErrorTranslation;
    @XmlElement(name = "GETDELIVERYTRANSLATION")
    protected List<DASDELIVERYTRANSLATE> dasdeliverytranslate;
    @XmlElement(name = "GETQQCFIELDSTEMPLATE")
    protected List<DASQQCFieldsTemplate> dasqqcfieldstemplate;
    @XmlElement(name = "GETREASONCODELIST")
    protected List<GETREASONCODELISTType> dasReasonCodeList;
    @XmlElement(name = "GETCASCADELIST")
    protected List<DASCascadeList> dasCascadeList;
    @XmlElement(name = "GETREASONOFTRANSACTION")
    protected List<DASGetReasonOfTransactionList> dasGetReasonOfTransactionList;
    @XmlElement(name = "GETSTAGEDFULFILLMENTREGIONS")
    protected List<DASGetStagedFulfillmentRegionsList> dasGetStagedFulfillmentRegionsList;
    @XmlElement(name = "GETMESSAGELIST")
    protected List<DASGetMessageList> dasGetMessageList;
    @XmlElement(name = "GETSTATELIST")
    protected List<DASGetStateList> dasGetStateList;

    /**
     * Gets the value of the dasOrigCurrencyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasOrigCurrencyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASOrigCurrencyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASISOCurrency }
     * 
     * 
     * @return
     *     The value of the dasOrigCurrencyList property.
     */
    public List<DASISOCurrency> getDASOrigCurrencyList() {
        if (dasOrigCurrencyList == null) {
            dasOrigCurrencyList = new ArrayList<>();
        }
        return this.dasOrigCurrencyList;
    }

    /**
     * Gets the value of the dasMexCityStateInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasMexCityStateInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASMexCityStateInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASMexCityStateInfo }
     * 
     * 
     * @return
     *     The value of the dasMexCityStateInfoList property.
     */
    public List<DASMexCityStateInfo> getDASMexCityStateInfoList() {
        if (dasMexCityStateInfoList == null) {
            dasMexCityStateInfoList = new ArrayList<>();
        }
        return this.dasMexCityStateInfoList;
    }

    /**
     * Gets the value of the dasusStateInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasusStateInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASUSStateInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASUSStateInfo }
     * 
     * 
     * @return
     *     The value of the dasusStateInfoList property.
     */
    public List<DASUSStateInfo> getDASUSStateInfoList() {
        if (dasusStateInfoList == null) {
            dasusStateInfoList = new ArrayList<>();
        }
        return this.dasusStateInfoList;
    }

    /**
     * Gets the value of the dasDeliverySvcList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasDeliverySvcList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASDeliverySvcList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASDeliverySvc }
     * 
     * 
     * @return
     *     The value of the dasDeliverySvcList property.
     */
    public List<DASDeliverySvc> getDASDeliverySvcList() {
        if (dasDeliverySvcList == null) {
            dasDeliverySvcList = new ArrayList<>();
        }
        return this.dasDeliverySvcList;
    }

    /**
     * Gets the value of the dasDelivOptTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasDelivOptTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASDelivOptTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASDelivOptTemplate }
     * 
     * 
     * @return
     *     The value of the dasDelivOptTemplate property.
     */
    public List<DASDelivOptTemplate> getDASDelivOptTemplate() {
        if (dasDelivOptTemplate == null) {
            dasDelivOptTemplate = new ArrayList<>();
        }
        return this.dasDelivOptTemplate;
    }

    /**
     * Gets the value of the dasCompliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasCompliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASCompliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASCompliance }
     * 
     * 
     * @return
     *     The value of the dasCompliance property.
     */
    public List<DASCompliance> getDASCompliance() {
        if (dasCompliance == null) {
            dasCompliance = new ArrayList<>();
        }
        return this.dasCompliance;
    }

    /**
     * Gets the value of the daswuBannerMsgList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the daswuBannerMsgList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASWUBannerMsgList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASBannerMsg }
     * 
     * 
     * @return
     *     The value of the daswuBannerMsgList property.
     */
    public List<DASBannerMsg> getDASWUBannerMsgList() {
        if (daswuBannerMsgList == null) {
            daswuBannerMsgList = new ArrayList<>();
        }
        return this.daswuBannerMsgList;
    }

    /**
     * Gets the value of the daswuAgentBannerMsgList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the daswuAgentBannerMsgList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASWUAgentBannerMsgList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASBannerMsg }
     * 
     * 
     * @return
     *     The value of the daswuAgentBannerMsgList property.
     */
    public List<DASBannerMsg> getDASWUAgentBannerMsgList() {
        if (daswuAgentBannerMsgList == null) {
            daswuAgentBannerMsgList = new ArrayList<>();
        }
        return this.daswuAgentBannerMsgList;
    }

    /**
     * Gets the value of the dasDestCurrencyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasDestCurrencyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASDestCurrencyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASISOCurrency }
     * 
     * 
     * @return
     *     The value of the dasDestCurrencyList property.
     */
    public List<DASISOCurrency> getDASDestCurrencyList() {
        if (dasDestCurrencyList == null) {
            dasDestCurrencyList = new ArrayList<>();
        }
        return this.dasDestCurrencyList;
    }

    /**
     * Gets the value of the dasDestCountryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasDestCountryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASDestCountryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASISOCountry }
     * 
     * 
     * @return
     *     The value of the dasDestCountryList property.
     */
    public List<DASISOCountry> getDASDestCountryList() {
        if (dasDestCountryList == null) {
            dasDestCountryList = new ArrayList<>();
        }
        return this.dasDestCountryList;
    }

    /**
     * Gets the value of the dasisoCurrencyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasisoCurrencyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASISOCurrencyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASISOCurrency }
     * 
     * 
     * @return
     *     The value of the dasisoCurrencyList property.
     */
    public List<DASISOCurrency> getDASISOCurrencyList() {
        if (dasisoCurrencyList == null) {
            dasisoCurrencyList = new ArrayList<>();
        }
        return this.dasisoCurrencyList;
    }

    /**
     * Gets the value of the dasisoCountryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasisoCountryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASISOCountryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASISOCountry }
     * 
     * 
     * @return
     *     The value of the dasisoCountryList property.
     */
    public List<DASISOCountry> getDASISOCountryList() {
        if (dasisoCountryList == null) {
            dasisoCountryList = new ArrayList<>();
        }
        return this.dasisoCountryList;
    }

    /**
     * Gets the value of the dasAgentFieldsTemplateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasAgentFieldsTemplateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASAgentFieldsTemplateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASTemplateLine }
     * 
     * 
     * @return
     *     The value of the dasAgentFieldsTemplateList property.
     */
    public List<DASTemplateLine> getDASAgentFieldsTemplateList() {
        if (dasAgentFieldsTemplateList == null) {
            dasAgentFieldsTemplateList = new ArrayList<>();
        }
        return this.dasAgentFieldsTemplateList;
    }

    /**
     * Gets the value of the dasHostRequestTemplateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasHostRequestTemplateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASHostRequestTemplateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASTemplateLine }
     * 
     * 
     * @return
     *     The value of the dasHostRequestTemplateList property.
     */
    public List<DASTemplateLine> getDASHostRequestTemplateList() {
        if (dasHostRequestTemplateList == null) {
            dasHostRequestTemplateList = new ArrayList<>();
        }
        return this.dasHostRequestTemplateList;
    }

    /**
     * Gets the value of the dasPrivacyTemplateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasPrivacyTemplateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASPrivacyTemplateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASTemplateLine }
     * 
     * 
     * @return
     *     The value of the dasPrivacyTemplateList property.
     */
    public List<DASTemplateLine> getDASPrivacyTemplateList() {
        if (dasPrivacyTemplateList == null) {
            dasPrivacyTemplateList = new ArrayList<>();
        }
        return this.dasPrivacyTemplateList;
    }

    /**
     * Gets the value of the dasCountryInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasCountryInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASCountryInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASCountryInfo }
     * 
     * 
     * @return
     *     The value of the dasCountryInfoList property.
     */
    public List<DASCountryInfo> getDASCountryInfoList() {
        if (dasCountryInfoList == null) {
            dasCountryInfoList = new ArrayList<>();
        }
        return this.dasCountryInfoList;
    }

    /**
     * Gets the value of the dasuaTemplateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasuaTemplateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASUATemplateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASTemplateLine }
     * 
     * 
     * @return
     *     The value of the dasuaTemplateList property.
     */
    public List<DASTemplateLine> getDASUATemplateList() {
        if (dasuaTemplateList == null) {
            dasuaTemplateList = new ArrayList<>();
        }
        return this.dasuaTemplateList;
    }

    /**
     * Gets the value of the dasqqcAccountTemplateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasqqcAccountTemplateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASQQCAccountTemplateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASTemplateLine }
     * 
     * 
     * @return
     *     The value of the dasqqcAccountTemplateList property.
     */
    public List<DASTemplateLine> getDASQQCAccountTemplateList() {
        if (dasqqcAccountTemplateList == null) {
            dasqqcAccountTemplateList = new ArrayList<>();
        }
        return this.dasqqcAccountTemplateList;
    }

    /**
     * Gets the value of the dasqqcCompanyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasqqcCompanyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASQQCCompanyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASQQCCompany }
     * 
     * 
     * @return
     *     The value of the dasqqcCompanyList property.
     */
    public List<DASQQCCompany> getDASQQCCompanyList() {
        if (dasqqcCompanyList == null) {
            dasqqcCompanyList = new ArrayList<>();
        }
        return this.dasqqcCompanyList;
    }

    /**
     * Gets the value of the daswuCardDtlsTemplateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the daswuCardDtlsTemplateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASWUCardDtlsTemplateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASTemplateLine }
     * 
     * 
     * @return
     *     The value of the daswuCardDtlsTemplateList property.
     */
    public List<DASTemplateLine> getDASWUCardDtlsTemplateList() {
        if (daswuCardDtlsTemplateList == null) {
            daswuCardDtlsTemplateList = new ArrayList<>();
        }
        return this.daswuCardDtlsTemplateList;
    }

    /**
     * Gets the value of the daswuCardPermChanges property.
     * 
     * @return
     *     possible object is
     *     {@link DASFlag }
     *     
     */
    public DASFlag getDASWUCardPermChanges() {
        return daswuCardPermChanges;
    }

    /**
     * Sets the value of the daswuCardPermChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASFlag }
     *     
     */
    public void setDASWUCardPermChanges(DASFlag value) {
        this.daswuCardPermChanges = value;
    }

    /**
     * Gets the value of the dasErrorInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasErrorInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASErrorInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASErrorInfo }
     * 
     * 
     * @return
     *     The value of the dasErrorInfoList property.
     */
    public List<DASErrorInfo> getDASErrorInfoList() {
        if (dasErrorInfoList == null) {
            dasErrorInfoList = new ArrayList<>();
        }
        return this.dasErrorInfoList;
    }

    /**
     * Gets the value of the dasTxnHistoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasTxnHistoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASTxnHistoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASTxnHistory }
     * 
     * 
     * @return
     *     The value of the dasTxnHistoryList property.
     */
    public List<DASTxnHistory> getDASTxnHistoryList() {
        if (dasTxnHistoryList == null) {
            dasTxnHistoryList = new ArrayList<>();
        }
        return this.dasTxnHistoryList;
    }

    /**
     * Gets the value of the dasTxnDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DASTxnDetail }
     *     
     */
    public DASTxnDetail getDASTxnDetail() {
        return dasTxnDetail;
    }

    /**
     * Sets the value of the dasTxnDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DASTxnDetail }
     *     
     */
    public void setDASTxnDetail(DASTxnDetail value) {
        this.dasTxnDetail = value;
    }

    /**
     * Gets the value of the dasatmLocationsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasatmLocationsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASATMLocationsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASATMLocInfo }
     * 
     * 
     * @return
     *     The value of the dasatmLocationsList property.
     */
    public List<DASATMLocInfo> getDASATMLocationsList() {
        if (dasatmLocationsList == null) {
            dasatmLocationsList = new ArrayList<>();
        }
        return this.dasatmLocationsList;
    }

    /**
     * Gets the value of the dasd2BBanksList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasd2BBanksList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASD2BBanksList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASBankInfo }
     * 
     * 
     * @return
     *     The value of the dasd2BBanksList property.
     */
    public List<DASBankInfo> getDASD2BBanksList() {
        if (dasd2BBanksList == null) {
            dasd2BBanksList = new ArrayList<>();
        }
        return this.dasd2BBanksList;
    }

    /**
     * Gets the value of the dasUnivComplTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasUnivComplTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASUnivComplTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASCompliance }
     * 
     * 
     * @return
     *     The value of the dasUnivComplTemplates property.
     */
    public List<DASCompliance> getDASUnivComplTemplates() {
        if (dasUnivComplTemplates == null) {
            dasUnivComplTemplates = new ArrayList<>();
        }
        return this.dasUnivComplTemplates;
    }

    /**
     * Gets the value of the dasModifyTxnTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasModifyTxnTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASModifyTxnTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASModifyTxnTemplates }
     * 
     * 
     * @return
     *     The value of the dasModifyTxnTemplates property.
     */
    public List<DASModifyTxnTemplates> getDASModifyTxnTemplates() {
        if (dasModifyTxnTemplates == null) {
            dasModifyTxnTemplates = new ArrayList<>();
        }
        return this.dasModifyTxnTemplates;
    }

    /**
     * Gets the value of the dasSupplyOrderList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasSupplyOrderList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASSupplyOrderList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASSupplyItemInfo }
     * 
     * 
     * @return
     *     The value of the dasSupplyOrderList property.
     */
    public List<DASSupplyItemInfo> getDASSupplyOrderList() {
        if (dasSupplyOrderList == null) {
            dasSupplyOrderList = new ArrayList<>();
        }
        return this.dasSupplyOrderList;
    }

    /**
     * Gets the value of the dasCheckWriterList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasCheckWriterList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASCheckWriterList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASCheckWriterInfo }
     * 
     * 
     * @return
     *     The value of the dasCheckWriterList property.
     */
    public List<DASCheckWriterInfo> getDASCheckWriterList() {
        if (dasCheckWriterList == null) {
            dasCheckWriterList = new ArrayList<>();
        }
        return this.dasCheckWriterList;
    }

    /**
     * Gets the value of the dasComboTemplateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasComboTemplateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASComboTemplateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASTemplateLine }
     * 
     * 
     * @return
     *     The value of the dasComboTemplateList property.
     */
    public List<DASTemplateLine> getDASComboTemplateList() {
        if (dasComboTemplateList == null) {
            dasComboTemplateList = new ArrayList<>();
        }
        return this.dasComboTemplateList;
    }

    /**
     * Gets the value of the dasAccountTableInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasAccountTableInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASAccountTableInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASAccountTableInfo }
     * 
     * 
     * @return
     *     The value of the dasAccountTableInfo property.
     */
    public List<DASAccountTableInfo> getDASAccountTableInfo() {
        if (dasAccountTableInfo == null) {
            dasAccountTableInfo = new ArrayList<>();
        }
        return this.dasAccountTableInfo;
    }

    /**
     * Gets the value of the dasDestinationCountriesCurrencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasDestinationCountriesCurrencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASDestinationCountriesCurrencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASCountryCurrency }
     * 
     * 
     * @return
     *     The value of the dasDestinationCountriesCurrencies property.
     */
    public List<DASCountryCurrency> getDASDestinationCountriesCurrencies() {
        if (dasDestinationCountriesCurrencies == null) {
            dasDestinationCountriesCurrencies = new ArrayList<>();
        }
        return this.dasDestinationCountriesCurrencies;
    }

    /**
     * Gets the value of the dasBankTransactionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasBankTransactionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASBankTransactionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BANKTRANSACTIONType }
     * 
     * 
     * @return
     *     The value of the dasBankTransactionData property.
     */
    public List<BANKTRANSACTIONType> getDASBankTransactionData() {
        if (dasBankTransactionData == null) {
            dasBankTransactionData = new ArrayList<>();
        }
        return this.dasBankTransactionData;
    }

    /**
     * Gets the value of the dasReasonList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasReasonList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASReasonList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASReasonList }
     * 
     * 
     * @return
     *     The value of the dasReasonList property.
     */
    public List<DASReasonList> getDASReasonList() {
        if (dasReasonList == null) {
            dasReasonList = new ArrayList<>();
        }
        return this.dasReasonList;
    }

    /**
     * Gets the value of the dasCityStateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasCityStateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASCityStateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASCityStateInfo }
     * 
     * 
     * @return
     *     The value of the dasCityStateList property.
     */
    public List<DASCityStateInfo> getDASCityStateList() {
        if (dasCityStateList == null) {
            dasCityStateList = new ArrayList<>();
        }
        return this.dasCityStateList;
    }

    /**
     * Gets the value of the dasAchBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasAchBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASAchBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASACHBankData }
     * 
     * 
     * @return
     *     The value of the dasAchBank property.
     */
    public List<DASACHBankData> getDASAchBank() {
        if (dasAchBank == null) {
            dasAchBank = new ArrayList<>();
        }
        return this.dasAchBank;
    }

    /**
     * Gets the value of the dasErrorTranslation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasErrorTranslation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASErrorTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASErrorTranslation }
     * 
     * 
     * @return
     *     The value of the dasErrorTranslation property.
     */
    public List<DASErrorTranslation> getDASErrorTranslation() {
        if (dasErrorTranslation == null) {
            dasErrorTranslation = new ArrayList<>();
        }
        return this.dasErrorTranslation;
    }

    /**
     * Gets the value of the dasdeliverytranslate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasdeliverytranslate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASDELIVERYTRANSLATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASDELIVERYTRANSLATE }
     * 
     * 
     * @return
     *     The value of the dasdeliverytranslate property.
     */
    public List<DASDELIVERYTRANSLATE> getDASDELIVERYTRANSLATE() {
        if (dasdeliverytranslate == null) {
            dasdeliverytranslate = new ArrayList<>();
        }
        return this.dasdeliverytranslate;
    }

    /**
     * Gets the value of the dasqqcfieldstemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasqqcfieldstemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASQQCFIELDSTEMPLATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASQQCFieldsTemplate }
     * 
     * 
     * @return
     *     The value of the dasqqcfieldstemplate property.
     */
    public List<DASQQCFieldsTemplate> getDASQQCFIELDSTEMPLATE() {
        if (dasqqcfieldstemplate == null) {
            dasqqcfieldstemplate = new ArrayList<>();
        }
        return this.dasqqcfieldstemplate;
    }

    /**
     * Gets the value of the dasReasonCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasReasonCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASReasonCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GETREASONCODELISTType }
     * 
     * 
     * @return
     *     The value of the dasReasonCodeList property.
     */
    public List<GETREASONCODELISTType> getDASReasonCodeList() {
        if (dasReasonCodeList == null) {
            dasReasonCodeList = new ArrayList<>();
        }
        return this.dasReasonCodeList;
    }

    /**
     * Gets the value of the dasCascadeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasCascadeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASCascadeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASCascadeList }
     * 
     * 
     * @return
     *     The value of the dasCascadeList property.
     */
    public List<DASCascadeList> getDASCascadeList() {
        if (dasCascadeList == null) {
            dasCascadeList = new ArrayList<>();
        }
        return this.dasCascadeList;
    }

    /**
     * Gets the value of the dasGetReasonOfTransactionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasGetReasonOfTransactionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASGetReasonOfTransactionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASGetReasonOfTransactionList }
     * 
     * 
     * @return
     *     The value of the dasGetReasonOfTransactionList property.
     */
    public List<DASGetReasonOfTransactionList> getDASGetReasonOfTransactionList() {
        if (dasGetReasonOfTransactionList == null) {
            dasGetReasonOfTransactionList = new ArrayList<>();
        }
        return this.dasGetReasonOfTransactionList;
    }

    /**
     * Gets the value of the dasGetStagedFulfillmentRegionsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasGetStagedFulfillmentRegionsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASGetStagedFulfillmentRegionsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASGetStagedFulfillmentRegionsList }
     * 
     * 
     * @return
     *     The value of the dasGetStagedFulfillmentRegionsList property.
     */
    public List<DASGetStagedFulfillmentRegionsList> getDASGetStagedFulfillmentRegionsList() {
        if (dasGetStagedFulfillmentRegionsList == null) {
            dasGetStagedFulfillmentRegionsList = new ArrayList<>();
        }
        return this.dasGetStagedFulfillmentRegionsList;
    }

    /**
     * Gets the value of the dasGetMessageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasGetMessageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASGetMessageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASGetMessageList }
     * 
     * 
     * @return
     *     The value of the dasGetMessageList property.
     */
    public List<DASGetMessageList> getDASGetMessageList() {
        if (dasGetMessageList == null) {
            dasGetMessageList = new ArrayList<>();
        }
        return this.dasGetMessageList;
    }

    /**
     * Gets the value of the dasGetStateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dasGetStateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDASGetStateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DASGetStateList }
     * 
     * 
     * @return
     *     The value of the dasGetStateList property.
     */
    public List<DASGetStateList> getDASGetStateList() {
        if (dasGetStateList == null) {
            dasGetStateList = new ArrayList<>();
        }
        return this.dasGetStateList;
    }

}
