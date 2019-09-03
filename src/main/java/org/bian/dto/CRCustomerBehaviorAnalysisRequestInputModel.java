package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisRequestInputModelCustomerBehaviorAnalysisInstanceRecord;
import org.bian.dto.CRCustomerBehaviorAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisRequestInputModel
 */
public class CRCustomerBehaviorAnalysisRequestInputModel   {
  private String customerBehavioralInsightsServicingSessionReference = null;

  private String customerBehaviorAnalysisInstanceReference = null;

  private CRCustomerBehaviorAnalysisRequestInputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord = null;

  private Object customerBehaviorAnalysisRequestActionTaskRecord = null;

  private CRCustomerBehaviorAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerBehaviorAnalysisRequestInputModelCustomerBehaviorAnalysisInstanceRecord getCustomerBehaviorAnalysisInstanceRecord() {
    return customerBehaviorAnalysisInstanceRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceRecord(CRCustomerBehaviorAnalysisRequestInputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord) {
    this.customerBehaviorAnalysisInstanceRecord = customerBehaviorAnalysisInstanceRecord;
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

