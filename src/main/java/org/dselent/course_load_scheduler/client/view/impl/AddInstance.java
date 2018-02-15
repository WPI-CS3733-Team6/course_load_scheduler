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
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.LayoutPanel;

public class AddInstance extends Composite {

	private static AddInstanceUiBinder uiBinder = GWT.create(AddInstanceUiBinder.class);

	interface AddInstanceUiBinder extends UiBinder<Widget, AddInstance> {
	}

	public AddInstance() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField TextBox courseNumberHeader;
	@UiField TextBox instanceNumberHeader;
	@UiField TextBox termHeader;
	@UiField TextBox courseNumberField;
	@UiField TextBox instanceNumberField;
	@UiField ListBox termList;
	@UiField FlexTable sectionInfoList;
	@UiField ListBox sectionDropList;
	@UiField Button backButton;
	@UiField Button saveButton;
	@UiField Button deleteButton;
	@UiField LayoutPanel sectionInfoPanel;
	@UiField LayoutPanel saveDeletePanel;
	@UiField LayoutPanel instanceInfoPanel;
}
