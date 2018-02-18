package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToClassSearchAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToClassSearchEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class GoToClassSearchEvent extends GwtEvent<GoToClassSearchEventHandler> {
	
	public static Type<GoToClassSearchEventHandler> TYPE =  new Type<GoToClassSearchEventHandler>();
	
	private GoToClassSearchAction action;

	public GoToClassSearchEvent(GoToClassSearchAction action) {
		this.action = action;
	}

	public GoToClassSearchAction getAction() {
		return action;
	}

	@Override
	public Type<GoToClassSearchEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(GoToClassSearchEventHandler handler) {
		handler.onGoToClassSearch(this);
	}

}
