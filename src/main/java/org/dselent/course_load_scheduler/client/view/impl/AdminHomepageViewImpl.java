package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.DecoratedTabPanel;

public class AdminHomepageViewImpl extends Composite {

	private static AdminHomepageViewImplUiBinder uiBinder = GWT.create(AdminHomepageViewImplUiBinder.class);
	@UiField LayoutPanel layoutPanel;
	@UiField HTMLPanel adminHomepageView;

	interface AdminHomepageViewImplUiBinder extends UiBinder<Widget, AdminHomepageViewImpl> {
	}

	public AdminHomepageViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
