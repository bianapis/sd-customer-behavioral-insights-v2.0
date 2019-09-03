package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisExchangeInputModelCustomerBehaviorAnalysisExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQInsightExchangeInputModel
 */
public class BQInsightExchangeInputModel   {
  private String customerBehaviorAnalysisInstanceReference = null;

  private Object insightExchangeActionTaskRecord = null;

  private CRCustomerBehaviorAnalysisExchangeInputModelCustomerBehaviorAnalysisExchangeActionRequest insightExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Behavior Analysis instance 
   * @return customerBehaviorAnalysisInstanceReference
  **/

  public String getCustomerBehaviorAnalysisInstanceReference() {
    return customerBehaviorAnalysisInstanceReference;
  }

  public void setCustomerBehaviorAnalysisInstanceReference(String customerBehaviorAnalysisInstanceReference) {
    this.customerBehaviorAnalysisInstanceReference = customerBehaviorAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return insightExchangeActionTaskRecord
  **/

  public Object getInsightExchangeActionTaskRecord() {
    return insightExchangeActionTaskRecord;
  }

  public void setInsightExchangeActionTaskRecord(Object insightExchangeActionTaskRecord) {
    this.insightExchangeActionTaskRecord = insightExchangeActionTaskRecord;
  }


  /**
   * Get insightExchangeActionRequest
   * @return insightExchangeActionRequest
  **/

  public CRCustomerBehaviorAnalysisExchangeInputModelCustomerBehaviorAnalysisExchangeActionRequest getInsightExchangeActionRequest() {
    return insightExchangeActionRequest;
  }

  public void setInsightExchangeActionRequest(CRCustomerBehaviorAnalysisExchangeInputModelCustomerBehaviorAnalysisExchangeActionRequest insightExchangeActionRequest) {
    this.insightExchangeActionRequest = insightExchangeActionRequest;
  }


}

