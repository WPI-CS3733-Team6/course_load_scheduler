package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AddCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.AddCourseEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class AddCourseEvent extends GwtEvent<AddCourseEventHandler>{
public static Type<AddCourseEventHandler> TYPE = new Type<AddCourseEventHandler>();
	
	private AddCourseAction action;
	
	public AddCourseEvent(AddCourseAction action)
	{
		this.action = action;
	}
	
	public AddCourseAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<AddCourseEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(AddCourseEventHandler handler)
	{
		handler.onAddCourse(this);
	}
}
