package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidInstanceEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class InvalidInstanceEvent extends GwtEvent<InvalidInstanceEventHandler> {
	
	public static Type<InvalidInstanceEventHandler> TYPE = new Type<InvalidInstanceEventHandler>();
	
	private InvalidInstanceAction action;
	
	public InvalidInstanceEvent(InvalidInstanceAction action) {
		this.action = action;
	}
	
	public InvalidInstanceAction getAction() {
		return action;
	}

	@Override
	public Type<InvalidInstanceEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(InvalidInstanceEventHandler handler) {
		// TODO Auto-generated method stub
		handler.onInvalidInstance(this);
	}
	
	
	
}
