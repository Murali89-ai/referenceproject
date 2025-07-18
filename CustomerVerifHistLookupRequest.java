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
 * This is the request model for CustomerVerifHistLookup service. This is to search for a customer verification history by supplying key elements.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T20:02:06.369160100+05:30[Asia/Calcutta]")
public class CustomerVerifHistLookupRequest {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Header header;

  public static final String SERIALIZED_NAME_CUSTOMER_KEY = "customerKey";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_KEY)
  private CustomerKey customerKey;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channelType";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private Integer channelType;

  public static final String SERIALIZED_NAME_VERIFICATION_FLAG_TYPE_ID = "verificationFlagTypeId";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_FLAG_TYPE_ID)
  private Integer verificationFlagTypeId;

  /**
   * This flag indicates that the response should include Partial Customers or not. This flag will be defaulted to N. * If the flag value is Y, then the search will be for Full + Partial customers. * If the flag value is N, then the search will be for Full customers only. 
   */
  @JsonAdapter(SendPartialCustomerFlagEnum.Adapter.class)
  public enum SendPartialCustomerFlagEnum {
    Y("Y"),
    
    N("N");

    private String value;

    SendPartialCustomerFlagEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SendPartialCustomerFlagEnum fromValue(String value) {
      for (SendPartialCustomerFlagEnum b : SendPartialCustomerFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SendPartialCustomerFlagEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SendPartialCustomerFlagEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SendPartialCustomerFlagEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SendPartialCustomerFlagEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEND_PARTIAL_CUSTOMER_FLAG = "sendPartialCustomerFlag";
  @SerializedName(SERIALIZED_NAME_SEND_PARTIAL_CUSTOMER_FLAG)
  private SendPartialCustomerFlagEnum sendPartialCustomerFlag = SendPartialCustomerFlagEnum.N;

  public static final String SERIALIZED_NAME_REQUEST_INITIATED_BY = "requestInitiatedBy";
  @SerializedName(SERIALIZED_NAME_REQUEST_INITIATED_BY)
  private String requestInitiatedBy;

  public CustomerVerifHistLookupRequest() {
  }

  public CustomerVerifHistLookupRequest header(Header header) {
    
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


  public CustomerVerifHistLookupRequest customerKey(CustomerKey customerKey) {
    
    this.customerKey = customerKey;
    return this;
  }

   /**
   * Get customerKey
   * @return customerKey
  **/
  @javax.annotation.Nonnull
  public CustomerKey getCustomerKey() {
    return customerKey;
  }


  public void setCustomerKey(CustomerKey customerKey) {
    this.customerKey = customerKey;
  }


  public CustomerVerifHistLookupRequest channelType(Integer channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * This flag would indicate to include channnel specific CustomerKYCDetails and CustomerVerification * If not passed in request, CustomerKYCDetails and CustomerVerification will be defaulted to Channel Type 1 * If passed in request, CustomerKYCDetails and CustomerVerification will be corresponding to the Channel Type passed 
   * @return channelType
  **/
  @javax.annotation.Nullable
  public Integer getChannelType() {
    return channelType;
  }


  public void setChannelType(Integer channelType) {
    this.channelType = channelType;
  }


  public CustomerVerifHistLookupRequest verificationFlagTypeId(Integer verificationFlagTypeId) {
    
    this.verificationFlagTypeId = verificationFlagTypeId;
    return this;
  }

   /**
   * Verification Flag Type Id. * 1 &#x3D; Veda, EID, EUID * 2 &#x3D; PEP Screening Status 
   * @return verificationFlagTypeId
  **/
  @javax.annotation.Nullable
  public Integer getVerificationFlagTypeId() {
    return verificationFlagTypeId;
  }


  public void setVerificationFlagTypeId(Integer verificationFlagTypeId) {
    this.verificationFlagTypeId = verificationFlagTypeId;
  }


  public CustomerVerifHistLookupRequest sendPartialCustomerFlag(SendPartialCustomerFlagEnum sendPartialCustomerFlag) {
    
    this.sendPartialCustomerFlag = sendPartialCustomerFlag;
    return this;
  }

   /**
   * This flag indicates that the response should include Partial Customers or not. This flag will be defaulted to N. * If the flag value is Y, then the search will be for Full + Partial customers. * If the flag value is N, then the search will be for Full customers only. 
   * @return sendPartialCustomerFlag
  **/
  @javax.annotation.Nullable
  public SendPartialCustomerFlagEnum getSendPartialCustomerFlag() {
    return sendPartialCustomerFlag;
  }


  public void setSendPartialCustomerFlag(SendPartialCustomerFlagEnum sendPartialCustomerFlag) {
    this.sendPartialCustomerFlag = sendPartialCustomerFlag;
  }


  public CustomerVerifHistLookupRequest requestInitiatedBy(String requestInitiatedBy) {
    
    this.requestInitiatedBy = requestInitiatedBy;
    return this;
  }

   /**
   * To identify who has initiated the request.
   * @return requestInitiatedBy
  **/
  @javax.annotation.Nonnull
  public String getRequestInitiatedBy() {
    return requestInitiatedBy;
  }


  public void setRequestInitiatedBy(String requestInitiatedBy) {
    this.requestInitiatedBy = requestInitiatedBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerVerifHistLookupRequest customerVerifHistLookupRequest = (CustomerVerifHistLookupRequest) o;
    return Objects.equals(this.header, customerVerifHistLookupRequest.header) &&
        Objects.equals(this.customerKey, customerVerifHistLookupRequest.customerKey) &&
        Objects.equals(this.channelType, customerVerifHistLookupRequest.channelType) &&
        Objects.equals(this.verificationFlagTypeId, customerVerifHistLookupRequest.verificationFlagTypeId) &&
        Objects.equals(this.sendPartialCustomerFlag, customerVerifHistLookupRequest.sendPartialCustomerFlag) &&
        Objects.equals(this.requestInitiatedBy, customerVerifHistLookupRequest.requestInitiatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, customerKey, channelType, verificationFlagTypeId, sendPartialCustomerFlag, requestInitiatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerVerifHistLookupRequest {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    customerKey: ").append(toIndentedString(customerKey)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    verificationFlagTypeId: ").append(toIndentedString(verificationFlagTypeId)).append("\n");
    sb.append("    sendPartialCustomerFlag: ").append(toIndentedString(sendPartialCustomerFlag)).append("\n");
    sb.append("    requestInitiatedBy: ").append(toIndentedString(requestInitiatedBy)).append("\n");
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
    openapiFields.add("customerKey");
    openapiFields.add("channelType");
    openapiFields.add("verificationFlagTypeId");
    openapiFields.add("sendPartialCustomerFlag");
    openapiFields.add("requestInitiatedBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("header");
    openapiRequiredFields.add("customerKey");
    openapiRequiredFields.add("requestInitiatedBy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerVerifHistLookupRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerVerifHistLookupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerVerifHistLookupRequest is not found in the empty JSON string", CustomerVerifHistLookupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerVerifHistLookupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerVerifHistLookupRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerVerifHistLookupRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `header`
      Header.validateJsonObject(jsonObj.getAsJsonObject("header"));
      // validate the required field `customerKey`
      CustomerKey.validateJsonObject(jsonObj.getAsJsonObject("customerKey"));
      if ((jsonObj.get("sendPartialCustomerFlag") != null && !jsonObj.get("sendPartialCustomerFlag").isJsonNull()) && !jsonObj.get("sendPartialCustomerFlag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sendPartialCustomerFlag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sendPartialCustomerFlag").toString()));
      }
      if (!jsonObj.get("requestInitiatedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestInitiatedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestInitiatedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerVerifHistLookupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerVerifHistLookupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerVerifHistLookupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerVerifHistLookupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerVerifHistLookupRequest>() {
           @Override
           public void write(JsonWriter out, CustomerVerifHistLookupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerVerifHistLookupRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerVerifHistLookupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerVerifHistLookupRequest
  * @throws IOException if the JSON string is invalid with respect to CustomerVerifHistLookupRequest
  */
  public static CustomerVerifHistLookupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerVerifHistLookupRequest.class);
  }

 /**
  * Convert an instance of CustomerVerifHistLookupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

