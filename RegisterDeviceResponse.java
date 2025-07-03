package com.wu.brwallet.customer.profile.model.response.registerDevice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * RegisterDeviceResponse
 */

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDeviceResponse {

  @JsonProperty("umn")
  private String umn;

  @JsonProperty("deviceId")
  private String deviceId;

  @JsonProperty("deviceName")
  private String deviceName;

  @JsonProperty("deviceModel")
  private String deviceModel;

  @JsonProperty("deviceOs")
  private String deviceOs;
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    A("A"),

    B("B"),

    I("I");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("startDate")
  private String startDate;

}

