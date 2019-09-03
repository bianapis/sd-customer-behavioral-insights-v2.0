package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisExchangeInputModelCustomerBehaviorAnalysisExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisExchangeInputModel
 */
public class CRCustomerBehaviorAnalysisExchangeInputModel   {
  private String customerBehavioralInsightsServicingSessionReference = null;

  private String customerBehaviorAnalysisInstanceReference = null;

  private Object customerBehaviorAnalysisExchangeActionTaskRecord = null;

  private CRCustomerBehaviorAnalysisExchangeInputModelCustomerBehaviorAnalysisExchangeActionRequest customerBehaviorAnalysisExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerBehaviorAnalysisExchangeActionTaskRecord
  **/

  public Object getCustomerBehaviorAnalysisExchangeActionTaskRecord() {
    return customerBehaviorAnalysisExchangeActionTaskRecord;
  }

  public void setCustomerBehaviorAnalysisExchangeActionTaskRecord(Object customerBehaviorAnalysisExchangeActionTaskRecord) {
    this.customerBehaviorAnalysisExchangeActionTaskRecord = customerBehaviorAnalysisExchangeActionTaskRecord;
  }


  /**
   * Get customerBehaviorAnalysisExchangeActionRequest
   * @return customerBehaviorAnalysisExchangeActionRequest
  **/

  public CRCustomerBehaviorAnalysisExchangeInputModelCustomerBehaviorAnalysisExchangeActionRequest getCustomerBehaviorAnalysisExchangeActionRequest() {
    return customerBehaviorAnalysisExchangeActionRequest;
  }

  public void setCustomerBehaviorAnalysisExchangeActionRequest(CRCustomerBehaviorAnalysisExchangeInputModelCustomerBehaviorAnalysisExchangeActionRequest customerBehaviorAnalysisExchangeActionRequest) {
    this.customerBehaviorAnalysisExchangeActionRequest = customerBehaviorAnalysisExchangeActionRequest;
  }


}

