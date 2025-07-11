package com.wu.brwallet.customer.profile.model.response.ping.get;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Embedded {
    private List<Entry> entries;
}
