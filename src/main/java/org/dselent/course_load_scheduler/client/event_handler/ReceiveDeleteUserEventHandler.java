package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveDeleteUserEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveDeleteUserEventHandler extends EventHandler{
	void onReceiveDeleteCourse(ReceiveDeleteUserEvent evt);
}
