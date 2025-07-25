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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * This is response model for CustomerLookup service. If the customer is matched in database with the details given in request, the details of the existing customer will be returned in the response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T20:02:06.369160100+05:30[Asia/Calcutta]")
public class CustomerLookupResponse {

  @Autowired
  ObjectMapper mapper;

  public CustomerLookupResponse() {
    this.mapper = new ObjectMapper();
    this.mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
  }

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private HeaderResponse header;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS = "responseStatus";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS)
  private ResponseStatus responseStatus;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SEARCHED_BY = "searchedBy";
  @SerializedName(SERIALIZED_NAME_SEARCHED_BY)
  private CustomerKey searchedBy;

  public static final String SERIALIZED_NAME_NO_OF_CUSTOMERS = "noOfCustomers";
  @SerializedName(SERIALIZED_NAME_NO_OF_CUSTOMERS)
  private Integer noOfCustomers;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customerDetails";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private List<CustomerDetailsSet6> customerDetails;

  public static final String SERIALIZED_NAME_MORE_CUSTOMERS = "moreCustomers";
  @SerializedName(SERIALIZED_NAME_MORE_CUSTOMERS)
  private Boolean moreCustomers;

  public CustomerLookupResponse header(HeaderResponse header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nonnull
  public HeaderResponse getHeader() {
    return header;
  }


  public void setHeader(HeaderResponse header) {
    this.header = header;
  }


  public CustomerLookupResponse responseStatus(ResponseStatus responseStatus) {
    
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


  public CustomerLookupResponse description(String description) {
    
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


  public CustomerLookupResponse searchedBy(CustomerKey searchedBy) {
    
    this.searchedBy = searchedBy;
    return this;
  }

   /**
   * Get searchedBy
   * @return searchedBy
  **/
  @javax.annotation.Nullable
  public CustomerKey getSearchedBy() {
    return searchedBy;
  }


  public void setSearchedBy(CustomerKey searchedBy) {
    this.searchedBy = searchedBy;
  }


  public CustomerLookupResponse noOfCustomers(Integer noOfCustomers) {
    
    this.noOfCustomers = noOfCustomers;
    return this;
  }

   /**
   * No of Customer/Convenience in response
   * @return noOfCustomers
  **/
  @javax.annotation.Nullable
  public Integer getNoOfCustomers() {
    return noOfCustomers;
  }


  public void setNoOfCustomers(Integer noOfCustomers) {
    this.noOfCustomers = noOfCustomers;
  }


  public CustomerLookupResponse customerDetails(List<CustomerDetailsSet6> customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

  public CustomerLookupResponse addCustomerDetailsItem(CustomerDetailsSet6 customerDetailsItem) {
    if (this.customerDetails == null) {
      this.customerDetails = new ArrayList<>();
    }
    this.customerDetails.add(customerDetailsItem);
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  public List<CustomerDetailsSet6> getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(List<CustomerDetailsSet6> customerDetails) {
    this.customerDetails = customerDetails;
  }


  public CustomerLookupResponse moreCustomers(Boolean moreCustomers) {
    
    this.moreCustomers = moreCustomers;
    return this;
  }

   /**
   * Get moreCustomers
   * @return moreCustomers
  **/
  @javax.annotation.Nullable
  public Boolean getMoreCustomers() {
    return moreCustomers;
  }


  public void setMoreCustomers(Boolean moreCustomers) {
    this.moreCustomers = moreCustomers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLookupResponse customerLookupResponse = (CustomerLookupResponse) o;
    return Objects.equals(this.header, customerLookupResponse.header) &&
        Objects.equals(this.responseStatus, customerLookupResponse.responseStatus) &&
        Objects.equals(this.description, customerLookupResponse.description) &&
        Objects.equals(this.searchedBy, customerLookupResponse.searchedBy) &&
        Objects.equals(this.noOfCustomers, customerLookupResponse.noOfCustomers) &&
        Objects.equals(this.customerDetails, customerLookupResponse.customerDetails) &&
        Objects.equals(this.moreCustomers, customerLookupResponse.moreCustomers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, responseStatus, description, searchedBy, noOfCustomers, customerDetails, moreCustomers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLookupResponse {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    searchedBy: ").append(toIndentedString(searchedBy)).append("\n");
    sb.append("    noOfCustomers: ").append(toIndentedString(noOfCustomers)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    moreCustomers: ").append(toIndentedString(moreCustomers)).append("\n");
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
    openapiFields.add("searchedBy");
    openapiFields.add("noOfCustomers");
    openapiFields.add("customerDetails");
    openapiFields.add("moreCustomers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("header");
    openapiRequiredFields.add("responseStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerLookupResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerLookupResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerLookupResponse is not found in the empty JSON string", CustomerLookupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerLookupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerLookupResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerLookupResponse.openapiRequiredFields) {
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
      // validate the optional field `searchedBy`
      if (jsonObj.get("searchedBy") != null && !jsonObj.get("searchedBy").isJsonNull()) {
        CustomerKey.validateJsonObject(jsonObj.getAsJsonObject("searchedBy"));
      }
      if (jsonObj.get("customerDetails") != null && !jsonObj.get("customerDetails").isJsonNull()) {
        JsonArray jsonArraycustomerDetails = jsonObj.getAsJsonArray("customerDetails");
        if (jsonArraycustomerDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customerDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customerDetails` to be an array in the JSON string but got `%s`", jsonObj.get("customerDetails").toString()));
          }

          // validate the optional field `customerDetails` (array)
          for (int i = 0; i < jsonArraycustomerDetails.size(); i++) {
            CustomerDetailsSet6.validateJsonObject(jsonArraycustomerDetails.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerLookupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerLookupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerLookupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerLookupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerLookupResponse>() {
           @Override
           public void write(JsonWriter out, CustomerLookupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerLookupResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerLookupResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerLookupResponse
  * @throws IOException if the JSON string is invalid with respect to CustomerLookupResponse
  */
  public static CustomerLookupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerLookupResponse.class);
  }

 /**
  * Convert an instance of CustomerLookupResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

