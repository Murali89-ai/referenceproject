
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commit_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="commit_status">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Y"/>
 *     <enumeration value="P"/>
 *     <enumeration value="R"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "commit_status")
@XmlEnum
public enum CommitStatus {

    Y,
    P,
    R;

    public String value() {
        return name();
    }

    public static CommitStatus fromValue(String v) {
        return valueOf(v);
    }

}
