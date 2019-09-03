package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInsightExecuteOutputModelInsightInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInsightExecuteOutputModel
 */
public class BQInsightExecuteOutputModel   {
  private BQInsightExecuteOutputModelInsightInstanceRecord insightInstanceRecord = null;

  private String insightExecuteActionTaskReference = null;

  private Object insightExecuteActionTaskRecord = null;

  private String insightExecuteRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Insight instance execute service call 
   * @return insightExecuteActionTaskReference
  **/

  public String getInsightExecuteActionTaskReference() {
    return insightExecuteActionTaskReference;
  }

  public void setInsightExecuteActionTaskReference(String insightExecuteActionTaskReference) {
    this.insightExecuteActionTaskReference = insightExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return insightExecuteActionTaskRecord
  **/

  public Object getInsightExecuteActionTaskRecord() {
    return insightExecuteActionTaskRecord;
  }

  public void setInsightExecuteActionTaskRecord(Object insightExecuteActionTaskRecord) {
    this.insightExecuteActionTaskRecord = insightExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Insight execute transaction/record 
   * @return insightExecuteRecordReference
  **/

  public String getInsightExecuteRecordReference() {
    return insightExecuteRecordReference;
  }

  public void setInsightExecuteRecordReference(String insightExecuteRecordReference) {
    this.insightExecuteRecordReference = insightExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

