package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseRegistrationCartEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class CourseRegistrationCartEvent  extends GwtEvent<CourseRegistrationCartEventHandler>{
	public static Type< CourseRegistrationCartEventHandler> TYPE = new Type<CourseRegistrationCartEventHandler>();
	
	private  CourseRegistrationCartAction action;
	
	public  CourseRegistrationCartEvent( CourseRegistrationCartAction action)
	{
		this.action = action;
	}
	
	public  CourseRegistrationCartAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<CourseRegistrationCartEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CourseRegistrationCartEventHandler handler)
	{
		handler.onSubmitCart(this);
	}
}
