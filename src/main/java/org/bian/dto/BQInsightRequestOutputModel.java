package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInsightExecuteOutputModelInsightInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInsightRequestOutputModel
 */
public class BQInsightRequestOutputModel   {
  private BQInsightExecuteOutputModelInsightInstanceRecord insightInstanceRecord = null;

  private String insightRequestActionTaskReference = null;

  private Object insightRequestActionTaskRecord = null;

  private String insightRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get insightInstanceRecord
   * @return insightInstanceRecord
  **/

  public BQInsightExecuteOutputModelInsightInstanceRecord getInsightInstanceRecord() {
    return insightInstanceRecord;
  }

  public void setInsightInstanceRecord(BQInsightExecuteOutputModelInsightInstanceRecord insightInstanceRecord) {
    this.insightInstanceRecord = insightInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Insight instance request service call 
   * @return insightRequestActionTaskReference
  **/

  public String getInsightRequestActionTaskReference() {
    return insightRequestActionTaskReference;
  }

  public void setInsightRequestActionTaskReference(String insightRequestActionTaskReference) {
    this.insightRequestActionTaskReference = insightRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return insightRequestActionTaskRecord
  **/

  public Object getInsightRequestActionTaskRecord() {
    return insightRequestActionTaskRecord;
  }

  public void setInsightRequestActionTaskRecord(Object insightRequestActionTaskRecord) {
    this.insightRequestActionTaskRecord = insightRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Insight service request record 
   * @return insightRequestRecordReference
  **/

  public String getInsightRequestRecordReference() {
    return insightRequestRecordReference;
  }

  public void setInsightRequestRecordReference(String insightRequestRecordReference) {
    this.insightRequestRecordReference = insightRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

