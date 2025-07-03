package com.wu.brwallet.customer.profile.model.retry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RetryDetails implements Serializable {

    private RetryKey retryKey;
}
