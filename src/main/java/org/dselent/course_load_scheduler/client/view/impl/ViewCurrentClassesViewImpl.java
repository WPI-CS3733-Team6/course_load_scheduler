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

public class ViewCurrentClassesViewImpl extends Composite {

	private static ViewCurrentClassesViewImplUiBinder uiBinder = GWT.create(ViewCurrentClassesViewImplUiBinder.class);
	@UiField LayoutPanel currentCourses;
	@UiField LayoutPanel detailedSchedule;
	@UiField ScrollPanel panelForScrollingCourseTable;
	@UiField ScrollPanel panelForScrollingDetailedSchedule;
	@UiField FlexTable tableDisplayCurrentCourses;
	@UiField FlexTable tableDisplayDetailedSchedule;

	interface ViewCurrentClassesViewImplUiBinder extends UiBinder<Widget, ViewCurrentClassesViewImpl> {
	}

	public ViewCurrentClassesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));

	    // Create the text fields (This table is a K x 5, with K being the number of courses they have registered for)
		tableDisplayCurrentCourses.setText(0, 0, "Course Name");
		tableDisplayCurrentCourses.setText(0, 1, "Course Number");
		tableDisplayCurrentCourses.setText(0, 2, "Term");
		tableDisplayCurrentCourses.setText(0, 3, "Instance ID");
		tableDisplayCurrentCourses.setText(0, 4, "Status");
		
		tableDisplayDetailedSchedule.setText(0, 4, "Number of Sections");

	    // ...and set it's column span so that it takes up the whole row.
		tableDisplayCurrentCourses.getFlexCellFormatter().setColSpan(1, 0, 3);

		
		
	    RootPanel.get().add(tableDisplayCurrentCourses);
	    RootPanel.get().add(tableDisplayDetailedSchedule);
	}

}
