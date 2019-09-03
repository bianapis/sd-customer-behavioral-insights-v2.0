package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInsightExecuteInputModelInsightInstanceRecordInsightEvaluationTask
 */
public class BQInsightExecuteInputModelInsightInstanceRecordInsightEvaluationTask   {
  private String insightEvaluationRequestSpecification = null;

  private String insightEvaluationCustomerBehaviorModelReference = null;

  private Object insightEvaluationProductServiceActivityReport = null;

  private Object insightEvaluationCustomerEventLogReport = null;

  private Object insightEvaluationServicingEventLogReport = null;

  private Object insightEvaluationChannelEventLogReport = null;

  private Object insightEvaluationMarketResearchReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific details of the analysis (can be a default/standard and scheduled refresh) 
   * @return insightEvaluationRequestSpecification
  **/

  public String getInsightEvaluationRequestSpecification() {
    return insightEvaluationRequestSpecification;
  }

  public void setInsightEvaluationRequestSpecification(String insightEvaluationRequestSpecification) {
    this.insightEvaluationRequestSpecification = insightEvaluationRequestSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the behavior model used to develop the insight 
   * @return insightEvaluationCustomerBehaviorModelReference
  **/

  public String getInsightEvaluationCustomerBehaviorModelReference() {
    return insightEvaluationCustomerBehaviorModelReference;
  }

  public void setInsightEvaluationCustomerBehaviorModelReference(String insightEvaluationCustomerBehaviorModelReference) {
    this.insightEvaluationCustomerBehaviorModelReference = insightEvaluationCustomerBehaviorModelReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The data file, report of production activity used in the analysis 
   * @return insightEvaluationProductServiceActivityReport
  **/

  public Object getInsightEvaluationProductServiceActivityReport() {
    return insightEvaluationProductServiceActivityReport;
  }

  public void setInsightEvaluationProductServiceActivityReport(Object insightEvaluationProductServiceActivityReport) {
    this.insightEvaluationProductServiceActivityReport = insightEvaluationProductServiceActivityReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Record containing the selected event records from the log 
   * @return insightEvaluationCustomerEventLogReport
  **/

  public Object getInsightEvaluationCustomerEventLogReport() {
    return insightEvaluationCustomerEventLogReport;
  }

  public void setInsightEvaluationCustomerEventLogReport(Object insightEvaluationCustomerEventLogReport) {
    this.insightEvaluationCustomerEventLogReport = insightEvaluationCustomerEventLogReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Record containing the selected event records from the log 
   * @return insightEvaluationServicingEventLogReport
  **/

  public Object getInsightEvaluationServicingEventLogReport() {
    return insightEvaluationServicingEventLogReport;
  }

  public void setInsightEvaluationServicingEventLogReport(Object insightEvaluationServicingEventLogReport) {
    this.insightEvaluationServicingEventLogReport = insightEvaluationServicingEventLogReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Record containing the selected event records from the log 
   * @return insightEvaluationChannelEventLogReport
  **/

  public Object getInsightEvaluationChannelEventLogReport() {
    return insightEvaluationChannelEventLogReport;
  }

  public void setInsightEvaluationChannelEventLogReport(Object insightEvaluationChannelEventLogReport) {
    this.insightEvaluationChannelEventLogReport = insightEvaluationChannelEventLogReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of a specific market research report or database in any suitable form 
   * @return insightEvaluationMarketResearchReport
  **/

  public Object getInsightEvaluationMarketResearchReport() {
    return insightEvaluationMarketResearchReport;
  }

  public void setInsightEvaluationMarketResearchReport(Object insightEvaluationMarketResearchReport) {
    this.insightEvaluationMarketResearchReport = insightEvaluationMarketResearchReport;
  }


}

