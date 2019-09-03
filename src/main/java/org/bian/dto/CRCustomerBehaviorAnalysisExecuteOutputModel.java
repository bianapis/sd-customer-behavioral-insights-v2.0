package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisExecuteOutputModel
 */
public class CRCustomerBehaviorAnalysisExecuteOutputModel   {
  private CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord = null;

  private String customerBehaviorAnalysisExecuteActionTaskReference = null;

  private Object customerBehaviorAnalysisExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior Analysis instance execute service call 
   * @return customerBehaviorAnalysisExecuteActionTaskReference
  **/

  public String getCustomerBehaviorAnalysisExecuteActionTaskReference() {
    return customerBehaviorAnalysisExecuteActionTaskReference;
  }

  public void setCustomerBehaviorAnalysisExecuteActionTaskReference(String customerBehaviorAnalysisExecuteActionTaskReference) {
    this.customerBehaviorAnalysisExecuteActionTaskReference = customerBehaviorAnalysisExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerBehaviorAnalysisExecuteActionTaskRecord
  **/

  public Object getCustomerBehaviorAnalysisExecuteActionTaskRecord() {
    return customerBehaviorAnalysisExecuteActionTaskRecord;
  }

  public void setCustomerBehaviorAnalysisExecuteActionTaskRecord(Object customerBehaviorAnalysisExecuteActionTaskRecord) {
    this.customerBehaviorAnalysisExecuteActionTaskRecord = customerBehaviorAnalysisExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

