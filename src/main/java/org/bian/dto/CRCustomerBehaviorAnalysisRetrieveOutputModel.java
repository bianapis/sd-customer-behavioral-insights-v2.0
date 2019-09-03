package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceAnalysis;
import org.bian.dto.CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceRecord;
import org.bian.dto.CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisRetrieveOutputModel
 */
public class CRCustomerBehaviorAnalysisRetrieveOutputModel   {
  private CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord = null;

  private String customerBehaviorAnalysisRetrieveActionTaskReference = null;

  private Object customerBehaviorAnalysisRetrieveActionTaskRecord = null;

  private String customerBehaviorAnalysisRetrieveActionResponse = null;

  private CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceReportRecord customerBehaviorAnalysisInstanceReportRecord = null;

  private CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceAnalysis customerBehaviorAnalysisInstanceAnalysis = null;


  /**
   * Get customerBehaviorAnalysisInstanceRecord
   * @return customerBehaviorAnalysisInstanceRecord
  **/

  public CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceRecord getCustomerBehaviorAnalysisInstanceRecord() {
    return customerBehaviorAnalysisInstanceRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceRecord(CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord) {
    this.customerBehaviorAnalysisInstanceRecord = customerBehaviorAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Behavior Analysis instance retrieve service call 
   * @return customerBehaviorAnalysisRetrieveActionTaskReference
  **/

  public String getCustomerBehaviorAnalysisRetrieveActionTaskReference() {
    return customerBehaviorAnalysisRetrieveActionTaskReference;
  }

  public void setCustomerBehaviorAnalysisRetrieveActionTaskReference(String customerBehaviorAnalysisRetrieveActionTaskReference) {
    this.customerBehaviorAnalysisRetrieveActionTaskReference = customerBehaviorAnalysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerBehaviorAnalysisRetrieveActionTaskRecord
  **/

  public Object getCustomerBehaviorAnalysisRetrieveActionTaskRecord() {
    return customerBehaviorAnalysisRetrieveActionTaskRecord;
  }

  public void setCustomerBehaviorAnalysisRetrieveActionTaskRecord(Object customerBehaviorAnalysisRetrieveActionTaskRecord) {
    this.customerBehaviorAnalysisRetrieveActionTaskRecord = customerBehaviorAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerBehaviorAnalysisRetrieveActionResponse
  **/

  public String getCustomerBehaviorAnalysisRetrieveActionResponse() {
    return customerBehaviorAnalysisRetrieveActionResponse;
  }

  public void setCustomerBehaviorAnalysisRetrieveActionResponse(String customerBehaviorAnalysisRetrieveActionResponse) {
    this.customerBehaviorAnalysisRetrieveActionResponse = customerBehaviorAnalysisRetrieveActionResponse;
  }


  /**
   * Get customerBehaviorAnalysisInstanceReportRecord
   * @return customerBehaviorAnalysisInstanceReportRecord
  **/

  public CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceReportRecord getCustomerBehaviorAnalysisInstanceReportRecord() {
    return customerBehaviorAnalysisInstanceReportRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceReportRecord(CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceReportRecord customerBehaviorAnalysisInstanceReportRecord) {
    this.customerBehaviorAnalysisInstanceReportRecord = customerBehaviorAnalysisInstanceReportRecord;
  }


  /**
   * Get customerBehaviorAnalysisInstanceAnalysis
   * @return customerBehaviorAnalysisInstanceAnalysis
  **/

  public CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceAnalysis getCustomerBehaviorAnalysisInstanceAnalysis() {
    return customerBehaviorAnalysisInstanceAnalysis;
  }

  public void setCustomerBehaviorAnalysisInstanceAnalysis(CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceAnalysis customerBehaviorAnalysisInstanceAnalysis) {
    this.customerBehaviorAnalysisInstanceAnalysis = customerBehaviorAnalysisInstanceAnalysis;
  }


}

