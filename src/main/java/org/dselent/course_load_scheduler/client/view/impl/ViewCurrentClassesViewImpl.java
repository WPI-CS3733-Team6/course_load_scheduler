package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.LayoutPanel;

public class ViewCurrentClassesViewImpl extends Composite {

	private static ViewCurrentClassesViewImplUiBinder uiBinder = GWT.create(ViewCurrentClassesViewImplUiBinder.class);
	@UiField LayoutPanel CurrentCourses;
	@UiField LayoutPanel DetailedCurrentCourses;

	interface ViewCurrentClassesViewImplUiBinder extends UiBinder<Widget, ViewCurrentClassesViewImpl> {
	}

	public ViewCurrentClassesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
