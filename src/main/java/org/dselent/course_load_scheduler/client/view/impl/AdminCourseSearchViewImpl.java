package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.FlexTable;

public class AdminCourseSearchViewImpl extends Composite{

	private static AdminCourseSearchImplUiBinder uiBinder = GWT.create(AdminCourseSearchImplUiBinder.class);
	@UiField ListBox semesterList;
	@UiField ListBox courseList;
	@UiField Button searchButton;
	@UiField Button advSearchButton;
	@UiField Button addCourseButton;
	@UiField LayoutPanel layoutPanel;
	@UiField FlexTable resultTable;

	interface AdminCourseSearchImplUiBinder extends UiBinder<Widget, AdminCourseSearchViewImpl> {
	}

	public AdminCourseSearchViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
