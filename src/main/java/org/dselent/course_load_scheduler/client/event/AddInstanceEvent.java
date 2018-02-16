package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AddInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.AddInstanceEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class AddInstanceEvent extends GwtEvent<AddInstanceEventHandler>{
	public static Type<AddInstanceEventHandler> TYPE = new Type<AddInstanceEventHandler>();

	private AddInstanceAction action;

	public AddInstanceEvent(AddInstanceAction action)
	{
		this.action = action;
	}

	public AddInstanceAction getAction()
	{
		return action;
	}

	/*
	 * 
	 */
	@Override
	public Type<AddInstanceEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(AddInstanceEventHandler handler)
	{
		handler.onAddInstance(this);
	}
}
