package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToReportAProblemEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToReportAProblemEventHandler extends EventHandler{

	public void onGoToReportAProblem(GoToReportAProblemEvent evt);
}
