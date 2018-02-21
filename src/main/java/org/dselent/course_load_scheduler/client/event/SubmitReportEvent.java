package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SubmitReportAction;
import org.dselent.course_load_scheduler.client.event_handler.SubmitReportEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SubmitReportEvent extends DisplayEvent<SubmitReportAction, SubmitReportEventHandler> {
	
	public static Type<SubmitReportEventHandler> TYPE = new Type<SubmitReportEventHandler>();
	
	private SubmitReportAction action;
	
	public SubmitReportEvent(SubmitReportAction action, HasWidgets container) {
		super(action, container);
		this.action = action;
	}

	public SubmitReportAction getAction() {
		return action;
	}

	@Override
	public Type<SubmitReportEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SubmitReportEventHandler handler) {
		handler.onSubmitReport(this);
	}

}
