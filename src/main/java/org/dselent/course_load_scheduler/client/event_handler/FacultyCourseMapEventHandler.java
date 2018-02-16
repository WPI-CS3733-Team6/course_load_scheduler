package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.FacultyCourseMapEvent;

import com.google.gwt.event.shared.EventHandler;

public interface FacultyCourseMapEventHandler extends EventHandler{
	public void onGetFaculty(FacultyCourseMapEvent fcme);
}
