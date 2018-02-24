package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.CourseSearchAction;
import org.dselent.course_load_scheduler.client.callback.CourseSearchCallback;
import org.dselent.course_load_scheduler.client.event.CourseSearchEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.CourseService;
import org.dselent.course_load_scheduler.client.translator.impl.CourseSearchTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

public class CourseServiceImpl extends BaseServiceImpl implements CourseService{
	
	public CourseServiceImpl()
	{
		
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(CourseSearchEvent.TYPE, this);
		eventBusRegistration.put(CourseSearchEvent.TYPE, registration);
	}

	@Override
	public void onCourseSearch(CourseSearchEvent evt) {
		CourseSearchAction action = evt.getAction();
		CourseSearchTranslatorImpl courseSearchTranslator = new CourseSearchTranslatorImpl();
		JSONObject json = courseSearchTranslator.translateToJson(action);
		CourseSearchCallback courseSearchCallback = new CourseSearchCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, courseSearchCallback, json);
		request.send();
	}

}
