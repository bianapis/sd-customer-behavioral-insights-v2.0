package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInsightRetrieveOutputModelInsightInstanceReport
 */
public class BQInsightRetrieveOutputModelInsightInstanceReport   {
  private Object insightInstanceReportRecord = null;

  private String insightInstanceReportType = null;

  private String insightInstanceReportParameters = null;

  private Object insightInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return insightInstanceReportRecord
  **/

  public Object getInsightInstanceReportRecord() {
    return insightInstanceReportRecord;
  }

  public void setInsightInstanceReportRecord(Object insightInstanceReportRecord) {
    this.insightInstanceReportRecord = insightInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return insightInstanceReportType
  **/

  public String getInsightInstanceReportType() {
    return insightInstanceReportType;
  }

  public void setInsightInstanceReportType(String insightInstanceReportType) {
    this.insightInstanceReportType = insightInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return insightInstanceReportParameters
  **/

  public String getInsightInstanceReportParameters() {
    return insightInstanceReportParameters;
  }

  public void setInsightInstanceReportParameters(String insightInstanceReportParameters) {
    this.insightInstanceReportParameters = insightInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return insightInstanceReport
  **/

  public Object getInsightInstanceReport() {
    return insightInstanceReport;
  }

  public void setInsightInstanceReport(Object insightInstanceReport) {
    this.insightInstanceReport = insightInstanceReport;
  }


}

