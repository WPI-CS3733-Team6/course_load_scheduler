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
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class SearchClassesViewImpl extends Composite {

	private static SearchClassesViewImplUiBinder uiBinder = GWT.create(SearchClassesViewImplUiBinder.class);
	@UiField ListBox semester;
	@UiField ListBox subject;
	@UiField Button searchButton;
	@UiField ListBox level;
	@UiField Grid gridCourses;
	@UiField ScrollPanel scrollPanel;
	@UiField LayoutPanel bottomPanel;
	@UiField HTMLPanel rootPanel;
	@UiField LayoutPanel topPanel;

	interface SearchClassesViewImplUiBinder extends UiBinder<Widget, SearchClassesViewImpl> {
	}

	public SearchClassesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
