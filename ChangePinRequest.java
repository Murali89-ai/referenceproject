package com.wu.brwallet.customer.profile.model.request.changepin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ChangePinRequest
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangePinRequest {

  private String customerUmn;

  private String cpfNumber;

  private String pin;

  /**
   * Gets or Sets flowName
   */
  public enum FlowNameEnum {
    RESETPIN("ResetPin"),
    
    CHANGEPIN("ChangePin");

    private String value;

    FlowNameEnum(String value) {
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
    public static FlowNameEnum fromValue(String value) {
      for (FlowNameEnum b : FlowNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FlowNameEnum flowName;

}

