
package com.santanderglobaltech.batchdemo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cti_txt_outgoing__c",
    "cti_type__c",
    "contact__c",
    "cti_txt_incoming__c",
    "cti_end_date__c",
    "name",
    "cl_txt_platform__c",
    "cti_ani__c",
    "ownerid",
    "cti_start_date__c",
    "cl_txt_start_time__c",
    "cl_lkp_user__c",
    "createddate",
    "cl_cas_fromws__c",
    "sfid",
    "id",
    "cl_txt_interest__c",
    "cl_txt_total__c",
    "cl_txt_start__c",
    "cl_txt_callername__c",
    "cti_duration__c",
    "cl_txt_online__c",
    "cl_lkp_userjid__c",
    "cl_lkp_userjid__r__its_jid__c",
    "cl_txt_calledname__c",
    "cl_txt_state__c",
    "cl_lkp_user__r__its_jid__c",
    "cl_txt_count__c",
    "cti_cas_callid__c"
})
public class CallLog {

    @JsonProperty("cti_txt_outgoing__c")
    public String ctiTxtOutgoingC;
    @JsonProperty("cti_type__c")
    public String ctiTypeC;
    @JsonProperty("contact__c")
    public String contactC;
    @JsonProperty("cti_txt_incoming__c")
    public String ctiTxtIncomingC;
    @JsonProperty("cti_end_date__c")
    public String ctiEndDateC;
    @JsonProperty("name")
    public String name;
    @JsonProperty("cl_txt_platform__c")
    public String clTxtPlatformC;
    @JsonProperty("cti_ani__c")
    public String ctiAniC;
    @JsonProperty("ownerid")
    public String ownerid;
    @JsonProperty("cti_start_date__c")
    public String ctiStartDateC;
    @JsonProperty("cl_txt_start_time__c")
    public String clTxtStartTimeC;
    @JsonProperty("cl_lkp_user__c")
    public String clLkpUserC;
    @JsonProperty("createddate")
    public String createddate;
    @JsonProperty("cl_cas_fromws__c")
    public Boolean clCasFromwsC;
    @JsonProperty("sfid")
    public String sfid;
    @JsonProperty("id")
    public Long id;
    @JsonProperty("cl_txt_interest__c")
    public String clTxtInterestC;
    @JsonProperty("cl_txt_total__c")
    public String clTxtTotalC;
    @JsonProperty("cl_txt_start__c")
    public String clTxtStartC;
    @JsonProperty("cl_txt_callername__c")
    public String clTxtCallernameC;
    @JsonProperty("cti_duration__c")
    public Long ctiDurationC;
    @JsonProperty("cl_txt_online__c")
    public String clTxtOnlineC;
    @JsonProperty("cl_lkp_userjid__c")
    public String clLkpUserjidC;
    @JsonProperty("cl_lkp_userjid__r__its_jid__c")
    public String clLkpUserjidRItsJidC;
    @JsonProperty("cl_txt_calledname__c")
    public String clTxtCallednameC;
    @JsonProperty("cl_txt_state__c")
    public String clTxtStateC;
    @JsonProperty("cl_lkp_user__r__its_jid__c")
    public String clLkpUserRItsJidC;
    @JsonProperty("cl_txt_count__c")
    public String clTxtCountC;
    @JsonProperty("cti_cas_callid__c")
    public String ctiCasCallidC;

}
