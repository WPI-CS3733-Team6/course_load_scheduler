package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.LayoutPanel;

public class AdminAdvancedCourseSearchViewImpl extends Composite {

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
	@UiField Button addCourseButton;
	@UiField FlexTable resultList;
	@UiField LayoutPanel resultPanel;
	@UiField LayoutPanel searchPanel;

}
