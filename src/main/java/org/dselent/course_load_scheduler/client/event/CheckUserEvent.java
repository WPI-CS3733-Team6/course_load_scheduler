package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CheckUserAction;
import org.dselent.course_load_scheduler.client.event_handler.CheckUserEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class CheckUserEvent extends DisplayEvent<CheckUserAction, CheckUserEventHandler>{

	public static Type<CheckUserEventHandler> TYPE = new Type<CheckUserEventHandler>();
	
	public CheckUserEvent(CheckUserAction action, HasWidgets container) {
		super(action, container);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Type<CheckUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	protected void dispatch(CheckUserEventHandler handler)
	{
		handler.onCheckUser(this);
	}
}
