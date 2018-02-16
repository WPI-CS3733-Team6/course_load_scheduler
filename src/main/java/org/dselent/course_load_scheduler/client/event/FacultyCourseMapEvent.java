package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.FacultyCourseMapAction;
import org.dselent.course_load_scheduler.client.event_handler.FacultyCourseMapEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class FacultyCourseMapEvent extends GwtEvent<FacultyCourseMapEventHandler>{

	public static Type<FacultyCourseMapEventHandler> TYPE = new Type<FacultyCourseMapEventHandler>();
	private FacultyCourseMapAction action;
	
	public FacultyCourseMapEvent(FacultyCourseMapAction fcma) {
		this.action = fcma;
	}
	
	public FacultyCourseMapAction getAction() {
		return action;
	}
	
	@Override
	public Type<FacultyCourseMapEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(FacultyCourseMapEventHandler handler) {
		handler.onGetFaculty(this);
	}

}
