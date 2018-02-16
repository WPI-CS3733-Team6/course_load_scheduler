/**
 * 
 */
package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SubmitReportEvent;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author bobbyshome
 *
 */
public interface SubmitReportEventHandler extends EventHandler {
	public void onSubmitReport(SubmitReportEvent evt);
}
