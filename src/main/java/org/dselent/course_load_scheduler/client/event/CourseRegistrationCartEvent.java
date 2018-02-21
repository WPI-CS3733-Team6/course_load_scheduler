package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CourseRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseRegistrationCartEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;

public class CourseRegistrationCartEvent  extends DisplayEvent<CourseRegistrationCartAction, CourseRegistrationCartEventHandler>{
	public static Type< CourseRegistrationCartEventHandler> TYPE = new Type<CourseRegistrationCartEventHandler>();
	
	private  CourseRegistrationCartAction action;
	
	public  CourseRegistrationCartEvent(CourseRegistrationCartAction action, HasWidgets container)
	{
		super(action, container);
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
