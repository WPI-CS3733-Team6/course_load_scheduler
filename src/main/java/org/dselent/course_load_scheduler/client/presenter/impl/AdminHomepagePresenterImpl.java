package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.GoToAccoutInfoAction;
import org.dselent.course_load_scheduler.client.action.GoToAddCourseAction;
import org.dselent.course_load_scheduler.client.action.GoToAddEditUserAction;
import org.dselent.course_load_scheduler.client.action.GoToCartAction;
import org.dselent.course_load_scheduler.client.action.GoToClassSearchAction;
import org.dselent.course_load_scheduler.client.action.GoToCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event.GoToAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.GoToAddCourseEvent;
import org.dselent.course_load_scheduler.client.event.GoToAddEditUserEvent;
import org.dselent.course_load_scheduler.client.event.GoToCartEvent;
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
	private HasWidgets container = parentPresenter.getView().getViewRootPanel();
	
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
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getAddCourse().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//event and checking
			
			GoToAddCourseAction gaca = new GoToAddCourseAction();
			GoToAddCourseEvent gace = new GoToAddCourseEvent(gaca);
			eventBus.fireEvent(gace);
			
		}
	}

	@Override
	public void goToAddUser() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getAddUser().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//event and checking
			
			GoToAddEditUserAction gaeua = new GoToAddEditUserAction();
			GoToAddEditUserEvent gaeue = new GoToAddEditUserEvent(gaeua);
			eventBus.fireEvent(gaeue);
			
		}
	}

	@Override
	public void goToAcctInfo() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getAccountInfoButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			GoToAccoutInfoAction gaa = new GoToAccoutInfoAction();
			GoToAccountInfoEvent gae = new GoToAccountInfoEvent(gaa);
			eventBus.fireEvent(gae);
			
		}
	}

	@Override
	public void goToEditUser() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getEditUser().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//event and checking
			
			GoToAddEditUserAction gaeua = new GoToAddEditUserAction();
			GoToAddEditUserEvent gaeue = new GoToAddEditUserEvent(gaeua);
			eventBus.fireEvent(gaeue);
			
		}
	}

	@Override
	public void goToModifyCourse() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getModifyCourse().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//event and checking
			
		}
	}
/*
	@Override
	public void goToGeneratedCompleteDepartmentSchedule() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getGeneratedCompleteDepartmentSchedule().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//event and checking
			
		}
	}
*/
	@Override
	public void goToCurrentClasses() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getCurrentClassesButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			GoToCurrentCoursesAction gcca = new GoToCurrentCoursesAction();
			GoToCurrentCoursesEvent gcce = new GoToCurrentCoursesEvent(gcca, container);
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
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getCourseRegistrationCart().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			GoToCartAction gca = new GoToCartAction();
			GoToCartEvent gce = new GoToCartEvent(gca);
			eventBus.fireEvent(gce);
			
		}
	}
}
