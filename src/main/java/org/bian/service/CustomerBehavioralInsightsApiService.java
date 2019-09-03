/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerBehavioralInsightsApiService {

	SDCustomerBehavioralInsightsActivateOutputModel activate(SDCustomerBehavioralInsightsActivateInputModel request);
	
	SDCustomerBehavioralInsightsConfigureOutputModel configure(String sdReferenceId, SDCustomerBehavioralInsightsConfigureInputModel request);
	
	CRCustomerBehaviorAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerBehaviorAnalysisEvaluateInputModel request);
	
	BQInsightExchangeOutputModel exchangeInsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInsightExchangeInputModel request);
	
	CRCustomerBehaviorAnalysisExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerBehaviorAnalysisExchangeInputModel request);
	
	BQInsightExecuteOutputModel executeInsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInsightExecuteInputModel request);
	
	CRCustomerBehaviorAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerBehaviorAnalysisExecuteInputModel request);
	
	SDCustomerBehavioralInsightsFeedbackOutputModel feedback(String sdReferenceId, SDCustomerBehavioralInsightsFeedbackInputModel request);
	
	BQInsightRequestOutputModel requestInsight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInsightRequestInputModel request);
	
	CRCustomerBehaviorAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerBehaviorAnalysisRequestInputModel request);
	
	BQInsightRetrieveOutputModel retrieveInsight(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCustomerBehaviorAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerBehavioralInsightsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
}
