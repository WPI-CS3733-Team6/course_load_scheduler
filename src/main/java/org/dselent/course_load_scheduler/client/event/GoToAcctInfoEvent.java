package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToAcctInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToAcctInfoEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToAcctInfoEvent extends GwtEvent<GoToAcctInfoEventHandler>
{
	public static Type<GoToAcctInfoEventHandler> TYPE = new Type<GoToAcctInfoEventHandler>();
	
	private GoToAcctInfoAction action;
	
	public GoToAcctInfoEvent(GoToAcctInfoAction action)
	{
		this.action = action;
	}
	
	public GoToAcctInfoAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<GoToAcctInfoEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(GoToAcctInfoEventHandler handler)
	{
		handler.onGoToAcctInfo(this);
	}
}

