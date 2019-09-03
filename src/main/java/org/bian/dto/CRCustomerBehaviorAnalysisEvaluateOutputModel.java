package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisEvaluateOutputModel
 */
public class CRCustomerBehaviorAnalysisEvaluateOutputModel   {
  private String customerBehaviorAnalysisInstanceReference = null;

  private CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Behavior Analysis instance 
   * @return customerBehaviorAnalysisInstanceReference
  **/

  public String getCustomerBehaviorAnalysisInstanceReference() {
    return customerBehaviorAnalysisInstanceReference;
  }

  public void setCustomerBehaviorAnalysisInstanceReference(String customerBehaviorAnalysisInstanceReference) {
    this.customerBehaviorAnalysisInstanceReference = customerBehaviorAnalysisInstanceReference;
  }


  /**
   * Get customerBehaviorAnalysisInstanceRecord
   * @return customerBehaviorAnalysisInstanceRecord
  **/

  public CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord getCustomerBehaviorAnalysisInstanceRecord() {
    return customerBehaviorAnalysisInstanceRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceRecord(CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord) {
    this.customerBehaviorAnalysisInstanceRecord = customerBehaviorAnalysisInstanceRecord;
  }


}

