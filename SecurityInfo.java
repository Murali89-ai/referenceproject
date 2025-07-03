
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="asnd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="apay" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="crcd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qcsh" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="domt" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qcol" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="isnd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="mxmt" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="ipay" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="payx" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="retx" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="acnv" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="avot" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="spdl" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="spvd" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qckr" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="prmc" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dtgm" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dmgm" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="itgm" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="mrtv" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="ccmt1" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="aucn" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="expo" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="ccmt4" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="leco" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="crpt" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="tran" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="clog" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="bngo" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="rtrm" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="wrap" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dbct" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dbmx" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dbcr" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dber" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dbfi" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dbra" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dbpfi" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dbpfu" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="dbpfa" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="aval" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="avalh" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="bval" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qsec" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qovl" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qacr" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qrpt" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="csvc" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qqcm" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="qqcr" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="cgmt" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="agrf" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="csvc_aucn" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="csvc_2" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="csvc_3" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="csvc_4" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="csvc_5" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="csvc_6" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="csvc_7" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityInfo", propOrder = {
    "asnd",
    "apay",
    "crcd",
    "qcsh",
    "domt",
    "qcol",
    "isnd",
    "mxmt",
    "ipay",
    "payx",
    "retx",
    "acnv",
    "avot",
    "spdl",
    "spvd",
    "qckr",
    "prmc",
    "dtgm",
    "dmgm",
    "itgm",
    "mrtv",
    "ccmt1",
    "aucn",
    "expo",
    "ccmt4",
    "leco",
    "crpt",
    "tran",
    "clog",
    "bngo",
    "rtrm",
    "wrap",
    "dbct",
    "dbmx",
    "dbcr",
    "dber",
    "dbfi",
    "dbra",
    "dbpfi",
    "dbpfu",
    "dbpfa",
    "aval",
    "avalh",
    "bval",
    "qsec",
    "qovl",
    "qacr",
    "qrpt",
    "csvc",
    "qqcm",
    "qqcr",
    "cgmt",
    "agrf",
    "csvcAucn",
    "csvc2",
    "csvc3",
    "csvc4",
    "csvc5",
    "csvc6",
    "csvc7"
})
public class SecurityInfo {

    protected String asnd;
    protected String apay;
    protected String crcd;
    protected String qcsh;
    protected String domt;
    protected String qcol;
    protected String isnd;
    protected String mxmt;
    protected String ipay;
    protected String payx;
    protected String retx;
    protected String acnv;
    protected String avot;
    protected String spdl;
    protected String spvd;
    protected String qckr;
    protected String prmc;
    protected String dtgm;
    protected String dmgm;
    protected String itgm;
    protected String mrtv;
    protected String ccmt1;
    protected String aucn;
    protected String expo;
    protected String ccmt4;
    protected String leco;
    protected String crpt;
    protected String tran;
    protected String clog;
    protected String bngo;
    protected String rtrm;
    protected String wrap;
    protected String dbct;
    protected String dbmx;
    protected String dbcr;
    protected String dber;
    protected String dbfi;
    protected String dbra;
    protected String dbpfi;
    protected String dbpfu;
    protected String dbpfa;
    protected String aval;
    protected String avalh;
    protected String bval;
    protected String qsec;
    protected String qovl;
    protected String qacr;
    protected String qrpt;
    protected String csvc;
    protected String qqcm;
    protected String qqcr;
    protected String cgmt;
    protected String agrf;
    @XmlElement(name = "csvc_aucn")
    protected String csvcAucn;
    @XmlElement(name = "csvc_2")
    protected String csvc2;
    @XmlElement(name = "csvc_3")
    protected String csvc3;
    @XmlElement(name = "csvc_4")
    protected String csvc4;
    @XmlElement(name = "csvc_5")
    protected String csvc5;
    @XmlElement(name = "csvc_6")
    protected String csvc6;
    @XmlElement(name = "csvc_7")
    protected String csvc7;

