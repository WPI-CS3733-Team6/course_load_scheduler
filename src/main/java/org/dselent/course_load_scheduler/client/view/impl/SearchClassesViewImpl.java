package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class SearchClassesViewImpl extends Composite {

	private static SearchClassesViewImplUiBinder uiBinder = GWT.create(SearchClassesViewImplUiBinder.class);
	@UiField ListBox Semester;
	@UiField Button button;
	@UiField ListBox Subject;
	@UiField ListBox Course_Name;
	@UiField ListBox Registration_Status;
	@UiField ListBox Course_Number;

	interface SearchClassesViewImplUiBinder extends UiBinder<Widget, SearchClassesViewImpl> {
	}

	public SearchClassesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
	}
}
