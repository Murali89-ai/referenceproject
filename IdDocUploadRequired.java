
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdDoc_upload_required.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IdDoc_upload_required">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Y"/>
 *     <enumeration value="N"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IdDoc_upload_required")
@XmlEnum
public enum IdDocUploadRequired {

    Y,
    N;

    public String value() {
        return name();
    }

    public static IdDocUploadRequired fromValue(String v) {
        return valueOf(v);
    }

}
