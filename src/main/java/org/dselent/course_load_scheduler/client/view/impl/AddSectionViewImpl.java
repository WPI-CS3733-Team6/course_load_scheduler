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
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.LayoutPanel;

public class AddSectionViewImpl extends Composite{

	private static AddSectionViewImplUiBinder uiBinder = GWT.create(AddSectionViewImplUiBinder.class);

	interface AddSectionViewImplUiBinder extends UiBinder<Widget, AddSectionViewImpl> {
	}

	public AddSectionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField TextBox courseNumberHeader;
	@UiField TextBox instanceNumberHeader;
	@UiField TextBox sectionNumberHeader;
	@UiField TextBox courseNumberField;
	@UiField TextBox instanceNumberField;
	@UiField TextBox sectionNumberField;
	@UiField TextBox expectedPopHeader;
	@UiField TextBox typeHeader;
	@UiField TextBox expectedPopField;
	@UiField TextBox typeField;
	@UiField TextBox daysHeader;
	@UiField CheckBox mondayCheck;
	@UiField CheckBox tuesdayCheck;
	@UiField CheckBox wednesdayCheck;
	@UiField CheckBox thursdayCheck;
	@UiField CheckBox fridayCheck;
	@UiField Label timeStartSeparator;
	@UiField Label timeEndSeparator;
	@UiField TextBox startMinutesField;
	@UiField TextBox startHoursField;
	@UiField TextBox endMinutesField;
	@UiField TextBox endHoursField;
	@UiField Button saveButton;
	@UiField Button deleteButton;
	@UiField Button backButton;
	@UiField LayoutPanel saveDeletePanel;
	@UiField LayoutPanel detailsPanel;
	@UiField LayoutPanel sectionInfoPanel;
}
