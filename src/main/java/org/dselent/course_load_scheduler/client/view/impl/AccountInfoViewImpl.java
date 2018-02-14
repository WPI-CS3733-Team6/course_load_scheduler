package org.dselent.course_load_scheduler.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.FlexTable;

public class AccountInfoViewImpl extends Composite {

	private static AccountInfoUiBinder uiBinder = GWT.create(AccountInfoUiBinder.class);
	@UiField TextBox AccountInfoPgTitle;
	@UiField LayoutPanel AccountInfoBaseLayoutPanel;

	interface AccountInfoUiBinder extends UiBinder<Widget, AccountInfoViewImpl> {
	}

	public AccountInfoViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		
	    FlexTable t = new FlexTable();

	    // Create the text fields (This table is a 10x10)
	    t.setText(0, 0, "Your username is:");
	    t.setText(1, 0, "Your WPI email is:");
	    t.setText(2, 0, "Your minimum eaching requirment (course hours) is:");
	    t.setText(6, 0, "Change password:");
	    t.setText(8, 0, "Prefered email (optional):");
	    t.setText(10, 0, "Phone number (optional):");

	    // Create the widgets
	    t.setWidget(6, 2, new PasswordTextBox()); // Enter current password
	    t.setWidget(6, 3, new PasswordTextBox()); // Enter new password
	    t.setWidget(6, 4, new PasswordTextBox()); //Repeat new password
	    
	    t.setWidget(8, 2, new TextBox()); // Preferred email
	    t.setWidget(10, 2, new TextBox()); // Phone Number
	    t.setWidget(10, 10, new Button("Submit Changes")); // Submit Changes

	    // ...and set it's column span so that it takes up the whole row.
	    t.getFlexCellFormatter().setColSpan(1, 0, 3);

	    RootPanel.get().add(t);
	}
	
	
}
