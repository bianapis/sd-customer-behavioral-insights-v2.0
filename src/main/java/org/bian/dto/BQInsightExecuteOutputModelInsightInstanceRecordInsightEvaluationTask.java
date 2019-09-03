package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInsightExecuteOutputModelInsightInstanceRecordInsightEvaluationTask
 */
public class BQInsightExecuteOutputModelInsightInstanceRecordInsightEvaluationTask   {
  private String insightEvaluationWorkProducts = null;

  private String insightEvaluationRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return insightEvaluationWorkProducts
  **/

  public String getInsightEvaluationWorkProducts() {
    return insightEvaluationWorkProducts;
  }

  public void setInsightEvaluationWorkProducts(String insightEvaluationWorkProducts) {
    this.insightEvaluationWorkProducts = insightEvaluationWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output from executing the assessment 
   * @return insightEvaluationRequestResult
  **/

  public String getInsightEvaluationRequestResult() {
    return insightEvaluationRequestResult;
  }

  public void setInsightEvaluationRequestResult(String insightEvaluationRequestResult) {
    this.insightEvaluationRequestResult = insightEvaluationRequestResult;
  }


}

