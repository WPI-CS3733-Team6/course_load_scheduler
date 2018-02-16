package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SubmitReportAction;
import org.dselent.course_load_scheduler.client.event_handler.SubmitReportEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class SubmitReportEvent extends GwtEvent<SubmitReportEventHandler> {
	
	public static Type<SubmitReportEventHandler> TYPE = new Type<SubmitReportEventHandler>();
	
	private SubmitReportAction action;
	
	public SubmitReportEvent(SubmitReportAction action) {
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
