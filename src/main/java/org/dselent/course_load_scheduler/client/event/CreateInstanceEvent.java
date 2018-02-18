package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CreateInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.CreateInstanceEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class CreateInstanceEvent extends GwtEvent<CreateInstanceEventHandler>{
	public static Type<CreateInstanceEventHandler> TYPE = new Type<CreateInstanceEventHandler>();
	
	private CreateInstanceAction action;
	
	public CreateInstanceEvent(CreateInstanceAction action) {
		this.action = action;
	}
	
	public CreateInstanceAction getaction() {
		return action;
	}
	
	@Override
	public Type<CreateInstanceEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(CreateInstanceEventHandler handler)
	{
		handler.onCreateInstance(this);
	}
}
