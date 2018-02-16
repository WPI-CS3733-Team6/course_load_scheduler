package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;

public class AdvancedSearchClassesImpl extends Composite {

	private static AdvancedSearchClassesImplUiBinder uiBinder = GWT.create(AdvancedSearchClassesImplUiBinder.class);
	@UiField Button search;
	@UiField ListBox Level;
	@UiField ListBox Days;
	@UiField ListBox Type;
	@UiField ListBox Location;
	@UiField ListBox Capacity;
	@UiField ListBox Subject;
	@UiField ListBox Semester;
	@UiField ListBox Schedule_Days;
	@UiField ListBox Expected_Population;

	interface AdvancedSearchClassesImplUiBinder extends UiBinder<Widget, AdvancedSearchClassesImpl> {
	}

	public AdvancedSearchClassesImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
	}
}
