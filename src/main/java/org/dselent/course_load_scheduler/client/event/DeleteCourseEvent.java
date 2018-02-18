package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DeleteCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.DeleteCourseEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class DeleteCourseEvent extends GwtEvent<DeleteCourseEventHandler>{
	public static Type<DeleteCourseEventHandler> TYPE = new Type<DeleteCourseEventHandler>();

	private DeleteCourseAction action;
	
	public DeleteCourseEvent(DeleteCourseAction action) {
		this.action = action;
	}
	
	public DeleteCourseAction getAction() {
		return action;
	}

	@Override
	public Type<DeleteCourseEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(DeleteCourseEventHandler handler)
	{
		handler.onDeleteCourse(this);
	}
}
