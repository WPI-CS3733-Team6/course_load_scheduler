package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminAdvancedCourseSearchPresenter;
import org.dselent.course_load_scheduler.client.view.AdminAdvancedCourseSearchView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.LayoutPanel;

public class AdminAdvancedCourseSearchViewImpl extends BaseViewImpl<AdminAdvancedCourseSearchPresenter> implements AdminAdvancedCourseSearchView{

	private static AdminAdvancedCourseSearchViewImplUiBinder uiBinder = GWT
			.create(AdminAdvancedCourseSearchViewImplUiBinder.class);

	interface AdminAdvancedCourseSearchViewImplUiBinder extends UiBinder<Widget, AdminAdvancedCourseSearchViewImpl> {
	}

	public AdminAdvancedCourseSearchViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField TextBox courseNameHeader;
	@UiField TextBox courseNameField;
	@UiField ListBox termList;
	@UiField ListBox departmentList;
	@UiField ListBox levelList;
	@UiField Button searchButton;
	@UiField Button addCourseButton;
	@UiField FlexTable resultList;
	@UiField LayoutPanel resultPanel;
	@UiField LayoutPanel searchPanel;
	@UiField HTMLPanel basePanel;
	
	@Override
	public void setPresenter(AdminAdvancedCourseSearchPresenter presenter) {
		this.presenter = presenter;
	}
	@Override
	public Widget getWidgetContainer() {
		return this;
	}
	@Override
	public HasWidgets getViewRootPanel() {
		return basePanel;
	}
	@Override
	public TextBox getCourseNameFieldTextBox() {
		return courseNameField;
	}
	@Override
	public ListBox getTermList() {
		return termList;
	}
	@Override
	public ListBox getDepartmentList() {
		return departmentList;
	}
	@Override
	public ListBox getLevelList() {
		return levelList;
	}
	@Override
	public FlexTable getResultTable() {
		return resultList;
	}
	@Override
	public Button getAddCourseButton() {
		return addCourseButton;
	}

	@Override
	public Button getSearchButton() {
		return searchButton;
	}
}
