package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event_handler.SubmitRegistrationCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SubmitRegistrationCartEvent  extends DisplayEvent<SubmitRegistrationCartAction, SubmitRegistrationCartEventHandler>{
	public static Type< SubmitRegistrationCartEventHandler> TYPE = new Type<SubmitRegistrationCartEventHandler>();
	
	private  SubmitRegistrationCartAction action;
	
	public  SubmitRegistrationCartEvent(SubmitRegistrationCartAction action, HasWidgets container)
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
	public Type<SubmitRegistrationCartEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(SubmitRegistrationCartEventHandler handler)
	{
		handler.onSubmitCart(this);
	}
}
