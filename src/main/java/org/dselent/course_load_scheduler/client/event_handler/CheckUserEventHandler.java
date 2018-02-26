package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CheckUserEvent;

import com.google.gwt.event.shared.EventHandler;

public interface CheckUserEventHandler extends EventHandler{
	void onCheckUser(CheckUserEvent evt);
}
