package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisExchangeOutputModel
 */
public class CRCustomerBehaviorAnalysisExchangeOutputModel   {
  private String customerBehaviorAnalysisExchangeActionTaskReference = null;

  private Object customerBehaviorAnalysisExchangeActionTaskRecord = null;

  private String customerBehaviorAnalysisExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior Analysis instance exchange service call 
   * @return customerBehaviorAnalysisExchangeActionTaskReference
  **/

  public String getCustomerBehaviorAnalysisExchangeActionTaskReference() {
    return customerBehaviorAnalysisExchangeActionTaskReference;
  }

  public void setCustomerBehaviorAnalysisExchangeActionTaskReference(String customerBehaviorAnalysisExchangeActionTaskReference) {
    this.customerBehaviorAnalysisExchangeActionTaskReference = customerBehaviorAnalysisExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerBehaviorAnalysisExchangeActionResponse
  **/

  public String getCustomerBehaviorAnalysisExchangeActionResponse() {
    return customerBehaviorAnalysisExchangeActionResponse;
  }

  public void setCustomerBehaviorAnalysisExchangeActionResponse(String customerBehaviorAnalysisExchangeActionResponse) {
    this.customerBehaviorAnalysisExchangeActionResponse = customerBehaviorAnalysisExchangeActionResponse;
  }


}

