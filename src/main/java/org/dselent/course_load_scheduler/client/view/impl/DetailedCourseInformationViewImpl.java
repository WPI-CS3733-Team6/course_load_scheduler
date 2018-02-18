package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class DetailedCourseInformationViewImpl extends Composite {

	private static DetailedCourseInformationViewImplUiBinder uiBinder = GWT
			.create(DetailedCourseInformationViewImplUiBinder.class);
	@UiField TextBox description;
	@UiField Button submitToCartButton;
	@UiField Button returnToSearchButton;
	@UiField LayoutPanel LayoutPanel;
	@UiField HTMLPanel rootPanel;

	interface DetailedCourseInformationViewImplUiBinder extends UiBinder<Widget, DetailedCourseInformationViewImpl> {
	}

	public DetailedCourseInformationViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
