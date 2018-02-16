package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AdminAdvancedCourseSearchEvent;

import com.google.gwt.event.shared.EventHandler;

public interface AdminAdvancedCourseSearchEventHandler extends EventHandler{
	
	public void onAdminAdvancedCourseSearch(AdminAdvancedCourseSearchEvent evt);
	
}
