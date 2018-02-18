package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToAddEditUserAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToAddEditUserEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToAddEditUserEvent extends GwtEvent<GoToAddEditUserEventHandler> {
	
	public static Type<GoToAddEditUserEventHandler> TYPE = new Type<GoToAddEditUserEventHandler>();
	
	private GoToAddEditUserAction action;

	public GoToAddEditUserEvent(GoToAddEditUserAction action) {
		super();
		this.action = action;
	}

	public GoToAddEditUserAction getAction() {
		return action;
	}

	@Override
	public Type<GoToAddEditUserEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GoToAddEditUserEventHandler handler) {
		handler.onGoToAddEditUser(this);
	}

}
