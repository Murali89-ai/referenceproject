package com.wu.brwallet.customer.profile.model.request.customerRegister;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RegPhone
 */

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class RegPhone {

  @NotNull
  @JsonProperty("isdCode")
  private String isdCode;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("phoneVvStatus")
  private String phoneVvStatus;

  @JsonProperty("phoneVvStatusBy")
  private String phoneVvStatusBy;

  @JsonProperty("phoneVvDate")
  private String phoneVvDate;

}

