package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.AdminAdvancedCourseSearchAction;
import org.dselent.course_load_scheduler.client.event.AdminAdvancedCourseSearchEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.AdminAdvancedCourseSearchPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AdminAdvancedCourseSearchView;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AdminAdvancedCourseSearchPresenterImpl extends BasePresenterImpl implements AdminAdvancedCourseSearchPresenter{

	private IndexPresenter parentPresenter;
	private AdminAdvancedCourseSearchView view;
	private boolean searchClickInProgress;
	
	@Inject
	public AdminAdvancedCourseSearchPresenterImpl(IndexPresenter parentPresenter, AdminAdvancedCourseSearchView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		searchClickInProgress = false;
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
	public AdminAdvancedCourseSearchView getView()
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
	public void search() {
		if(!searchClickInProgress) {
			searchClickInProgress = true;
			view.getSearchButton().setEnabled(false);
			view.getAddCourseButton().setEnabled(false);
		}
		
		Integer department = view.getDepartmentList().getSelectedIndex();
		Integer term = view.getTermList().getSelectedIndex();
		Integer level = view.getLevelList().getSelectedIndex();
		String name = view.getCourseNameFieldTextBox().getText();
		
		AdminAdvancedCourseSearchAction aacsa = new AdminAdvancedCourseSearchAction(department, term, level, name);
		AdminAdvancedCourseSearchEvent aacse = new AdminAdvancedCourseSearchEvent(aacsa);
		eventBus.fireEvent(aacse);
	}

}
