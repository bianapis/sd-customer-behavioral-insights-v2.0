package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInsightRetrieveInputModelInsightInstanceAnalysis
 */
public class BQInsightRetrieveInputModelInsightInstanceAnalysis   {
  private String insightInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return insightInstanceAnalysisReference
  **/

  public String getInsightInstanceAnalysisReference() {
    return insightInstanceAnalysisReference;
  }

  public void setInsightInstanceAnalysisReference(String insightInstanceAnalysisReference) {
    this.insightInstanceAnalysisReference = insightInstanceAnalysisReference;
  }


}

