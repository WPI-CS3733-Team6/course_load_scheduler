package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.UpdateAccountAction;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;
import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AccountInfoPresenterImpl extends BasePresenterImpl implements AccountInfoPresenter{
	
	private IndexPresenter parentPresenter;
	private AccountInfoView view;
	//don't know what clickInProgress means, but it's here because it's in LoginPresenterImpl
	private boolean accountInfoClickInProgress;
	
	@Inject
	public AccountInfoPresenterImpl(IndexPresenter parentPresenter, AccountInfoView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		accountInfoClickInProgress = false;
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidLoginEvent.TYPE, this);
		eventBusRegistration.put(InvalidLoginEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public AccountInfoView getView()
	{
		return view;
	}
	
	@Override
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}
	
	public void changeAccountInfo() {
		//TODO: add checks for valid inputs: (@wpi.edu, phoneNum is a number), also add exceptions
		if (!accountInfoClickInProgress) 
		{
			accountInfoClickInProgress = true;
			view.getSubmitChangesButton().setEnabled(false);
			
			String currentPassword = view.getCurrPassword().getValue();
			String newPassword = view.getNewPassword().getValue();
			String repeatPassword= view.getRepeatNewPassword().getValue();
			String preferedEmail = view.getPreferedEmail().getValue();
			Integer phoneNumber = view.getPhoneNumber().getValue();
			boolean isPasswordValid;
			boolean repeatIsCorrect;
			boolean validEmail;
			
			//Check if fields either pass requirements or are empty
			if (newPassword.compareTo("") == 0 && repeatPassword.compareTo("") == 0 ) {
				isPasswordValid = true;
				repeatIsCorrect = true;
			}
			
			if (preferedEmail.compareTo("") == 0)
				validEmail = true;
			
			isPasswordValid = isPasswordValid(newPassword);
			repeatIsCorrect = isRepeatCorrect(view.getNewPassword().getValue(), view.getRepeatNewPassword().getValue());
			validEmail = view.getPreferedEmail().getValue().endsWith("@wpi.edu");	//email ends with "@wpi.edu"
			
			if(isPasswordValid && repeatIsCorrect && validEmail) {
				updateInfo(currentPassword, newPassword, preferedEmail, phoneNumber);
			}
			else {
				//TODO throw expection
				}
		}
	}
	
	//Passing these in, some can be null, if so, service layer will find out
	public void updateInfo (String currentPassword, String newPassword, String newEmail, Integer newPhoneNum) {
		UpdateAccountAction uaa = new UpdateAccountAction(currentPassword, newPassword, newEmail, newPhoneNum);
		UpdateAccountEvent uae = new UpdateAccountEvent(uaa);
		eventBus.fireEvent(uae);
	}
	
	private boolean isRepeatCorrect(String newPassword, String repeatPassword){
		if (newPassword.equals(repeatPassword))
			return true;
		else
			return false;
	}

	private boolean isPasswordValid(String newPassword) {
		if (newPassword.length() > 4)
			return true;
		else
			return false;
	}
}
