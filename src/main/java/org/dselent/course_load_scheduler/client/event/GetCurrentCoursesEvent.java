package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GetCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event_handler.GetCurrentCoursesEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GetCurrentCoursesEvent extends GwtEvent<GetCurrentCoursesEventHandler>{

	public static Type<GetCurrentCoursesEventHandler> TYPE = new Type<GetCurrentCoursesEventHandler>();
	private GetCurrentCoursesAction action;
	
	public GetCurrentCoursesEvent(GetCurrentCoursesAction fcma) {
		this.action = fcma;
	}
	
	public GetCurrentCoursesAction getAction() {
		return action;
	}
	
	@Override
	public Type<GetCurrentCoursesEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GetCurrentCoursesEventHandler handler) {
		handler.onGetCurrentCourses(this);
	}
}
