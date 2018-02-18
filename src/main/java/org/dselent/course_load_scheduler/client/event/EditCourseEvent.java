package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.EditCourseAction;
import org.dselent.course_load_scheduler.client.event_handler.EditCourseEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class EditCourseEvent extends GwtEvent<EditCourseEventHandler>{
		
		public static Type<EditCourseEventHandler> TYPE = new Type<EditCourseEventHandler>();
		private EditCourseAction action;
		
		public EditCourseEvent(EditCourseAction action)
		{
			this.action = action;
		}
		
		public EditCourseAction getAction()
		{
			return action;
		}
		
		@Override
		public Type<EditCourseEventHandler> getAssociatedType() {
			return TYPE;
		}

		@Override
		protected void dispatch(EditCourseEventHandler handler) {
			handler.onEditCourse(this);
		}
}
