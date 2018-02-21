package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminHomepagePresenter;
import org.dselent.course_load_scheduler.client.view.AdminHomepageView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AdminHomepageViewImpl extends BaseViewImpl<AdminHomepagePresenter> implements AdminHomepageView {

	private static AdminHomepageViewImplUiBinder uiBinder = GWT.create(AdminHomepageViewImplUiBinder.class);
	@UiField LayoutPanel layoutPanel;
	@UiField HTMLPanel rootPanel;
	@UiField LayoutPanel viewAsAdmin;
	@UiField ListBox department;
	@UiField TextBox departmentName;
	@UiField ListBox courses;
	@UiField Button addUser;
	@UiField Button editUser;
	@UiField Button addCourse;
	@UiField Button modifyCourse;
	@UiField TextBox courseText;
	@UiField LayoutPanel viewAsInstructor;
	@UiField Button createRequest;
	@UiField Button generatedCompleteDepartmentSchedule;
	@UiField LayoutPanel courseSummariesPanel;
	@UiField SplitLayoutPanel table;
	@UiField HorizontalPanel north;
	@UiField ListBox west;
	@UiField ListBox center;
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

	public Button getAccountInfoButton() {
		return accountInfoButton;
	}

	public void setAccountInfoButton(Button accountInfoButton) {
		this.accountInfoButton = accountInfoButton;
	}

	public Button getAddUser() {
		return addUser;
	}

	public Button getEditUser() {
		return editUser;
	}

	public Button getAddCourse() {
		return addCourse;
	}

	public Button getModifyCourse() {
		return modifyCourse;
	}

	public Button getGeneratedCompleteDepartmentSchedule() {
		return generatedCompleteDepartmentSchedule;
	}

	public Button getCurrentClassesButton() {
		return currentClassesButton;
	}

	public Button getSearchClassesButton() {
		return searchClassesButton;
	}

	public Button getCourseRegistrationCart() {
		return courseRegistrationCart;
	}

	@Override
	public void setPresenter(AdminHomepagePresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return rootPanel;
	}
	
	
	//currentClassesButton, searchClassesButton, accountInfoButton, courseRegistrationCart, generatedCompleteDepartmentSchedule, addUser, editUser, addCourse, modifyCourse
}
