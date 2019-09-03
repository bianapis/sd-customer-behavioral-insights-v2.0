package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInsightRetrieveInputModelInsightInstanceAnalysis;
import org.bian.dto.BQInsightRetrieveInputModelInsightInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInsightRetrieveInputModel
 */
public class BQInsightRetrieveInputModel   {
  private Object insightRetrieveActionTaskRecord = null;

  private String insightRetrieveActionRequest = null;

  private BQInsightRetrieveInputModelInsightInstanceReport insightInstanceReport = null;

  private BQInsightRetrieveInputModelInsightInstanceAnalysis insightInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return insightRetrieveActionTaskRecord
  **/

  public Object getInsightRetrieveActionTaskRecord() {
    return insightRetrieveActionTaskRecord;
  }

  public void setInsightRetrieveActionTaskRecord(Object insightRetrieveActionTaskRecord) {
    this.insightRetrieveActionTaskRecord = insightRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return insightRetrieveActionRequest
  **/

  public String getInsightRetrieveActionRequest() {
    return insightRetrieveActionRequest;
  }

  public void setInsightRetrieveActionRequest(String insightRetrieveActionRequest) {
    this.insightRetrieveActionRequest = insightRetrieveActionRequest;
  }


  /**
   * Get insightInstanceReport
   * @return insightInstanceReport
  **/

  public BQInsightRetrieveInputModelInsightInstanceReport getInsightInstanceReport() {
    return insightInstanceReport;
  }

  public void setInsightInstanceReport(BQInsightRetrieveInputModelInsightInstanceReport insightInstanceReport) {
    this.insightInstanceReport = insightInstanceReport;
  }


  /**
   * Get insightInstanceAnalysis
   * @return insightInstanceAnalysis
  **/

  public BQInsightRetrieveInputModelInsightInstanceAnalysis getInsightInstanceAnalysis() {
    return insightInstanceAnalysis;
  }

  public void setInsightInstanceAnalysis(BQInsightRetrieveInputModelInsightInstanceAnalysis insightInstanceAnalysis) {
    this.insightInstanceAnalysis = insightInstanceAnalysis;
  }


}

