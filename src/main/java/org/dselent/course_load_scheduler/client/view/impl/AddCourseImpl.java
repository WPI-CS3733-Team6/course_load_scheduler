package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;

public class AddCourseImpl extends Composite{

	private static AddCourseImplUiBinder uiBinder = GWT.create(AddCourseImplUiBinder.class);
	@UiField TextBox courseNumberHeader;
	@UiField TextBox courseNameHeader;
	@UiField TextBox instanceNumberHeader;
	@UiField TextBox statusHeader;

	interface AddCourseImplUiBinder extends UiBinder<Widget, AddCourseImpl> {
	}

	public AddCourseImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
