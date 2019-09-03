package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecordCustomerBehaviorAnalysisInsightsRecord
 */
public class CRCustomerBehaviorAnalysisEvaluateOutputModelCustomerBehaviorAnalysisInstanceRecordCustomerBehaviorAnalysisInsightsRecord   {
  private String customerInsightType = null;

  private String customerInsight = null;

  private String customerInsightCalculationDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines a type of maintained customer insight (e.g. retention candidate, cross-sell candidate) 
   * @return customerInsightType
  **/

  public String getCustomerInsightType() {
    return customerInsightType;
  }

  public void setCustomerInsightType(String customerInsightType) {
    this.customerInsightType = customerInsightType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The derived value of the specific insight for the customer and past values if appropriate 
   * @return customerInsight
  **/

  public String getCustomerInsight() {
    return customerInsight;
  }

  public void setCustomerInsight(String customerInsight) {
    this.customerInsight = customerInsight;
  }


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

