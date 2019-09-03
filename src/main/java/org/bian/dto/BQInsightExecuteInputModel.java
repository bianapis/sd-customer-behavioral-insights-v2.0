package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInsightExecuteInputModelInsightInstanceRecord;
import org.bian.dto.CRCustomerBehaviorAnalysisExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQInsightExecuteInputModel
 */
public class BQInsightExecuteInputModel   {
  private String customerBehaviorAnalysisInstanceReference = null;

  private String insightInstanceReference = null;

  private BQInsightExecuteInputModelInsightInstanceRecord insightInstanceRecord = null;

  private Object insightExecuteActionTaskRecord = null;

  private CRCustomerBehaviorAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Insight instance 
   * @return insightInstanceReference
  **/

  public String getInsightInstanceReference() {
    return insightInstanceReference;
  }

  public void setInsightInstanceReference(String insightInstanceReference) {
    this.insightInstanceReference = insightInstanceReference;
  }


  /**
   * Get insightInstanceRecord
   * @return insightInstanceRecord
  **/

  public BQInsightExecuteInputModelInsightInstanceRecord getInsightInstanceRecord() {
    return insightInstanceRecord;
  }

  public void setInsightInstanceRecord(BQInsightExecuteInputModelInsightInstanceRecord insightInstanceRecord) {
    this.insightInstanceRecord = insightInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return insightExecuteActionTaskRecord
  **/

  public Object getInsightExecuteActionTaskRecord() {
    return insightExecuteActionTaskRecord;
  }

  public void setInsightExecuteActionTaskRecord(Object insightExecuteActionTaskRecord) {
    this.insightExecuteActionTaskRecord = insightExecuteActionTaskRecord;
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

