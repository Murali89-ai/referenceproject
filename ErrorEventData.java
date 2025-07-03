package com.wu.brwallet.customer.profile.model.common.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorEventData {
   private String processName;
   private String flowName;
   private String customerUmn;
   private String errorMessage;
}
