package com.wu.brwallet.customer.profile.model.response.validatepin;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
public class MambuClientResponse {
    private List<ClientDetails> payload;

    @Data
    public static class ClientDetails {
        private String encodedKey;
        private String id;
        private String state;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
        private OffsetDateTime creationDate;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
        private OffsetDateTime lastModifiedDate;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
        private OffsetDateTime approvedDate;
        private String firstName;
        private String lastName;
        private String middleName;
        private String homePhone;
        private String mobilePhone;
        private String mobilePhone2;
        private String emailAddress;
        private String preferredLanguage;
        private String birthDate;
        private String notes;
        private String assignedBranchKey;
        private String clientRoleKey;
        private int loanCycle;
        private int groupLoanCycle;
        private List<String> groupKeys;
        private List<Address> addresses;
        private List<String> idDocuments;
        private Profile _profile;
        private Documents _documents;
        private KYC _kyc;
    }

    @Data
    public static class Address {
        private String encodedKey;
        private String parentKey;
        private String line1;
        private String line2;
        private String city;
        private String region;
        private String postcode;
        private String country;
        private int indexInList;
    }

    @Data
    public static class Profile {
        private String ucdCustomerId;
        private String lastPinUpdatedDate;
        private String countryOfBirth;
        private String customerPin;
        private String wuTCPS;
        private String flagshipAccountHolderId;
        private String walletTCPS;
    }

    @Data
    public static class Documents {
        private String idType;
        private String idIssueDate;
        private String idExpirationDate;
        private String idNumber;
        private String idUF;
        private String lastIdDocVerificationDate;
    }

    @Data
    public static class KYC {
        private String occupation;
        private String purposeOfWallet;
        private String mothersName;
        private String employmentPositionLevel;
        private String sourceOfFunds;
        private String monthlyIncome;
    }
}
