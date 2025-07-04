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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * StatusType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-17T21:22:09.739306500+05:30[Asia/Calcutta]")
public class StatusType {
  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_STRING_CODE = "stringCode";
  @SerializedName(SERIALIZED_NAME_STRING_CODE)
  private String stringCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public StatusType() {
  }

  public StatusType statusCode(String statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Numeric code (restricted to positive integers) giving information about the cumulative message itself
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  public StatusType stringCode(String stringCode) {
    
    this.stringCode = stringCode;
    return this;
  }

   /**
   * String representation of the info. For example - info.ignored.mobile.in.registration, when the Mobile is ignored while registering the customer
   * @return stringCode
  **/
  @javax.annotation.Nullable
  public String getStringCode() {
    return stringCode;
  }


  public void setStringCode(String stringCode) {
    this.stringCode = stringCode;
  }


  public StatusType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * This will provide more information on the status code.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusType statusType = (StatusType) o;
    return Objects.equals(this.statusCode, statusType.statusCode) &&
        Objects.equals(this.stringCode, statusType.stringCode) &&
        Objects.equals(this.description, statusType.description);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, stringCode, description);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusType {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    stringCode: ").append(toIndentedString(stringCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("statusCode");
    openapiFields.add("stringCode");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatusType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatusType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatusType is not found in the empty JSON string", StatusType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatusType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatusType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("statusCode") != null && !jsonObj.get("statusCode").isJsonNull()) && !jsonObj.get("statusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusCode").toString()));
      }
      if ((jsonObj.get("stringCode") != null && !jsonObj.get("stringCode").isJsonNull()) && !jsonObj.get("stringCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stringCode").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatusType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatusType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatusType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatusType.class));

       return (TypeAdapter<T>) new TypeAdapter<StatusType>() {
           @Override
           public void write(JsonWriter out, StatusType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatusType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatusType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatusType
  * @throws IOException if the JSON string is invalid with respect to StatusType
  */
  public static StatusType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatusType.class);
  }

 /**
  * Convert an instance of StatusType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

