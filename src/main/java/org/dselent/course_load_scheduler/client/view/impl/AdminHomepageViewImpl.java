package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class AdminHomepageViewImpl extends Composite {

	private static AdminHomepageViewImplUiBinder uiBinder = GWT.create(AdminHomepageViewImplUiBinder.class);
	@UiField LayoutPanel layoutPanel;
	@UiField HTMLPanel adminHomepageView;
	@UiField LayoutPanel viewAsAdministrator;
	@UiField LayoutPanel viewAsInstructor;
	@UiField ListBox department;
	@UiField TextBox departmentName;
	@UiField ListBox courses;
	@UiField Button addUser;
	@UiField Button editUser;
	@UiField Button addCourse;
	@UiField Button modifyCourse;
	@UiField TextBox courseText;
	@UiField LayoutPanel layoutPanelInstructor;
	@UiField Button createRequest;
	@UiField Button generatedCompleteDepartmentSchedule;
	@UiField LayoutPanel courseSummariesPanel;
	@UiField SplitLayoutPanel table;
	@UiField HorizontalPanel north;
	@UiField ListBox west;
	@UiField ListBox center;
	@UiField TextBox courseSummaries;
	@UiField HorizontalPanel horizontalPanel;
	@UiField Button currentClassesButton;
	@UiField Button searchClassesButton;
	@UiField Button accountInfoButton;
	@UiField Button courseRegistrationCart;

	interface AdminHomepageViewImplUiBinder extends UiBinder<Widget, AdminHomepageViewImpl> {
	}

	public AdminHomepageViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
