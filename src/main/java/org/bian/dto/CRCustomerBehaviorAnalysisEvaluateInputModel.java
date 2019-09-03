package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisEvaluateInputModelCustomerBehaviorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisEvaluateInputModel
 */
public class CRCustomerBehaviorAnalysisEvaluateInputModel   {
  private String customerBehavioralInsightsServicingSessionReference = null;

  private CRCustomerBehaviorAnalysisEvaluateInputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerBehavioralInsightsServicingSessionReference
  **/

  public String getCustomerBehavioralInsightsServicingSessionReference() {
    return customerBehavioralInsightsServicingSessionReference;
  }

  public void setCustomerBehavioralInsightsServicingSessionReference(String customerBehavioralInsightsServicingSessionReference) {
    this.customerBehavioralInsightsServicingSessionReference = customerBehavioralInsightsServicingSessionReference;
  }


  /**
   * Get customerBehaviorAnalysisInstanceRecord
   * @return customerBehaviorAnalysisInstanceRecord
  **/

  public CRCustomerBehaviorAnalysisEvaluateInputModelCustomerBehaviorAnalysisInstanceRecord getCustomerBehaviorAnalysisInstanceRecord() {
    return customerBehaviorAnalysisInstanceRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceRecord(CRCustomerBehaviorAnalysisEvaluateInputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord) {
    this.customerBehaviorAnalysisInstanceRecord = customerBehaviorAnalysisInstanceRecord;
  }


}

