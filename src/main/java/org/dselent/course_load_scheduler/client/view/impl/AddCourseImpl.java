package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.ListBox;

public class AddCourseImpl extends Composite{

	private static AddCourseImplUiBinder uiBinder = GWT.create(AddCourseImplUiBinder.class);
	@UiField TextBox courseNumberHeader;
	@UiField TextBox courseNameHeader;
	@UiField TextBox instanceNumberHeader;
	@UiField TextBox statusHeader;
	@UiField TextBox courseNumberField;
	@UiField TextBox courseNameField;
	@UiField TextBox instanceNumberField;
	@UiField TextBox statusField;
	@UiField Button saveCourseButton;
	@UiField Button deleteCourseButton;
	@UiField Button editInstanceButton;
	@UiField Button createInstanceButton;
	@UiField ListBox instanceList;	
	@UiField TextArea courseDescField;
	@UiField TextBox courseDescHeader;
	@UiField LayoutPanel instancePanel;
	@UiField LayoutPanel descriptionPanel;
	@UiField LayoutPanel saveDeletePanel;

	interface AddCourseImplUiBinder extends UiBinder<Widget, AddCourseImpl> {
	}

	public AddCourseImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}