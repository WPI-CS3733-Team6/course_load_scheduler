package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;

public class CourseRegistrationCartViewImpl extends Composite {

	private static CourseRegistrationCartUiBinder uiBinder = GWT.create(CourseRegistrationCartUiBinder.class);
	@UiField Button submitForApproval;
	@UiField Button removeCourse;
	@UiField FlexTable flexTableFor;

	interface CourseRegistrationCartUiBinder extends UiBinder<Widget, CourseRegistrationCartViewImpl> {
	}

	public CourseRegistrationCartViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));		
		
	    // ...and set it's column span so that it takes up the whole row.
		flexTableFor.getFlexCellFormatter().setColSpan(0, 0, 3);
		flexTableFor.setText(0, 0, "Registartion Cart");
		
		flexTableFor.setText(1, 0, "Course Name");
		flexTableFor.setText(1, 1, "Course Number");
		flexTableFor.setText(1, 2, "Term");
		flexTableFor.setText(1, 3, "Instance ID");
	}

	/**
	 * @return the submitForApproval
	 */
	public Button getSubmitForApproval() {
		return submitForApproval;
	}

	/**
	 * @return the removeCourse
	 */
	public Button getRemoveCourse() {
		return removeCourse;
	}

	/**
	 * @return the flexTableFor
	 */
	public FlexTable getFlexTableFor() {
		return flexTableFor;
	}

}
