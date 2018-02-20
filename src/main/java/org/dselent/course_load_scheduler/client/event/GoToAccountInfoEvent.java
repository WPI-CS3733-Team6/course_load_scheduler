package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToAccoutInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToAccountInfoEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToAccountInfoEvent extends GwtEvent<GoToAccountInfoEventHandler>
{
	public static Type<GoToAccountInfoEventHandler> TYPE = new Type<GoToAccountInfoEventHandler>();
	
	private GoToAccoutInfoAction action;
	
	public GoToAccountInfoEvent(GoToAccoutInfoAction action)
	{
		this.action = action;
	}
	
	public GoToAccoutInfoAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<GoToAccountInfoEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(GoToAccountInfoEventHandler handler)
	{
		handler.onGoToAccountInfo(this);
	}
}

