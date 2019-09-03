package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInsightExecuteInputModelInsightInstanceRecordInsightEvaluationTask;

import javax.validation.Valid;
  
/**
 * BQInsightExecuteInputModelInsightInstanceRecord
 */
public class BQInsightExecuteInputModelInsightInstanceRecord   {
  private String insightEvaluationCustomerInsightType = null;

  private BQInsightExecuteInputModelInsightInstanceRecordInsightEvaluationTask insightEvaluationTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of customer insight developed in this evaluation (e.g. retention candidate, cross-sell candidate) 
   * @return insightEvaluationCustomerInsightType
  **/

  public String getInsightEvaluationCustomerInsightType() {
    return insightEvaluationCustomerInsightType;
  }

  public void setInsightEvaluationCustomerInsightType(String insightEvaluationCustomerInsightType) {
    this.insightEvaluationCustomerInsightType = insightEvaluationCustomerInsightType;
  }


  /**
   * Get insightEvaluationTask
   * @return insightEvaluationTask
  **/

  public BQInsightExecuteInputModelInsightInstanceRecordInsightEvaluationTask getInsightEvaluationTask() {
    return insightEvaluationTask;
  }

  public void setInsightEvaluationTask(BQInsightExecuteInputModelInsightInstanceRecordInsightEvaluationTask insightEvaluationTask) {
    this.insightEvaluationTask = insightEvaluationTask;
  }


}

