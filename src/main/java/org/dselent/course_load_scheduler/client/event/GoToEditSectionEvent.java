package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToEditSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToEditSectionEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToEditSectionEvent extends GwtEvent<GoToEditSectionEventHandler>{
	public static Type<GoToEditSectionEventHandler> TYPE = new Type<GoToEditSectionEventHandler>();

	private GoToEditSectionAction action;
	
	public GoToEditSectionEvent(GoToEditSectionAction action) {
		this.action = action;
	}
	
	public GoToEditSectionAction getAction() {
		return action;
	}

	@Override
	public Type<GoToEditSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToEditSectionEventHandler handler)
	{
		handler.onGoToEditSection(this);
	}
}
