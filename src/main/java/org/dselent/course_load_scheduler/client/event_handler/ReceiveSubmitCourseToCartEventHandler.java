package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveSubmitCourseToCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveSubmitCourseToCartEventHandler extends EventHandler {
	public void onReceiveSubmitCourseToCart(ReceiveSubmitCourseToCartEvent evt);
}
