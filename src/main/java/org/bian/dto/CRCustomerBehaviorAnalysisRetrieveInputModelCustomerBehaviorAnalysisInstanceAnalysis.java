package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceAnalysis
 */
public class CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceAnalysis   {
  private String customerBehaviorAnalysisInstanceAnalysisReference = null;

  private String customerBehaviorAnalysisInstanceAnalysisReportType = null;

  private String customerBehaviorAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerBehaviorAnalysisInstanceAnalysisReference
  **/

  public String getCustomerBehaviorAnalysisInstanceAnalysisReference() {
    return customerBehaviorAnalysisInstanceAnalysisReference;
  }

  public void setCustomerBehaviorAnalysisInstanceAnalysisReference(String customerBehaviorAnalysisInstanceAnalysisReference) {
    this.customerBehaviorAnalysisInstanceAnalysisReference = customerBehaviorAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerBehaviorAnalysisInstanceAnalysisParameters
  **/

  public String getCustomerBehaviorAnalysisInstanceAnalysisParameters() {
    return customerBehaviorAnalysisInstanceAnalysisParameters;
  }

  public void setCustomerBehaviorAnalysisInstanceAnalysisParameters(String customerBehaviorAnalysisInstanceAnalysisParameters) {
    this.customerBehaviorAnalysisInstanceAnalysisParameters = customerBehaviorAnalysisInstanceAnalysisParameters;
  }


}

