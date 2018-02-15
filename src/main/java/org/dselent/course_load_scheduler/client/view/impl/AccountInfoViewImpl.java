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
	// I'm not sure how to use this but this might be necessary
	// @UiField Button SubmitChangesButton 
	
	public Button submitChangesButton = new Button("Submit Changes");
	public PasswordTextBox currPassword = new PasswordTextBox();
	public PasswordTextBox newPassword = new PasswordTextBox();
	public PasswordTextBox repeatNewPassword = new PasswordTextBox();
	public TextBox preferedEmail = new TextBox();
	public TextBox phoneNumber = new TextBox();
	
	public Button getSubmitChangesButton() {
		return submitChangesButton;
	}
	
	public PasswordTextBox getCurrPassword() {
		return currPassword;
	}
	
	public PasswordTextBox getNewPassword() {
		return newPassword;
	}
	
	public PasswordTextBox getRepeatNewPassword() {
		return repeatNewPassword;
	}
	
	public TextBox getPreferedEmail() {
		return preferedEmail;
	}
	
	public TextBox getPhoneNumber() {
		return phoneNumber;
	}
	
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
	    t.setWidget(6, 2, currPassword);
	    t.setWidget(6, 3, newPassword);
	    t.setWidget(6, 4, repeatNewPassword);
	    
	    t.setWidget(8, 2, preferedEmail);
	    t.setWidget(10, 2, phoneNumber);
	    t.setWidget(10, 10, submitChangesButton);
	    
	    // ...and set it's column span so that it takes up the whole row.
	    t.getFlexCellFormatter().setColSpan(1, 0, 3);

	    RootPanel.get().add(t);
	}
	
	
}
