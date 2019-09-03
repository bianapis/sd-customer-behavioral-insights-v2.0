package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceReportRecord
 */
public class CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceReportRecord   {
  private String customerBehaviorAnalysisInstanceReportData = null;

  private String customerBehaviorAnalysisInstanceReportType = null;

  private Object customerBehaviorAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerBehaviorAnalysisInstanceReportData
  **/

  public String getCustomerBehaviorAnalysisInstanceReportData() {
    return customerBehaviorAnalysisInstanceReportData;
  }

  public void setCustomerBehaviorAnalysisInstanceReportData(String customerBehaviorAnalysisInstanceReportData) {
    this.customerBehaviorAnalysisInstanceReportData = customerBehaviorAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerBehaviorAnalysisInstanceReportType
  **/

  public String getCustomerBehaviorAnalysisInstanceReportType() {
    return customerBehaviorAnalysisInstanceReportType;
  }

  public void setCustomerBehaviorAnalysisInstanceReportType(String customerBehaviorAnalysisInstanceReportType) {
    this.customerBehaviorAnalysisInstanceReportType = customerBehaviorAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerBehaviorAnalysisInstanceReport
  **/

  public Object getCustomerBehaviorAnalysisInstanceReport() {
    return customerBehaviorAnalysisInstanceReport;
  }

  public void setCustomerBehaviorAnalysisInstanceReport(Object customerBehaviorAnalysisInstanceReport) {
    this.customerBehaviorAnalysisInstanceReport = customerBehaviorAnalysisInstanceReport;
  }


}

