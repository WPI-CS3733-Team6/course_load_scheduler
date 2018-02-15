package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.UpdateAccountAction;
import org.dselent.course_load_scheduler.client.event_handler.UpdateAccountEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class UpdateAccountEvent extends GwtEvent<UpdateAccountEventHandler>{

	public static Type<UpdateAccountEventHandler> TYPE = new Type<UpdateAccountEventHandler>();

	@Override
	protected void dispatch(UpdateAccountEventHandler handler)
	{
		handler.onUpdateAccount(this);
	}

	@Override
	public Type<UpdateAccountEventHandler> getAssociatedType()
	{
		return TYPE;
	}	

	private UpdateAccountAction action;

	public UpdateAccountEvent(UpdateAccountAction action)
	{
		this.action = action;
	}

	public UpdateAccountAction getAction()
	{
		return action;
	}

}
