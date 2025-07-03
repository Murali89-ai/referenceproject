
package com.wu.brwallet.customer.profile.model.common.gateway.xrsi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for web_cub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="web_cub">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cub_source" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="cub_cnp_completion_code" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght4" minOccurs="0"/>
 *         <element name="cub_cnp_errorcode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="cub_cnp_kbaresultcode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="cub_cnp_review_reference_id" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght11" minOccurs="0"/>
 *         <element name="cub_cnp_acceptrefercode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="cub_cnp_precise_id_score" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="cub_cnp_outwalletscore" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="cub_cnp_outwalletscoreformula" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght15" minOccurs="0"/>
 *         <element name="cub_cnp_reason1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght4" minOccurs="0"/>
 *         <element name="cub_cnp_reason2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght4" minOccurs="0"/>
 *         <element name="cub_cnp_reason3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght4" minOccurs="0"/>
 *         <element name="cub_cnp_reason4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght4" minOccurs="0"/>
 *         <element name="cub_cnp_fs01_fs27" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght27" minOccurs="0"/>
 *         <element name="cub_cnp_addrcode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="cub_cnp_phncode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="cub_cnp_ssncode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="cub_cnp_dateofbirthmatch" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="cub_cnp_validationscore" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="cub_cnp_verificationscore" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="cub_cnp_exceeded_use_limit_code" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="cub_cnp_consumer_total" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="cub_cnp_web_interpreted_resp" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="cub_alt_transaction_id" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="cub_alt_resp_code" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="cub_alt_web_interpreted_resp" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="reserved_for_experian1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="reserved_for_experian2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="reserved_for_experian3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="reserved_for_experian4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="fid_acculynk_trans_id" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght32" minOccurs="0"/>
 *         <element name="fid_acculynk_response_code" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght7" minOccurs="0"/>
 *         <element name="fid_acculynk_gu_id" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght36" minOccurs="0"/>
 *         <element name="fid_acculynk_modulus" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght100" maxOccurs="3" minOccurs="0"/>
 *         <element name="fid_acculynk_exponent" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="fid_acculynk_language" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght5" minOccurs="0"/>
 *         <element name="cub_site_info_forgot_pwd_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_forgot_user_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_login_username" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_login_errors" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="wu_exccode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght5" minOccurs="0"/>
 *         <element name="ng_avs" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="ng_cv" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="tsw_amount_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="aq_anscode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght50" minOccurs="0"/>
 *         <element name="aq_refid" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght50" minOccurs="0"/>
 *         <element name="aq_avs" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght100" minOccurs="0"/>
 *         <element name="aq_cv" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght50" minOccurs="0"/>
 *         <element name="not_use1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="not_use2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="not_use3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="cub_site_info_personal_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cub_site_info_security_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cub_site_info_additional_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cub_site_info_registration_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cub_site_info_invalid_email_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_site_info_reg_username" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_wucard_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_wucard_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_site_info_contact_options_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_contact_mail_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_contact_phone_number" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="cub_site_info_contact_email_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_contact_phone_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_sec_question1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_sec_answer1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_sec_question2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_sec_answer2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_sec_question3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_sec_answer3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_registration_errors" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="ibp_eligible_flag" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="ibp_payment_scheme" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="ibp_cub_bankid" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="ibp_cub_bankname" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght60" minOccurs="0"/>
 *         <element name="transaction_id" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght50" minOccurs="0"/>
 *         <element name="response_code" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="order_desc" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="order_detail_desc" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="card_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght20" minOccurs="0"/>
 *         <element name="card_issue" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght5" minOccurs="0"/>
 *         <element name="start_date" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght7" minOccurs="0"/>
 *         <element name="cub_site_info_transaction_flow" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_site_info_existing_user_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_saved_receiver_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_saved_payment_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_receiver_save_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_payment_save_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_cc_error_count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="cub_site_info_promotion_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="cub_site_info_select_service_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cub_site_info_receiver_payment_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cub_site_info_review_submit_time" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cub_site_info_transaction_attempt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="cub_site_info_transaction_errors" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="cub_d_call_purpose" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="ng_txnstatus" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght5" minOccurs="0"/>
 *         <element name="aq_authcode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght50" minOccurs="0"/>
 *         <element name="cub_exp_date" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="not_use4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="not_use5" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="delivery_service_charge" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="message_charge" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="discount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="cub_kyc_status2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="cub_compliance_status" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_recent_mtcn" type="{http://www.westernunion.com/schema/xrsi}mtcn" minOccurs="0"/>
 *         <element name="cub_recent_mtcn_status" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="cub_mtcn_next_step" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="kyc_txn_status_required_flag" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="cub_kyc_status1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght24" minOccurs="0"/>
 *         <element name="consumer_validation_selection" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght4" minOccurs="0"/>
 *         <element name="save_txn_options" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght30" minOccurs="0"/>
 *         <element name="principal_amount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="base_charge" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="sending_currency" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="total_amount" type="{http://www.westernunion.com/schema/xrsi}float_amount" minOccurs="0"/>
 *         <element name="pin_request_counter" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="pin_entry_counter" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="previousmtcn" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght16" minOccurs="0"/>
 *         <element name="conversiontype" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="channel_code" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="cub_ach_service_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="cub_ref_url" type="{http://www.westernunion.com/schema/xrsi}string" minOccurs="0"/>
 *         <element name="cub_total_cms_page" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_total_tool_page" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_total_trans_page" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_time_spent_cms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_time_spent_tool" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_time_spent_trans" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="cub_total_transaction" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="fid_original_email_address" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="fid_street_address" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="fid_state" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="fid_city" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_zip_code" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght5" minOccurs="0"/>
 *         <element name="fid_billing_phone_number" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_contact_phone_number" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_mobile_number" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght15" minOccurs="0"/>
 *         <element name="fid_email_address" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="fid_marketing_opt_in_out_statement" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_customer_dob" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="fid_user_name" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_password" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_question_1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_answer_1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_question_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_answer_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_question_3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_answer_3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_credit_card_type_1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght20" minOccurs="0"/>
 *         <element name="fid_credit_card_expiry_type_1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="fid_account_number_1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_credit_card_type_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght20" minOccurs="0"/>
 *         <element name="fid_credit_card_expiry_type_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="fid_account_number_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_credit_card_type_3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght20" minOccurs="0"/>
 *         <element name="fid_credit_card_expiry_type_3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="fid_account_number_3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_credit_card_type_4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght20" minOccurs="0"/>
 *         <element name="fid_credit_card_expiry_type_4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="fid_account_number_4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_credit_card_type_5" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght20" minOccurs="0"/>
 *         <element name="fid_credit_card_expiry_type_5" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="fid_account_number_5" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_currenttimestemp" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght20" minOccurs="0"/>
 *         <element name="fid_credit_card_type_6" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght20" minOccurs="0"/>
 *         <element name="fid_credit_card_expiry_type_6" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="fid_account_number_6" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_customer_first_name" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght24" minOccurs="0"/>
 *         <element name="fid_customer_middle_name" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_customer_last_name" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght24" minOccurs="0"/>
 *         <element name="fid_bank_routing_number_1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght9" minOccurs="0"/>
 *         <element name="fid_bank_account_number_1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_account_type_1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_routing_number_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght9" minOccurs="0"/>
 *         <element name="fid_bank_account_number_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_account_type_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_routing_number_3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght9" minOccurs="0"/>
 *         <element name="fid_bank_account_number_3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_account_type_3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_routing_number_4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght9" minOccurs="0"/>
 *         <element name="fid_bank_account_number_4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_account_type_4" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_routing_number_5" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght9" minOccurs="0"/>
 *         <element name="fid_bank_account_number_5" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_account_type_5" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_routing_number_6" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght9" minOccurs="0"/>
 *         <element name="fid_bank_account_number_6" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_bank_account_type_6" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght25" minOccurs="0"/>
 *         <element name="fid_alternate_phone_number_2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="fid_phone_1_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_phone_2_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_phone_3_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_pbv_status" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_pin_delivery_option" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_gold_card_number" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght9" minOccurs="0"/>
 *         <element name="fid_verified_delivery_options" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_user_activation_flag" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="fid_ach_service_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="fid_raw_address_hash" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght40" minOccurs="0"/>
 *         <element name="fid_cleansed_address_hash" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght40" minOccurs="0"/>
 *         <element name="fid_cub_pcp" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght16" minOccurs="0"/>
 *         <element name="fid_street_address2" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght40" minOccurs="0"/>
 *         <element name="fid_cub_country" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght40" minOccurs="0"/>
 *         <element name="fid_device_status_flag" type="{http://www.westernunion.com/schema/xrsi}test_question_flag" minOccurs="0"/>
 *         <element name="fid_device_known_status_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no_flag" minOccurs="0"/>
 *         <element name="fid_channel_name" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="consumer_selected_kyc_option1" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="ach_done_or_not" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="environment" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="bp_ref_id" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="bp_refund_token" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght80" minOccurs="0"/>
 *         <element name="ng_paytype" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="blazeextendedresponse" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght30" minOccurs="0"/>
 *         <element name="cancelreasoncode" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="veda_verification_flag" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght50" minOccurs="0"/>
 *         <element name="veda_retry_count" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght50" minOccurs="0"/>
 *         <element name="id_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght8" minOccurs="0"/>
 *         <element name="flag_for_resetting_retrycount" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="consumer_selected_kyc_option3" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="eligible_to_transact" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght1" minOccurs="0"/>
 *         <element name="last_txn_date" type="{http://www.westernunion.com/schema/xrsi}time" minOccurs="0"/>
 *         <element name="cub_ip" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght12" minOccurs="0"/>
 *         <element name="cub_ip_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght10" minOccurs="0"/>
 *         <element name="trx_aval_for_consum" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght4" minOccurs="0"/>
 *         <element name="email_verification_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *         <element name="rwc_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="send_delay_hours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="auth_processing_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="auth_zeroauth_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymenr_capture_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="account_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sat_payment_retry_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="capture_expiry_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="di_thirdparty_identifier" type="{http://www.westernunion.com/schema/xrsi}di_thirdparty_identifier" minOccurs="0"/>
 *         <element name="di_txn_channel" type="{http://www.westernunion.com/schema/xrsi}di_txn_channel" minOccurs="0"/>
 *         <element name="di_partner_name" type="{http://www.westernunion.com/schema/xrsi}di_partner_name" minOccurs="0"/>
 *         <element name="additional_data" type="{http://www.westernunion.com/schema/xrsi}additional_data" minOccurs="0"/>
 *         <element name="digital_threshold_flag" type="{http://www.westernunion.com/schema/xrsi}digital_threshold_flag" minOccurs="0"/>
 *         <element name="fee_threshold_flag" type="{http://www.westernunion.com/schema/xrsi}digital_threshold_flag" minOccurs="0"/>
 *         <element name="fX_threshold_flag" type="{http://www.westernunion.com/schema/xrsi}digital_threshold_flag" minOccurs="0"/>
 *         <element name="lock_on_principal_amount" type="{http://www.westernunion.com/schema/xrsi}lock_on_principal_amount" minOccurs="0"/>
 *         <element name="limitcheck_bypass_flag" type="{http://www.westernunion.com/schema/xrsi}bypass_limitcheck" minOccurs="0"/>
 *         <element name="ap_cardnumber" type="{http://www.westernunion.com/schema/xrsi}ap_cardnumber" minOccurs="0"/>
 *         <element name="validate_type" type="{http://www.westernunion.com/schema/xrsi}validate_type" minOccurs="0"/>
 *         <element name="cruise_user_flag" type="{http://www.westernunion.com/schema/xrsi}cruise_user_flag" minOccurs="0"/>
 *         <element name="payment_processing_fee" type="{http://www.westernunion.com/schema/xrsi}payment_processing_fee" minOccurs="0"/>
 *         <element name="receipt_notification" type="{http://www.westernunion.com/schema/xrsi}receipt_notification" minOccurs="0"/>
 *         <element name="txn_identifier" type="{http://www.westernunion.com/schema/xrsi}TransactionIdentifier" minOccurs="0"/>
 *         <element name="payment_verification_flag" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght2" minOccurs="0"/>
 *         <element name="rwc_delay" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="merchant_id" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght40" minOccurs="0"/>
 *         <element name="txn_type" type="{http://www.westernunion.com/schema/xrsi}service_flag" minOccurs="0"/>
 *         <element name="pricing_segment" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght6" minOccurs="0"/>
 *         <element name="pricing_partnerId" type="{http://www.westernunion.com/schema/xrsi}di_partner_name" minOccurs="0"/>
 *         <element name="rcrr_subscription_type" type="{http://www.westernunion.com/schema/xrsi}efp_cub_lenght3" minOccurs="0"/>
 *         <element name="zepto_pay_id_flag" type="{http://www.westernunion.com/schema/xrsi}yes_no" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "web_cub", propOrder = {
    "cubSource",
    "cubCnpCompletionCode",
    "cubCnpErrorcode",
    "cubCnpKbaresultcode",
    "cubCnpReviewReferenceId",
    "cubCnpAcceptrefercode",
    "cubCnpPreciseIdScore",
    "cubCnpOutwalletscore",
    "cubCnpOutwalletscoreformula",
    "cubCnpReason1",
    "cubCnpReason2",
    "cubCnpReason3",
    "cubCnpReason4",
    "cubCnpFs01Fs27",
    "cubCnpAddrcode",
    "cubCnpPhncode",
    "cubCnpSsncode",
    "cubCnpDateofbirthmatch",
    "cubCnpValidationscore",
    "cubCnpVerificationscore",
    "cubCnpExceededUseLimitCode",
    "cubCnpConsumerTotal",
    "cubCnpWebInterpretedResp",
    "cubAltTransactionId",
    "cubAltRespCode",
    "cubAltWebInterpretedResp",
    "reservedForExperian1",
    "reservedForExperian2",
    "reservedForExperian3",
    "reservedForExperian4",
    "fidAcculynkTransId",
    "fidAcculynkResponseCode",
    "fidAcculynkGuId",
    "fidAcculynkModulus",
    "fidAcculynkExponent",
    "fidAcculynkLanguage",
    "cubSiteInfoForgotPwdFlag",
    "cubSiteInfoForgotUserFlag",
    "cubSiteInfoLoginUsername",
    "cubSiteInfoLoginErrors",
    "wuExccode",
    "ngAvs",
    "ngCv",
    "tswAmountType",
    "aqAnscode",
    "aqRefid",
    "aqAvs",
    "aqCv",
    "notUse1",
    "notUse2",
    "notUse3",
    "cubSiteInfoPersonalTime",
    "cubSiteInfoSecurityTime",
    "cubSiteInfoAdditionalTime",
    "cubSiteInfoRegistrationTime",
    "cubSiteInfoInvalidEmailCount",
    "cubSiteInfoRegUsername",
    "cubSiteInfoWucardFlag",
    "cubSiteInfoWucardNumber",
    "cubSiteInfoContactOptionsFlag",
    "cubSiteInfoContactMailFlag",
    "cubSiteInfoContactPhoneNumber",
    "cubSiteInfoContactEmailFlag",
    "cubSiteInfoContactPhoneFlag",
    "cubSiteInfoSecQuestion1",
    "cubSiteInfoSecAnswer1",
    "cubSiteInfoSecQuestion2",
    "cubSiteInfoSecAnswer2",
    "cubSiteInfoSecQuestion3",
    "cubSiteInfoSecAnswer3",
    "cubSiteInfoRegistrationErrors",
    "ibpEligibleFlag",
    "ibpPaymentScheme",
    "ibpCubBankid",
    "ibpCubBankname",
    "transactionId",
    "responseCode",
    "orderDesc",
    "orderDetailDesc",
    "cardType",
    "cardIssue",
    "startDate",
    "cubSiteInfoTransactionFlow",
    "cubSiteInfoExistingUserFlag",
    "cubSiteInfoSavedReceiverFlag",
    "cubSiteInfoSavedPaymentFlag",
    "cubSiteInfoReceiverSaveFlag",
    "cubSiteInfoPaymentSaveFlag",
    "cubSiteInfoCcErrorCount",
    "cubSiteInfoPromotionFlag",
    "cubSiteInfoSelectServiceTime",
    "cubSiteInfoReceiverPaymentTime",
    "cubSiteInfoReviewSubmitTime",
    "cubSiteInfoTransactionAttempt",
    "cubSiteInfoTransactionErrors",
    "cubDCallPurpose",
    "ngTxnstatus",
    "aqAuthcode",
    "cubExpDate",
    "notUse4",
    "notUse5",
    "deliveryServiceCharge",
    "messageCharge",
    "discount",
    "cubKycStatus2",
    "cubComplianceStatus",
    "cubRecentMtcn",
    "cubRecentMtcnStatus",
    "cubMtcnNextStep",
    "kycTxnStatusRequiredFlag",
    "cubKycStatus1",
    "consumerValidationSelection",
    "saveTxnOptions",
    "principalAmount",
    "baseCharge",
    "sendingCurrency",
    "totalAmount",
    "pinRequestCounter",
    "pinEntryCounter",
    "previousmtcn",
    "conversiontype",
    "channelCode",
    "cubAchServiceType",
    "cubRefUrl",
    "cubTotalCmsPage",
    "cubTotalToolPage",
    "cubTotalTransPage",
    "cubTimeSpentCms",
    "cubTimeSpentTool",
    "cubTimeSpentTrans",
    "cubTotalTransaction",
    "fidOriginalEmailAddress",
    "fidStreetAddress",
    "fidState",
    "fidCity",
    "fidZipCode",
    "fidBillingPhoneNumber",
    "fidContactPhoneNumber",
    "fidMobileNumber",
    "fidEmailAddress",
    "fidMarketingOptInOutStatement",
    "fidCustomerDob",
    "fidUserName",
    "fidPassword",
    "fidQuestion1",
    "fidAnswer1",
    "fidQuestion2",
    "fidAnswer2",
    "fidQuestion3",
    "fidAnswer3",
    "fidCreditCardType1",
    "fidCreditCardExpiryType1",
    "fidAccountNumber1",
    "fidCreditCardType2",
    "fidCreditCardExpiryType2",
    "fidAccountNumber2",
    "fidCreditCardType3",
    "fidCreditCardExpiryType3",
    "fidAccountNumber3",
    "fidCreditCardType4",
    "fidCreditCardExpiryType4",
    "fidAccountNumber4",
    "fidCreditCardType5",
    "fidCreditCardExpiryType5",
    "fidAccountNumber5",
    "fidCurrenttimestemp",
    "fidCreditCardType6",
    "fidCreditCardExpiryType6",
    "fidAccountNumber6",
    "fidCustomerFirstName",
    "fidCustomerMiddleName",
    "fidCustomerLastName",
    "fidBankRoutingNumber1",
    "fidBankAccountNumber1",
    "fidBankAccountType1",
    "fidBankRoutingNumber2",
    "fidBankAccountNumber2",
    "fidBankAccountType2",
    "fidBankRoutingNumber3",
    "fidBankAccountNumber3",
    "fidBankAccountType3",
    "fidBankRoutingNumber4",
    "fidBankAccountNumber4",
    "fidBankAccountType4",
    "fidBankRoutingNumber5",
    "fidBankAccountNumber5",
    "fidBankAccountType5",
    "fidBankRoutingNumber6",
    "fidBankAccountNumber6",
    "fidBankAccountType6",
    "fidAlternatePhoneNumber2",
    "fidPhone1Type",
    "fidPhone2Type",
    "fidPhone3Type",
    "fidPbvStatus",
    "fidPinDeliveryOption",
    "fidGoldCardNumber",
    "fidVerifiedDeliveryOptions",
    "fidUserActivationFlag",
    "fidAchServiceType",
    "fidRawAddressHash",
    "fidCleansedAddressHash",
    "fidCubPcp",
    "fidStreetAddress2",
    "fidCubCountry",
    "fidDeviceStatusFlag",
    "fidDeviceKnownStatusFlag",
    "fidChannelName",
    "consumerSelectedKycOption1",
    "achDoneOrNot",
    "environment",
    "bpRefId",
    "bpRefundToken",
    "ngPaytype",
    "blazeextendedresponse",
    "cancelreasoncode",
    "vedaVerificationFlag",
    "vedaRetryCount",
    "idType",
    "flagForResettingRetrycount",
    "consumerSelectedKycOption3",
    "eligibleToTransact",
    "lastTxnDate",
    "cubIp",
    "cubIpType",
    "trxAvalForConsum",
    "emailVerificationFlag",
    "rwcFlag",
    "sendDelayHours",
    "authProcessingId",
    "authZeroauthCode",
    "paymenrCaptureDate",
    "accountNumber",
    "satPaymentRetryCode",
    "captureExpiryDate",
    "diThirdpartyIdentifier",
    "diTxnChannel",
    "diPartnerName",
    "additionalData",
    "digitalThresholdFlag",
    "feeThresholdFlag",
    "fxThresholdFlag",
    "lockOnPrincipalAmount",
    "limitcheckBypassFlag",
    "apCardnumber",
    "validateType",
    "cruiseUserFlag",
    "paymentProcessingFee",
    "receiptNotification",
    "txnIdentifier",
    "paymentVerificationFlag",
    "rwcDelay",
    "merchantId",
    "txnType",
    "pricingSegment",
    "pricingPartnerId",
    "rcrrSubscriptionType",
    "zeptoPayIdFlag"
})
public class WebCub {

    @XmlElement(name = "cub_source")
    protected String cubSource;
    @XmlElement(name = "cub_cnp_completion_code")
    protected String cubCnpCompletionCode;
    @XmlElement(name = "cub_cnp_errorcode")
    protected String cubCnpErrorcode;
    @XmlElement(name = "cub_cnp_kbaresultcode")
    protected String cubCnpKbaresultcode;
    @XmlElement(name = "cub_cnp_review_reference_id")
    protected String cubCnpReviewReferenceId;
    @XmlElement(name = "cub_cnp_acceptrefercode")
    protected String cubCnpAcceptrefercode;
    @XmlElement(name = "cub_cnp_precise_id_score")
    protected String cubCnpPreciseIdScore;
    @XmlElement(name = "cub_cnp_outwalletscore")
    protected String cubCnpOutwalletscore;
    @XmlElement(name = "cub_cnp_outwalletscoreformula")
    protected String cubCnpOutwalletscoreformula;
    @XmlElement(name = "cub_cnp_reason1")
    protected String cubCnpReason1;
    @XmlElement(name = "cub_cnp_reason2")
    protected String cubCnpReason2;
    @XmlElement(name = "cub_cnp_reason3")
    protected String cubCnpReason3;
    @XmlElement(name = "cub_cnp_reason4")
    protected String cubCnpReason4;
    @XmlElement(name = "cub_cnp_fs01_fs27")
    protected String cubCnpFs01Fs27;
    @XmlElement(name = "cub_cnp_addrcode")
    protected String cubCnpAddrcode;
    @XmlElement(name = "cub_cnp_phncode")
    protected String cubCnpPhncode;
    @XmlElement(name = "cub_cnp_ssncode")
    protected String cubCnpSsncode;
    @XmlElement(name = "cub_cnp_dateofbirthmatch")
    protected String cubCnpDateofbirthmatch;
    @XmlElement(name = "cub_cnp_validationscore")
    protected String cubCnpValidationscore;
    @XmlElement(name = "cub_cnp_verificationscore")
    protected String cubCnpVerificationscore;
    @XmlElement(name = "cub_cnp_exceeded_use_limit_code")
    protected String cubCnpExceededUseLimitCode;
    @XmlElement(name = "cub_cnp_consumer_total")
    protected String cubCnpConsumerTotal;
    @XmlElement(name = "cub_cnp_web_interpreted_resp")
    protected String cubCnpWebInterpretedResp;
    @XmlElement(name = "cub_alt_transaction_id")
    protected String cubAltTransactionId;
    @XmlElement(name = "cub_alt_resp_code")
    protected String cubAltRespCode;
    @XmlElement(name = "cub_alt_web_interpreted_resp")
    protected String cubAltWebInterpretedResp;
    @XmlElement(name = "reserved_for_experian1")
    protected String reservedForExperian1;
    @XmlElement(name = "reserved_for_experian2")
    protected String reservedForExperian2;
    @XmlElement(name = "reserved_for_experian3")
    protected String reservedForExperian3;
    @XmlElement(name = "reserved_for_experian4")
    protected String reservedForExperian4;
    @XmlElement(name = "fid_acculynk_trans_id")
    protected String fidAcculynkTransId;
    @XmlElement(name = "fid_acculynk_response_code")
    protected String fidAcculynkResponseCode;
    @XmlElement(name = "fid_acculynk_gu_id")
    protected String fidAcculynkGuId;
    @XmlElement(name = "fid_acculynk_modulus")
    protected List<String> fidAcculynkModulus;
    @XmlElement(name = "fid_acculynk_exponent")
    protected String fidAcculynkExponent;
    @XmlElement(name = "fid_acculynk_language")
    protected String fidAcculynkLanguage;
    @XmlElement(name = "cub_site_info_forgot_pwd_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoForgotPwdFlag;
    @XmlElement(name = "cub_site_info_forgot_user_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoForgotUserFlag;
    @XmlElement(name = "cub_site_info_login_username")
    protected String cubSiteInfoLoginUsername;
    @XmlElement(name = "cub_site_info_login_errors")
    protected String cubSiteInfoLoginErrors;
    @XmlElement(name = "wu_exccode")
    protected String wuExccode;
    @XmlElement(name = "ng_avs")
    protected String ngAvs;
    @XmlElement(name = "ng_cv")
    protected String ngCv;
    @XmlElement(name = "tsw_amount_type")
    protected String tswAmountType;
    @XmlElement(name = "aq_anscode")
    protected String aqAnscode;
    @XmlElement(name = "aq_refid")
    protected String aqRefid;
    @XmlElement(name = "aq_avs")
    protected String aqAvs;
    @XmlElement(name = "aq_cv")
    protected String aqCv;
    @XmlElement(name = "not_use1")
    protected String notUse1;
    @XmlElement(name = "not_use2")
    protected String notUse2;
    @XmlElement(name = "not_use3")
    protected String notUse3;
    @XmlElement(name = "cub_site_info_personal_time")
    protected String cubSiteInfoPersonalTime;
    @XmlElement(name = "cub_site_info_security_time")
    protected String cubSiteInfoSecurityTime;
    @XmlElement(name = "cub_site_info_additional_time")
    protected String cubSiteInfoAdditionalTime;
    @XmlElement(name = "cub_site_info_registration_time")
    protected String cubSiteInfoRegistrationTime;
    @XmlElement(name = "cub_site_info_invalid_email_count")
    protected BigInteger cubSiteInfoInvalidEmailCount;
    @XmlElement(name = "cub_site_info_reg_username")
    protected String cubSiteInfoRegUsername;
    @XmlElement(name = "cub_site_info_wucard_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoWucardFlag;
    @XmlElement(name = "cub_site_info_wucard_number")
    protected BigInteger cubSiteInfoWucardNumber;
    @XmlElement(name = "cub_site_info_contact_options_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoContactOptionsFlag;
    @XmlElement(name = "cub_site_info_contact_mail_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoContactMailFlag;
    @XmlElement(name = "cub_site_info_contact_phone_number")
    protected String cubSiteInfoContactPhoneNumber;
    @XmlElement(name = "cub_site_info_contact_email_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoContactEmailFlag;
    @XmlElement(name = "cub_site_info_contact_phone_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoContactPhoneFlag;
    @XmlElement(name = "cub_site_info_sec_question1")
    protected String cubSiteInfoSecQuestion1;
    @XmlElement(name = "cub_site_info_sec_answer1")
    protected String cubSiteInfoSecAnswer1;
    @XmlElement(name = "cub_site_info_sec_question2")
    protected String cubSiteInfoSecQuestion2;
    @XmlElement(name = "cub_site_info_sec_answer2")
    protected String cubSiteInfoSecAnswer2;
    @XmlElement(name = "cub_site_info_sec_question3")
    protected String cubSiteInfoSecQuestion3;
    @XmlElement(name = "cub_site_info_sec_answer3")
    protected String cubSiteInfoSecAnswer3;
    @XmlElement(name = "cub_site_info_registration_errors")
    protected String cubSiteInfoRegistrationErrors;
    @XmlElement(name = "ibp_eligible_flag")
    protected String ibpEligibleFlag;
    @XmlElement(name = "ibp_payment_scheme")
    protected String ibpPaymentScheme;
    @XmlElement(name = "ibp_cub_bankid")
    protected String ibpCubBankid;
    @XmlElement(name = "ibp_cub_bankname")
    protected String ibpCubBankname;
    @XmlElement(name = "transaction_id")
    protected String transactionId;
    @XmlElement(name = "response_code")
    protected String responseCode;
    @XmlElement(name = "order_desc")
    protected String orderDesc;
    @XmlElement(name = "order_detail_desc")
    protected String orderDetailDesc;
    @XmlElement(name = "card_type")
    protected String cardType;
    @XmlElement(name = "card_issue")
    protected String cardIssue;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "cub_site_info_transaction_flow")
    protected String cubSiteInfoTransactionFlow;
    @XmlElement(name = "cub_site_info_existing_user_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoExistingUserFlag;
    @XmlElement(name = "cub_site_info_saved_receiver_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoSavedReceiverFlag;
    @XmlElement(name = "cub_site_info_saved_payment_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoSavedPaymentFlag;
    @XmlElement(name = "cub_site_info_receiver_save_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoReceiverSaveFlag;
    @XmlElement(name = "cub_site_info_payment_save_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoPaymentSaveFlag;
    @XmlElement(name = "cub_site_info_cc_error_count")
    protected Long cubSiteInfoCcErrorCount;
    @XmlElement(name = "cub_site_info_promotion_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag cubSiteInfoPromotionFlag;
    @XmlElement(name = "cub_site_info_select_service_time")
    protected String cubSiteInfoSelectServiceTime;
    @XmlElement(name = "cub_site_info_receiver_payment_time")
    protected String cubSiteInfoReceiverPaymentTime;
    @XmlElement(name = "cub_site_info_review_submit_time")
    protected String cubSiteInfoReviewSubmitTime;
    @XmlElement(name = "cub_site_info_transaction_attempt")
    protected Long cubSiteInfoTransactionAttempt;
    @XmlElement(name = "cub_site_info_transaction_errors")
    protected String cubSiteInfoTransactionErrors;
    @XmlElement(name = "cub_d_call_purpose")
    protected String cubDCallPurpose;
    @XmlElement(name = "ng_txnstatus")
    protected String ngTxnstatus;
    @XmlElement(name = "aq_authcode")
    protected String aqAuthcode;
    @XmlElement(name = "cub_exp_date")
    protected String cubExpDate;
    @XmlElement(name = "not_use4")
    protected String notUse4;
    @XmlElement(name = "not_use5")
    protected String notUse5;
    @XmlElement(name = "delivery_service_charge")
    protected BigDecimal deliveryServiceCharge;
    @XmlElement(name = "message_charge")
    protected BigDecimal messageCharge;
    protected BigDecimal discount;
    @XmlElement(name = "cub_kyc_status2")
    protected String cubKycStatus2;
    @XmlElement(name = "cub_compliance_status")
    protected BigInteger cubComplianceStatus;
    @XmlElement(name = "cub_recent_mtcn")
    protected String cubRecentMtcn;
    @XmlElement(name = "cub_recent_mtcn_status")
    protected String cubRecentMtcnStatus;
    @XmlElement(name = "cub_mtcn_next_step")
    protected String cubMtcnNextStep;
    @XmlElement(name = "kyc_txn_status_required_flag")
    protected String kycTxnStatusRequiredFlag;
    @XmlElement(name = "cub_kyc_status1")
    protected String cubKycStatus1;
    @XmlElement(name = "consumer_validation_selection")
    protected String consumerValidationSelection;
    @XmlElement(name = "save_txn_options")
    protected String saveTxnOptions;
    @XmlElement(name = "principal_amount")
    protected BigDecimal principalAmount;
    @XmlElement(name = "base_charge")
    protected BigDecimal baseCharge;
    @XmlElement(name = "sending_currency")
    protected String sendingCurrency;
    @XmlElement(name = "total_amount")
    protected BigDecimal totalAmount;
    @XmlElement(name = "pin_request_counter")
    protected String pinRequestCounter;
    @XmlElement(name = "pin_entry_counter")
    protected String pinEntryCounter;
    protected String previousmtcn;
    protected String conversiontype;
    @XmlElement(name = "channel_code")
    protected String channelCode;
    @XmlElement(name = "cub_ach_service_type")
    protected String cubAchServiceType;
    @XmlElement(name = "cub_ref_url")
    protected String cubRefUrl;
    @XmlElement(name = "cub_total_cms_page")
    protected BigInteger cubTotalCmsPage;
    @XmlElement(name = "cub_total_tool_page")
    protected BigInteger cubTotalToolPage;
    @XmlElement(name = "cub_total_trans_page")
    protected BigInteger cubTotalTransPage;
    @XmlElement(name = "cub_time_spent_cms")
    protected BigInteger cubTimeSpentCms;
    @XmlElement(name = "cub_time_spent_tool")
    protected BigInteger cubTimeSpentTool;
    @XmlElement(name = "cub_time_spent_trans")
    protected BigInteger cubTimeSpentTrans;
    @XmlElement(name = "cub_total_transaction")
    protected BigInteger cubTotalTransaction;
    @XmlElement(name = "fid_original_email_address")
    protected String fidOriginalEmailAddress;
    @XmlElement(name = "fid_street_address")
    protected String fidStreetAddress;
    @XmlElement(name = "fid_state")
    protected String fidState;
    @XmlElement(name = "fid_city")
    protected String fidCity;
    @XmlElement(name = "fid_zip_code")
    protected String fidZipCode;
    @XmlElement(name = "fid_billing_phone_number")
    protected String fidBillingPhoneNumber;
    @XmlElement(name = "fid_contact_phone_number")
    protected String fidContactPhoneNumber;
    @XmlElement(name = "fid_mobile_number")
    protected String fidMobileNumber;
    @XmlElement(name = "fid_email_address")
    protected String fidEmailAddress;
    @XmlElement(name = "fid_marketing_opt_in_out_statement")
    protected String fidMarketingOptInOutStatement;
    @XmlElement(name = "fid_customer_dob")
    protected String fidCustomerDob;
    @XmlElement(name = "fid_user_name")
    protected String fidUserName;
    @XmlElement(name = "fid_password")
    protected String fidPassword;
    @XmlElement(name = "fid_question_1")
    protected String fidQuestion1;
    @XmlElement(name = "fid_answer_1")
    protected String fidAnswer1;
    @XmlElement(name = "fid_question_2")
    protected String fidQuestion2;
    @XmlElement(name = "fid_answer_2")
    protected String fidAnswer2;
    @XmlElement(name = "fid_question_3")
    protected String fidQuestion3;
    @XmlElement(name = "fid_answer_3")
    protected String fidAnswer3;
    @XmlElement(name = "fid_credit_card_type_1")
    protected String fidCreditCardType1;
    @XmlElement(name = "fid_credit_card_expiry_type_1")
    protected String fidCreditCardExpiryType1;
    @XmlElement(name = "fid_account_number_1")
    protected String fidAccountNumber1;
    @XmlElement(name = "fid_credit_card_type_2")
    protected String fidCreditCardType2;
    @XmlElement(name = "fid_credit_card_expiry_type_2")
    protected String fidCreditCardExpiryType2;
    @XmlElement(name = "fid_account_number_2")
    protected String fidAccountNumber2;
    @XmlElement(name = "fid_credit_card_type_3")
    protected String fidCreditCardType3;
    @XmlElement(name = "fid_credit_card_expiry_type_3")
    protected String fidCreditCardExpiryType3;
    @XmlElement(name = "fid_account_number_3")
    protected String fidAccountNumber3;
    @XmlElement(name = "fid_credit_card_type_4")
    protected String fidCreditCardType4;
    @XmlElement(name = "fid_credit_card_expiry_type_4")
    protected String fidCreditCardExpiryType4;
    @XmlElement(name = "fid_account_number_4")
    protected String fidAccountNumber4;
    @XmlElement(name = "fid_credit_card_type_5")
    protected String fidCreditCardType5;
    @XmlElement(name = "fid_credit_card_expiry_type_5")
    protected String fidCreditCardExpiryType5;
    @XmlElement(name = "fid_account_number_5")
    protected String fidAccountNumber5;
    @XmlElement(name = "fid_currenttimestemp")
    protected String fidCurrenttimestemp;
    @XmlElement(name = "fid_credit_card_type_6")
    protected String fidCreditCardType6;
    @XmlElement(name = "fid_credit_card_expiry_type_6")
    protected String fidCreditCardExpiryType6;
    @XmlElement(name = "fid_account_number_6")
    protected String fidAccountNumber6;
    @XmlElement(name = "fid_customer_first_name")
    protected String fidCustomerFirstName;
    @XmlElement(name = "fid_customer_middle_name")
    protected String fidCustomerMiddleName;
    @XmlElement(name = "fid_customer_last_name")
    protected String fidCustomerLastName;
    @XmlElement(name = "fid_bank_routing_number_1")
    protected String fidBankRoutingNumber1;
    @XmlElement(name = "fid_bank_account_number_1")
    protected String fidBankAccountNumber1;
    @XmlElement(name = "fid_bank_account_type_1")
    protected String fidBankAccountType1;
    @XmlElement(name = "fid_bank_routing_number_2")
    protected String fidBankRoutingNumber2;
    @XmlElement(name = "fid_bank_account_number_2")
    protected String fidBankAccountNumber2;
    @XmlElement(name = "fid_bank_account_type_2")
    protected String fidBankAccountType2;
    @XmlElement(name = "fid_bank_routing_number_3")
    protected String fidBankRoutingNumber3;
    @XmlElement(name = "fid_bank_account_number_3")
    protected String fidBankAccountNumber3;
    @XmlElement(name = "fid_bank_account_type_3")
    protected String fidBankAccountType3;
    @XmlElement(name = "fid_bank_routing_number_4")
    protected String fidBankRoutingNumber4;
    @XmlElement(name = "fid_bank_account_number_4")
    protected String fidBankAccountNumber4;
    @XmlElement(name = "fid_bank_account_type_4")
    protected String fidBankAccountType4;
    @XmlElement(name = "fid_bank_routing_number_5")
    protected String fidBankRoutingNumber5;
    @XmlElement(name = "fid_bank_account_number_5")
    protected String fidBankAccountNumber5;
    @XmlElement(name = "fid_bank_account_type_5")
    protected String fidBankAccountType5;
    @XmlElement(name = "fid_bank_routing_number_6")
    protected String fidBankRoutingNumber6;
    @XmlElement(name = "fid_bank_account_number_6")
    protected String fidBankAccountNumber6;
    @XmlElement(name = "fid_bank_account_type_6")
    protected String fidBankAccountType6;
    @XmlElement(name = "fid_alternate_phone_number_2")
    protected String fidAlternatePhoneNumber2;
    @XmlElement(name = "fid_phone_1_type")
    protected String fidPhone1Type;
    @XmlElement(name = "fid_phone_2_type")
    protected String fidPhone2Type;
    @XmlElement(name = "fid_phone_3_type")
    protected String fidPhone3Type;
    @XmlElement(name = "fid_pbv_status")
    protected String fidPbvStatus;
    @XmlElement(name = "fid_pin_delivery_option")
    protected String fidPinDeliveryOption;
    @XmlElement(name = "fid_gold_card_number")
    protected String fidGoldCardNumber;
    @XmlElement(name = "fid_verified_delivery_options")
    protected String fidVerifiedDeliveryOptions;
    @XmlElement(name = "fid_user_activation_flag")
    protected String fidUserActivationFlag;
    @XmlElement(name = "fid_ach_service_type")
    protected String fidAchServiceType;
    @XmlElement(name = "fid_raw_address_hash")
    protected String fidRawAddressHash;
    @XmlElement(name = "fid_cleansed_address_hash")
    protected String fidCleansedAddressHash;
    @XmlElement(name = "fid_cub_pcp")
    protected String fidCubPcp;
    @XmlElement(name = "fid_street_address2")
    protected String fidStreetAddress2;
    @XmlElement(name = "fid_cub_country")
    protected String fidCubCountry;
    @XmlElement(name = "fid_device_status_flag")
    protected String fidDeviceStatusFlag;
    @XmlElement(name = "fid_device_known_status_flag")
    @XmlSchemaType(name = "string")
    protected YesNoFlag fidDeviceKnownStatusFlag;
    @XmlElement(name = "fid_channel_name")
    protected String fidChannelName;
    @XmlElement(name = "consumer_selected_kyc_option1")
    protected String consumerSelectedKycOption1;
    @XmlElement(name = "ach_done_or_not")
    protected String achDoneOrNot;
    protected String environment;
    @XmlElement(name = "bp_ref_id")
    protected String bpRefId;
    @XmlElement(name = "bp_refund_token")
    protected String bpRefundToken;
    @XmlElement(name = "ng_paytype")
    protected String ngPaytype;
    protected String blazeextendedresponse;
    protected String cancelreasoncode;
    @XmlElement(name = "veda_verification_flag")
    protected String vedaVerificationFlag;
    @XmlElement(name = "veda_retry_count")
    protected String vedaRetryCount;
    @XmlElement(name = "id_type")
    protected String idType;
    @XmlElement(name = "flag_for_resetting_retrycount")
    protected String flagForResettingRetrycount;
    @XmlElement(name = "consumer_selected_kyc_option3")
    protected String consumerSelectedKycOption3;
    @XmlElement(name = "eligible_to_transact")
    protected String eligibleToTransact;
    @XmlElement(name = "last_txn_date")
    protected String lastTxnDate;
    @XmlElement(name = "cub_ip")
    protected String cubIp;
    @XmlElement(name = "cub_ip_type")
    protected String cubIpType;
    @XmlElement(name = "trx_aval_for_consum")
    protected String trxAvalForConsum;
    @XmlElement(name = "email_verification_flag")
    @XmlSchemaType(name = "string")
    protected YesNo emailVerificationFlag;
    @XmlElement(name = "rwc_flag")
    protected String rwcFlag;
    @XmlElement(name = "send_delay_hours")
    protected String sendDelayHours;
    @XmlElement(name = "auth_processing_id")
    protected String authProcessingId;
    @XmlElement(name = "auth_zeroauth_code")
    protected String authZeroauthCode;
    @XmlElement(name = "paymenr_capture_date")
    protected String paymenrCaptureDate;
    @XmlElement(name = "account_number")
    protected String accountNumber;
    @XmlElement(name = "sat_payment_retry_code")
    protected String satPaymentRetryCode;
    @XmlElement(name = "capture_expiry_date")
    protected String captureExpiryDate;
    @XmlElement(name = "di_thirdparty_identifier")
    protected String diThirdpartyIdentifier;
    @XmlElement(name = "di_txn_channel")
    protected String diTxnChannel;
    @XmlElement(name = "di_partner_name")
    protected String diPartnerName;
    @XmlElement(name = "additional_data")
    protected String additionalData;
    @XmlElement(name = "digital_threshold_flag")
    protected String digitalThresholdFlag;
    @XmlElement(name = "fee_threshold_flag")
    protected String feeThresholdFlag;
    @XmlElement(name = "fX_threshold_flag")
    protected String fxThresholdFlag;
    @XmlElement(name = "lock_on_principal_amount")
    protected String lockOnPrincipalAmount;
    @XmlElement(name = "limitcheck_bypass_flag")
    @XmlSchemaType(name = "string")
    protected BypassLimitcheck limitcheckBypassFlag;
    @XmlElement(name = "ap_cardnumber")
    protected String apCardnumber;
    @XmlElement(name = "validate_type")
    @XmlSchemaType(name = "string")
    protected ValidateType validateType;
    @XmlElement(name = "cruise_user_flag")
    @XmlSchemaType(name = "string")
    protected CruiseUserFlag cruiseUserFlag;
    @XmlElement(name = "payment_processing_fee")
    protected Long paymentProcessingFee;
    @XmlElement(name = "receipt_notification")
    @XmlSchemaType(name = "string")
    protected ReceiptNotification receiptNotification;
    @XmlElement(name = "txn_identifier")
    @XmlSchemaType(name = "string")
    protected TransactionIdentifier txnIdentifier;
    @XmlElement(name = "payment_verification_flag")
    protected String paymentVerificationFlag;
    @XmlElement(name = "rwc_delay")
    protected String rwcDelay;
    @XmlElement(name = "merchant_id")
    protected String merchantId;
    @XmlElement(name = "txn_type")
    protected String txnType;
    @XmlElement(name = "pricing_segment")
    protected String pricingSegment;
    @XmlElement(name = "pricing_partnerId")
    protected String pricingPartnerId;
    @XmlElement(name = "rcrr_subscription_type")
    protected String rcrrSubscriptionType;
    @XmlElement(name = "zepto_pay_id_flag")
    @XmlSchemaType(name = "string")
    protected YesNo zeptoPayIdFlag;

    /**
     * Gets the value of the cubSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSource() {
        return cubSource;
    }

    /**
     * Sets the value of the cubSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSource(String value) {
        this.cubSource = value;
    }

    /**
     * Gets the value of the cubCnpCompletionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpCompletionCode() {
        return cubCnpCompletionCode;
    }

    /**
     * Sets the value of the cubCnpCompletionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpCompletionCode(String value) {
        this.cubCnpCompletionCode = value;
    }

    /**
     * Gets the value of the cubCnpErrorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpErrorcode() {
        return cubCnpErrorcode;
    }

    /**
     * Sets the value of the cubCnpErrorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpErrorcode(String value) {
        this.cubCnpErrorcode = value;
    }

    /**
     * Gets the value of the cubCnpKbaresultcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpKbaresultcode() {
        return cubCnpKbaresultcode;
    }

    /**
     * Sets the value of the cubCnpKbaresultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpKbaresultcode(String value) {
        this.cubCnpKbaresultcode = value;
    }

    /**
     * Gets the value of the cubCnpReviewReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpReviewReferenceId() {
        return cubCnpReviewReferenceId;
    }

    /**
     * Sets the value of the cubCnpReviewReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpReviewReferenceId(String value) {
        this.cubCnpReviewReferenceId = value;
    }

    /**
     * Gets the value of the cubCnpAcceptrefercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpAcceptrefercode() {
        return cubCnpAcceptrefercode;
    }

    /**
     * Sets the value of the cubCnpAcceptrefercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpAcceptrefercode(String value) {
        this.cubCnpAcceptrefercode = value;
    }

    /**
     * Gets the value of the cubCnpPreciseIdScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpPreciseIdScore() {
        return cubCnpPreciseIdScore;
    }

    /**
     * Sets the value of the cubCnpPreciseIdScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpPreciseIdScore(String value) {
        this.cubCnpPreciseIdScore = value;
    }

    /**
     * Gets the value of the cubCnpOutwalletscore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpOutwalletscore() {
        return cubCnpOutwalletscore;
    }

    /**
     * Sets the value of the cubCnpOutwalletscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpOutwalletscore(String value) {
        this.cubCnpOutwalletscore = value;
    }

    /**
     * Gets the value of the cubCnpOutwalletscoreformula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpOutwalletscoreformula() {
        return cubCnpOutwalletscoreformula;
    }

    /**
     * Sets the value of the cubCnpOutwalletscoreformula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpOutwalletscoreformula(String value) {
        this.cubCnpOutwalletscoreformula = value;
    }

    /**
     * Gets the value of the cubCnpReason1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpReason1() {
        return cubCnpReason1;
    }

    /**
     * Sets the value of the cubCnpReason1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpReason1(String value) {
        this.cubCnpReason1 = value;
    }

    /**
     * Gets the value of the cubCnpReason2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpReason2() {
        return cubCnpReason2;
    }

    /**
     * Sets the value of the cubCnpReason2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpReason2(String value) {
        this.cubCnpReason2 = value;
    }

    /**
     * Gets the value of the cubCnpReason3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpReason3() {
        return cubCnpReason3;
    }

    /**
     * Sets the value of the cubCnpReason3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpReason3(String value) {
        this.cubCnpReason3 = value;
    }

    /**
     * Gets the value of the cubCnpReason4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpReason4() {
        return cubCnpReason4;
    }

    /**
     * Sets the value of the cubCnpReason4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpReason4(String value) {
        this.cubCnpReason4 = value;
    }

    /**
     * Gets the value of the cubCnpFs01Fs27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpFs01Fs27() {
        return cubCnpFs01Fs27;
    }

    /**
     * Sets the value of the cubCnpFs01Fs27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpFs01Fs27(String value) {
        this.cubCnpFs01Fs27 = value;
    }

    /**
     * Gets the value of the cubCnpAddrcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpAddrcode() {
        return cubCnpAddrcode;
    }

    /**
     * Sets the value of the cubCnpAddrcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpAddrcode(String value) {
        this.cubCnpAddrcode = value;
    }

    /**
     * Gets the value of the cubCnpPhncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpPhncode() {
        return cubCnpPhncode;
    }

    /**
     * Sets the value of the cubCnpPhncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpPhncode(String value) {
        this.cubCnpPhncode = value;
    }

    /**
     * Gets the value of the cubCnpSsncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpSsncode() {
        return cubCnpSsncode;
    }

    /**
     * Sets the value of the cubCnpSsncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpSsncode(String value) {
        this.cubCnpSsncode = value;
    }

    /**
     * Gets the value of the cubCnpDateofbirthmatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpDateofbirthmatch() {
        return cubCnpDateofbirthmatch;
    }

    /**
     * Sets the value of the cubCnpDateofbirthmatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpDateofbirthmatch(String value) {
        this.cubCnpDateofbirthmatch = value;
    }

    /**
     * Gets the value of the cubCnpValidationscore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpValidationscore() {
        return cubCnpValidationscore;
    }

    /**
     * Sets the value of the cubCnpValidationscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpValidationscore(String value) {
        this.cubCnpValidationscore = value;
    }

    /**
     * Gets the value of the cubCnpVerificationscore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpVerificationscore() {
        return cubCnpVerificationscore;
    }

    /**
     * Sets the value of the cubCnpVerificationscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpVerificationscore(String value) {
        this.cubCnpVerificationscore = value;
    }

    /**
     * Gets the value of the cubCnpExceededUseLimitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpExceededUseLimitCode() {
        return cubCnpExceededUseLimitCode;
    }

    /**
     * Sets the value of the cubCnpExceededUseLimitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpExceededUseLimitCode(String value) {
        this.cubCnpExceededUseLimitCode = value;
    }

    /**
     * Gets the value of the cubCnpConsumerTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpConsumerTotal() {
        return cubCnpConsumerTotal;
    }

    /**
     * Sets the value of the cubCnpConsumerTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpConsumerTotal(String value) {
        this.cubCnpConsumerTotal = value;
    }

    /**
     * Gets the value of the cubCnpWebInterpretedResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubCnpWebInterpretedResp() {
        return cubCnpWebInterpretedResp;
    }

    /**
     * Sets the value of the cubCnpWebInterpretedResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubCnpWebInterpretedResp(String value) {
        this.cubCnpWebInterpretedResp = value;
    }

    /**
     * Gets the value of the cubAltTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubAltTransactionId() {
        return cubAltTransactionId;
    }

    /**
     * Sets the value of the cubAltTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubAltTransactionId(String value) {
        this.cubAltTransactionId = value;
    }

    /**
     * Gets the value of the cubAltRespCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubAltRespCode() {
        return cubAltRespCode;
    }

    /**
     * Sets the value of the cubAltRespCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubAltRespCode(String value) {
        this.cubAltRespCode = value;
    }

    /**
     * Gets the value of the cubAltWebInterpretedResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubAltWebInterpretedResp() {
        return cubAltWebInterpretedResp;
    }

    /**
     * Sets the value of the cubAltWebInterpretedResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubAltWebInterpretedResp(String value) {
        this.cubAltWebInterpretedResp = value;
    }

    /**
     * Gets the value of the reservedForExperian1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedForExperian1() {
        return reservedForExperian1;
    }

    /**
     * Sets the value of the reservedForExperian1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedForExperian1(String value) {
        this.reservedForExperian1 = value;
    }

    /**
     * Gets the value of the reservedForExperian2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedForExperian2() {
        return reservedForExperian2;
    }

    /**
     * Sets the value of the reservedForExperian2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedForExperian2(String value) {
        this.reservedForExperian2 = value;
    }

    /**
     * Gets the value of the reservedForExperian3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedForExperian3() {
        return reservedForExperian3;
    }

    /**
     * Sets the value of the reservedForExperian3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedForExperian3(String value) {
        this.reservedForExperian3 = value;
    }

    /**
     * Gets the value of the reservedForExperian4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedForExperian4() {
        return reservedForExperian4;
    }

    /**
     * Sets the value of the reservedForExperian4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedForExperian4(String value) {
        this.reservedForExperian4 = value;
    }

    /**
     * Gets the value of the fidAcculynkTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAcculynkTransId() {
        return fidAcculynkTransId;
    }

    /**
     * Sets the value of the fidAcculynkTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAcculynkTransId(String value) {
        this.fidAcculynkTransId = value;
    }

    /**
     * Gets the value of the fidAcculynkResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAcculynkResponseCode() {
        return fidAcculynkResponseCode;
    }

    /**
     * Sets the value of the fidAcculynkResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAcculynkResponseCode(String value) {
        this.fidAcculynkResponseCode = value;
    }

    /**
     * Gets the value of the fidAcculynkGuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAcculynkGuId() {
        return fidAcculynkGuId;
    }

    /**
     * Sets the value of the fidAcculynkGuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAcculynkGuId(String value) {
        this.fidAcculynkGuId = value;
    }

    /**
     * Gets the value of the fidAcculynkModulus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fidAcculynkModulus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFidAcculynkModulus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the fidAcculynkModulus property.
     */
    public List<String> getFidAcculynkModulus() {
        if (fidAcculynkModulus == null) {
            fidAcculynkModulus = new ArrayList<>();
        }
        return this.fidAcculynkModulus;
    }

    /**
     * Gets the value of the fidAcculynkExponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAcculynkExponent() {
        return fidAcculynkExponent;
    }

    /**
     * Sets the value of the fidAcculynkExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAcculynkExponent(String value) {
        this.fidAcculynkExponent = value;
    }

    /**
     * Gets the value of the fidAcculynkLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAcculynkLanguage() {
        return fidAcculynkLanguage;
    }

    /**
     * Sets the value of the fidAcculynkLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAcculynkLanguage(String value) {
        this.fidAcculynkLanguage = value;
    }

    /**
     * Gets the value of the cubSiteInfoForgotPwdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoForgotPwdFlag() {
        return cubSiteInfoForgotPwdFlag;
    }

    /**
     * Sets the value of the cubSiteInfoForgotPwdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoForgotPwdFlag(YesNoFlag value) {
        this.cubSiteInfoForgotPwdFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoForgotUserFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoForgotUserFlag() {
        return cubSiteInfoForgotUserFlag;
    }

    /**
     * Sets the value of the cubSiteInfoForgotUserFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoForgotUserFlag(YesNoFlag value) {
        this.cubSiteInfoForgotUserFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoLoginUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoLoginUsername() {
        return cubSiteInfoLoginUsername;
    }

    /**
     * Sets the value of the cubSiteInfoLoginUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoLoginUsername(String value) {
        this.cubSiteInfoLoginUsername = value;
    }

    /**
     * Gets the value of the cubSiteInfoLoginErrors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoLoginErrors() {
        return cubSiteInfoLoginErrors;
    }

    /**
     * Sets the value of the cubSiteInfoLoginErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoLoginErrors(String value) {
        this.cubSiteInfoLoginErrors = value;
    }

    /**
     * Gets the value of the wuExccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWuExccode() {
        return wuExccode;
    }

    /**
     * Sets the value of the wuExccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWuExccode(String value) {
        this.wuExccode = value;
    }

    /**
     * Gets the value of the ngAvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgAvs() {
        return ngAvs;
    }

    /**
     * Sets the value of the ngAvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgAvs(String value) {
        this.ngAvs = value;
    }

    /**
     * Gets the value of the ngCv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgCv() {
        return ngCv;
    }

    /**
     * Sets the value of the ngCv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgCv(String value) {
        this.ngCv = value;
    }

    /**
     * Gets the value of the tswAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTswAmountType() {
        return tswAmountType;
    }

    /**
     * Sets the value of the tswAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTswAmountType(String value) {
        this.tswAmountType = value;
    }

    /**
     * Gets the value of the aqAnscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAqAnscode() {
        return aqAnscode;
    }

    /**
     * Sets the value of the aqAnscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAqAnscode(String value) {
        this.aqAnscode = value;
    }

    /**
     * Gets the value of the aqRefid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAqRefid() {
        return aqRefid;
    }

    /**
     * Sets the value of the aqRefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAqRefid(String value) {
        this.aqRefid = value;
    }

    /**
     * Gets the value of the aqAvs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAqAvs() {
        return aqAvs;
    }

    /**
     * Sets the value of the aqAvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAqAvs(String value) {
        this.aqAvs = value;
    }

    /**
     * Gets the value of the aqCv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAqCv() {
        return aqCv;
    }

    /**
     * Sets the value of the aqCv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAqCv(String value) {
        this.aqCv = value;
    }

    /**
     * Gets the value of the notUse1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotUse1() {
        return notUse1;
    }

    /**
     * Sets the value of the notUse1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotUse1(String value) {
        this.notUse1 = value;
    }

    /**
     * Gets the value of the notUse2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotUse2() {
        return notUse2;
    }

    /**
     * Sets the value of the notUse2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotUse2(String value) {
        this.notUse2 = value;
    }

    /**
     * Gets the value of the notUse3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotUse3() {
        return notUse3;
    }

    /**
     * Sets the value of the notUse3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotUse3(String value) {
        this.notUse3 = value;
    }

    /**
     * Gets the value of the cubSiteInfoPersonalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoPersonalTime() {
        return cubSiteInfoPersonalTime;
    }

    /**
     * Sets the value of the cubSiteInfoPersonalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoPersonalTime(String value) {
        this.cubSiteInfoPersonalTime = value;
    }

    /**
     * Gets the value of the cubSiteInfoSecurityTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoSecurityTime() {
        return cubSiteInfoSecurityTime;
    }

    /**
     * Sets the value of the cubSiteInfoSecurityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoSecurityTime(String value) {
        this.cubSiteInfoSecurityTime = value;
    }

    /**
     * Gets the value of the cubSiteInfoAdditionalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoAdditionalTime() {
        return cubSiteInfoAdditionalTime;
    }

    /**
     * Sets the value of the cubSiteInfoAdditionalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoAdditionalTime(String value) {
        this.cubSiteInfoAdditionalTime = value;
    }

    /**
     * Gets the value of the cubSiteInfoRegistrationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoRegistrationTime() {
        return cubSiteInfoRegistrationTime;
    }

    /**
     * Sets the value of the cubSiteInfoRegistrationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoRegistrationTime(String value) {
        this.cubSiteInfoRegistrationTime = value;
    }

    /**
     * Gets the value of the cubSiteInfoInvalidEmailCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubSiteInfoInvalidEmailCount() {
        return cubSiteInfoInvalidEmailCount;
    }

    /**
     * Sets the value of the cubSiteInfoInvalidEmailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubSiteInfoInvalidEmailCount(BigInteger value) {
        this.cubSiteInfoInvalidEmailCount = value;
    }

    /**
     * Gets the value of the cubSiteInfoRegUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoRegUsername() {
        return cubSiteInfoRegUsername;
    }

    /**
     * Sets the value of the cubSiteInfoRegUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoRegUsername(String value) {
        this.cubSiteInfoRegUsername = value;
    }

    /**
     * Gets the value of the cubSiteInfoWucardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoWucardFlag() {
        return cubSiteInfoWucardFlag;
    }

    /**
     * Sets the value of the cubSiteInfoWucardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoWucardFlag(YesNoFlag value) {
        this.cubSiteInfoWucardFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoWucardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubSiteInfoWucardNumber() {
        return cubSiteInfoWucardNumber;
    }

    /**
     * Sets the value of the cubSiteInfoWucardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubSiteInfoWucardNumber(BigInteger value) {
        this.cubSiteInfoWucardNumber = value;
    }

    /**
     * Gets the value of the cubSiteInfoContactOptionsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoContactOptionsFlag() {
        return cubSiteInfoContactOptionsFlag;
    }

    /**
     * Sets the value of the cubSiteInfoContactOptionsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoContactOptionsFlag(YesNoFlag value) {
        this.cubSiteInfoContactOptionsFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoContactMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoContactMailFlag() {
        return cubSiteInfoContactMailFlag;
    }

    /**
     * Sets the value of the cubSiteInfoContactMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoContactMailFlag(YesNoFlag value) {
        this.cubSiteInfoContactMailFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoContactPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoContactPhoneNumber() {
        return cubSiteInfoContactPhoneNumber;
    }

    /**
     * Sets the value of the cubSiteInfoContactPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoContactPhoneNumber(String value) {
        this.cubSiteInfoContactPhoneNumber = value;
    }

    /**
     * Gets the value of the cubSiteInfoContactEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoContactEmailFlag() {
        return cubSiteInfoContactEmailFlag;
    }

    /**
     * Sets the value of the cubSiteInfoContactEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoContactEmailFlag(YesNoFlag value) {
        this.cubSiteInfoContactEmailFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoContactPhoneFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoContactPhoneFlag() {
        return cubSiteInfoContactPhoneFlag;
    }

    /**
     * Sets the value of the cubSiteInfoContactPhoneFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoContactPhoneFlag(YesNoFlag value) {
        this.cubSiteInfoContactPhoneFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoSecQuestion1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoSecQuestion1() {
        return cubSiteInfoSecQuestion1;
    }

    /**
     * Sets the value of the cubSiteInfoSecQuestion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoSecQuestion1(String value) {
        this.cubSiteInfoSecQuestion1 = value;
    }

    /**
     * Gets the value of the cubSiteInfoSecAnswer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoSecAnswer1() {
        return cubSiteInfoSecAnswer1;
    }

    /**
     * Sets the value of the cubSiteInfoSecAnswer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoSecAnswer1(String value) {
        this.cubSiteInfoSecAnswer1 = value;
    }

    /**
     * Gets the value of the cubSiteInfoSecQuestion2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoSecQuestion2() {
        return cubSiteInfoSecQuestion2;
    }

    /**
     * Sets the value of the cubSiteInfoSecQuestion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoSecQuestion2(String value) {
        this.cubSiteInfoSecQuestion2 = value;
    }

    /**
     * Gets the value of the cubSiteInfoSecAnswer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoSecAnswer2() {
        return cubSiteInfoSecAnswer2;
    }

    /**
     * Sets the value of the cubSiteInfoSecAnswer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoSecAnswer2(String value) {
        this.cubSiteInfoSecAnswer2 = value;
    }

    /**
     * Gets the value of the cubSiteInfoSecQuestion3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoSecQuestion3() {
        return cubSiteInfoSecQuestion3;
    }

    /**
     * Sets the value of the cubSiteInfoSecQuestion3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoSecQuestion3(String value) {
        this.cubSiteInfoSecQuestion3 = value;
    }

    /**
     * Gets the value of the cubSiteInfoSecAnswer3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoSecAnswer3() {
        return cubSiteInfoSecAnswer3;
    }

    /**
     * Sets the value of the cubSiteInfoSecAnswer3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoSecAnswer3(String value) {
        this.cubSiteInfoSecAnswer3 = value;
    }

    /**
     * Gets the value of the cubSiteInfoRegistrationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoRegistrationErrors() {
        return cubSiteInfoRegistrationErrors;
    }

    /**
     * Sets the value of the cubSiteInfoRegistrationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoRegistrationErrors(String value) {
        this.cubSiteInfoRegistrationErrors = value;
    }

    /**
     * Gets the value of the ibpEligibleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbpEligibleFlag() {
        return ibpEligibleFlag;
    }

    /**
     * Sets the value of the ibpEligibleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbpEligibleFlag(String value) {
        this.ibpEligibleFlag = value;
    }

    /**
     * Gets the value of the ibpPaymentScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbpPaymentScheme() {
        return ibpPaymentScheme;
    }

    /**
     * Sets the value of the ibpPaymentScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbpPaymentScheme(String value) {
        this.ibpPaymentScheme = value;
    }

    /**
     * Gets the value of the ibpCubBankid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbpCubBankid() {
        return ibpCubBankid;
    }

    /**
     * Sets the value of the ibpCubBankid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbpCubBankid(String value) {
        this.ibpCubBankid = value;
    }

    /**
     * Gets the value of the ibpCubBankname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbpCubBankname() {
        return ibpCubBankname;
    }

    /**
     * Sets the value of the ibpCubBankname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbpCubBankname(String value) {
        this.ibpCubBankname = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the orderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDesc() {
        return orderDesc;
    }

    /**
     * Sets the value of the orderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDesc(String value) {
        this.orderDesc = value;
    }

    /**
     * Gets the value of the orderDetailDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDetailDesc() {
        return orderDetailDesc;
    }

    /**
     * Sets the value of the orderDetailDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDetailDesc(String value) {
        this.orderDetailDesc = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssue() {
        return cardIssue;
    }

    /**
     * Sets the value of the cardIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssue(String value) {
        this.cardIssue = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the cubSiteInfoTransactionFlow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoTransactionFlow() {
        return cubSiteInfoTransactionFlow;
    }

    /**
     * Sets the value of the cubSiteInfoTransactionFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoTransactionFlow(String value) {
        this.cubSiteInfoTransactionFlow = value;
    }

    /**
     * Gets the value of the cubSiteInfoExistingUserFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoExistingUserFlag() {
        return cubSiteInfoExistingUserFlag;
    }

    /**
     * Sets the value of the cubSiteInfoExistingUserFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoExistingUserFlag(YesNoFlag value) {
        this.cubSiteInfoExistingUserFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoSavedReceiverFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoSavedReceiverFlag() {
        return cubSiteInfoSavedReceiverFlag;
    }

    /**
     * Sets the value of the cubSiteInfoSavedReceiverFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoSavedReceiverFlag(YesNoFlag value) {
        this.cubSiteInfoSavedReceiverFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoSavedPaymentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoSavedPaymentFlag() {
        return cubSiteInfoSavedPaymentFlag;
    }

    /**
     * Sets the value of the cubSiteInfoSavedPaymentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoSavedPaymentFlag(YesNoFlag value) {
        this.cubSiteInfoSavedPaymentFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoReceiverSaveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoReceiverSaveFlag() {
        return cubSiteInfoReceiverSaveFlag;
    }

    /**
     * Sets the value of the cubSiteInfoReceiverSaveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoReceiverSaveFlag(YesNoFlag value) {
        this.cubSiteInfoReceiverSaveFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoPaymentSaveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoPaymentSaveFlag() {
        return cubSiteInfoPaymentSaveFlag;
    }

    /**
     * Sets the value of the cubSiteInfoPaymentSaveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoPaymentSaveFlag(YesNoFlag value) {
        this.cubSiteInfoPaymentSaveFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoCcErrorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCubSiteInfoCcErrorCount() {
        return cubSiteInfoCcErrorCount;
    }

    /**
     * Sets the value of the cubSiteInfoCcErrorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCubSiteInfoCcErrorCount(Long value) {
        this.cubSiteInfoCcErrorCount = value;
    }

    /**
     * Gets the value of the cubSiteInfoPromotionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getCubSiteInfoPromotionFlag() {
        return cubSiteInfoPromotionFlag;
    }

    /**
     * Sets the value of the cubSiteInfoPromotionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setCubSiteInfoPromotionFlag(YesNoFlag value) {
        this.cubSiteInfoPromotionFlag = value;
    }

    /**
     * Gets the value of the cubSiteInfoSelectServiceTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoSelectServiceTime() {
        return cubSiteInfoSelectServiceTime;
    }

    /**
     * Sets the value of the cubSiteInfoSelectServiceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoSelectServiceTime(String value) {
        this.cubSiteInfoSelectServiceTime = value;
    }

    /**
     * Gets the value of the cubSiteInfoReceiverPaymentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoReceiverPaymentTime() {
        return cubSiteInfoReceiverPaymentTime;
    }

    /**
     * Sets the value of the cubSiteInfoReceiverPaymentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoReceiverPaymentTime(String value) {
        this.cubSiteInfoReceiverPaymentTime = value;
    }

    /**
     * Gets the value of the cubSiteInfoReviewSubmitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoReviewSubmitTime() {
        return cubSiteInfoReviewSubmitTime;
    }

    /**
     * Sets the value of the cubSiteInfoReviewSubmitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoReviewSubmitTime(String value) {
        this.cubSiteInfoReviewSubmitTime = value;
    }

    /**
     * Gets the value of the cubSiteInfoTransactionAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCubSiteInfoTransactionAttempt() {
        return cubSiteInfoTransactionAttempt;
    }

    /**
     * Sets the value of the cubSiteInfoTransactionAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCubSiteInfoTransactionAttempt(Long value) {
        this.cubSiteInfoTransactionAttempt = value;
    }

    /**
     * Gets the value of the cubSiteInfoTransactionErrors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubSiteInfoTransactionErrors() {
        return cubSiteInfoTransactionErrors;
    }

    /**
     * Sets the value of the cubSiteInfoTransactionErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubSiteInfoTransactionErrors(String value) {
        this.cubSiteInfoTransactionErrors = value;
    }

    /**
     * Gets the value of the cubDCallPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubDCallPurpose() {
        return cubDCallPurpose;
    }

    /**
     * Sets the value of the cubDCallPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubDCallPurpose(String value) {
        this.cubDCallPurpose = value;
    }

    /**
     * Gets the value of the ngTxnstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgTxnstatus() {
        return ngTxnstatus;
    }

    /**
     * Sets the value of the ngTxnstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgTxnstatus(String value) {
        this.ngTxnstatus = value;
    }

    /**
     * Gets the value of the aqAuthcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAqAuthcode() {
        return aqAuthcode;
    }

    /**
     * Sets the value of the aqAuthcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAqAuthcode(String value) {
        this.aqAuthcode = value;
    }

    /**
     * Gets the value of the cubExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubExpDate() {
        return cubExpDate;
    }

    /**
     * Sets the value of the cubExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubExpDate(String value) {
        this.cubExpDate = value;
    }

    /**
     * Gets the value of the notUse4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotUse4() {
        return notUse4;
    }

    /**
     * Sets the value of the notUse4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotUse4(String value) {
        this.notUse4 = value;
    }

    /**
     * Gets the value of the notUse5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotUse5() {
        return notUse5;
    }

    /**
     * Sets the value of the notUse5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotUse5(String value) {
        this.notUse5 = value;
    }

    /**
     * Gets the value of the deliveryServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeliveryServiceCharge() {
        return deliveryServiceCharge;
    }

    /**
     * Sets the value of the deliveryServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeliveryServiceCharge(BigDecimal value) {
        this.deliveryServiceCharge = value;
    }

    /**
     * Gets the value of the messageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMessageCharge() {
        return messageCharge;
    }

    /**
     * Sets the value of the messageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMessageCharge(BigDecimal value) {
        this.messageCharge = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the cubKycStatus2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubKycStatus2() {
        return cubKycStatus2;
    }

    /**
     * Sets the value of the cubKycStatus2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubKycStatus2(String value) {
        this.cubKycStatus2 = value;
    }

    /**
     * Gets the value of the cubComplianceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubComplianceStatus() {
        return cubComplianceStatus;
    }

    /**
     * Sets the value of the cubComplianceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubComplianceStatus(BigInteger value) {
        this.cubComplianceStatus = value;
    }

    /**
     * Gets the value of the cubRecentMtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubRecentMtcn() {
        return cubRecentMtcn;
    }

    /**
     * Sets the value of the cubRecentMtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubRecentMtcn(String value) {
        this.cubRecentMtcn = value;
    }

    /**
     * Gets the value of the cubRecentMtcnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubRecentMtcnStatus() {
        return cubRecentMtcnStatus;
    }

    /**
     * Sets the value of the cubRecentMtcnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubRecentMtcnStatus(String value) {
        this.cubRecentMtcnStatus = value;
    }

    /**
     * Gets the value of the cubMtcnNextStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubMtcnNextStep() {
        return cubMtcnNextStep;
    }

    /**
     * Sets the value of the cubMtcnNextStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubMtcnNextStep(String value) {
        this.cubMtcnNextStep = value;
    }

    /**
     * Gets the value of the kycTxnStatusRequiredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKycTxnStatusRequiredFlag() {
        return kycTxnStatusRequiredFlag;
    }

    /**
     * Sets the value of the kycTxnStatusRequiredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKycTxnStatusRequiredFlag(String value) {
        this.kycTxnStatusRequiredFlag = value;
    }

    /**
     * Gets the value of the cubKycStatus1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubKycStatus1() {
        return cubKycStatus1;
    }

    /**
     * Sets the value of the cubKycStatus1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubKycStatus1(String value) {
        this.cubKycStatus1 = value;
    }

    /**
     * Gets the value of the consumerValidationSelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerValidationSelection() {
        return consumerValidationSelection;
    }

    /**
     * Sets the value of the consumerValidationSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerValidationSelection(String value) {
        this.consumerValidationSelection = value;
    }

    /**
     * Gets the value of the saveTxnOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveTxnOptions() {
        return saveTxnOptions;
    }

    /**
     * Sets the value of the saveTxnOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveTxnOptions(String value) {
        this.saveTxnOptions = value;
    }

    /**
     * Gets the value of the principalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalAmount() {
        return principalAmount;
    }

    /**
     * Sets the value of the principalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalAmount(BigDecimal value) {
        this.principalAmount = value;
    }

    /**
     * Gets the value of the baseCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseCharge() {
        return baseCharge;
    }

    /**
     * Sets the value of the baseCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseCharge(BigDecimal value) {
        this.baseCharge = value;
    }

    /**
     * Gets the value of the sendingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingCurrency() {
        return sendingCurrency;
    }

    /**
     * Sets the value of the sendingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingCurrency(String value) {
        this.sendingCurrency = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the pinRequestCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinRequestCounter() {
        return pinRequestCounter;
    }

    /**
     * Sets the value of the pinRequestCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinRequestCounter(String value) {
        this.pinRequestCounter = value;
    }

    /**
     * Gets the value of the pinEntryCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinEntryCounter() {
        return pinEntryCounter;
    }

    /**
     * Sets the value of the pinEntryCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinEntryCounter(String value) {
        this.pinEntryCounter = value;
    }

    /**
     * Gets the value of the previousmtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousmtcn() {
        return previousmtcn;
    }

    /**
     * Sets the value of the previousmtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousmtcn(String value) {
        this.previousmtcn = value;
    }

    /**
     * Gets the value of the conversiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversiontype() {
        return conversiontype;
    }

    /**
     * Sets the value of the conversiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversiontype(String value) {
        this.conversiontype = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the cubAchServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubAchServiceType() {
        return cubAchServiceType;
    }

    /**
     * Sets the value of the cubAchServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubAchServiceType(String value) {
        this.cubAchServiceType = value;
    }

    /**
     * Gets the value of the cubRefUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubRefUrl() {
        return cubRefUrl;
    }

    /**
     * Sets the value of the cubRefUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubRefUrl(String value) {
        this.cubRefUrl = value;
    }

    /**
     * Gets the value of the cubTotalCmsPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubTotalCmsPage() {
        return cubTotalCmsPage;
    }

    /**
     * Sets the value of the cubTotalCmsPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubTotalCmsPage(BigInteger value) {
        this.cubTotalCmsPage = value;
    }

    /**
     * Gets the value of the cubTotalToolPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubTotalToolPage() {
        return cubTotalToolPage;
    }

    /**
     * Sets the value of the cubTotalToolPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubTotalToolPage(BigInteger value) {
        this.cubTotalToolPage = value;
    }

    /**
     * Gets the value of the cubTotalTransPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubTotalTransPage() {
        return cubTotalTransPage;
    }

    /**
     * Sets the value of the cubTotalTransPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubTotalTransPage(BigInteger value) {
        this.cubTotalTransPage = value;
    }

    /**
     * Gets the value of the cubTimeSpentCms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubTimeSpentCms() {
        return cubTimeSpentCms;
    }

    /**
     * Sets the value of the cubTimeSpentCms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubTimeSpentCms(BigInteger value) {
        this.cubTimeSpentCms = value;
    }

    /**
     * Gets the value of the cubTimeSpentTool property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubTimeSpentTool() {
        return cubTimeSpentTool;
    }

    /**
     * Sets the value of the cubTimeSpentTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubTimeSpentTool(BigInteger value) {
        this.cubTimeSpentTool = value;
    }

    /**
     * Gets the value of the cubTimeSpentTrans property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubTimeSpentTrans() {
        return cubTimeSpentTrans;
    }

    /**
     * Sets the value of the cubTimeSpentTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubTimeSpentTrans(BigInteger value) {
        this.cubTimeSpentTrans = value;
    }

    /**
     * Gets the value of the cubTotalTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCubTotalTransaction() {
        return cubTotalTransaction;
    }

    /**
     * Sets the value of the cubTotalTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCubTotalTransaction(BigInteger value) {
        this.cubTotalTransaction = value;
    }

    /**
     * Gets the value of the fidOriginalEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidOriginalEmailAddress() {
        return fidOriginalEmailAddress;
    }

    /**
     * Sets the value of the fidOriginalEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidOriginalEmailAddress(String value) {
        this.fidOriginalEmailAddress = value;
    }

    /**
     * Gets the value of the fidStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidStreetAddress() {
        return fidStreetAddress;
    }

    /**
     * Sets the value of the fidStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidStreetAddress(String value) {
        this.fidStreetAddress = value;
    }

    /**
     * Gets the value of the fidState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidState() {
        return fidState;
    }

    /**
     * Sets the value of the fidState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidState(String value) {
        this.fidState = value;
    }

    /**
     * Gets the value of the fidCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCity() {
        return fidCity;
    }

    /**
     * Sets the value of the fidCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCity(String value) {
        this.fidCity = value;
    }

    /**
     * Gets the value of the fidZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidZipCode() {
        return fidZipCode;
    }

    /**
     * Sets the value of the fidZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidZipCode(String value) {
        this.fidZipCode = value;
    }

    /**
     * Gets the value of the fidBillingPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBillingPhoneNumber() {
        return fidBillingPhoneNumber;
    }

    /**
     * Sets the value of the fidBillingPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBillingPhoneNumber(String value) {
        this.fidBillingPhoneNumber = value;
    }

    /**
     * Gets the value of the fidContactPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidContactPhoneNumber() {
        return fidContactPhoneNumber;
    }

    /**
     * Sets the value of the fidContactPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidContactPhoneNumber(String value) {
        this.fidContactPhoneNumber = value;
    }

    /**
     * Gets the value of the fidMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidMobileNumber() {
        return fidMobileNumber;
    }

    /**
     * Sets the value of the fidMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidMobileNumber(String value) {
        this.fidMobileNumber = value;
    }

    /**
     * Gets the value of the fidEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidEmailAddress() {
        return fidEmailAddress;
    }

    /**
     * Sets the value of the fidEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidEmailAddress(String value) {
        this.fidEmailAddress = value;
    }

    /**
     * Gets the value of the fidMarketingOptInOutStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidMarketingOptInOutStatement() {
        return fidMarketingOptInOutStatement;
    }

    /**
     * Sets the value of the fidMarketingOptInOutStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidMarketingOptInOutStatement(String value) {
        this.fidMarketingOptInOutStatement = value;
    }

    /**
     * Gets the value of the fidCustomerDob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCustomerDob() {
        return fidCustomerDob;
    }

    /**
     * Sets the value of the fidCustomerDob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCustomerDob(String value) {
        this.fidCustomerDob = value;
    }

    /**
     * Gets the value of the fidUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidUserName() {
        return fidUserName;
    }

    /**
     * Sets the value of the fidUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidUserName(String value) {
        this.fidUserName = value;
    }

    /**
     * Gets the value of the fidPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidPassword() {
        return fidPassword;
    }

    /**
     * Sets the value of the fidPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidPassword(String value) {
        this.fidPassword = value;
    }

    /**
     * Gets the value of the fidQuestion1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidQuestion1() {
        return fidQuestion1;
    }

    /**
     * Sets the value of the fidQuestion1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidQuestion1(String value) {
        this.fidQuestion1 = value;
    }

    /**
     * Gets the value of the fidAnswer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAnswer1() {
        return fidAnswer1;
    }

    /**
     * Sets the value of the fidAnswer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAnswer1(String value) {
        this.fidAnswer1 = value;
    }

    /**
     * Gets the value of the fidQuestion2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidQuestion2() {
        return fidQuestion2;
    }

    /**
     * Sets the value of the fidQuestion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidQuestion2(String value) {
        this.fidQuestion2 = value;
    }

    /**
     * Gets the value of the fidAnswer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAnswer2() {
        return fidAnswer2;
    }

    /**
     * Sets the value of the fidAnswer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAnswer2(String value) {
        this.fidAnswer2 = value;
    }

    /**
     * Gets the value of the fidQuestion3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidQuestion3() {
        return fidQuestion3;
    }

    /**
     * Sets the value of the fidQuestion3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidQuestion3(String value) {
        this.fidQuestion3 = value;
    }

    /**
     * Gets the value of the fidAnswer3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAnswer3() {
        return fidAnswer3;
    }

    /**
     * Sets the value of the fidAnswer3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAnswer3(String value) {
        this.fidAnswer3 = value;
    }

    /**
     * Gets the value of the fidCreditCardType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardType1() {
        return fidCreditCardType1;
    }

    /**
     * Sets the value of the fidCreditCardType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardType1(String value) {
        this.fidCreditCardType1 = value;
    }

    /**
     * Gets the value of the fidCreditCardExpiryType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardExpiryType1() {
        return fidCreditCardExpiryType1;
    }

    /**
     * Sets the value of the fidCreditCardExpiryType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardExpiryType1(String value) {
        this.fidCreditCardExpiryType1 = value;
    }

    /**
     * Gets the value of the fidAccountNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAccountNumber1() {
        return fidAccountNumber1;
    }

    /**
     * Sets the value of the fidAccountNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAccountNumber1(String value) {
        this.fidAccountNumber1 = value;
    }

    /**
     * Gets the value of the fidCreditCardType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardType2() {
        return fidCreditCardType2;
    }

    /**
     * Sets the value of the fidCreditCardType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardType2(String value) {
        this.fidCreditCardType2 = value;
    }

    /**
     * Gets the value of the fidCreditCardExpiryType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardExpiryType2() {
        return fidCreditCardExpiryType2;
    }

    /**
     * Sets the value of the fidCreditCardExpiryType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardExpiryType2(String value) {
        this.fidCreditCardExpiryType2 = value;
    }

    /**
     * Gets the value of the fidAccountNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAccountNumber2() {
        return fidAccountNumber2;
    }

    /**
     * Sets the value of the fidAccountNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAccountNumber2(String value) {
        this.fidAccountNumber2 = value;
    }

    /**
     * Gets the value of the fidCreditCardType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardType3() {
        return fidCreditCardType3;
    }

    /**
     * Sets the value of the fidCreditCardType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardType3(String value) {
        this.fidCreditCardType3 = value;
    }

    /**
     * Gets the value of the fidCreditCardExpiryType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardExpiryType3() {
        return fidCreditCardExpiryType3;
    }

    /**
     * Sets the value of the fidCreditCardExpiryType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardExpiryType3(String value) {
        this.fidCreditCardExpiryType3 = value;
    }

    /**
     * Gets the value of the fidAccountNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAccountNumber3() {
        return fidAccountNumber3;
    }

    /**
     * Sets the value of the fidAccountNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAccountNumber3(String value) {
        this.fidAccountNumber3 = value;
    }

    /**
     * Gets the value of the fidCreditCardType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardType4() {
        return fidCreditCardType4;
    }

    /**
     * Sets the value of the fidCreditCardType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardType4(String value) {
        this.fidCreditCardType4 = value;
    }

    /**
     * Gets the value of the fidCreditCardExpiryType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardExpiryType4() {
        return fidCreditCardExpiryType4;
    }

    /**
     * Sets the value of the fidCreditCardExpiryType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardExpiryType4(String value) {
        this.fidCreditCardExpiryType4 = value;
    }

    /**
     * Gets the value of the fidAccountNumber4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAccountNumber4() {
        return fidAccountNumber4;
    }

    /**
     * Sets the value of the fidAccountNumber4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAccountNumber4(String value) {
        this.fidAccountNumber4 = value;
    }

    /**
     * Gets the value of the fidCreditCardType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardType5() {
        return fidCreditCardType5;
    }

    /**
     * Sets the value of the fidCreditCardType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardType5(String value) {
        this.fidCreditCardType5 = value;
    }

    /**
     * Gets the value of the fidCreditCardExpiryType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardExpiryType5() {
        return fidCreditCardExpiryType5;
    }

    /**
     * Sets the value of the fidCreditCardExpiryType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardExpiryType5(String value) {
        this.fidCreditCardExpiryType5 = value;
    }

    /**
     * Gets the value of the fidAccountNumber5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAccountNumber5() {
        return fidAccountNumber5;
    }

    /**
     * Sets the value of the fidAccountNumber5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAccountNumber5(String value) {
        this.fidAccountNumber5 = value;
    }

    /**
     * Gets the value of the fidCurrenttimestemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCurrenttimestemp() {
        return fidCurrenttimestemp;
    }

    /**
     * Sets the value of the fidCurrenttimestemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCurrenttimestemp(String value) {
        this.fidCurrenttimestemp = value;
    }

    /**
     * Gets the value of the fidCreditCardType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardType6() {
        return fidCreditCardType6;
    }

    /**
     * Sets the value of the fidCreditCardType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardType6(String value) {
        this.fidCreditCardType6 = value;
    }

    /**
     * Gets the value of the fidCreditCardExpiryType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCreditCardExpiryType6() {
        return fidCreditCardExpiryType6;
    }

    /**
     * Sets the value of the fidCreditCardExpiryType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCreditCardExpiryType6(String value) {
        this.fidCreditCardExpiryType6 = value;
    }

    /**
     * Gets the value of the fidAccountNumber6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAccountNumber6() {
        return fidAccountNumber6;
    }

    /**
     * Sets the value of the fidAccountNumber6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAccountNumber6(String value) {
        this.fidAccountNumber6 = value;
    }

    /**
     * Gets the value of the fidCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCustomerFirstName() {
        return fidCustomerFirstName;
    }

    /**
     * Sets the value of the fidCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCustomerFirstName(String value) {
        this.fidCustomerFirstName = value;
    }

    /**
     * Gets the value of the fidCustomerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCustomerMiddleName() {
        return fidCustomerMiddleName;
    }

    /**
     * Sets the value of the fidCustomerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCustomerMiddleName(String value) {
        this.fidCustomerMiddleName = value;
    }

    /**
     * Gets the value of the fidCustomerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCustomerLastName() {
        return fidCustomerLastName;
    }

    /**
     * Sets the value of the fidCustomerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCustomerLastName(String value) {
        this.fidCustomerLastName = value;
    }

    /**
     * Gets the value of the fidBankRoutingNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankRoutingNumber1() {
        return fidBankRoutingNumber1;
    }

    /**
     * Sets the value of the fidBankRoutingNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankRoutingNumber1(String value) {
        this.fidBankRoutingNumber1 = value;
    }

    /**
     * Gets the value of the fidBankAccountNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountNumber1() {
        return fidBankAccountNumber1;
    }

    /**
     * Sets the value of the fidBankAccountNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountNumber1(String value) {
        this.fidBankAccountNumber1 = value;
    }

    /**
     * Gets the value of the fidBankAccountType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountType1() {
        return fidBankAccountType1;
    }

    /**
     * Sets the value of the fidBankAccountType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountType1(String value) {
        this.fidBankAccountType1 = value;
    }

    /**
     * Gets the value of the fidBankRoutingNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankRoutingNumber2() {
        return fidBankRoutingNumber2;
    }

    /**
     * Sets the value of the fidBankRoutingNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankRoutingNumber2(String value) {
        this.fidBankRoutingNumber2 = value;
    }

    /**
     * Gets the value of the fidBankAccountNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountNumber2() {
        return fidBankAccountNumber2;
    }

    /**
     * Sets the value of the fidBankAccountNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountNumber2(String value) {
        this.fidBankAccountNumber2 = value;
    }

    /**
     * Gets the value of the fidBankAccountType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountType2() {
        return fidBankAccountType2;
    }

    /**
     * Sets the value of the fidBankAccountType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountType2(String value) {
        this.fidBankAccountType2 = value;
    }

    /**
     * Gets the value of the fidBankRoutingNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankRoutingNumber3() {
        return fidBankRoutingNumber3;
    }

    /**
     * Sets the value of the fidBankRoutingNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankRoutingNumber3(String value) {
        this.fidBankRoutingNumber3 = value;
    }

    /**
     * Gets the value of the fidBankAccountNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountNumber3() {
        return fidBankAccountNumber3;
    }

    /**
     * Sets the value of the fidBankAccountNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountNumber3(String value) {
        this.fidBankAccountNumber3 = value;
    }

    /**
     * Gets the value of the fidBankAccountType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountType3() {
        return fidBankAccountType3;
    }

    /**
     * Sets the value of the fidBankAccountType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountType3(String value) {
        this.fidBankAccountType3 = value;
    }

    /**
     * Gets the value of the fidBankRoutingNumber4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankRoutingNumber4() {
        return fidBankRoutingNumber4;
    }

    /**
     * Sets the value of the fidBankRoutingNumber4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankRoutingNumber4(String value) {
        this.fidBankRoutingNumber4 = value;
    }

    /**
     * Gets the value of the fidBankAccountNumber4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountNumber4() {
        return fidBankAccountNumber4;
    }

    /**
     * Sets the value of the fidBankAccountNumber4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountNumber4(String value) {
        this.fidBankAccountNumber4 = value;
    }

    /**
     * Gets the value of the fidBankAccountType4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountType4() {
        return fidBankAccountType4;
    }

    /**
     * Sets the value of the fidBankAccountType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountType4(String value) {
        this.fidBankAccountType4 = value;
    }

    /**
     * Gets the value of the fidBankRoutingNumber5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankRoutingNumber5() {
        return fidBankRoutingNumber5;
    }

    /**
     * Sets the value of the fidBankRoutingNumber5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankRoutingNumber5(String value) {
        this.fidBankRoutingNumber5 = value;
    }

    /**
     * Gets the value of the fidBankAccountNumber5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountNumber5() {
        return fidBankAccountNumber5;
    }

    /**
     * Sets the value of the fidBankAccountNumber5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountNumber5(String value) {
        this.fidBankAccountNumber5 = value;
    }

    /**
     * Gets the value of the fidBankAccountType5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountType5() {
        return fidBankAccountType5;
    }

    /**
     * Sets the value of the fidBankAccountType5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountType5(String value) {
        this.fidBankAccountType5 = value;
    }

    /**
     * Gets the value of the fidBankRoutingNumber6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankRoutingNumber6() {
        return fidBankRoutingNumber6;
    }

    /**
     * Sets the value of the fidBankRoutingNumber6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankRoutingNumber6(String value) {
        this.fidBankRoutingNumber6 = value;
    }

    /**
     * Gets the value of the fidBankAccountNumber6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountNumber6() {
        return fidBankAccountNumber6;
    }

    /**
     * Sets the value of the fidBankAccountNumber6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountNumber6(String value) {
        this.fidBankAccountNumber6 = value;
    }

    /**
     * Gets the value of the fidBankAccountType6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidBankAccountType6() {
        return fidBankAccountType6;
    }

    /**
     * Sets the value of the fidBankAccountType6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidBankAccountType6(String value) {
        this.fidBankAccountType6 = value;
    }

    /**
     * Gets the value of the fidAlternatePhoneNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAlternatePhoneNumber2() {
        return fidAlternatePhoneNumber2;
    }

    /**
     * Sets the value of the fidAlternatePhoneNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAlternatePhoneNumber2(String value) {
        this.fidAlternatePhoneNumber2 = value;
    }

    /**
     * Gets the value of the fidPhone1Type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidPhone1Type() {
        return fidPhone1Type;
    }

    /**
     * Sets the value of the fidPhone1Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidPhone1Type(String value) {
        this.fidPhone1Type = value;
    }

    /**
     * Gets the value of the fidPhone2Type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidPhone2Type() {
        return fidPhone2Type;
    }

    /**
     * Sets the value of the fidPhone2Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidPhone2Type(String value) {
        this.fidPhone2Type = value;
    }

    /**
     * Gets the value of the fidPhone3Type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidPhone3Type() {
        return fidPhone3Type;
    }

    /**
     * Sets the value of the fidPhone3Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidPhone3Type(String value) {
        this.fidPhone3Type = value;
    }

    /**
     * Gets the value of the fidPbvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidPbvStatus() {
        return fidPbvStatus;
    }

    /**
     * Sets the value of the fidPbvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidPbvStatus(String value) {
        this.fidPbvStatus = value;
    }

    /**
     * Gets the value of the fidPinDeliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidPinDeliveryOption() {
        return fidPinDeliveryOption;
    }

    /**
     * Sets the value of the fidPinDeliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidPinDeliveryOption(String value) {
        this.fidPinDeliveryOption = value;
    }

    /**
     * Gets the value of the fidGoldCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidGoldCardNumber() {
        return fidGoldCardNumber;
    }

    /**
     * Sets the value of the fidGoldCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidGoldCardNumber(String value) {
        this.fidGoldCardNumber = value;
    }

    /**
     * Gets the value of the fidVerifiedDeliveryOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidVerifiedDeliveryOptions() {
        return fidVerifiedDeliveryOptions;
    }

    /**
     * Sets the value of the fidVerifiedDeliveryOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidVerifiedDeliveryOptions(String value) {
        this.fidVerifiedDeliveryOptions = value;
    }

    /**
     * Gets the value of the fidUserActivationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidUserActivationFlag() {
        return fidUserActivationFlag;
    }

    /**
     * Sets the value of the fidUserActivationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidUserActivationFlag(String value) {
        this.fidUserActivationFlag = value;
    }

    /**
     * Gets the value of the fidAchServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidAchServiceType() {
        return fidAchServiceType;
    }

    /**
     * Sets the value of the fidAchServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidAchServiceType(String value) {
        this.fidAchServiceType = value;
    }

    /**
     * Gets the value of the fidRawAddressHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidRawAddressHash() {
        return fidRawAddressHash;
    }

    /**
     * Sets the value of the fidRawAddressHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidRawAddressHash(String value) {
        this.fidRawAddressHash = value;
    }

    /**
     * Gets the value of the fidCleansedAddressHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCleansedAddressHash() {
        return fidCleansedAddressHash;
    }

    /**
     * Sets the value of the fidCleansedAddressHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCleansedAddressHash(String value) {
        this.fidCleansedAddressHash = value;
    }

    /**
     * Gets the value of the fidCubPcp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCubPcp() {
        return fidCubPcp;
    }

    /**
     * Sets the value of the fidCubPcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCubPcp(String value) {
        this.fidCubPcp = value;
    }

    /**
     * Gets the value of the fidStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidStreetAddress2() {
        return fidStreetAddress2;
    }

    /**
     * Sets the value of the fidStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidStreetAddress2(String value) {
        this.fidStreetAddress2 = value;
    }

    /**
     * Gets the value of the fidCubCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidCubCountry() {
        return fidCubCountry;
    }

    /**
     * Sets the value of the fidCubCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidCubCountry(String value) {
        this.fidCubCountry = value;
    }

    /**
     * Gets the value of the fidDeviceStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidDeviceStatusFlag() {
        return fidDeviceStatusFlag;
    }

    /**
     * Sets the value of the fidDeviceStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidDeviceStatusFlag(String value) {
        this.fidDeviceStatusFlag = value;
    }

    /**
     * Gets the value of the fidDeviceKnownStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoFlag }
     *     
     */
    public YesNoFlag getFidDeviceKnownStatusFlag() {
        return fidDeviceKnownStatusFlag;
    }

    /**
     * Sets the value of the fidDeviceKnownStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoFlag }
     *     
     */
    public void setFidDeviceKnownStatusFlag(YesNoFlag value) {
        this.fidDeviceKnownStatusFlag = value;
    }

    /**
     * Gets the value of the fidChannelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFidChannelName() {
        return fidChannelName;
    }

    /**
     * Sets the value of the fidChannelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFidChannelName(String value) {
        this.fidChannelName = value;
    }

    /**
     * Gets the value of the consumerSelectedKycOption1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSelectedKycOption1() {
        return consumerSelectedKycOption1;
    }

    /**
     * Sets the value of the consumerSelectedKycOption1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSelectedKycOption1(String value) {
        this.consumerSelectedKycOption1 = value;
    }

    /**
     * Gets the value of the achDoneOrNot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchDoneOrNot() {
        return achDoneOrNot;
    }

    /**
     * Sets the value of the achDoneOrNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchDoneOrNot(String value) {
        this.achDoneOrNot = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the bpRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpRefId() {
        return bpRefId;
    }

    /**
     * Sets the value of the bpRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpRefId(String value) {
        this.bpRefId = value;
    }

    /**
     * Gets the value of the bpRefundToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpRefundToken() {
        return bpRefundToken;
    }

    /**
     * Sets the value of the bpRefundToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpRefundToken(String value) {
        this.bpRefundToken = value;
    }

    /**
     * Gets the value of the ngPaytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgPaytype() {
        return ngPaytype;
    }

    /**
     * Sets the value of the ngPaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgPaytype(String value) {
        this.ngPaytype = value;
    }

    /**
     * Gets the value of the blazeextendedresponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlazeextendedresponse() {
        return blazeextendedresponse;
    }

    /**
     * Sets the value of the blazeextendedresponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlazeextendedresponse(String value) {
        this.blazeextendedresponse = value;
    }

    /**
     * Gets the value of the cancelreasoncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelreasoncode() {
        return cancelreasoncode;
    }

    /**
     * Sets the value of the cancelreasoncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelreasoncode(String value) {
        this.cancelreasoncode = value;
    }

    /**
     * Gets the value of the vedaVerificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVedaVerificationFlag() {
        return vedaVerificationFlag;
    }

    /**
     * Sets the value of the vedaVerificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVedaVerificationFlag(String value) {
        this.vedaVerificationFlag = value;
    }

    /**
     * Gets the value of the vedaRetryCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVedaRetryCount() {
        return vedaRetryCount;
    }

    /**
     * Sets the value of the vedaRetryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVedaRetryCount(String value) {
        this.vedaRetryCount = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the flagForResettingRetrycount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagForResettingRetrycount() {
        return flagForResettingRetrycount;
    }

    /**
     * Sets the value of the flagForResettingRetrycount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagForResettingRetrycount(String value) {
        this.flagForResettingRetrycount = value;
    }

    /**
     * Gets the value of the consumerSelectedKycOption3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSelectedKycOption3() {
        return consumerSelectedKycOption3;
    }

    /**
     * Sets the value of the consumerSelectedKycOption3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSelectedKycOption3(String value) {
        this.consumerSelectedKycOption3 = value;
    }

    /**
     * Gets the value of the eligibleToTransact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibleToTransact() {
        return eligibleToTransact;
    }

    /**
     * Sets the value of the eligibleToTransact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibleToTransact(String value) {
        this.eligibleToTransact = value;
    }

    /**
     * Gets the value of the lastTxnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTxnDate() {
        return lastTxnDate;
    }

    /**
     * Sets the value of the lastTxnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTxnDate(String value) {
        this.lastTxnDate = value;
    }

    /**
     * Gets the value of the cubIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubIp() {
        return cubIp;
    }

    /**
     * Sets the value of the cubIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubIp(String value) {
        this.cubIp = value;
    }

    /**
     * Gets the value of the cubIpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCubIpType() {
        return cubIpType;
    }

    /**
     * Sets the value of the cubIpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCubIpType(String value) {
        this.cubIpType = value;
    }

    /**
     * Gets the value of the trxAvalForConsum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxAvalForConsum() {
        return trxAvalForConsum;
    }

    /**
     * Sets the value of the trxAvalForConsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxAvalForConsum(String value) {
        this.trxAvalForConsum = value;
    }

    /**
     * Gets the value of the emailVerificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getEmailVerificationFlag() {
        return emailVerificationFlag;
    }

    /**
     * Sets the value of the emailVerificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setEmailVerificationFlag(YesNo value) {
        this.emailVerificationFlag = value;
    }

    /**
     * Gets the value of the rwcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRwcFlag() {
        return rwcFlag;
    }

    /**
     * Sets the value of the rwcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRwcFlag(String value) {
        this.rwcFlag = value;
    }

    /**
     * Gets the value of the sendDelayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDelayHours() {
        return sendDelayHours;
    }

    /**
     * Sets the value of the sendDelayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDelayHours(String value) {
        this.sendDelayHours = value;
    }

    /**
     * Gets the value of the authProcessingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthProcessingId() {
        return authProcessingId;
    }

    /**
     * Sets the value of the authProcessingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthProcessingId(String value) {
        this.authProcessingId = value;
    }

    /**
     * Gets the value of the authZeroauthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthZeroauthCode() {
        return authZeroauthCode;
    }

    /**
     * Sets the value of the authZeroauthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthZeroauthCode(String value) {
        this.authZeroauthCode = value;
    }

    /**
     * Gets the value of the paymenrCaptureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenrCaptureDate() {
        return paymenrCaptureDate;
    }

    /**
     * Sets the value of the paymenrCaptureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenrCaptureDate(String value) {
        this.paymenrCaptureDate = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the satPaymentRetryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSatPaymentRetryCode() {
        return satPaymentRetryCode;
    }

    /**
     * Sets the value of the satPaymentRetryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSatPaymentRetryCode(String value) {
        this.satPaymentRetryCode = value;
    }

    /**
     * Gets the value of the captureExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureExpiryDate() {
        return captureExpiryDate;
    }

    /**
     * Sets the value of the captureExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureExpiryDate(String value) {
        this.captureExpiryDate = value;
    }

    /**
     * Gets the value of the diThirdpartyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiThirdpartyIdentifier() {
        return diThirdpartyIdentifier;
    }

    /**
     * Sets the value of the diThirdpartyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiThirdpartyIdentifier(String value) {
        this.diThirdpartyIdentifier = value;
    }

    /**
     * Gets the value of the diTxnChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiTxnChannel() {
        return diTxnChannel;
    }

    /**
     * Sets the value of the diTxnChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiTxnChannel(String value) {
        this.diTxnChannel = value;
    }

    /**
     * Gets the value of the diPartnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiPartnerName() {
        return diPartnerName;
    }

    /**
     * Sets the value of the diPartnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiPartnerName(String value) {
        this.diPartnerName = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the digitalThresholdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalThresholdFlag() {
        return digitalThresholdFlag;
    }

    /**
     * Sets the value of the digitalThresholdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalThresholdFlag(String value) {
        this.digitalThresholdFlag = value;
    }

    /**
     * Gets the value of the feeThresholdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeThresholdFlag() {
        return feeThresholdFlag;
    }

    /**
     * Sets the value of the feeThresholdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeThresholdFlag(String value) {
        this.feeThresholdFlag = value;
    }

    /**
     * Gets the value of the fxThresholdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXThresholdFlag() {
        return fxThresholdFlag;
    }

    /**
     * Sets the value of the fxThresholdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXThresholdFlag(String value) {
        this.fxThresholdFlag = value;
    }

    /**
     * Gets the value of the lockOnPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockOnPrincipalAmount() {
        return lockOnPrincipalAmount;
    }

    /**
     * Sets the value of the lockOnPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockOnPrincipalAmount(String value) {
        this.lockOnPrincipalAmount = value;
    }

    /**
     * Gets the value of the limitcheckBypassFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BypassLimitcheck }
     *     
     */
    public BypassLimitcheck getLimitcheckBypassFlag() {
        return limitcheckBypassFlag;
    }

    /**
     * Sets the value of the limitcheckBypassFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BypassLimitcheck }
     *     
     */
    public void setLimitcheckBypassFlag(BypassLimitcheck value) {
        this.limitcheckBypassFlag = value;
    }

    /**
     * Gets the value of the apCardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApCardnumber() {
        return apCardnumber;
    }

    /**
     * Sets the value of the apCardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApCardnumber(String value) {
        this.apCardnumber = value;
    }

    /**
     * Gets the value of the validateType property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateType }
     *     
     */
    public ValidateType getValidateType() {
        return validateType;
    }

    /**
     * Sets the value of the validateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateType }
     *     
     */
    public void setValidateType(ValidateType value) {
        this.validateType = value;
    }

    /**
     * Gets the value of the cruiseUserFlag property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseUserFlag }
     *     
     */
    public CruiseUserFlag getCruiseUserFlag() {
        return cruiseUserFlag;
    }

    /**
     * Sets the value of the cruiseUserFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseUserFlag }
     *     
     */
    public void setCruiseUserFlag(CruiseUserFlag value) {
        this.cruiseUserFlag = value;
    }

    /**
     * Gets the value of the paymentProcessingFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentProcessingFee() {
        return paymentProcessingFee;
    }

    /**
     * Sets the value of the paymentProcessingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentProcessingFee(Long value) {
        this.paymentProcessingFee = value;
    }

    /**
     * Gets the value of the receiptNotification property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptNotification }
     *     
     */
    public ReceiptNotification getReceiptNotification() {
        return receiptNotification;
    }

    /**
     * Sets the value of the receiptNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptNotification }
     *     
     */
    public void setReceiptNotification(ReceiptNotification value) {
        this.receiptNotification = value;
    }

    /**
     * Gets the value of the txnIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier }
     *     
     */
    public TransactionIdentifier getTxnIdentifier() {
        return txnIdentifier;
    }

    /**
     * Sets the value of the txnIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier }
     *     
     */
    public void setTxnIdentifier(TransactionIdentifier value) {
        this.txnIdentifier = value;
    }

    /**
     * Gets the value of the paymentVerificationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentVerificationFlag() {
        return paymentVerificationFlag;
    }

    /**
     * Sets the value of the paymentVerificationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentVerificationFlag(String value) {
        this.paymentVerificationFlag = value;
    }

    /**
     * Gets the value of the rwcDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRwcDelay() {
        return rwcDelay;
    }

    /**
     * Sets the value of the rwcDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRwcDelay(String value) {
        this.rwcDelay = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnType(String value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the pricingSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingSegment() {
        return pricingSegment;
    }

    /**
     * Sets the value of the pricingSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingSegment(String value) {
        this.pricingSegment = value;
    }

    /**
     * Gets the value of the pricingPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingPartnerId() {
        return pricingPartnerId;
    }

    /**
     * Sets the value of the pricingPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingPartnerId(String value) {
        this.pricingPartnerId = value;
    }

    /**
     * Gets the value of the rcrrSubscriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcrrSubscriptionType() {
        return rcrrSubscriptionType;
    }

    /**
     * Sets the value of the rcrrSubscriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcrrSubscriptionType(String value) {
        this.rcrrSubscriptionType = value;
    }

    /**
     * Gets the value of the zeptoPayIdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getZeptoPayIdFlag() {
        return zeptoPayIdFlag;
    }

    /**
     * Sets the value of the zeptoPayIdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setZeptoPayIdFlag(YesNo value) {
        this.zeptoPayIdFlag = value;
    }

}
