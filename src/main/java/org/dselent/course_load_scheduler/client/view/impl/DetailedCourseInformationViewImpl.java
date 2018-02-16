package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextBox;

public class DetailedCourseInformationViewImpl extends Composite {

	private static DetailedCourseInformationViewImplUiBinder uiBinder = GWT
			.create(DetailedCourseInformationViewImplUiBinder.class);
	@UiField TextBox Registration_Status;
	@UiField TextBox Course_Name;
	@UiField TextBox Course_Number;
	@UiField TextBox Level;
	@UiField TextBox Section_Id;
	@UiField TextBox Section_Type;
	@UiField TextBox Schedule_Days;
	@UiField TextBox description;

	interface DetailedCourseInformationViewImplUiBinder extends UiBinder<Widget, DetailedCourseInformationViewImpl> {
	}

	public DetailedCourseInformationViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
