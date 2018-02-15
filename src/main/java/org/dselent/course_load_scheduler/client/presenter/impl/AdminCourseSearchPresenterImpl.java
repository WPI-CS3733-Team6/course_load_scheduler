package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.AdminCourseSearchAction;
import org.dselent.course_load_scheduler.client.action.UpdateAccountAction;
import org.dselent.course_load_scheduler.client.event.AdminCourseSearchEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;
import org.dselent.course_load_scheduler.client.presenter.AdminCourseSearchPresenter;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;
import org.dselent.course_load_scheduler.client.view.AdminCourseSearchView;
import org.dselent.course_load_scheduler.client.view.BaseView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminCourseSearchPresenterImpl extends BasePresenterImpl implements AdminCourseSearchPresenter{
	
	private IndexPresenter parentPresenter;
	private AdminCourseSearchView view;
	//don't know what clickInProgress means, but it's here because it's in LoginPresenterImpl
	private boolean adminCourseSearchClickInProgress;
	
	@Inject
	public AdminCourseSearchPresenterImpl(IndexPresenter parentPresenter, AdminCourseSearchView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		adminCourseSearchClickInProgress = false;
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
	public AdminCourseSearchView getView()
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
	public void adminCourseSearch() {
		if (!adminCourseSearchClickInProgress) {
			adminCourseSearchClickInProgress = true;
			view.getSearchButton().setEnabled(false);
			
			String subject = view.getCourseList().toString();
			String term = view.getSemesterList().toString();
			
			
		}
		
	}
	
	public void adminCourseSearch(String subject, String term) {
		AdminCourseSearchAction acsa = new AdminCourseSearchAction(subject, term);
		AdminCourseSearchEvent asce = new AdminCourseSearchEvent(acsa);
		//eventBus.fireEvent(acsa);
	}

}
