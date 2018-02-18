package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToCurrentCoursesEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToCurrentCoursesEvent extends GwtEvent<GoToCurrentCoursesEventHandler> {
	
	public static Type<GoToCurrentCoursesEventHandler> TYPE = new Type<GoToCurrentCoursesEventHandler>();
	
	private GoToCurrentCoursesAction action;

	public GoToCurrentCoursesEvent(GoToCurrentCoursesAction action) {
		this.action = action;
	}

	public GoToCurrentCoursesAction getAction() {
		return action;
	}

	@Override
	public Type<GoToCurrentCoursesEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(GoToCurrentCoursesEventHandler handler) {
		handler.onGoToCurrentCourses(this);
	}
	
}
