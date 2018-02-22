package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event_handler.CourseRegistrationCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class CourseRegistrationCartEvent  extends DisplayEvent<SubmitRegistrationCartAction, CourseRegistrationCartEventHandler>{
	public static Type< CourseRegistrationCartEventHandler> TYPE = new Type<CourseRegistrationCartEventHandler>();
	
	private  SubmitRegistrationCartAction action;
	
	public  CourseRegistrationCartEvent(SubmitRegistrationCartAction action, HasWidgets container)
	{
		super(action, container);
		this.action = action;
	}
	
	public  SubmitRegistrationCartAction getAction()
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
