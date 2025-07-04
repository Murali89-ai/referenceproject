/*
 * ucd_pmgmt_v1_api
 * Swagger documentation for UCD Profile Management Service API
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: UCDWSDevTeam@westernunion.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.AuditInfo;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.UcbDisplayFlag;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.JSON;

/**
 * UcbDisplayFlagAndAudit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T21:22:09.739306500+05:30[Asia/Calcutta]")
public class UcbDisplayFlagAndAudit {
  public static final String SERIALIZED_NAME_UCB_DISPLAY_FLAG = "ucbDisplayFlag";
  @SerializedName(SERIALIZED_NAME_UCB_DISPLAY_FLAG)
  private UcbDisplayFlag ucbDisplayFlag;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo auditInfo;

  public UcbDisplayFlagAndAudit() {
  }

  public UcbDisplayFlagAndAudit ucbDisplayFlag(UcbDisplayFlag ucbDisplayFlag) {
    
    this.ucbDisplayFlag = ucbDisplayFlag;
    return this;
  }

   /**
   * Get ucbDisplayFlag
   * @return ucbDisplayFlag
  **/
  @javax.annotation.Nullable
  public UcbDisplayFlag getUcbDisplayFlag() {
    return ucbDisplayFlag;
  }


  public void setUcbDisplayFlag(UcbDisplayFlag ucbDisplayFlag) {
    this.ucbDisplayFlag = ucbDisplayFlag;
  }


  public UcbDisplayFlagAndAudit auditInfo(AuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  public AuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcbDisplayFlagAndAudit ucbDisplayFlagAndAudit = (UcbDisplayFlagAndAudit) o;
    return Objects.equals(this.ucbDisplayFlag, ucbDisplayFlagAndAudit.ucbDisplayFlag) &&
        Objects.equals(this.auditInfo, ucbDisplayFlagAndAudit.auditInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ucbDisplayFlag, auditInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcbDisplayFlagAndAudit {\n");
    sb.append("    ucbDisplayFlag: ").append(toIndentedString(ucbDisplayFlag)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ucbDisplayFlag");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UcbDisplayFlagAndAudit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UcbDisplayFlagAndAudit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UcbDisplayFlagAndAudit is not found in the empty JSON string", UcbDisplayFlagAndAudit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UcbDisplayFlagAndAudit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UcbDisplayFlagAndAudit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `ucbDisplayFlag`
      if (jsonObj.get("ucbDisplayFlag") != null && !jsonObj.get("ucbDisplayFlag").isJsonNull()) {
        UcbDisplayFlag.validateJsonObject(jsonObj.getAsJsonObject("ucbDisplayFlag"));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UcbDisplayFlagAndAudit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UcbDisplayFlagAndAudit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UcbDisplayFlagAndAudit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UcbDisplayFlagAndAudit.class));

       return (TypeAdapter<T>) new TypeAdapter<UcbDisplayFlagAndAudit>() {
           @Override
           public void write(JsonWriter out, UcbDisplayFlagAndAudit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UcbDisplayFlagAndAudit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UcbDisplayFlagAndAudit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UcbDisplayFlagAndAudit
  * @throws IOException if the JSON string is invalid with respect to UcbDisplayFlagAndAudit
  */
  public static UcbDisplayFlagAndAudit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UcbDisplayFlagAndAudit.class);
  }

 /**
  * Convert an instance of UcbDisplayFlagAndAudit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

