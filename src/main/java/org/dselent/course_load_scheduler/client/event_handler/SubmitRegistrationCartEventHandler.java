package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SubmitRegistrationCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SubmitRegistrationCartEventHandler  extends EventHandler{
	public void onSubmitCart(SubmitRegistrationCartEvent evt);
}
