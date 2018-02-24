package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseSearchAction;
import org.dselent.course_load_scheduler.client.action.CourseSearchAction;
import org.dselent.course_load_scheduler.client.model.ViewAccountInformation;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCourseSearchKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.CourseSearchKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class CourseSearchTranslatorImpl implements ActionTranslator<CourseSearchAction, ReceiveCourseSearchAction>{

	@Override
	public JSONObject translateToJson(CourseSearchAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSearchKeys.SUBJECT), action.getSubject());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSearchKeys.TERM), action.getTerm());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(CourseSearchKeys.LEVEL), action.getLevel());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveCourseSearchAction translateToAction(JSONObject json)
	{
		return null;		
		
		/*
		JSONValue jsonObject = json.get("success");
		JSONObject courseObject = jsonObject.isArray().get(0).isObject();
		
		Integer id = JSONHelper.getArrayValue();
		String userName = JSONHelper.getStringValue(courseObject, JSONHelper.convertKeyName(ReceiveCourseSearchKeys.USER_NAME));
		
		ViewAccountInformation user = new ViewAccountInformation();
		user.setReqCourses(reqCourses);
		
		ReceiveCourseSearchAction action = new ReceiveCourseSearchAction(user);	
	
		return action;
		*/
	}
	
}
