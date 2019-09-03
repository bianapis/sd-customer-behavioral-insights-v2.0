package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisEvaluateInputModelCustomerBehaviorAnalysisInstanceRecordCustomerBehaviorAnalysisInsightsRecord
 */
public class CRCustomerBehaviorAnalysisEvaluateInputModelCustomerBehaviorAnalysisInstanceRecordCustomerBehaviorAnalysisInsightsRecord   {
  private String customerInsightCalculationDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the value was last refreshed, and past value dates if appropriate 
   * @return customerInsightCalculationDate
  **/

  public String getCustomerInsightCalculationDate() {
    return customerInsightCalculationDate;
  }

  public void setCustomerInsightCalculationDate(String customerInsightCalculationDate) {
    this.customerInsightCalculationDate = customerInsightCalculationDate;
  }


}

