package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInsightRequestInputModelInsightInstanceRecord;
import org.bian.dto.CRCustomerBehaviorAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQInsightRequestInputModel
 */
public class BQInsightRequestInputModel   {
  private String customerBehaviorAnalysisInstanceReference = null;

  private String insightInstanceReference = null;

  private BQInsightRequestInputModelInsightInstanceRecord insightInstanceRecord = null;

  private Object insightRequestActionTaskRecord = null;

  private CRCustomerBehaviorAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQInsightRequestInputModelInsightInstanceRecord getInsightInstanceRecord() {
    return insightInstanceRecord;
  }

  public void setInsightInstanceRecord(BQInsightRequestInputModelInsightInstanceRecord insightInstanceRecord) {
    this.insightInstanceRecord = insightInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return insightRequestActionTaskRecord
  **/

  public Object getInsightRequestActionTaskRecord() {
    return insightRequestActionTaskRecord;
  }

  public void setInsightRequestActionTaskRecord(Object insightRequestActionTaskRecord) {
    this.insightRequestActionTaskRecord = insightRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerBehaviorAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerBehaviorAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

