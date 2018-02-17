package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminAddEditUserPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminAddEditUserView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminAddEditUserPresenterImpl extends BasePresenterImpl implements AdminAddEditUserPresenter{

	private IndexPresenter parentPresenter;
	private AdminAddEditUserView view;
	//don't know what clickInProgress means, but it's here because it's in LoginPresenterImpl
	private boolean addCourseClickInProgress;

	@Inject
	public AdminAddEditUserPresenterImpl(IndexPresenter parentPresenter, AdminAddEditUserView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		addCourseClickInProgress = false;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editUser() {
		// TODO Auto-generated method stub
		
	}

}
