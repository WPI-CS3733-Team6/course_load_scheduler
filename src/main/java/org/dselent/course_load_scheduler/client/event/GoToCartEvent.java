package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToCartAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToCartEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToCartEvent extends GwtEvent<GoToCartEventHandler>
{
	public static Type<GoToCartEventHandler> TYPE = new Type<GoToCartEventHandler>();
	
	private GoToCartAction action;
	
	public GoToCartEvent(GoToCartAction action)
	{
		this.action = action;
	}
	
	public GoToCartAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<GoToCartEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(GoToCartEventHandler handler)
	{
		handler.onGoToCart(this);
	}
}
