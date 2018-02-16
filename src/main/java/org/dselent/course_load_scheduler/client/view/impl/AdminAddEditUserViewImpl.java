package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

public class AdminAddEditUserViewImpl extends Composite {

	private static AdminAddEditUserUiBinder uiBinder = GWT.create(AdminAddEditUserUiBinder.class);
	@UiField Button home;
	@UiField Button logout;
	@UiField Button admin;

	interface AdminAddEditUserUiBinder extends UiBinder<Widget, AdminAddEditUserViewImpl> {
	}

	public AdminAddEditUserViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
