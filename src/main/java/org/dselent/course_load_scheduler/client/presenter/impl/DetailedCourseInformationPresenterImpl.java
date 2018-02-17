package org.dselent.course_load_scheduler.client.presenter.impl;

//import org.dselent.course_load_scheduler.client.action.DetailedCourseInformationAction;
//import org.dselent.course_load_scheduler.client.event.DetailedCourseInformationEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.CourseRegistrationCartPresenter;
import org.dselent.course_load_scheduler.client.presenter.DetailedCourseInformationPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.DetailedCourseInformationView;
import org.dselent.course_load_scheduler.client.view.LoginView;

//add exceptions
//
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class DetailedCourseInformationPresenterImpl extends BasePresenterImpl implements DetailedCourseInformationPresenter{

	private IndexPresenter parentPresenter;
	private DetailedCourseInformationView view;
	private boolean submitClickInProgress;

	@Inject
	public DetailedCourseInformationPresenterImpl(IndexPresenter parentPresenter, DetailedCourseInformationView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		submitClickInProgress = false;
	}

	@Override
	public void init()
	{
		bind();
	}

	//--------------------Need this method?--------------
	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(InvalidLoginEvent.TYPE, this);
		eventBusRegistration.put(InvalidLoginEvent.TYPE, registration);
	}
	//----------------------------------------
	
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public DetailedCourseInformationView getView()
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
