package com.wu.brwallet.customer.profile.model.common.blaze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversalRequestProperties {
    private String Purpose;
    private String MustangAppVersion;
    private String InternalId;
    private String Guid16;
    private String VersionName;
}
