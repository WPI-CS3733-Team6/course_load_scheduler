package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.CreateSectionAction;
import org.dselent.course_load_scheduler.client.event_handler.CreateSectionEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class CreateSectionEvent extends GwtEvent<CreateSectionEventHandler>{
	public static Type<CreateSectionEventHandler> TYPE = new Type<CreateSectionEventHandler>();

	private CreateSectionAction action;

	public CreateSectionEvent(CreateSectionAction action)
	{
		this.action = action;
	}

	public CreateSectionAction getAction()
	{
		return action;
	}

	@Override
	public Type<CreateSectionEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(CreateSectionEventHandler handler)
	{
		handler.onCreateSection(this);
	}
}