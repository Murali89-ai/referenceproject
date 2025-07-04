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
 * This is the response model for LookupCustomerLevelReceiver service. If the customer is found, successful message with customer details will be returned in the response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T20:02:06.369160100+05:30[Asia/Calcutta]")
public class LookupCustomerLevelReceiverResponse {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Header header;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS = "responseStatus";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS)
  private ResponseStatus responseStatus;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customerDetails";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private CustomerDetailsSet3 customerDetails;

  public LookupCustomerLevelReceiverResponse() {
  }

  public LookupCustomerLevelReceiverResponse header(Header header) {
    
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


  public LookupCustomerLevelReceiverResponse responseStatus(ResponseStatus responseStatus) {
    
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


  public LookupCustomerLevelReceiverResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Summary of the response
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public LookupCustomerLevelReceiverResponse customerDetails(CustomerDetailsSet3 customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  public CustomerDetailsSet3 getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(CustomerDetailsSet3 customerDetails) {
    this.customerDetails = customerDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupCustomerLevelReceiverResponse lookupCustomerLevelReceiverResponse = (LookupCustomerLevelReceiverResponse) o;
    return Objects.equals(this.header, lookupCustomerLevelReceiverResponse.header) &&
        Objects.equals(this.responseStatus, lookupCustomerLevelReceiverResponse.responseStatus) &&
        Objects.equals(this.description, lookupCustomerLevelReceiverResponse.description) &&
        Objects.equals(this.customerDetails, lookupCustomerLevelReceiverResponse.customerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, responseStatus, description, customerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupCustomerLevelReceiverResponse {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
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
    openapiFields.add("customerDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("header");
    openapiRequiredFields.add("responseStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LookupCustomerLevelReceiverResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LookupCustomerLevelReceiverResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LookupCustomerLevelReceiverResponse is not found in the empty JSON string", LookupCustomerLevelReceiverResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LookupCustomerLevelReceiverResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LookupCustomerLevelReceiverResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LookupCustomerLevelReceiverResponse.openapiRequiredFields) {
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
      // validate the optional field `customerDetails`
      if (jsonObj.get("customerDetails") != null && !jsonObj.get("customerDetails").isJsonNull()) {
        CustomerDetailsSet3.validateJsonObject(jsonObj.getAsJsonObject("customerDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LookupCustomerLevelReceiverResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LookupCustomerLevelReceiverResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LookupCustomerLevelReceiverResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LookupCustomerLevelReceiverResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LookupCustomerLevelReceiverResponse>() {
           @Override
           public void write(JsonWriter out, LookupCustomerLevelReceiverResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LookupCustomerLevelReceiverResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LookupCustomerLevelReceiverResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LookupCustomerLevelReceiverResponse
  * @throws IOException if the JSON string is invalid with respect to LookupCustomerLevelReceiverResponse
  */
  public static LookupCustomerLevelReceiverResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LookupCustomerLevelReceiverResponse.class);
  }

 /**
  * Convert an instance of LookupCustomerLevelReceiverResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

