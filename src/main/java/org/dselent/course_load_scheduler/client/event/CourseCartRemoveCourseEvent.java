package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseCartRemoveCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseCartRemoveCourseEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class CourseCartRemoveCourseEvent
		extends DisplayEvent<CourseCartRemoveCourseAction, CourseCartRemoveCourseEventHandler> {
	public static Type<CourseCartRemoveCourseEventHandler> TYPE = new Type<CourseCartRemoveCourseEventHandler>();

	public CourseCartRemoveCourseEvent(CourseCartRemoveCourseAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<CourseCartRemoveCourseEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(CourseCartRemoveCourseEventHandler handler) {
		handler.onCartRemoveCourse(this);
	}

}
