package com.wu.brwallet.customer.profile.model.response.ping;

import com.wu.brwallet.customer.profile.model.response.ping.create.PingCreateResponse;
import com.wu.brwallet.customer.profile.model.response.ping.get.PingGetResponse;
import lombok.Data;

@Data
public class PingResponse {
    private PingCreateResponse pingCreateResponse;
    private PingGetResponse pingGetResponse;
}
