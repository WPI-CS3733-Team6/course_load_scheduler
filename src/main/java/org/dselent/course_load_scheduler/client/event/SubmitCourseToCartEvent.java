package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SubmitCourseToCartAction;
import org.dselent.course_load_scheduler.client.event_handler.SubmitCourseToCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SubmitCourseToCartEvent extends DisplayEvent<SubmitCourseToCartAction, SubmitCourseToCartEventHandler> {
	
	public static Type<SubmitCourseToCartEventHandler> TYPE = new Type<SubmitCourseToCartEventHandler>();

	public SubmitCourseToCartEvent(SubmitCourseToCartAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<SubmitCourseToCartEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SubmitCourseToCartEventHandler handler) {
		handler.onSubmitCourseToCart(this);
	}

}
