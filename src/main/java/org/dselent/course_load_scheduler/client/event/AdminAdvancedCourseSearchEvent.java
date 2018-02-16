package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AdminAdvancedCourseSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.AdminAdvancedCourseSearchEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class AdminAdvancedCourseSearchEvent extends GwtEvent<AdminAdvancedCourseSearchEventHandler>{
	
	public static Type<AdminAdvancedCourseSearchEventHandler> TYPE = new Type<AdminAdvancedCourseSearchEventHandler>();
	
	private AdminAdvancedCourseSearchAction action;
	
	public AdminAdvancedCourseSearchEvent(AdminAdvancedCourseSearchAction action) {
		this.action = action;
	}
	
	public AdminAdvancedCourseSearchAction getAction() {
		return action;
	}

	@Override
	public Type<AdminAdvancedCourseSearchEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(AdminAdvancedCourseSearchEventHandler handler) {
		handler.onAdminAdvancedCourseSearch(this);
	}
	

}
