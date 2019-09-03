package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInsightExchangeOutputModel
 */
public class BQInsightExchangeOutputModel   {
  private String insightInstanceReference = null;

  private String insightExchangeActionTaskReference = null;

  private Object insightExchangeActionTaskRecord = null;

  private String insightExchangeActionResponse = null;

  private String insightInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Insight instance 
   * @return insightInstanceReference
  **/

  public String getInsightInstanceReference() {
    return insightInstanceReference;
  }

  public void setInsightInstanceReference(String insightInstanceReference) {
    this.insightInstanceReference = insightInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Insight instance exchange service call 
   * @return insightExchangeActionTaskReference
  **/

  public String getInsightExchangeActionTaskReference() {
    return insightExchangeActionTaskReference;
  }

  public void setInsightExchangeActionTaskReference(String insightExchangeActionTaskReference) {
    this.insightExchangeActionTaskReference = insightExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return insightExchangeActionTaskRecord
  **/

  public Object getInsightExchangeActionTaskRecord() {
    return insightExchangeActionTaskRecord;
  }

  public void setInsightExchangeActionTaskRecord(Object insightExchangeActionTaskRecord) {
    this.insightExchangeActionTaskRecord = insightExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return insightExchangeActionResponse
  **/

  public String getInsightExchangeActionResponse() {
    return insightExchangeActionResponse;
  }

  public void setInsightExchangeActionResponse(String insightExchangeActionResponse) {
    this.insightExchangeActionResponse = insightExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Insight instance (e.g. accepted, rejected, verified) 
   * @return insightInstanceStatus
  **/

  public String getInsightInstanceStatus() {
    return insightInstanceStatus;
  }

  public void setInsightInstanceStatus(String insightInstanceStatus) {
    this.insightInstanceStatus = insightInstanceStatus;
  }


}

