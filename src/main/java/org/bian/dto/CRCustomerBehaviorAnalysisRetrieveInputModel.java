package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceAnalysis;
import org.bian.dto.CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisRetrieveInputModel
 */
public class CRCustomerBehaviorAnalysisRetrieveInputModel   {
  private Object customerBehaviorAnalysisRetrieveActionTaskRecord = null;

  private String customerBehaviorAnalysisRetrieveActionRequest = null;

  private CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceReportRecord customerBehaviorAnalysisInstanceReportRecord = null;

  private CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceAnalysis customerBehaviorAnalysisInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerBehaviorAnalysisRetrieveActionRequest
  **/

  public String getCustomerBehaviorAnalysisRetrieveActionRequest() {
    return customerBehaviorAnalysisRetrieveActionRequest;
  }

  public void setCustomerBehaviorAnalysisRetrieveActionRequest(String customerBehaviorAnalysisRetrieveActionRequest) {
    this.customerBehaviorAnalysisRetrieveActionRequest = customerBehaviorAnalysisRetrieveActionRequest;
  }


  /**
   * Get customerBehaviorAnalysisInstanceReportRecord
   * @return customerBehaviorAnalysisInstanceReportRecord
  **/

  public CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceReportRecord getCustomerBehaviorAnalysisInstanceReportRecord() {
    return customerBehaviorAnalysisInstanceReportRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceReportRecord(CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceReportRecord customerBehaviorAnalysisInstanceReportRecord) {
    this.customerBehaviorAnalysisInstanceReportRecord = customerBehaviorAnalysisInstanceReportRecord;
  }


  /**
   * Get customerBehaviorAnalysisInstanceAnalysis
   * @return customerBehaviorAnalysisInstanceAnalysis
  **/

  public CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceAnalysis getCustomerBehaviorAnalysisInstanceAnalysis() {
    return customerBehaviorAnalysisInstanceAnalysis;
  }

  public void setCustomerBehaviorAnalysisInstanceAnalysis(CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceAnalysis customerBehaviorAnalysisInstanceAnalysis) {
    this.customerBehaviorAnalysisInstanceAnalysis = customerBehaviorAnalysisInstanceAnalysis;
  }


}

