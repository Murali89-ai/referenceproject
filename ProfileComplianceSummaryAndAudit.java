/*
 * ucd_clkup_v1_api
 * Swagger documentation for UCD Customer Lookup Service API
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: UCDWSDevTeam@westernunion.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.wu.brwallet.customer.profile.model.common.ucd.customerlookup;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ProfileComplianceSummaryAndAudit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T20:02:06.369160100+05:30[Asia/Calcutta]")
public class ProfileComplianceSummaryAndAudit {
  public static final String SERIALIZED_NAME_PROFILE_COMPLIANCE_SUMMARY = "profileComplianceSummary";
  @SerializedName(SERIALIZED_NAME_PROFILE_COMPLIANCE_SUMMARY)
  private ProfileComplianceSummary profileComplianceSummary;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo auditInfo;

  public ProfileComplianceSummaryAndAudit() {
  }

  public ProfileComplianceSummaryAndAudit profileComplianceSummary(ProfileComplianceSummary profileComplianceSummary) {
    
    this.profileComplianceSummary = profileComplianceSummary;
    return this;
  }

   /**
   * Get profileComplianceSummary
   * @return profileComplianceSummary
  **/
  @javax.annotation.Nullable
  public ProfileComplianceSummary getProfileComplianceSummary() {
    return profileComplianceSummary;
  }


  public void setProfileComplianceSummary(ProfileComplianceSummary profileComplianceSummary) {
    this.profileComplianceSummary = profileComplianceSummary;
  }


  public ProfileComplianceSummaryAndAudit auditInfo(AuditInfo auditInfo) {
    
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
    ProfileComplianceSummaryAndAudit profileComplianceSummaryAndAudit = (ProfileComplianceSummaryAndAudit) o;
    return Objects.equals(this.profileComplianceSummary, profileComplianceSummaryAndAudit.profileComplianceSummary) &&
        Objects.equals(this.auditInfo, profileComplianceSummaryAndAudit.auditInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileComplianceSummary, auditInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileComplianceSummaryAndAudit {\n");
    sb.append("    profileComplianceSummary: ").append(toIndentedString(profileComplianceSummary)).append("\n");
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
    openapiFields.add("profileComplianceSummary");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProfileComplianceSummaryAndAudit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProfileComplianceSummaryAndAudit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProfileComplianceSummaryAndAudit is not found in the empty JSON string", ProfileComplianceSummaryAndAudit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProfileComplianceSummaryAndAudit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProfileComplianceSummaryAndAudit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `profileComplianceSummary`
      if (jsonObj.get("profileComplianceSummary") != null && !jsonObj.get("profileComplianceSummary").isJsonNull()) {
        ProfileComplianceSummary.validateJsonObject(jsonObj.getAsJsonObject("profileComplianceSummary"));
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
       if (!ProfileComplianceSummaryAndAudit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProfileComplianceSummaryAndAudit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProfileComplianceSummaryAndAudit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProfileComplianceSummaryAndAudit.class));

       return (TypeAdapter<T>) new TypeAdapter<ProfileComplianceSummaryAndAudit>() {
           @Override
           public void write(JsonWriter out, ProfileComplianceSummaryAndAudit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProfileComplianceSummaryAndAudit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProfileComplianceSummaryAndAudit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProfileComplianceSummaryAndAudit
  * @throws IOException if the JSON string is invalid with respect to ProfileComplianceSummaryAndAudit
  */
  public static ProfileComplianceSummaryAndAudit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProfileComplianceSummaryAndAudit.class);
  }

 /**
  * Convert an instance of ProfileComplianceSummaryAndAudit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

