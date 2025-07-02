package com.wu.brwallet.customer.profile.constants;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BusinessConstants {

    public static final String EXTERNAL_REF_ID = "x-wu-externalRefId";
    public static final String LOG_MESSSAGE = "{} STARTED";
    public static final String LOG_MESSSAGE_WITH_ELAPSED_TIME = "{} ENDED | ElapsedTime :: {}";

    public static final String KAFKA_HEADERS_TENANT_ID = "WU";
    public static final String KAFKA_HEADERS_BUSINESS_AREA = "DigitalBank";
    public static final String KAFKA_HEADERS_BUSINESS_DOMAIN = "WUIB";

    //Business event codes
    public static final String LOGIN_BUSINESS_EVENT_CODE = "CUSZPRFLBE01";
    public static final String REGISTER_BUSINESS_EVENT_CODE = "CUSZPRFLBE02";
    public static final String CHANGEPIN_BUSINESS_EVENT_CODE = "CUSZPRFLBE03";
    public static final String INITIATECUSVVERIFY_BUSINESS_EVENT_CODE = "CUSZPRFLBE04";
    public static final String VALIDATEPIN_BUSINESS_EVENT_CODE = "CUSZPRFLBE05";
    public static final String REGISTER_DEVICE_BUSINESS_EVENT_CODE = "CUSZPRFLBE06";
    public static final String UPDATE_DEVICE_BUSINESS_EVENT_CODE = "CUSZPRFLBE07";


    public static final String UCD_ERROR = "CUSPROFILE08";
    public static final String APP_BLAZE_ERROR = "CUSPROFILE20";
    public static final String UMN_MISMATCH = "CUSPROFILE24";
    public static final String INVALID_PIN = "CUSPROFILE28";
    public static final String PIN_NOT_PRESENT = "CUSPROFILE30";
    public static final String INVALID_DATA="CUSPROFILE01";


    // Error code constants
    public static final String BAD_REQUEST = "CUSPROFILE01";
    public static final String NOT_FOUND = "CUSPROFILE02";
    public static final String METHOD_NOT_ALLOWED = "CUSPROFILE03";
    public static final String NOT_ACCEPTABLE = "CUSPROFILE04";
    public static final String UNSUPPORTED_MEDIA_TYPE = "CUSPROFILE05";
    public static final String INTERNAL_SERVER_ERROR = "CUSPROFILE13";
    public static final String UNAUTHORIZED = "CUSPROFILE14";
    public static final String FORBIDDEN = "CUSPROFILE15";
    public static final String BAD_GATEWAY = "CUSPROFILE16";
    public static final String GENERIC_INTERNAL_SERVER_ERROR = "CUSPROFILE17";
    public static final String GENERIC_EXCEPTION = "CUSPROFILE18";
    public static final String JWT_GENERATION_ERROR = "CUSPROFILE21";


    //businessEvent constants for UCD
    public static final String UCD_BUSINESS_EVENT_SOURCE_SYSTEM="Mulesoft";
    public static final String UCD_BUSINESS_EVENT_TARGET_SYSTEM="UCD";
    public static final String UCD_BUSINESS_EVENT_PROCESSNAME="Customer Profile API";
    public static final String UCD_BUSINESS_EVENT_DESCRIPTION="UCDProfileRegistration call completed";
    public static final String UCD_BUSINESS_EVENT_FLOWNAME="Register Customer in UCD";
    public static final String UCD_BUSINESS_EVENT_STAGE="UCD-Customer-Registeration-API-Call";
     //PING Constats
    public static final String PING_BUSINESS_EVENT_SOURCE_SYSTEM="Mulesoft";
    public static final String PING_BUSINESS_EVENT_TARGET_SYSTEM="ping";
    public static final String PING_BUSINESS_EVENT_PROCESSNAME="Customer Profile API";
    public static final String PING_UPDATE_BUSINESS_EVENT_DESCRIPTION="Updating UMN in Ping Directory Call Completed";
    public static final String PING_UPDTAE_BUSINESS_EVENT_FLOWNAME="ping-umn-update-flow";
    public static final String PING_UPDATE_BUSINESS_EVENT_STAGE="Ping-Update-UMN-API-Call";

    public static final String PING_GET_BUSINESS_EVENT_DESCRIPTION="Get User from Ping Directory Call Completed";
    public static final String PING_GET_BUSINESS_EVENT_FLOWNAME="Get User from Ping Directory";
    public static final String PING_GET_BUSINESS_EVENT_STAGE="Get User from Ping Directory";

    public static final String PING_CREATE_BUSINESS_EVENT_DESCRIPTION="Creating New User in Ping Directory Call Completedd";
    public static final String PING_CREATE_BUSINESS_EVENT_FLOWNAME="Create New User in Ping Directory";
    public static final String PING_CREATE_BUSINESS_EVENT_STAGE="Create New User in Ping Directory";

   //BLaze constants
    public static final String BLAZE_BUSINESS_EVENT_SOURCE_SYSTEM="Mulesoft";
    public static final String BLAZE_BUSINESS_EVENT_TARGET_SYSTEM="BLaze";
    public static final String BLAZE_BUSINESS_EVENT_PROCESSNAME="Customer Profile API";
    public static final String BLAZE_BUSINESS_EVENT_DESCRIPTION="Blaze Login Register Call Completed";
    public static final String BLAZE_BUSINESS_EVENT_FLOWNAME="initiateCusVerify-Login-register-flow";
    public static final String BLAZE_BUSINESS_EVENT_STAGE="Blaze-Register-Logon-Risk-InIt-API-Call";

    public static final String CUS_NOTIFY_BUSINESS_EVENT_SOURCE_SYSTEM="Mulesoft";
    public static final String CUS_NOTIFY_BUSINESS_EVENT_TARGET_SYSTEM="Sfmc";
    public static final String CUS_NOTIFY_BUSINESS_EVENT_PROCESSNAME="Customer Profile API";
    public static final String CUS_NOTIFY_BUSINESS_EVENT_DESCRIPTION="Notifying Customer Completed Successfully";
    public static final String CUS_NOTIFY_BUSINESS_EVENT_FLOWNAME="customer-notification-flow";
    public static final String CUS_NOTIFY_BUSINESS_EVENT_STAGE="Customer-Notification-Service";


    public static final String BLAZE_CUSTOMER_VERIFICATION_INITIALIZATION="Blaze-Customer-Verification-Initialization-Service";
    public static final String BLAZE_CUSTOMER_VERIFICATION_SERVICE ="Blaze-Customer-Verification-Service";
    public static final String BLAZE_CUSTOMER_OTP_SERVICE= "Blaze-Customer-OTP-Initiation-Notification-Service";
    public static final String MAMBU_UPSTREAM_SERVICE="mambu-get-adaptor-service";
    public static final String UCD_REGISTER_UPSTREAM_NAME="UCD-Customer-Registeration-Service";
    public static final String PING_CREATEUSER_UPSTREAM_NAME = "Ping-Create-User-Service";
    public static final String PING_GETUSER_UPSTREAM_NAME="Ping-Get-User-Service";
    public static final String PING_UPDATEUSER_UPSTREAM_NAME = "Ping-Update-UMN-Service";
    public static final String BLAZE_LOGON_RISK_SERVICE_NAME = "Blaze-Register-Logon-Risk-Init-Service";
    public static final String UCD_LOOKUP_UPSTREAM_SERVICE = "UCD-Lookup-Service";
    public static final String UCD_ADD_NONWALLET_UPSTREAM_SERVICE = "UCD Add non wallet";
    public static final String UCD_ADD_DEVICE_UPSTREAM_SERVICE = "UCD Add Device service";
    public static final String UCD_UPDATE_DEVICE_UPSTREAM_SERVICE = "UCD Update Device service";
    public static final String UCD_UPDATE_DEVICE_UPSTREAM_SRV = "ucd-update-device-service";
    public static final String GATEWAY_TXN_UPSTREAM_SERVICE = "ABMT-CIS-trasaction-History-Service";

    public static final String UPSTREAM_MAMBU_CHANGE_PIN_SERVICE_NAME = "UPSTREAM";

    //CUSTOMER PROFILE BUSINESS CONSTANTS FOR BIZ CARD DETAILS
    public static final String BIZ_GET_CARD_DETAILS_BUSINESSEVENT_SYSTEM="BIZ";
    public static final String BIZ_GET_CARD_DETAILS_BUSINESSEVENT_SOURCE="MuleSoft";
    public static final String BIZ_GET_CARD_DETAILS_BUSINESSEVENT_EVENTSTAGE="BIZ-Get-Card-Details-API-Call";
    public static final String BIZ_GET_CARD_DETAILS_BUSINESSEVENT_DESCRIPTION="BIZ Get Card Details call ";
    public static final String BIZ_GET_CARD_DETAILS_BUSINESSEVENT_FLOWNAME="get-card-details-by-cpf-flow";
    public static final String PROCESSNAME="Customer Profile API";

    //CUSTOMER PROFILE BUSINESS CONSTANTS FOR BIZ CHANGE PIN
    public static final String BIZ_CHANGE_PIN_BUSINESSEVENT_SYSTEM="BIZ";
    public static final String BIZ_CHANGE_PIN_BUSINESSEVENT_SOURCE="MuleSoft";
    public static final String BIZ_CHANGE_PIN_BUSINESSEVENT_EVENTSTAGE="BIZ-Change-Pin-API-Call";
    public static final String BIZ_CHANGE_PIN_BUSINESSEVENT_DESCRIPTION="Blaze Change Pin Call Completed";
    public static final String BIZ_CHANGE_PIN_BUSINESSEVENT_FLOWNAME="biz-change-pin-flow";

    //Customer notification BE/EE
    public static final String CUSTOMER_NOTIFICATION_BUSINESSEVENT_SYSTEM="MuleSoft";
    public static final String CUSTOMER_NOTIFICATION_BUSINESSEVENT_SOURCE="MuleSoft";
    public static final String CUSTOMER_NOTIFICATION_BUSINESSEVENT_EVENTSTAGE="Customer-Notification-Service";
    public static final String CUSTOMER_NOTIFICATION_BUSINESSEVENT_DESCRIPTION="Customer Notification Service Call Completed";
    public static final String CUSTOMER_NOTIFICATION_BUSINESSEVENT_FLOWNAME="customer-notification-flow";
    public static final String BRAZIL_COUNTRYCODE="BR";

    //Mambu change pin
    public static final String MAMBU_CHANGE_PIN_BUSINESSEVENT_SYSTEM="Mambu";
    public static final String MAMBU_CHANGE_PIN_BUSINESSEVENT_SOURCE="Mulesoft";
    public static final String MAMBU_CHANGE_PIN_BUSINESSEVENT_EVENTSTAGE="Mambu-Change-Pin";
    public static final String MAMBU_CHANGE_PIN_BUSINESSEVENT_DESCRIPTION="Change Pin in Mambu";
    public static final String MAMBU_CHANGE_PIN_BUSINESSEVENT_FLOWNAME="mambu-update-pin-flow";



}
