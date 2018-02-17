package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ListBox;

public class InstructorHomepageViewImpl extends Composite {

	private static InstructorHomepageUiBinder uiBinder = GWT.create(InstructorHomepageUiBinder.class);
	@UiField HTMLPanel rootPanel;
	@UiField LayoutPanel layoutPanel;
	@UiField HorizontalPanel selectPanel;
	@UiField Button currentClassButton;
	@UiField Button classSearchButton;
	@UiField Button accountInfoButton;
	@UiField Button courseCartButton;
	@UiField Button createRequestButton;
	@UiField Button generateScheduleButton;
	@UiField HorizontalPanel headerPanel;
	@UiField SplitLayoutPanel courseInfoPanel;
	@UiField LayoutPanel bodyPanel;
	@UiField TextBox registeredHeaderBox;
	@UiField TextBox pendingHeaderBox;
	@UiField ListBox registeredCourseListBox;
	@UiField ListBox pendingCourseListBox;
	@UiField TextBox titleBox;

	interface InstructorHomepageUiBinder extends UiBinder<Widget, InstructorHomepageViewImpl> {
	}

	public InstructorHomepageViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
