package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInsightRetrieveInputModelInsightInstanceReport
 */
public class BQInsightRetrieveInputModelInsightInstanceReport   {
  private String insightInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return insightInstanceReportReference
  **/

  public String getInsightInstanceReportReference() {
    return insightInstanceReportReference;
  }

  public void setInsightInstanceReportReference(String insightInstanceReportReference) {
    this.insightInstanceReportReference = insightInstanceReportReference;
  }


}

