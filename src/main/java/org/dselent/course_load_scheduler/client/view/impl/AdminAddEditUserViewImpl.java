package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTMLPanel;

public class AdminAddEditUserViewImpl extends Composite {

	private static AdminAddEditUserUiBinder uiBinder = GWT.create(AdminAddEditUserUiBinder.class);
	@UiField HTMLPanel rootPanel;
	@UiField TextBox firstNameField;
	@UiField TextBox lastNameField;
	@UiField TextBox emailField;
	@UiField DoubleBox requirementField;
	@UiField CheckBox adminCheckBox;
	@UiField Button submitButton;

	interface AdminAddEditUserUiBinder extends UiBinder<Widget, AdminAddEditUserViewImpl> {
	}

	public AdminAddEditUserViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
