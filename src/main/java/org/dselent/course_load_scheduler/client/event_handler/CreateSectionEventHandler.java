package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CreateSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface CreateSectionEventHandler extends EventHandler{
	
	public void onCreateSection(CreateSectionEvent evt);

}
