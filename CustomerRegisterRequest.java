package com.wu.brwallet.customer.profile.model.request.customerRegister;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CustomerRegisterRequest
 */

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRegisterRequest {

  @NotNull
  @JsonProperty("sessionId")
  private String sessionId;

  @NotNull
  @JsonProperty("endUserIp")
  private String endUserIp;

  @NotNull
  @JsonProperty("loginAuthType")
  private String loginAuthType;

  @NotNull
  @JsonProperty("appVersion")
  private String appVersion;

  @JsonProperty("userDn")
  private String userDn;

  @NotNull
  @JsonProperty("blackBoxData")
  private String blackBoxData;

  @JsonProperty("email")
  private String email;

  @NotNull
  @JsonProperty("emailVvStatus")
  private String emailVvStatus;

  @JsonProperty("emailVvStatusBy")
  private String emailVvStatusBy;

  @JsonProperty("emailVvDate")
  private String emailVvDate;

  @JsonProperty("deviceDetails")
  private String deviceDetails;

  @JsonProperty("accountTypeId")
  //Digits(integer = 2, fraction = 0)
  private String accountTypeId;

  @JsonProperty("idNumber")
  private String idNumber;

  @JsonProperty("locale")
  private String locale;

  @JsonProperty("accountStatus")
  private String accountStatus;

  @JsonProperty("address")
  private RegAddress address;

  @JsonProperty("phone")
  @Valid
  private RegPhone phone;

}