    /**
     * Gets the value of the asnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsnd() {
        return asnd;
    }

    /**
     * Sets the value of the asnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsnd(String value) {
        this.asnd = value;
    }

    /**
     * Gets the value of the apay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApay() {
        return apay;
    }

    /**
     * Sets the value of the apay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApay(String value) {
        this.apay = value;
    }

    /**
     * Gets the value of the crcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrcd() {
        return crcd;
    }

    /**
     * Sets the value of the crcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrcd(String value) {
        this.crcd = value;
    }

    /**
     * Gets the value of the qcsh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcsh() {
        return qcsh;
    }

    /**
     * Sets the value of the qcsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcsh(String value) {
        this.qcsh = value;
    }

    /**
     * Gets the value of the domt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomt() {
        return domt;
    }

    /**
     * Sets the value of the domt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomt(String value) {
        this.domt = value;
    }

    /**
     * Gets the value of the qcol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQcol() {
        return qcol;
    }

    /**
     * Sets the value of the qcol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQcol(String value) {
        this.qcol = value;
    }

    /**
     * Gets the value of the isnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsnd() {
        return isnd;
    }

    /**
     * Sets the value of the isnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsnd(String value) {
        this.isnd = value;
    }

    /**
     * Gets the value of the mxmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMxmt() {
        return mxmt;
    }

    /**
     * Sets the value of the mxmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMxmt(String value) {
        this.mxmt = value;
    }

    /**
     * Gets the value of the ipay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpay() {
        return ipay;
    }

    /**
     * Sets the value of the ipay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpay(String value) {
        this.ipay = value;
    }

    /**
     * Gets the value of the payx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayx() {
        return payx;
    }

    /**
     * Sets the value of the payx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayx(String value) {
        this.payx = value;
    }

    /**
     * Gets the value of the retx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetx() {
        return retx;
    }

    /**
     * Sets the value of the retx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetx(String value) {
        this.retx = value;
    }

    /**
     * Gets the value of the acnv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcnv() {
        return acnv;
    }

    /**
     * Sets the value of the acnv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcnv(String value) {
        this.acnv = value;
    }

    /**
     * Gets the value of the avot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvot() {
        return avot;
    }

    /**
     * Sets the value of the avot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvot(String value) {
        this.avot = value;
    }

    /**
     * Gets the value of the spdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpdl() {
        return spdl;
    }

    /**
     * Sets the value of the spdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpdl(String value) {
        this.spdl = value;
    }

    /**
     * Gets the value of the spvd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpvd() {
        return spvd;
    }

    /**
     * Sets the value of the spvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpvd(String value) {
        this.spvd = value;
    }

    /**
     * Gets the value of the qckr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQckr() {
        return qckr;
    }

    /**
     * Sets the value of the qckr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQckr(String value) {
        this.qckr = value;
    }

    /**
     * Gets the value of the prmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmc() {
        return prmc;
    }

    /**
     * Sets the value of the prmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmc(String value) {
        this.prmc = value;
    }

    /**
     * Gets the value of the dtgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtgm() {
        return dtgm;
    }

    /**
     * Sets the value of the dtgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtgm(String value) {
        this.dtgm = value;
    }

    /**
     * Gets the value of the dmgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmgm() {
        return dmgm;
    }

    /**
     * Sets the value of the dmgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmgm(String value) {
        this.dmgm = value;
    }

    /**
     * Gets the value of the itgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItgm() {
        return itgm;
    }

    /**
     * Sets the value of the itgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItgm(String value) {
        this.itgm = value;
    }

    /**
     * Gets the value of the mrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrtv() {
        return mrtv;
    }

    /**
     * Sets the value of the mrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrtv(String value) {
        this.mrtv = value;
    }

    /**
     * Gets the value of the ccmt1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcmt1() {
        return ccmt1;
    }

    /**
     * Sets the value of the ccmt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcmt1(String value) {
        this.ccmt1 = value;
    }

    /**
     * Gets the value of the aucn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAucn() {
        return aucn;
    }

    /**
     * Sets the value of the aucn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAucn(String value) {
        this.aucn = value;
    }

    /**
     * Gets the value of the expo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpo() {
        return expo;
    }

    /**
     * Sets the value of the expo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpo(String value) {
        this.expo = value;
    }

    /**
     * Gets the value of the ccmt4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcmt4() {
        return ccmt4;
    }

    /**
     * Sets the value of the ccmt4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcmt4(String value) {
        this.ccmt4 = value;
    }

    /**
     * Gets the value of the leco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeco() {
        return leco;
    }

    /**
     * Sets the value of the leco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeco(String value) {
        this.leco = value;
    }

    /**
     * Gets the value of the crpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrpt() {
        return crpt;
    }

    /**
     * Sets the value of the crpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrpt(String value) {
        this.crpt = value;
    }

    /**
     * Gets the value of the tran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTran() {
        return tran;
    }

    /**
     * Sets the value of the tran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTran(String value) {
        this.tran = value;
    }

    /**
     * Gets the value of the clog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClog() {
        return clog;
    }

    /**
     * Sets the value of the clog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClog(String value) {
        this.clog = value;
    }

    /**
     * Gets the value of the bngo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBngo() {
        return bngo;
    }

    /**
     * Sets the value of the bngo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBngo(String value) {
        this.bngo = value;
    }

    /**
     * Gets the value of the rtrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrm() {
        return rtrm;
    }

    /**
     * Sets the value of the rtrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtrm(String value) {
        this.rtrm = value;
    }

    /**
     * Gets the value of the wrap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrap() {
        return wrap;
    }

    /**
     * Sets the value of the wrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrap(String value) {
        this.wrap = value;
    }

    /**
     * Gets the value of the dbct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbct() {
        return dbct;
    }

    /**
     * Sets the value of the dbct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbct(String value) {
        this.dbct = value;
    }

    /**
     * Gets the value of the dbmx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbmx() {
        return dbmx;
    }

    /**
     * Sets the value of the dbmx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbmx(String value) {
        this.dbmx = value;
    }

    /**
     * Gets the value of the dbcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbcr() {
        return dbcr;
    }

    /**
     * Sets the value of the dbcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbcr(String value) {
        this.dbcr = value;
    }

    /**
     * Gets the value of the dber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDber() {
        return dber;
    }

    /**
     * Sets the value of the dber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDber(String value) {
        this.dber = value;
    }

    /**
     * Gets the value of the dbfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbfi() {
        return dbfi;
    }

    /**
     * Sets the value of the dbfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbfi(String value) {
        this.dbfi = value;
    }

    /**
     * Gets the value of the dbra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbra() {
        return dbra;
    }

    /**
     * Sets the value of the dbra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbra(String value) {
        this.dbra = value;
    }

    /**
     * Gets the value of the dbpfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbpfi() {
        return dbpfi;
    }

    /**
     * Sets the value of the dbpfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbpfi(String value) {
        this.dbpfi = value;
    }

    /**
     * Gets the value of the dbpfu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbpfu() {
        return dbpfu;
    }

    /**
     * Sets the value of the dbpfu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbpfu(String value) {
        this.dbpfu = value;
    }

    /**
     * Gets the value of the dbpfa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbpfa() {
        return dbpfa;
    }

    /**
     * Sets the value of the dbpfa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbpfa(String value) {
        this.dbpfa = value;
    }

    /**
     * Gets the value of the aval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAval() {
        return aval;
    }

    /**
     * Sets the value of the aval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAval(String value) {
        this.aval = value;
    }

    /**
     * Gets the value of the avalh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvalh() {
        return avalh;
    }

    /**
     * Sets the value of the avalh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvalh(String value) {
        this.avalh = value;
    }

    /**
     * Gets the value of the bval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBval() {
        return bval;
    }

    /**
     * Sets the value of the bval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBval(String value) {
        this.bval = value;
    }

    /**
     * Gets the value of the qsec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQsec() {
        return qsec;
    }

    /**
     * Sets the value of the qsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQsec(String value) {
        this.qsec = value;
    }

    /**
     * Gets the value of the qovl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQovl() {
        return qovl;
    }

    /**
     * Sets the value of the qovl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQovl(String value) {
        this.qovl = value;
    }

    /**
     * Gets the value of the qacr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQacr() {
        return qacr;
    }

    /**
     * Sets the value of the qacr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQacr(String value) {
        this.qacr = value;
    }

    /**
     * Gets the value of the qrpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrpt() {
        return qrpt;
    }

    /**
     * Sets the value of the qrpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrpt(String value) {
        this.qrpt = value;
    }

    /**
     * Gets the value of the csvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvc() {
        return csvc;
    }

    /**
     * Sets the value of the csvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvc(String value) {
        this.csvc = value;
    }

    /**
     * Gets the value of the qqcm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqcm() {
        return qqcm;
    }

    /**
     * Sets the value of the qqcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqcm(String value) {
        this.qqcm = value;
    }

    /**
     * Gets the value of the qqcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQqcr() {
        return qqcr;
    }

    /**
     * Sets the value of the qqcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQqcr(String value) {
        this.qqcr = value;
    }

    /**
     * Gets the value of the cgmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCgmt() {
        return cgmt;
    }

    /**
     * Sets the value of the cgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCgmt(String value) {
        this.cgmt = value;
    }

    /**
     * Gets the value of the agrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrf() {
        return agrf;
    }

    /**
     * Sets the value of the agrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrf(String value) {
        this.agrf = value;
    }

    /**
     * Gets the value of the csvcAucn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvcAucn() {
        return csvcAucn;
    }

    /**
     * Sets the value of the csvcAucn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvcAucn(String value) {
        this.csvcAucn = value;
    }

    /**
     * Gets the value of the csvc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvc2() {
        return csvc2;
    }

    /**
     * Sets the value of the csvc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvc2(String value) {
        this.csvc2 = value;
    }

    /**
     * Gets the value of the csvc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvc3() {
        return csvc3;
    }

    /**
     * Sets the value of the csvc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvc3(String value) {
        this.csvc3 = value;
    }

    /**
     * Gets the value of the csvc4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvc4() {
        return csvc4;
    }

    /**
     * Sets the value of the csvc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvc4(String value) {
        this.csvc4 = value;
    }

    /**
     * Gets the value of the csvc5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvc5() {
        return csvc5;
    }

    /**
     * Sets the value of the csvc5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvc5(String value) {
        this.csvc5 = value;
    }

    /**
     * Gets the value of the csvc6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvc6() {
        return csvc6;
    }

    /**
     * Sets the value of the csvc6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvc6(String value) {
        this.csvc6 = value;
    }

    /**
     * Gets the value of the csvc7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsvc7() {
        return csvc7;
    }

    /**
     * Sets the value of the csvc7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsvc7(String value) {
        this.csvc7 = value;
    }

}
