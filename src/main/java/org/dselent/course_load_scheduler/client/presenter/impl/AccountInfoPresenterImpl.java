package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.UpdateAccountAction;
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
		
		registration = eventBus.addHandler(UpdateAccountEvent.TYPE, this);
		eventBusRegistration.put(UpdateAccountEvent.TYPE, registration);
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
			
			if(isPasswordValid(view.getNewPassword().toString(), view.getRepeatNewPassword().toString()));{
				updateInfo(view.getNewPassword().toString(), view.getPhoneNumber().toString(), view.getPreferedEmail().toString());
			}
		}
	}
	
	//Passing these in, some can be null, if so, service layer will find out
	public void updateInfo (String newPassword, String newEmail, String newPhoneNum) {
		UpdateAccountAction uaa = new UpdateAccountAction(newPassword, newEmail, newPhoneNum);
		UpdateAccountEvent uae = new UpdateAccountEvent(uaa);
		eventBus.fireEvent(uae);
	}
	
	public boolean isPasswordValid(String newPassword, String repeatPassword){
		if (newPassword.equals(repeatPassword))
			return true;
		else
			return false;
	}

}
