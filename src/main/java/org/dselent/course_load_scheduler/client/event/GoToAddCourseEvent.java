package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToAddCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToAddCourseEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToAddCourseEvent extends GwtEvent<GoToAddCourseEventHandler> {
	
	public static Type<GoToAddCourseEventHandler> TYPE = new Type<GoToAddCourseEventHandler>();
	
	private GoToAddCourseAction action;

	public GoToAddCourseEvent(GoToAddCourseAction action) {
		this.action = action;
	}

	public GoToAddCourseAction getAction() {
		return action;
	}

	@Override
	public Type<GoToAddCourseEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GoToAddCourseEventHandler handler) {
		handler.onGoToAddCourse(this);
	}

}
