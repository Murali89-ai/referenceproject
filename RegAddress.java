package com.wu.brwallet.customer.profile.model.request.customerRegister;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RegAddress
 */

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class RegAddress {

  @JsonProperty("addressType")
  private String addressType;

  @JsonProperty("countryCodeIso3")
  private String countryCodeIso3;

}

