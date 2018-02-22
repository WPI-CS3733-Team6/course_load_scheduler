package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SubmitCourseToCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SubmitCourseToCartEventHandler extends EventHandler {
	public void onSubmitCourseToCart(SubmitCourseToCartEvent evt);
}
