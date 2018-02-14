package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class AccountInfoViewImpl extends Composite {

	private static AccountInfoUiBinder uiBinder = GWT.create(AccountInfoUiBinder.class);
	@UiField VerticalPanel VerticalPanel;

	interface AccountInfoUiBinder extends UiBinder<Widget, AccountInfoViewImpl> {
	}

	public AccountInfoViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
