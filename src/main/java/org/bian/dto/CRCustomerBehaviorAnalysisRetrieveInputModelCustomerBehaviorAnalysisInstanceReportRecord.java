package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceReportRecord
 */
public class CRCustomerBehaviorAnalysisRetrieveInputModelCustomerBehaviorAnalysisInstanceReportRecord   {
  private String customerBehaviorAnalysisInstanceReportReference = null;

  private String customerBehaviorAnalysisInstanceReportType = null;

  private String customerBehaviorAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerBehaviorAnalysisInstanceReportReference
  **/

  public String getCustomerBehaviorAnalysisInstanceReportReference() {
    return customerBehaviorAnalysisInstanceReportReference;
  }

  public void setCustomerBehaviorAnalysisInstanceReportReference(String customerBehaviorAnalysisInstanceReportReference) {
    this.customerBehaviorAnalysisInstanceReportReference = customerBehaviorAnalysisInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerBehaviorAnalysisInstanceReportParameters
  **/

  public String getCustomerBehaviorAnalysisInstanceReportParameters() {
    return customerBehaviorAnalysisInstanceReportParameters;
  }

  public void setCustomerBehaviorAnalysisInstanceReportParameters(String customerBehaviorAnalysisInstanceReportParameters) {
    this.customerBehaviorAnalysisInstanceReportParameters = customerBehaviorAnalysisInstanceReportParameters;
  }


}

