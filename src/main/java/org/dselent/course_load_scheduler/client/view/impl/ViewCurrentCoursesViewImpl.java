package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.FlexTable;

public class ViewCurrentCoursesViewImpl extends Composite {

	private static ViewCurrentCoursesViewImplUiBinder uiBinder = GWT.create(ViewCurrentCoursesViewImplUiBinder.class);
	@UiField LayoutPanel currentCourses;
	@UiField LayoutPanel detailedSchedule;
	@UiField ScrollPanel panelForScrollingCourseTable;
	@UiField ScrollPanel panelForScrollingDetailedSchedule;
	@UiField FlexTable tableDisplayCurrentCourses;
	@UiField FlexTable tableDisplayDetailedSchedule;

	interface ViewCurrentCoursesViewImplUiBinder extends UiBinder<Widget, ViewCurrentCoursesViewImpl> {
	}

	public ViewCurrentCoursesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));

	    // Create the text fields (This table is a K x 5, with K being the number of courses they have registered for)
		tableDisplayCurrentCourses.setText(0, 0, "Course Name");
		tableDisplayCurrentCourses.setText(0, 1, "Course Number");
		tableDisplayCurrentCourses.setText(0, 2, "Term");
		tableDisplayCurrentCourses.setText(0, 3, "Instance ID");
		tableDisplayCurrentCourses.setText(0, 4, "Status");
		
		tableDisplayDetailedSchedule.setText(0, 0, "Times");
		tableDisplayDetailedSchedule.setText(0, 1, "Mon");
		tableDisplayDetailedSchedule.setText(0, 2, "Tue");
		tableDisplayDetailedSchedule.setText(0, 3, "Wed");
		tableDisplayDetailedSchedule.setText(0, 4, "Thur");
		tableDisplayDetailedSchedule.setText(0, 5, "Fri");
		tableDisplayDetailedSchedule.setText(1, 0, "8:00 AM");
		tableDisplayDetailedSchedule.setText(2, 0, "9:00 AM");
		tableDisplayDetailedSchedule.setText(3, 0, "10:00 AM");
		tableDisplayDetailedSchedule.setText(4, 0, "11:00 AM");
		tableDisplayDetailedSchedule.setText(5, 0, "12:00 PM");
		tableDisplayDetailedSchedule.setText(5, 0, "1:00 PM");
		tableDisplayDetailedSchedule.setText(6, 0, "2:00 PM");
		tableDisplayDetailedSchedule.setText(7, 0, "3:00 PM");
		tableDisplayDetailedSchedule.setText(8, 0, "4:00 PM");
		tableDisplayDetailedSchedule.setText(9, 0, "5:00 PM");
		tableDisplayDetailedSchedule.setText(10, 0, "6:00 PM");
		tableDisplayDetailedSchedule.setText(11, 0, "7:00 PM");
		tableDisplayDetailedSchedule.setText(12, 0, "8:00 PM");
		
	    RootPanel.get().add(tableDisplayCurrentCourses);
	    RootPanel.get().add(tableDisplayDetailedSchedule);
	}

}
