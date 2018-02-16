package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class InstructorHomepageViewImpl extends Composite {

	private static InstructorHomepageUiBinder uiBinder = GWT.create(InstructorHomepageUiBinder.class);

	interface InstructorHomepageUiBinder extends UiBinder<Widget, InstructorHomepageViewImpl> {
	}

	public InstructorHomepageViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
