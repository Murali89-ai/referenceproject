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
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.AccountKey;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.PartnerKey;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.ServiceProviderKey;

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
 * CustomerKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T21:22:09.739306500+05:30[Asia/Calcutta]")
public class CustomerKey {
  public static final String SERIALIZED_NAME_CUSTOMER_UMN = "customerUmn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_UMN)
  private String customerUmn;

  public static final String SERIALIZED_NAME_PCP_NUMBER = "pcpNumber";
  @SerializedName(SERIALIZED_NAME_PCP_NUMBER)
  private String pcpNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_KEY = "accountKey";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_KEY)
  private AccountKey accountKey;

  public static final String SERIALIZED_NAME_PARTNER_KEY = "partnerKey";
  @SerializedName(SERIALIZED_NAME_PARTNER_KEY)
  private PartnerKey partnerKey;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_KEY = "serviceProviderKey";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_KEY)
  private ServiceProviderKey serviceProviderKey;

  public CustomerKey() {
  }

  public CustomerKey customerUmn(String customerUmn) {
    
    this.customerUmn = customerUmn;
    return this;
  }

   /**
   * Customer&#39;s UMN
   * @return customerUmn
  **/
  @javax.annotation.Nullable
  public String getCustomerUmn() {
    return customerUmn;
  }


  public void setCustomerUmn(String customerUmn) {
    this.customerUmn = customerUmn;
  }


  public CustomerKey pcpNumber(String pcpNumber) {
    
    this.pcpNumber = pcpNumber;
    return this;
  }

   /**
   * Customer&#39;s PCP Number
   * @return pcpNumber
  **/
  @javax.annotation.Nullable
  public String getPcpNumber() {
    return pcpNumber;
  }


  public void setPcpNumber(String pcpNumber) {
    this.pcpNumber = pcpNumber;
  }


  public CustomerKey accountKey(AccountKey accountKey) {
    
    this.accountKey = accountKey;
    return this;
  }

   /**
   * Get accountKey
   * @return accountKey
  **/
  @javax.annotation.Nullable
  public AccountKey getAccountKey() {
    return accountKey;
  }


  public void setAccountKey(AccountKey accountKey) {
    this.accountKey = accountKey;
  }


  public CustomerKey partnerKey(PartnerKey partnerKey) {
    
    this.partnerKey = partnerKey;
    return this;
  }

   /**
   * Get partnerKey
   * @return partnerKey
  **/
  @javax.annotation.Nullable
  public PartnerKey getPartnerKey() {
    return partnerKey;
  }


  public void setPartnerKey(PartnerKey partnerKey) {
    this.partnerKey = partnerKey;
  }


  public CustomerKey serviceProviderKey(ServiceProviderKey serviceProviderKey) {
    
    this.serviceProviderKey = serviceProviderKey;
    return this;
  }

   /**
   * Get serviceProviderKey
   * @return serviceProviderKey
  **/
  @javax.annotation.Nullable
  public ServiceProviderKey getServiceProviderKey() {
    return serviceProviderKey;
  }


  public void setServiceProviderKey(ServiceProviderKey serviceProviderKey) {
    this.serviceProviderKey = serviceProviderKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerKey customerKey = (CustomerKey) o;
    return Objects.equals(this.customerUmn, customerKey.customerUmn) &&
        Objects.equals(this.pcpNumber, customerKey.pcpNumber) &&
        Objects.equals(this.accountKey, customerKey.accountKey) &&
        Objects.equals(this.partnerKey, customerKey.partnerKey) &&
        Objects.equals(this.serviceProviderKey, customerKey.serviceProviderKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerUmn, pcpNumber, accountKey, partnerKey, serviceProviderKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerKey {\n");
    sb.append("    customerUmn: ").append(toIndentedString(customerUmn)).append("\n");
    sb.append("    pcpNumber: ").append(toIndentedString(pcpNumber)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    partnerKey: ").append(toIndentedString(partnerKey)).append("\n");
    sb.append("    serviceProviderKey: ").append(toIndentedString(serviceProviderKey)).append("\n");
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
    openapiFields.add("customerUmn");
    openapiFields.add("pcpNumber");
    openapiFields.add("accountKey");
    openapiFields.add("partnerKey");
    openapiFields.add("serviceProviderKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomerKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerKey is not found in the empty JSON string", CustomerKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("customerUmn") != null && !jsonObj.get("customerUmn").isJsonNull()) && !jsonObj.get("customerUmn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerUmn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerUmn").toString()));
      }
      if ((jsonObj.get("pcpNumber") != null && !jsonObj.get("pcpNumber").isJsonNull()) && !jsonObj.get("pcpNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pcpNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pcpNumber").toString()));
      }
      // validate the optional field `accountKey`
      if (jsonObj.get("accountKey") != null && !jsonObj.get("accountKey").isJsonNull()) {
        AccountKey.validateJsonObject(jsonObj.getAsJsonObject("accountKey"));
      }
      // validate the optional field `partnerKey`
      if (jsonObj.get("partnerKey") != null && !jsonObj.get("partnerKey").isJsonNull()) {
        PartnerKey.validateJsonObject(jsonObj.getAsJsonObject("partnerKey"));
      }
      // validate the optional field `serviceProviderKey`
      if (jsonObj.get("serviceProviderKey") != null && !jsonObj.get("serviceProviderKey").isJsonNull()) {
        ServiceProviderKey.validateJsonObject(jsonObj.getAsJsonObject("serviceProviderKey"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerKey.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerKey>() {
           @Override
           public void write(JsonWriter out, CustomerKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerKey
  * @throws IOException if the JSON string is invalid with respect to CustomerKey
  */
  public static CustomerKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerKey.class);
  }

 /**
  * Convert an instance of CustomerKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

