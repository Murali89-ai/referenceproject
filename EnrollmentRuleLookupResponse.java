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
import com.google.gson.annotations.JsonAdapter;
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
 * This is the response model for EnrollmentRuleLookup service. If the rule is found, successful message with level code &amp; card calss will be sent in the response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T20:02:06.369160100+05:30[Asia/Calcutta]")
public class EnrollmentRuleLookupResponse {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Header header;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS = "responseStatus";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS)
  private ResponseStatus responseStatus;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  /**
   * Enrollment Type - Explicit (E)/Convenience (C). If this field is not passed it will be treated as Implicit.
   */
  @JsonAdapter(EnrollmentTypeEnum.Adapter.class)
  public enum EnrollmentTypeEnum {
    E("E"),
    
    C("C");

    private String value;

    EnrollmentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnrollmentTypeEnum fromValue(String value) {
      for (EnrollmentTypeEnum b : EnrollmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnrollmentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnrollmentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnrollmentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnrollmentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENROLLMENT_TYPE = "enrollmentType";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_TYPE)
  private EnrollmentTypeEnum enrollmentType;

  /**
   * A - if auto enroll , C - Conveneince enroll, Y - previously enrolled
   */
  @JsonAdapter(AutoEnrollFlagEnum.Adapter.class)
  public enum AutoEnrollFlagEnum {
    A("A"),
    
    C("C"),
    
    Y("Y");

    private String value;

    AutoEnrollFlagEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutoEnrollFlagEnum fromValue(String value) {
      for (AutoEnrollFlagEnum b : AutoEnrollFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AutoEnrollFlagEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutoEnrollFlagEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutoEnrollFlagEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AutoEnrollFlagEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTO_ENROLL_FLAG = "autoEnrollFlag";
  @SerializedName(SERIALIZED_NAME_AUTO_ENROLL_FLAG)
  private AutoEnrollFlagEnum autoEnrollFlag;

  public static final String SERIALIZED_NAME_CUSTOMER_LEVEL_CODE = "customerLevelCode";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LEVEL_CODE)
  private String customerLevelCode;

  public static final String SERIALIZED_NAME_CARD_CLASS = "cardClass";
  @SerializedName(SERIALIZED_NAME_CARD_CLASS)
  private String cardClass;

  public EnrollmentRuleLookupResponse() {
  }

  public EnrollmentRuleLookupResponse header(Header header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nonnull
  public Header getHeader() {
    return header;
  }


  public void setHeader(Header header) {
    this.header = header;
  }


  public EnrollmentRuleLookupResponse responseStatus(ResponseStatus responseStatus) {
    
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * Get responseStatus
   * @return responseStatus
  **/
  @javax.annotation.Nonnull
  public ResponseStatus getResponseStatus() {
    return responseStatus;
  }


  public void setResponseStatus(ResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }


  public EnrollmentRuleLookupResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Summary of the Enrollment Rule Lookup response
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EnrollmentRuleLookupResponse ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Rule Id
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public EnrollmentRuleLookupResponse enrollmentType(EnrollmentTypeEnum enrollmentType) {
    
    this.enrollmentType = enrollmentType;
    return this;
  }

   /**
   * Enrollment Type - Explicit (E)/Convenience (C). If this field is not passed it will be treated as Implicit.
   * @return enrollmentType
  **/
  @javax.annotation.Nullable
  public EnrollmentTypeEnum getEnrollmentType() {
    return enrollmentType;
  }


  public void setEnrollmentType(EnrollmentTypeEnum enrollmentType) {
    this.enrollmentType = enrollmentType;
  }


  public EnrollmentRuleLookupResponse autoEnrollFlag(AutoEnrollFlagEnum autoEnrollFlag) {
    
    this.autoEnrollFlag = autoEnrollFlag;
    return this;
  }

   /**
   * A - if auto enroll , C - Conveneince enroll, Y - previously enrolled
   * @return autoEnrollFlag
  **/
  @javax.annotation.Nullable
  public AutoEnrollFlagEnum getAutoEnrollFlag() {
    return autoEnrollFlag;
  }


  public void setAutoEnrollFlag(AutoEnrollFlagEnum autoEnrollFlag) {
    this.autoEnrollFlag = autoEnrollFlag;
  }


  public EnrollmentRuleLookupResponse customerLevelCode(String customerLevelCode) {
    
    this.customerLevelCode = customerLevelCode;
    return this;
  }

   /**
   * Customer&#39;s Level Code. Example values are XXC, YYC, WU6, WU7 etc.
   * @return customerLevelCode
  **/
  @javax.annotation.Nullable
  public String getCustomerLevelCode() {
    return customerLevelCode;
  }


  public void setCustomerLevelCode(String customerLevelCode) {
    this.customerLevelCode = customerLevelCode;
  }


  public EnrollmentRuleLookupResponse cardClass(String cardClass) {
    
    this.cardClass = cardClass;
    return this;
  }

   /**
   * This is an extension of Level Code.
   * @return cardClass
  **/
  @javax.annotation.Nullable
  public String getCardClass() {
    return cardClass;
  }


  public void setCardClass(String cardClass) {
    this.cardClass = cardClass;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentRuleLookupResponse enrollmentRuleLookupResponse = (EnrollmentRuleLookupResponse) o;
    return Objects.equals(this.header, enrollmentRuleLookupResponse.header) &&
        Objects.equals(this.responseStatus, enrollmentRuleLookupResponse.responseStatus) &&
        Objects.equals(this.description, enrollmentRuleLookupResponse.description) &&
        Objects.equals(this.ruleId, enrollmentRuleLookupResponse.ruleId) &&
        Objects.equals(this.enrollmentType, enrollmentRuleLookupResponse.enrollmentType) &&
        Objects.equals(this.autoEnrollFlag, enrollmentRuleLookupResponse.autoEnrollFlag) &&
        Objects.equals(this.customerLevelCode, enrollmentRuleLookupResponse.customerLevelCode) &&
        Objects.equals(this.cardClass, enrollmentRuleLookupResponse.cardClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, responseStatus, description, ruleId, enrollmentType, autoEnrollFlag, customerLevelCode, cardClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentRuleLookupResponse {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    enrollmentType: ").append(toIndentedString(enrollmentType)).append("\n");
    sb.append("    autoEnrollFlag: ").append(toIndentedString(autoEnrollFlag)).append("\n");
    sb.append("    customerLevelCode: ").append(toIndentedString(customerLevelCode)).append("\n");
    sb.append("    cardClass: ").append(toIndentedString(cardClass)).append("\n");
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
    openapiFields.add("header");
    openapiFields.add("responseStatus");
    openapiFields.add("description");
    openapiFields.add("ruleId");
    openapiFields.add("enrollmentType");
    openapiFields.add("autoEnrollFlag");
    openapiFields.add("customerLevelCode");
    openapiFields.add("cardClass");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("header");
    openapiRequiredFields.add("responseStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnrollmentRuleLookupResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EnrollmentRuleLookupResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnrollmentRuleLookupResponse is not found in the empty JSON string", EnrollmentRuleLookupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnrollmentRuleLookupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnrollmentRuleLookupResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnrollmentRuleLookupResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `header`
      Header.validateJsonObject(jsonObj.getAsJsonObject("header"));
      // validate the required field `responseStatus`
      ResponseStatus.validateJsonObject(jsonObj.getAsJsonObject("responseStatus"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("ruleId") != null && !jsonObj.get("ruleId").isJsonNull()) && !jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
      if ((jsonObj.get("enrollmentType") != null && !jsonObj.get("enrollmentType").isJsonNull()) && !jsonObj.get("enrollmentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrollmentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrollmentType").toString()));
      }
      if ((jsonObj.get("autoEnrollFlag") != null && !jsonObj.get("autoEnrollFlag").isJsonNull()) && !jsonObj.get("autoEnrollFlag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoEnrollFlag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("autoEnrollFlag").toString()));
      }
      if ((jsonObj.get("customerLevelCode") != null && !jsonObj.get("customerLevelCode").isJsonNull()) && !jsonObj.get("customerLevelCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerLevelCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerLevelCode").toString()));
      }
      if ((jsonObj.get("cardClass") != null && !jsonObj.get("cardClass").isJsonNull()) && !jsonObj.get("cardClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardClass").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnrollmentRuleLookupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnrollmentRuleLookupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnrollmentRuleLookupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnrollmentRuleLookupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EnrollmentRuleLookupResponse>() {
           @Override
           public void write(JsonWriter out, EnrollmentRuleLookupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnrollmentRuleLookupResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnrollmentRuleLookupResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnrollmentRuleLookupResponse
  * @throws IOException if the JSON string is invalid with respect to EnrollmentRuleLookupResponse
  */
  public static EnrollmentRuleLookupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnrollmentRuleLookupResponse.class);
  }

 /**
  * Convert an instance of EnrollmentRuleLookupResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

