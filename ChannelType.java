
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="channel_type">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CSC"/>
 *     <enumeration value="AGT"/>
 *     <enumeration value="H2H"/>
 *     <enumeration value="MTBP"/>
 *     <enumeration value="WEB"/>
 *     <enumeration value="WGD"/>
 *     <enumeration value="AGT"/>
 *     <enumeration value="IVR"/>
 *     <enumeration value="WUMT"/>
 *     <enumeration value="TMT"/>
 *     <enumeration value="MMT"/>
 *     <enumeration value="CSC"/>
 *     <enumeration value="SMT"/>
 *     <enumeration value="SMARTPHONE"/>
 *     <enumeration value="STAGEANDPAY"/>
 *     <enumeration value="MYWU"/>
 *     <enumeration value="WGDT"/>
 *     <enumeration value="DSS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "channel_type")
@XmlEnum
public enum ChannelType {

    CSC("CSC"),
    AGT("AGT"),
    @XmlEnumValue("H2H")
    H_2_H("H2H"),
    MTBP("MTBP"),
    WEB("WEB"),
    WGD("WGD"),
    IVR("IVR"),
    WUMT("WUMT"),
    TMT("TMT"),
    MMT("MMT"),
    SMT("SMT"),
    SMARTPHONE("SMARTPHONE"),
    STAGEANDPAY("STAGEANDPAY"),
    MYWU("MYWU"),
    WGDT("WGDT"),
    DSS("DSS");
    private final String value;

    ChannelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelType fromValue(String v) {
        for (ChannelType c: ChannelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
