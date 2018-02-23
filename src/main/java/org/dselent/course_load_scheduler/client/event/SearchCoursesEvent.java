package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AdminCourseSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.AdminCourseSearchEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SearchCoursesEvent extends DisplayEvent<AdminCourseSearchAction, AdminCourseSearchEventHandler> {
	
	public static Type<AdminCourseSearchEventHandler> TYPE = new Type<AdminCourseSearchEventHandler>();
	
	private AdminCourseSearchAction action;

	public SearchCoursesEvent(AdminCourseSearchAction action, HasWidgets container) {
		super(action, container);
	}

	public AdminCourseSearchAction getAction() {
		return action;
	}

	@Override
	public Type<AdminCourseSearchEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(AdminCourseSearchEventHandler handler) {
	}

}
