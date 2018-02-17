package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.ViewCurrentCoursesPresenter;
import org.dselent.course_load_scheduler.client.view.ViewCurrentCoursesView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class ViewCurrentCoursesPresenterImpl extends BasePresenterImpl implements ViewCurrentCoursesPresenter{
	
	private IndexPresenter parentPresenter;
	private ViewCurrentCoursesView view;
	
	@Inject
	public ViewCurrentCoursesPresenterImpl(IndexPresenter parentPresenter, ViewCurrentCoursesView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		//view.setPresenter(this);
		//accountInfoClickInProgress = false;
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		//TODO Not sure what to do here... The items on the flex table will be dynamically
		//added so, i'm not sure how to create the events and such for clicking on a course. HeLp
	}
	
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}
	
	@Override
	public ViewCurrentCoursesView getView()
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
}
