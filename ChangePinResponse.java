package com.wu.brwallet.customer.profile.model.response.changepin;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ChangePinResponse
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangePinResponse {

  private Boolean success;

  private int httpStatus;

  private String message;

  private String externalRefId;

  private String correlationId;

  private List<String> additionalFields;

  private List<Errors> errors;


  @Data
  @Builder
  public static class Errors {
    private String errorCode;
    private String errorType;
    private String errorMessage;
    @JsonRawValue
    private String stackTrace;
  }

}

