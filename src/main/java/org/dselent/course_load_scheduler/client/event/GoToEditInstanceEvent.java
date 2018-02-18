package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToEditInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToEditInstanceEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToEditInstanceEvent extends GwtEvent<GoToEditInstanceEventHandler>{
	public static Type<GoToEditInstanceEventHandler> TYPE = new Type<GoToEditInstanceEventHandler>();

	private GoToEditInstanceAction action;
	
	public GoToEditInstanceEvent(GoToEditInstanceAction action) {
		this.action = action;
	}
	
	public GoToEditInstanceAction getAction() {
		return action;
	}

	@Override
	public Type<GoToEditInstanceEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToEditInstanceEventHandler handler)
	{
		handler.onGoToInstanceEdit(this);
	}
}
