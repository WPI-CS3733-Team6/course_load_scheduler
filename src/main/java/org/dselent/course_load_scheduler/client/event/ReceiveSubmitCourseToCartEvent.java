package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveSubmitCourseToCartAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveSubmitCourseToCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveSubmitCourseToCartEvent extends DisplayEvent<ReceiveSubmitCourseToCartAction, ReceiveSubmitCourseToCartEventHandler> {
	
	public static Type<ReceiveSubmitCourseToCartEventHandler> TYPE = new Type<ReceiveSubmitCourseToCartEventHandler>();

	public ReceiveSubmitCourseToCartEvent(ReceiveSubmitCourseToCartAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveSubmitCourseToCartEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveSubmitCourseToCartEventHandler handler) {
		handler.onReceiveSubmitCourseToCart(this);
	}

}
