package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.GetCourseDetailsAction;
import org.dselent.course_load_scheduler.client.action.ReceiveCourseDetailsAction;
import org.dselent.course_load_scheduler.client.model.DetailedCourseInformation;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveCourseDetailsKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.GetCourseDetailsKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class GetCourseDetailsActionTranslatorImpl implements ActionTranslator<GetCourseDetailsAction, ReceiveCourseDetailsAction>
{
	@Override
	public JSONObject translateToJson(GetCourseDetailsAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(GetCourseDetailsKeys.ID), action.getCourseId());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveCourseDetailsAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish
		
		// sent timestamps as epoch seconds (long)
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		String courseName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.NAME));
		String courseNum = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.NUMBER));
		Integer level = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.LEVEL));
		Integer expectedPop = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.EXPECTED_POP));
		String days = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveCourseDetailsKeys.DAYS));
		
		// TODO look into time conversion more
		// put into JSONHelper?
		
		DetailedCourseInformation course = new DetailedCourseInformation(courseName, courseNum, level, expectedPop, days);
		
		// possibly use builder pattern if it is a lot of data
		ReceiveCourseDetailsAction action = new ReceiveCourseDetailsAction(course);	
	
		return action;
	}


}
