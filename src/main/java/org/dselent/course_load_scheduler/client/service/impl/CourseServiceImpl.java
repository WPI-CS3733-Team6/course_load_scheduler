package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.AddCourseAction;
import org.dselent.course_load_scheduler.client.action.CourseSearchAction;
import org.dselent.course_load_scheduler.client.action.EditCourseAction;
import org.dselent.course_load_scheduler.client.callback.AddCourseCallback;
import org.dselent.course_load_scheduler.client.callback.CourseSearchCallback;
import org.dselent.course_load_scheduler.client.callback.EditCourseCallback;
import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import org.dselent.course_load_scheduler.client.event.CourseSearchEvent;
import org.dselent.course_load_scheduler.client.event.EditCourseEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.CourseService;
import org.dselent.course_load_scheduler.client.translator.impl.AddCourseTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.CourseSearchTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.EditCourseActionTranslatorImpl;

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
	
	public void onEditCourse(EditCourseEvent evt) {
		EditCourseAction action = evt.getAction();
		EditCourseActionTranslatorImpl editCourseTranslator = new EditCourseActionTranslatorImpl();
		JSONObject json = editCourseTranslator.translateToJson(action);
		EditCourseCallback editCourseCallback = new EditCourseCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, editCourseCallback, json);
		request.send();
	}

	public void onAddCourse(AddCourseEvent evt) {
		AddCourseAction action = evt.getAction();
		AddCourseTranslatorImpl addCourseTranslator = new AddCourseTranslatorImpl();
		JSONObject json = addCourseTranslator.translateToJson(action);
		AddCourseCallback addCourseCallback = new AddCourseCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, addCourseCallback, json);
		request.send();
	}
}
