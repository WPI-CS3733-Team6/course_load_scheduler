package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AddUserAction;
import org.dselent.course_load_scheduler.client.event_handler.AddUserEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class AddUserEvent extends GwtEvent<AddUserEventHandler>{
public static Type<AddUserEventHandler> TYPE = new Type<AddUserEventHandler>();
	
	private AddUserAction action;
	
	public AddUserEvent(AddUserAction action)
	{
		this.action = action;
	}
	
	public AddUserAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<AddUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(AddUserEventHandler handler)
	{
		handler.onAddUser(this);
	}
}
