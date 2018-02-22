package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.CourseCartRemoveCourseAction;
import org.dselent.course_load_scheduler.client.action.SubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event.CourseCartRemoveCourseEvent;
import org.dselent.course_load_scheduler.client.event.SubmitRegistrationCartEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.CourseRegistrationCartPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.CourseRegistrationCartView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class CourseRegistrationCartPresenterImpl extends BasePresenterImpl implements CourseRegistrationCartPresenter{
	private IndexPresenter parentPresenter;
	private CourseRegistrationCartView view;
	private boolean submitCartClickInProgress;
	
	@Inject
	public CourseRegistrationCartPresenterImpl(IndexPresenter parentPresenter, CourseRegistrationCartView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		submitCartClickInProgress = false;
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
	public CourseRegistrationCartView getView()
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
	
	public void submitCart() {
		if (!submitCartClickInProgress) {
			submitCartClickInProgress = false;
			
			view.getSubmitForApproval().setEnabled(false);
			
			sendSubmitCart();
		}
	}
	
	private void sendSubmitCart()
	{
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		SubmitRegistrationCartAction crca = new SubmitRegistrationCartAction();
		SubmitRegistrationCartEvent crce = new SubmitRegistrationCartEvent(crca, container);
		eventBus.fireEvent(crce);
	}
	
	public void removeCourse() {
		if(!submitCartClickInProgress) {
			submitCartClickInProgress = false;
			
			view.getRemoveCourse().setEnabled(false);
			
			//remove course.  should I take any arguments?
			HasWidgets container = parentPresenter.getView().getViewRootPanel();
			CourseCartRemoveCourseAction cra = new CourseCartRemoveCourseAction();
			CourseCartRemoveCourseEvent cre = new CourseCartRemoveCourseEvent(cra, container);
			eventBus.fireEvent(cre);
			
		}
	}
	
}
