package org.dselent.course_load_scheduler.client.callback;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.InvalidCourseAction;
import org.dselent.course_load_scheduler.client.action.ReceiveCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event.InvalidCourseEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveCurrentCoursesEvent;
import org.dselent.course_load_scheduler.client.translator.impl.CurrentCoursesActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class CurrentCoursesCallback extends DisplayCallback<JSONValue> {

	public CurrentCoursesCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		CurrentCoursesActionTranslatorImpl CurrentCoursesTranslator = new CurrentCoursesActionTranslatorImpl();
		ReceiveCurrentCoursesAction action = CurrentCoursesTranslator.translateToAction(json);
		
		ReceiveCurrentCoursesEvent event = new ReceiveCurrentCoursesEvent(action, getContainer());
		eventBus.fireEvent(event);
	}

	public void onFailure(Throwable caught)
	{
		StringBuilder sb = new StringBuilder();
		
		StackTraceElement[] stackTraceElements = caught.getStackTrace();
		for(StackTraceElement stackTraceElement : stackTraceElements)
		{
			sb.append(stackTraceElement.toString());
			sb.append("\n");
		}
		
		ArrayList<String> reasonList = new ArrayList<String>();
		reasonList.add(sb.toString());
				
		InvalidCourseAction ica = new InvalidCourseAction(reasonList);
		InvalidCourseEvent ice = new InvalidCourseEvent(ica);
		eventBus.fireEvent(ice);
	}
	
}
