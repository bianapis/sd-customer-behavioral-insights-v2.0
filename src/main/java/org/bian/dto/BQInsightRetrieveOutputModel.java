package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInsightRetrieveOutputModelCustomerBehaviorAnalysisInstanceRecord;
import org.bian.dto.BQInsightRetrieveOutputModelInsightInstanceAnalysis;
import org.bian.dto.BQInsightRetrieveOutputModelInsightInstanceRecord;
import org.bian.dto.BQInsightRetrieveOutputModelInsightInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInsightRetrieveOutputModel
 */
public class BQInsightRetrieveOutputModel   {
  private BQInsightRetrieveOutputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord = null;

  private BQInsightRetrieveOutputModelInsightInstanceRecord insightInstanceRecord = null;

  private String insightRetrieveActionTaskReference = null;

  private Object insightRetrieveActionTaskRecord = null;

  private String insightRetrieveActionResponse = null;

  private BQInsightRetrieveOutputModelInsightInstanceReport insightInstanceReport = null;

  private BQInsightRetrieveOutputModelInsightInstanceAnalysis insightInstanceAnalysis = null;


  /**
   * Get customerBehaviorAnalysisInstanceRecord
   * @return customerBehaviorAnalysisInstanceRecord
  **/

  public BQInsightRetrieveOutputModelCustomerBehaviorAnalysisInstanceRecord getCustomerBehaviorAnalysisInstanceRecord() {
    return customerBehaviorAnalysisInstanceRecord;
  }

  public void setCustomerBehaviorAnalysisInstanceRecord(BQInsightRetrieveOutputModelCustomerBehaviorAnalysisInstanceRecord customerBehaviorAnalysisInstanceRecord) {
    this.customerBehaviorAnalysisInstanceRecord = customerBehaviorAnalysisInstanceRecord;
  }


  /**
   * Get insightInstanceRecord
   * @return insightInstanceRecord
  **/

  public BQInsightRetrieveOutputModelInsightInstanceRecord getInsightInstanceRecord() {
    return insightInstanceRecord;
  }

  public void setInsightInstanceRecord(BQInsightRetrieveOutputModelInsightInstanceRecord insightInstanceRecord) {
    this.insightInstanceRecord = insightInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Insight instance retrieve service call 
   * @return insightRetrieveActionTaskReference
  **/

  public String getInsightRetrieveActionTaskReference() {
    return insightRetrieveActionTaskReference;
  }

  public void setInsightRetrieveActionTaskReference(String insightRetrieveActionTaskReference) {
    this.insightRetrieveActionTaskReference = insightRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return insightRetrieveActionResponse
  **/

  public String getInsightRetrieveActionResponse() {
    return insightRetrieveActionResponse;
  }

  public void setInsightRetrieveActionResponse(String insightRetrieveActionResponse) {
    this.insightRetrieveActionResponse = insightRetrieveActionResponse;
  }


  /**
   * Get insightInstanceReport
   * @return insightInstanceReport
  **/

  public BQInsightRetrieveOutputModelInsightInstanceReport getInsightInstanceReport() {
    return insightInstanceReport;
  }

  public void setInsightInstanceReport(BQInsightRetrieveOutputModelInsightInstanceReport insightInstanceReport) {
    this.insightInstanceReport = insightInstanceReport;
  }


  /**
   * Get insightInstanceAnalysis
   * @return insightInstanceAnalysis
  **/

  public BQInsightRetrieveOutputModelInsightInstanceAnalysis getInsightInstanceAnalysis() {
    return insightInstanceAnalysis;
  }

  public void setInsightInstanceAnalysis(BQInsightRetrieveOutputModelInsightInstanceAnalysis insightInstanceAnalysis) {
    this.insightInstanceAnalysis = insightInstanceAnalysis;
  }


}

