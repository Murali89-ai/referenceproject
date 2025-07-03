package com.wu.brwallet.customer.profile.model.request.ping.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PingUpdateRequest {

    private List<Modifications> modifications;


}
