package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AddSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.AddSectionEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class AddSectionEvent extends GwtEvent<AddSectionEventHandler>{
	public static Type<AddSectionEventHandler> TYPE = new Type<AddSectionEventHandler>();

	private AddSectionAction action;

	public AddSectionEvent(AddSectionAction action)
	{
		this.action = action;
	}

	public AddSectionAction getAction()
	{
		return action;
	}

	/*
	 * 
	 */
	@Override
	public Type<AddSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(AddSectionEventHandler handler)
	{
		handler.onAddSection(this);
	}
}
