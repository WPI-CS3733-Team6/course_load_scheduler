package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.GoToAccountInfoAction;
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
import org.dselent.course_load_scheduler.client.presenter.AdminHomepagePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminHomepageView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminHomepagePresenterImpl extends BasePresenterImpl implements AdminHomepagePresenter{
	private IndexPresenter parentPresenter;
	private AdminHomepageView view;
	private boolean clickInProgress;
	private HasWidgets container = parentPresenter.getView().getCenterPanel();
	
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
			
			//TODO course ID
			
			GoToAddCourseAction gaca = new GoToAddCourseAction();
			GoToAddCourseEvent gace = new GoToAddCourseEvent(gaca, container);
			eventBus.fireEvent(gace);
			
		}
	}

	@Override
	public void goToAddUser() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getAddUser().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//TODO User ID?
			
			GoToAddEditUserAction gaeua = new GoToAddEditUserAction();
			GoToAddEditUserEvent gaeue = new GoToAddEditUserEvent(gaeua, container);
			eventBus.fireEvent(gaeue);
			
		}
	}

	@Override
	public void goToAcctInfo() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getAccountInfoButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//TODO User ID?
			
			GoToAccountInfoAction gaa = new GoToAccountInfoAction();
			GoToAccountInfoEvent gae = new GoToAccountInfoEvent(gaa, container);
			eventBus.fireEvent(gae);
			
		}
	}

	@Override
	public void goToEditUser() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getEditUser().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//TODO User ID?
			
			GoToAddEditUserAction gaeua = new GoToAddEditUserAction();
			GoToAddEditUserEvent gaeue = new GoToAddEditUserEvent(gaeua, container);
			eventBus.fireEvent(gaeue);
			
		}
	}

	@Override
	public void goToModifyCourse() {
		if(!clickInProgress) {
			
			clickInProgress = true;
			view.getModifyCourse().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			//TODO how to get course num
			/*
			GoToEditCourseAction gaeca = new GoToEditCourseAction( XXXX );
			GoToEditCourseEvent gaece = new GoToEditCourseEvent(gaeca);
			eventBus.fireEvent(gaece);
			*/
		}
	}
	
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
			GoToClassSearchEvent gcse = new GoToClassSearchEvent(gcsa, container);
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
			GoToCartEvent gce = new GoToCartEvent(gca, container);
			eventBus.fireEvent(gce);
			
		}
	}
}
