package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AdminCourseSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.AdminCourseSearchEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class AdminCourseSearchEvent extends GwtEvent<AdminCourseSearchEventHandler>{
	
	public static Type<AdminCourseSearchEventHandler> TYPE = new Type<AdminCourseSearchEventHandler>();

	@Override
	protected void dispatch(AdminCourseSearchEventHandler handler)
	{
		handler.onAdminCourseSearch(this);
	}

	@Override
	public Type<AdminCourseSearchEventHandler> getAssociatedType()
	{
		return TYPE;
	}	

	private AdminCourseSearchAction action;

	public AdminCourseSearchEvent(AdminCourseSearchAction action)
	{
		this.action = action;
	}

	public AdminCourseSearchAction getAction()
	{
		return action;
	}
}
