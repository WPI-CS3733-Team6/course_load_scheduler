package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AdminCourseSearchEvent;

import com.google.gwt.event.shared.EventHandler;

public interface AdminCourseSearchEventHandler extends EventHandler{
	public void onAdminCourseSearch(AdminCourseSearchEvent evt);
}
