package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CreateInstanceEvent;

import com.google.gwt.event.shared.EventHandler;

public interface CreateInstanceEventHandler extends EventHandler{
	public void onCreateInstance(CreateInstanceEvent createInstanceEvent);
}
