package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceAnalysis
 */
public class CRCustomerBehaviorAnalysisRetrieveOutputModelCustomerBehaviorAnalysisInstanceAnalysis   {
  private String customerBehaviorAnalysisInstanceAnalysisData = null;

  private String customerBehaviorAnalysisInstanceAnalysisReportType = null;

  private Object customerBehaviorAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerBehaviorAnalysisInstanceAnalysisData
  **/

  public String getCustomerBehaviorAnalysisInstanceAnalysisData() {
    return customerBehaviorAnalysisInstanceAnalysisData;
  }

  public void setCustomerBehaviorAnalysisInstanceAnalysisData(String customerBehaviorAnalysisInstanceAnalysisData) {
    this.customerBehaviorAnalysisInstanceAnalysisData = customerBehaviorAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerBehaviorAnalysisInstanceAnalysisReportType
  **/

  public String getCustomerBehaviorAnalysisInstanceAnalysisReportType() {
    return customerBehaviorAnalysisInstanceAnalysisReportType;
  }

  public void setCustomerBehaviorAnalysisInstanceAnalysisReportType(String customerBehaviorAnalysisInstanceAnalysisReportType) {
    this.customerBehaviorAnalysisInstanceAnalysisReportType = customerBehaviorAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerBehaviorAnalysisInstanceAnalysisReport
  **/

  public Object getCustomerBehaviorAnalysisInstanceAnalysisReport() {
    return customerBehaviorAnalysisInstanceAnalysisReport;
  }

  public void setCustomerBehaviorAnalysisInstanceAnalysisReport(Object customerBehaviorAnalysisInstanceAnalysisReport) {
    this.customerBehaviorAnalysisInstanceAnalysisReport = customerBehaviorAnalysisInstanceAnalysisReport;
  }


}

