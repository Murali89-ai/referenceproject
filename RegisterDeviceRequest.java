package com.wu.brwallet.customer.profile.model.request.registerDevice;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RegisterDeviceRequest
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDeviceRequest {

  @JsonProperty("umn")
  private String umn;

  @JsonProperty("deviceId")
  @NotNull
  @NotBlank
  @NotEmpty
  private String deviceId;

  @JsonProperty("deviceName")
  private String deviceName;

  @JsonProperty("deviceModel")
  private String deviceModel;

  @JsonProperty("deviceOs")
  private String deviceOs;

  @JsonProperty("sessionId")
  private String sessionId;

  @JsonProperty("comments")
  private String comments;

}

