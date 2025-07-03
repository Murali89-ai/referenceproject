
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qqc_device_request.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="qqc_device_request">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="query"/>
 *     <enumeration value="update"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "qqc_device_request")
@XmlEnum
public enum QqcDeviceRequest {

    @XmlEnumValue("query")
    QUERY("query"),
    @XmlEnumValue("update")
    UPDATE("update");
    private final String value;

    QqcDeviceRequest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QqcDeviceRequest fromValue(String v) {
        for (QqcDeviceRequest c: QqcDeviceRequest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
