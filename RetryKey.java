package com.wu.brwallet.customer.profile.model.retry;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RetryKey implements Serializable {
    @JsonProperty("cusnotifySuccess")
    private Boolean cusnotifySuccess;

    @JsonProperty("bizPinUpdateSuccess")
    private Boolean bizPinUpdateSuccess;
}
