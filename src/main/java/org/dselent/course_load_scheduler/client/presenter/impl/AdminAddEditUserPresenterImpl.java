package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.AddUserAction;
import org.dselent.course_load_scheduler.client.event.AddUserEvent;
import org.dselent.course_load_scheduler.client.presenter.AdminAddEditUserPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminAddEditUserView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminAddEditUserPresenterImpl extends BasePresenterImpl implements AdminAddEditUserPresenter{

	private IndexPresenter parentPresenter;
	private AdminAddEditUserView view;
	private boolean addUserClickInProgress;
	private boolean editUserClickInProgress;

	@Inject
	public AdminAddEditUserPresenterImpl(IndexPresenter parentPresenter, AdminAddEditUserView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		addUserClickInProgress = false;
		editUserClickInProgress = false;
	}

	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		//This is copied and pasted from the LoginPresenterImpl don't know how to implement it in here
//		HandlerRegistration registration;
//
//		registration = eventBus.addHandler(InvalidLoginEvent.TYPE, this);
//		eventBusRegistration.put(InvalidLoginEvent.TYPE, registration);
	}

	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public AdminAddEditUserView getView()
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

	@Override
	public void addUser() {
		
		if(!addUserClickInProgress) {
			addUserClickInProgress = false;
			view.getSubmitButton().setEnabled(false);
			
			sendAddUserAction(view.getFirstNameField().getValue(),
					view.getLastNameField().getValue(),
					view.getEmailField().getValue(),
					view.getRequirementField().getValue(),
					view.getAdminCheckBox().getValue());
		}
	}
	
	public void sendAddUserAction(String firstName, String lastName, String email, Double requirments, Boolean administrator)
	{
		AddUserAction aua = new AddUserAction(firstName, lastName, email, requirments, administrator);
		AddUserEvent aue = new AddUserEvent(aua);
		eventBus.fireEvent(aue);	
	}

	@Override
	public void editUser() {
		// TODO Auto-generated method stub *****Don't know how to do it
		
		if(!editUserClickInProgress) {
			editUserClickInProgress = false;
			//view.getEditButton().setEnabled(false);
			
			//sendEditUserAction(view.getFirstNameField().getValue(),
//			view.getLastNameField().getValue(),
//			view.getEmailField().getValue(),
//			view.getRequirementField().getValue(),
//			view.getAdminCheckBox().getValue());
		}
	}

}
