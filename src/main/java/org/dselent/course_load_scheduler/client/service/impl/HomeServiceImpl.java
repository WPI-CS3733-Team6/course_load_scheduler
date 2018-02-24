package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.SendReportAction;
import org.dselent.course_load_scheduler.client.callback.SendReportCallback;
import org.dselent.course_load_scheduler.client.event.SendReportEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.HomeService;
import org.dselent.course_load_scheduler.client.translator.impl.ReportProblemActionTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

public class HomeServiceImpl extends BaseServiceImpl implements HomeService{
	public HomeServiceImpl() {}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(SendReportEvent.TYPE, this);
		eventBusRegistration.put(SendReportEvent.TYPE, registration);
	}
	
	public void onReportProblem(SendReportEvent evt) {
		SendReportAction action = evt.getAction();
		ReportProblemActionTranslatorImpl sendReportActionTranslator = new ReportProblemActionTranslatorImpl();
		JSONObject json = sendReportActionTranslator.translateToJson(action);
		SendReportCallback sendReportCallback = new SendReportCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.REPORT_PROBLEM, sendReportCallback, json);
		request.send();
	}
}
