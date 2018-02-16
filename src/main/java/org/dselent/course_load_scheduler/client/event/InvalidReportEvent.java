/**
 * 
 */
package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidLoginAction;
import org.dselent.course_load_scheduler.client.action.InvalidReportAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidReportEventHandler;

import com.google.gwt.event.shared.GwtEvent;

/**
 * @author bobbyshome
 *
 */
public class InvalidReportEvent extends GwtEvent<InvalidReportEventHandler> {
	
	public static Type<InvalidReportEventHandler> TYPE = new Type<InvalidReportEventHandler>();
	
	private InvalidReportAction action;
	
	public InvalidReportEvent(InvalidReportAction action) {
		this.action = action;
	}
	
	public InvalidReportAction getAction()
	{
		return action;
	}

	@Override
	public Type<InvalidReportEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(InvalidReportEventHandler handler) {
		handler.onInvalidReport(this);
	}

}
