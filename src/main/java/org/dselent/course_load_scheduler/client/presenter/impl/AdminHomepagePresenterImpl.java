package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.GoToClassSearchAction;
import org.dselent.course_load_scheduler.client.action.GoToCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event.GoToClassSearchEvent;
import org.dselent.course_load_scheduler.client.event.GoToCurrentCoursesEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.AdminHomepagePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminHomepageView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminHomepagePresenterImpl extends BasePresenterImpl implements AdminHomepagePresenter{
	private IndexPresenter parentPresenter;
	private AdminHomepageView view;
	private boolean clickInProgress;
	
	@Inject
	public AdminHomepagePresenterImpl(IndexPresenter parentPresenter, AdminHomepageView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
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
	public AdminHomepageView getView()
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
	public void goToAddCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goToAddUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goToAcctInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goToEditUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goToModifyCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goToGeneratedCompleteDepartmentSchedule() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goToCurrentClasses() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getCurrentClassesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			GoToCurrentCoursesAction gcca = new GoToCurrentCoursesAction();
			GoToCurrentCoursesEvent gcce = new GoToCurrentCoursesEvent(gcca);
			eventBus.fireEvent(gcce);
			
		}
	}

	@Override
	public void goToSearchClasses() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getSearchClassesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			GoToClassSearchAction gcsa = new GoToClassSearchAction();
			GoToClassSearchEvent gcse = new GoToClassSearchEvent(gcsa);
			eventBus.fireEvent(gcse);
			
		}
	}

	@Override
	public void goToCart() {
		// TODO Auto-generated method stub
		
	}
}
