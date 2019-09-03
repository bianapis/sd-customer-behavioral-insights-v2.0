package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecordCustomerBehaviorAnalysisInsightsRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord
 */
public class CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord   {
  private String customerInsightAnalysisSchedule = null;

  private CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecordCustomerBehaviorAnalysisInsightsRecord customerBehaviorAnalysisInsightsRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for refreshing the analyses for a customer 
   * @return customerInsightAnalysisSchedule
  **/

  public String getCustomerInsightAnalysisSchedule() {
    return customerInsightAnalysisSchedule;
  }

  public void setCustomerInsightAnalysisSchedule(String customerInsightAnalysisSchedule) {
    this.customerInsightAnalysisSchedule = customerInsightAnalysisSchedule;
  }


  /**
   * Get customerBehaviorAnalysisInsightsRecord
   * @return customerBehaviorAnalysisInsightsRecord
  **/

  public CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecordCustomerBehaviorAnalysisInsightsRecord getCustomerBehaviorAnalysisInsightsRecord() {
    return customerBehaviorAnalysisInsightsRecord;
  }

  public void setCustomerBehaviorAnalysisInsightsRecord(CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecordCustomerBehaviorAnalysisInsightsRecord customerBehaviorAnalysisInsightsRecord) {
    this.customerBehaviorAnalysisInsightsRecord = customerBehaviorAnalysisInsightsRecord;
  }


}

