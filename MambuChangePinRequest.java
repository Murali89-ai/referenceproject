package com.wu.brwallet.customer.profile.model.common.mambu;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MambuChangePinRequest {
    String op;
    String path;
    String value;
}
