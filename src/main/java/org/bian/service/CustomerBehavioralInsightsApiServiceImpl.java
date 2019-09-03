/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerBehavioralInsightsApiServiceImpl implements CustomerBehavioralInsightsApiService {

	public SDCustomerBehavioralInsightsActivateOutputModel activate(SDCustomerBehavioralInsightsActivateInputModel request){
		return JsonReader.read("activate-SDCustomerBehavioralInsightsActivateOutputModel.json",new TypeReference<SDCustomerBehavioralInsightsActivateOutputModel>(){});
	}
	
	public SDCustomerBehavioralInsightsConfigureOutputModel configure(String sdReferenceId, SDCustomerBehavioralInsightsConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerBehavioralInsightsConfigureOutputModel.json",new TypeReference<SDCustomerBehavioralInsightsConfigureOutputModel>(){});
	}
	
	public CRCustomerBehaviorAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerBehaviorAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRCustomerBehaviorAnalysisEvaluateOutputModel.json",new TypeReference<CRCustomerBehaviorAnalysisEvaluateOutputModel>(){});
	}
	
	public BQInsightExchangeOutputModel exchangeInsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInsightExchangeInputModel request){
		return JsonReader.read("exchange-BQInsightExchangeOutputModel.json",new TypeReference<BQInsightExchangeOutputModel>(){});
	}
	
	public CRCustomerBehaviorAnalysisExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerBehaviorAnalysisExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerBehaviorAnalysisExchangeOutputModel.json",new TypeReference<CRCustomerBehaviorAnalysisExchangeOutputModel>(){});
	}
	
	public BQInsightExecuteOutputModel executeInsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInsightExecuteInputModel request){
		return JsonReader.read("execute-BQInsightExecuteOutputModel.json",new TypeReference<BQInsightExecuteOutputModel>(){});
	}
	
	public CRCustomerBehaviorAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerBehaviorAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerBehaviorAnalysisExecuteOutputModel.json",new TypeReference<CRCustomerBehaviorAnalysisExecuteOutputModel>(){});
	}
	
	public SDCustomerBehavioralInsightsFeedbackOutputModel feedback(String sdReferenceId, SDCustomerBehavioralInsightsFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerBehavioralInsightsFeedbackOutputModel.json",new TypeReference<SDCustomerBehavioralInsightsFeedbackOutputModel>(){});
	}
	
	public BQInsightRequestOutputModel requestInsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInsightRequestInputModel request){
		return JsonReader.read("request-BQInsightRequestOutputModel.json",new TypeReference<BQInsightRequestOutputModel>(){});
	}
	
	public CRCustomerBehaviorAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerBehaviorAnalysisRequestInputModel request){
		return JsonReader.read("request-CRCustomerBehaviorAnalysisRequestOutputModel.json",new TypeReference<CRCustomerBehaviorAnalysisRequestOutputModel>(){});
	}
	
	public BQInsightRetrieveOutputModel retrieveInsight(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInsightRetrieveOutputModel.json",new TypeReference<BQInsightRetrieveOutputModel>(){});
	}
	
	public CRCustomerBehaviorAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerBehaviorAnalysisRetrieveOutputModel.json",new TypeReference<CRCustomerBehaviorAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerBehavioralInsightsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerBehavioralInsightsRetrieveOutputModel.json",new TypeReference<SDCustomerBehavioralInsightsRetrieveOutputModel>(){});
	}
	
}
