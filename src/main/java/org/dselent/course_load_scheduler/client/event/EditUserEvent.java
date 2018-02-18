package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.EditUserAction;
import org.dselent.course_load_scheduler.client.event_handler.EditUserEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

public class EditUserEvent extends GwtEvent<EditUserEventHandler>{
	
public static Type< EditUserEventHandler> TYPE = new Type< EditUserEventHandler>();
	
	private  EditUserAction action;
	
	public  EditUserEvent( EditUserAction action)
	{
		this.action = action;
	}
	
	public  EditUserAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type< EditUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(EditUserEventHandler handler)
	{
		handler.onEditUser(this);
	}

}
