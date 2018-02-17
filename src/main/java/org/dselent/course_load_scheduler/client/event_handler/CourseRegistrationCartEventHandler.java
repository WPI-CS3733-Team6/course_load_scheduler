package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseRegistrationCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface CourseRegistrationCartEventHandler  extends EventHandler{
	public void onSubmitCart(CourseRegistrationCartEvent evt);
}
