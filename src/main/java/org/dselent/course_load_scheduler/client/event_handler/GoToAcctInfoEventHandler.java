package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToAcctInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToAcctInfoEventHandler extends EventHandler
{
	  public void onGoToAcctInfo(GoToAcctInfoEvent evt);
}
