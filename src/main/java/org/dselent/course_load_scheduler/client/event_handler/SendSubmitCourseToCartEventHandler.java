package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendSubmitCourseToCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendSubmitCourseToCartEventHandler extends EventHandler {
	public void onSendSubmitCourseToCart(SendSubmitCourseToCartEvent evt);
}
