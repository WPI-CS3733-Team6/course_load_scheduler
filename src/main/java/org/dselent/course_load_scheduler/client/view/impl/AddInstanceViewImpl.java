package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AddInstancePresenter;
import org.dselent.course_load_scheduler.client.view.AddInstanceView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AddInstanceViewImpl extends BaseViewImpl<AddInstancePresenter> implements AddInstanceView {

	private static AddInstanceUiBinder uiBinder = GWT.create(AddInstanceUiBinder.class);

	interface AddInstanceUiBinder extends UiBinder<Widget, AddInstanceViewImpl> {
	}

	public AddInstanceViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField HTMLPanel rootPanel;
	@UiField TextBox courseNumberHeader;
	@UiField TextBox instanceNumberHeader;
	@UiField TextBox termHeader;
	@UiField TextBox courseNumberField;
	@UiField IntegerBox instanceNumberField;
	@UiField ListBox termList;
	@UiField FlexTable sectionInfoList;
	@UiField ListBox sectionDropList;
	@UiField Button backButton;
	@UiField Button saveButton;
	@UiField Button deleteButton;
	@UiField LayoutPanel sectionInfoPanel;
	@UiField LayoutPanel saveDeletePanel;
	@UiField LayoutPanel instanceInfoPanel;
	
	@Override
	public void setPresenter(AddInstancePresenter presenter) {
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
	
	@UiHandler("saveButton")
	void onSaveButtonClicked() {
		presenter.addInstance();
	}
	public TextBox getCourseNumberField() {
		return courseNumberField;
	}
	public IntegerBox getInstanceNumberField() {
		return instanceNumberField;
	}
	public ListBox getTermList() {
		return termList;
	}
}
