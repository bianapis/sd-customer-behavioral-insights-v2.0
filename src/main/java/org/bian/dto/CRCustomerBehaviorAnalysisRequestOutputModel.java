package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisRequestOutputModel
 */
public class CRCustomerBehaviorAnalysisRequestOutputModel   {
  private CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord = null;

  private String customerBehaviorAnalysisRequestActionTaskReference = null;

  private Object customerBehaviorAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior Analysis instance request service call 
   * @return customerBehaviorAnalysisRequestActionTaskReference
  **/

  public String getCustomerBehaviorAnalysisRequestActionTaskReference() {
    return customerBehaviorAnalysisRequestActionTaskReference;
  }

  public void setCustomerBehaviorAnalysisRequestActionTaskReference(String customerBehaviorAnalysisRequestActionTaskReference) {
    this.customerBehaviorAnalysisRequestActionTaskReference = customerBehaviorAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerBehaviorAnalysisRequestActionTaskRecord
  **/

  public Object getCustomerBehaviorAnalysisRequestActionTaskRecord() {
    return customerBehaviorAnalysisRequestActionTaskRecord;
  }

  public void setCustomerBehaviorAnalysisRequestActionTaskRecord(Object customerBehaviorAnalysisRequestActionTaskRecord) {
    this.customerBehaviorAnalysisRequestActionTaskRecord = customerBehaviorAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

