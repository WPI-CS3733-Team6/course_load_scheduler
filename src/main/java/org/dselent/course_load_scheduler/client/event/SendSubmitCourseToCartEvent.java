package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendSubmitCourseToCartAction;
import org.dselent.course_load_scheduler.client.event_handler.SendSubmitCourseToCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendSubmitCourseToCartEvent extends DisplayEvent<SendSubmitCourseToCartAction, SendSubmitCourseToCartEventHandler> {
	
	public static Type<SendSubmitCourseToCartEventHandler> TYPE = new Type<SendSubmitCourseToCartEventHandler>();

	public SendSubmitCourseToCartEvent(SendSubmitCourseToCartAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<SendSubmitCourseToCartEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SendSubmitCourseToCartEventHandler handler) {
		handler.onSendSubmitCourseToCart(this);
	}

}
