package com.wu.brwallet.customer.profile.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppConstants {

    public static final String CORRELATION_ID_KEY = "crId";
    public static final String EXTERNAL_REFERENCE_ID_KEY = "externalRefId";
    public static final String BUSINESS_AREA = "DigitalBank";
    public static final String TENANT_ID = "WU";
    public static final String BUSINESS_DOMAIN = "WUIB";
    public static final String PING_SERVICE_ID="PINGCONN";

    //validate pin
    public static final String MAMBU_ENCRYPTION_ALGORITHM = "PBEWithHmacSHA512AndAES_256";
    public static final String MAMBU_GETCLIENT_BUSINESS_EVENT_TARGET_SYSTEM = "Mambu";
    public static final String MAMBU_GETCLIENT_BUSINESS_EVENT_SOURCE = "SpringBoot";
    public static final String MAMBU_GETCLIENT_BUSINESS_EVENT_EVENT_STAGE = "POST";
    public static final String MAMBU_GETCLIENT_BUSINESS_EVENT_DESCRIPTION = "Retrieve adaptor details from Mambu";
    public static final String MAMBU_GETCLIENT_FLOW_NAME = "CUSTVALDPIN001";
    public static final String MAMBU_FILTER_CRITERIA_FIELD = "_profile.ucdCustomerId";
    public static final String MAMBU_FILTER_CRITERIA_OPERATOR = "EQUALS";
    public static final String MAMBU_HEADER_ACCEPT = "application/vnd.mambu.v2+json";
    public static final String MAMBU_URI_QUERY_PARAM_DETAILS_LEVEL = "FULL";
    public static final Integer MAMBU_URI_QUERY_PARAM_OFFSET = 0;
    public static final Integer MAMBU_URI_QUERY_PARAM_LIMIT = 50;
    public static final String PROCESS_NAME = "Customer Profile API";
    public static final String INVALID_PIN="INVALID_PIN";
    public static final String INVALID_BOOLEAN = "INVALID_BOOLEAN";
    public static final String PIN_NOT_PRESENT = "PIN_NOT_PRESENT";
    public static final String PIN_NOT_PRESENT_MESSAGE = "Biz call failed and Pin is not set in Mambu";
    public static final String PIN_NOT_PRESENT_STACK_TRACE = "pin is not validated in Mambu";
    public static final String MAMBU_VALIDATE_PIN_BAD_REQUEST = "BAD_REQUEST";
    public static final String MAMBU_VALIDATE_INVALID_DATA_PROVIDED = "Invalid data provided";
    public static final String MAMBU_VALIDATE_PIN_ERROR_MESSAGE="The entered pin does not match with the pin in Mambu";
    public static final String ENTERED_PIN_IS_NOT_VALID="Entered pin is not valid";
    public static final String REQUIRED_KEY_CARDID_NOT_FOUND="required key [cardId] not found";
    public static final String REQUIRED_KEY_CUSTOMER_UMN_NOT_FOUND="required key [customerUmn] not found";
    public static final String REQUIRED_KEY_PIN_NOT_FOUND="required key [pin] not found";
    public static final String REQUIRED_KEY_CPF_NUMBER_NOT_FOUND="required key [cpfNumber] not found";
    //customer registration
    public static final String  PROFILE_REGISTER_CHANNEL_TYPE_KYC = "6";
    public static final String PROFILE_REGISTER_CHANNELTYPE="1";
    public static final String PROFILE_REGISTER_VERIFICATIONTYPE_FLAGID="1";
    public static final String PROFILE_REGISTER_PCP_NUMBER="0";
    public static final String PROFILE_REGISTER_ID_TYPE="N";
    public static final String PROFILE_REGISTER_KYC_DETAILS_SEQ="1";
    public static final String PROFILE_REGISTER_SOURCE="OUTSYSTEM";
    public static final String PROFILE_REGISTER_APPNAME="WUPlus";
    public static final String PROFILE_REGISTER_APPVERSION="1.0";
    public static final String PROFILE_REGISTER_HOSTNAME="api.useast1.cloudhubnonprod.awswuintranet.net";
    public static final String PROFILE_REGISTER_HOSTIP="10.152.3.224";
    public static final String  PROFILE_CUSTOMER_CATEGORY="P";
    public static final String WALLET_ACCOUNT_TYPE_ID="14";
    public static final String NON_WALLET_ACCOUNT_TYPE_ID="17";

    public static final int REGISTRATION_HTTP_STATUS_CODE=200;
    public static final boolean REGISTRATION_SUCCESS=true;
    public static final String REGISTRATION_STATUS_MESSAGE="Customer Registered successfully";

    public static final String  DEFAULT_ACCOUNT_ACTIVE_STATUS="ACTIVE";
    public static final String  PARENT_DN="ou=Consumers,dc=westernunion,dc=com";
    public static final String PING_CREATEUSER_TYPE="primary";
    public static final boolean PING_CREATEUSER_VERIFIED=false;
    public static final String SEARCH_SCOPE="searchScope";
    public static final String WHOLE_SUBTREE="wholeSubtree";
    public static final String PING_GET_FILTER="filter";

    public static final String PING_UPDATE_ATTRIBUTE_UMN="umn";
    public static final String PING_UPDATE_MODIFICATION_TYPE="set";

    //initiateCusVerify

    public static final String BlAZE_SOURCE="Mulesoft";
    public static final String BlAZE_EVENT_TYPE="LogonRiskSessionInit";
    public static final String BlAZE_OPERATION= "CREATE";
    public static final String BLAZE_ENVIRONMENT="NON PROD";
    public static final String BlAZE_MESSAGE_TYPE="LogonRiskSessionInit";
    public static final String BlAZE_TRANSACTION_TYPE=  "DIGITAL";
    public static final String BlAZE_CHANNEL_VERSION="9811";
    public static final String BlAZE_CVSL_PLATFORM="WU-WALLET";
    public static final String BlAZE_CVSL_PARTNERID="WU-WALLET";

    public static final String SFMC_EVENTDEFINATIONKEY_NONWALLET_ONBOARDING="ON-01-003";

    public static final String SFMC_MESSAGEKEY_NONWALLET_ONBOARDING="ON-01-003-2";
    public static final String CUS_NOTIFY_SERVICEID="ntfzcust";

    public static final String  IS_USER_EXIST_IN_UCD="Customer already exists in UCD";

    //signon ucd
    public static final String  UCD_SOURCE = "Outsystem";
    public static final String  UCD_APPNAME = "WUPlus";
    public static final String  UCD_APPVERSION = "1.0";
    public static final String  UCD_TRANSACTION_ID = "WU";
    public static final String  UCD_KEY_BASED = "Y";
    public static final String  UCD_REQUEST_INITIATED_BY = "mulesoft";
    public static final String  UCD_CHANNEL_TYPE = "5";
    public static final String  UCD_SEND_PARTIAL_CUSTOMER_FLAG = "Y";
    public static final String  UCD_SEND_NON_WU_ALSO_FLAG = "Y";
    public static final String  UCD_SEND_ALL_PFC = "Y";
    public static final String  UCD_SEND_OTHER_ADDR_ALSO_FLAG = "Y";
    public static final String  UCD_SEND_PARTNER_DETAILS = "Y";
    public static final String  UCD_HOST_IP = "10.152.3.224";
    public static final String  UCD_HOST_NAME = "api.useast1.cloudhubnonprod.awswuintranet.net";
    public static final String  UCD_API_KEY="mNEAJZM79Xayc7oTnhKN155xF26lrrjbOnlW5NI0";
    public static final String  UCD_ACCEPT = "application/json";
    public static final String UCD_NONWALLET_ACCOUNT_TYPE_ID = "17";
    public static final String UCD_UPDATE = "Update" ;
    public static final String PROVIDER_STATUS_REGULAR = "R";


    //Blaze LogonRisk Config
    public static final String BLAZE_LOGON_RISK_INIT_SOURCE = "Mulesoft";
    public static final String BLAZE_LOGON_RISK_INIT_EVENT_TYPE = "LogonRiskSessionInit";
    public static final String BLAZE_LOGON_RISK_INIT_OPERATION = "CREATE";
    public static final String BLAZE_LOGON_RISK_INIT_ENVIRONMENT = "NON PROD";
    public static final String BLAZE_LOGON_RISK_INIT_MESSAGE_TYPE = "LogonRiskSessionInit";
    public static final String BLAZE_LOGON_RISK_INIT_TRANSACTION_TYPE = "DIGITAL";
    public static final String BLAZE_LOGON_RISK_INIT_CHANNEL_VERSION = "9811";

    //Blaze CSVL Config
    public static final String BLAZE_CSVL_PLATFORM = "WU-WALLET";
    public static final String BLAZE_CSVL_PARTNER_ID = "WU-WALLET";

    public static final String MAMBU_SERVICEID = "mbultcon";

    //Biz
    public static final String BIZ_SERVICEID="bizltcds";
    public static final String BIZ_USER_AGENT="bizcards";
    public static final Integer PAGE_ELEMENTS=50;

    public static final String BIZ_ACCEPT = "application/json";
    public static final String BIZ_GET_CARD_DETAILS_METHOD = "GET";
    public static final String BIZ_CHANGE_PIN_METHOD = "PUT";
    public static final String CANCELLED_STATUS_GROUP_ID="3";

    public static final String PIN_CHANGE_SUCCESS_RESPONSE = "PIN changed successfully";
    public static final String PIN_CHANGE_INVALID_DATA_PROVIDED = "Invalid data provided";

    public static final String REDIS_PREFIX_KEY="BRW_CUSZPRFL_";

}