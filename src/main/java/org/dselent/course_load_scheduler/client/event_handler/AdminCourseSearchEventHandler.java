package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SearchCoursesEvent;

import com.google.gwt.event.shared.EventHandler;

public interface AdminCourseSearchEventHandler extends EventHandler{
	public void search(SearchCoursesEvent evt);
}
