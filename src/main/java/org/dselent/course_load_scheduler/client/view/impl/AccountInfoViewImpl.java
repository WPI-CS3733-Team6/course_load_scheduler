package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AccountInfoViewImpl extends Composite {

	private static AccountInfoUiBinder uiBinder = GWT.create(AccountInfoUiBinder.class);

	interface AccountInfoUiBinder extends UiBinder<Widget, AccountInfoViewImpl> {
	}

	public AccountInfoViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
