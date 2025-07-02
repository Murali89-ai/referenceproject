package com.wu.brwallet.customer.profile.model.common.blaze;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Headers {
    private String source;
    private String eventType;
	private String messageId;
}
