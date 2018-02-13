package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;

public class HomepageViewImpl extends Composite {

	private static HomepageViewImplUiBinder uiBinder = GWT.create(HomepageViewImplUiBinder.class);
	@UiField VerticalPanel BasePanel;
	@UiField HorizontalSplitPanel PanelPanel;

	interface HomepageViewImplUiBinder extends UiBinder<Widget, HomepageViewImpl> {
	}

	public HomepageViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
