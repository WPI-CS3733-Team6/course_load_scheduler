package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseCartRemoveCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface CourseCartRemoveCourseEventHandler extends EventHandler {
	public void onCartRemoveCourse(CourseCartRemoveCourseEvent evt);
}
