package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisExecuteInputModelCustomerBehaviorAnalysisInstanceRecord;
import org.bian.dto.CRCustomerBehaviorAnalysisExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisExecuteInputModel
 */
public class CRCustomerBehaviorAnalysisExecuteInputModel   {
  private String customerBehavioralInsightsServicingSessionReference = null;

  private String customerBehaviorAnalysisInstanceReference = null;

  private CRCustomerBehaviorAnalysisExecuteInputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord = null;

  private Object customerBehaviorAnalysisExecuteActionTaskRecord = null;

  private CRCustomerBehaviorAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get customerBehaviorAnalysisInstanceRecord
   * @return customerBehaviorAnalysisInstanceRecord
  **/

  public CRCustomerBehaviorAnalysisExecuteInputModelCustomerBehaviorAnalysisInstanceRecord getCustomerBehaviorAnalysisInstanceRecord() {
    return customerBehaviorAnalysisInstanceRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceRecord(CRCustomerBehaviorAnalysisExecuteInputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord) {
    this.customerBehaviorAnalysisInstanceRecord = customerBehaviorAnalysisInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerBehaviorAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerBehaviorAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

