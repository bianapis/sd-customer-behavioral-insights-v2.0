package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInsightRetrieveOutputModelInsightInstanceAnalysis
 */
public class BQInsightRetrieveOutputModelInsightInstanceAnalysis   {
  private Object insightInstanceAnalysisRecord = null;

  private String insightInstanceAnalysisReportType = null;

  private String insightInstanceAnalysisParameters = null;

  private Object insightInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return insightInstanceAnalysisRecord
  **/

  public Object getInsightInstanceAnalysisRecord() {
    return insightInstanceAnalysisRecord;
  }

  public void setInsightInstanceAnalysisRecord(Object insightInstanceAnalysisRecord) {
    this.insightInstanceAnalysisRecord = insightInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return insightInstanceAnalysisReportType
  **/

  public String getInsightInstanceAnalysisReportType() {
    return insightInstanceAnalysisReportType;
  }

  public void setInsightInstanceAnalysisReportType(String insightInstanceAnalysisReportType) {
    this.insightInstanceAnalysisReportType = insightInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return insightInstanceAnalysisParameters
  **/

  public String getInsightInstanceAnalysisParameters() {
    return insightInstanceAnalysisParameters;
  }

  public void setInsightInstanceAnalysisParameters(String insightInstanceAnalysisParameters) {
    this.insightInstanceAnalysisParameters = insightInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return insightInstanceAnalysisReport
  **/

  public Object getInsightInstanceAnalysisReport() {
    return insightInstanceAnalysisReport;
  }

  public void setInsightInstanceAnalysisReport(Object insightInstanceAnalysisReport) {
    this.insightInstanceAnalysisReport = insightInstanceAnalysisReport;
  }


}

