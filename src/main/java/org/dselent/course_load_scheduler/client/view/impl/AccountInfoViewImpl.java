package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AccountInfoViewImpl extends BaseViewImpl<AccountInfoPresenter> implements AccountInfoView{

	private static AccountInfoUiBinder uiBinder = GWT.create(AccountInfoUiBinder.class);
	
	@UiField HTMLPanel rootPanel;
	@UiField TextBox AccountInfoPgTitle;
	@UiField LayoutPanel AccountInfoBaseLayoutPanel;
	@UiField Button submitChangesButton;
	
	private PasswordTextBox currPassword;
	private PasswordTextBox newPassword;
	private PasswordTextBox repeatNewPassword;
	private TextBox preferedEmail;
	private IntegerBox phoneNumber;
	
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
	
	public IntegerBox getPhoneNumber() {
		return phoneNumber;
	}
	
	interface AccountInfoUiBinder extends UiBinder<Widget, AccountInfoViewImpl> {
	}
	
	public AccountInfoViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		
	    FlexTable t = new FlexTable();
	    currPassword = new PasswordTextBox();
	    newPassword = new PasswordTextBox();
	    repeatNewPassword = new PasswordTextBox();
	    preferedEmail = new TextBox();
	    phoneNumber = new IntegerBox();

	    // Create the text fields (This table is a 10x10)
	    t.setText(0, 0, "Your username is:");
	    t.setText(1, 0, "Your WPI email is:");
	    t.setText(2, 0, "Your minimum teaching requirement (course hours) is:");
	    t.setText(6, 0, "Change password:");
	    t.setText(8, 0, "Prefered email (optional):");
	    t.setText(10, 0, "Phone number (optional):");
	    
	    // Create the widgets
	    t.setWidget(6, 2, currPassword);
	    t.setWidget(6, 3, newPassword);
	    t.setWidget(6, 4, repeatNewPassword);
	    
	    t.setWidget(8, 2, preferedEmail);
	    t.setWidget(10, 2, phoneNumber);
	    
	    // ...and set it's column span so that it takes up the whole row.
	    t.getFlexCellFormatter().setColSpan(1, 0, 3);

	    RootPanel.get().add(t);
	}

	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return rootPanel;
	}
	
	@Override
	public void setPresenter(AccountInfoPresenter presenter)
	{
		this.presenter = presenter;
	}
	
	
}
