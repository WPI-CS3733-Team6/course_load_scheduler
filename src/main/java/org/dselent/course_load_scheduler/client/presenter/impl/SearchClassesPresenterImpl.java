package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.CourseSearchAction;
import org.dselent.course_load_scheduler.client.event.CourseSearchEvent;
import org.dselent.course_load_scheduler.client.event.GoToClassSearchEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.SearchClassesPresenter;
import org.dselent.course_load_scheduler.client.view.SearchClassesView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;


public class SearchClassesPresenterImpl extends BasePresenterImpl implements SearchClassesPresenter
{
	private IndexPresenter parentPresenter;
	private SearchClassesView view;
	private Boolean searchClickInProgress;

	@Inject
	public SearchClassesPresenterImpl(IndexPresenter parentPresenter, SearchClassesView view)
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
		
		registration = eventBus.addHandler(GoToClassSearchEvent.TYPE, this);
		eventBusRegistration.put(GoToClassSearchEvent.TYPE, registration);

	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public SearchClassesView getView()
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
	public void searchCourses() {
		if(!searchClickInProgress) {
			searchClickInProgress = true;
			view.getSearchButton().setEnabled(false);
			
			String term = view.getTerm().getItemText(view.getTerm().getSelectedIndex());
			String department = view.getSubject().getItemText(view.getSubject().getSelectedIndex());
			String level = view.getLevel().getItemText(view.getLevel().getSelectedIndex());
			
			HasWidgets container = parentPresenter.getView().getMiddlePanel();
			CourseSearchAction csa = new CourseSearchAction(department, term, level);
			CourseSearchEvent cse = new CourseSearchEvent(csa, container);
			eventBus.fireEvent(cse);
		}
	}
	
	@Override
	public void onGoToClassSearch(GoToClassSearchEvent evt) {
		this.go(evt.getContainer());
	}
}
