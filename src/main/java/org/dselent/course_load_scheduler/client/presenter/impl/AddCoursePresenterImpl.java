package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.AddCourseAction;
import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.AddCoursePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AddCourseView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AddCoursePresenterImpl extends BasePresenterImpl implements AddCoursePresenter{

	private IndexPresenter parentPresenter;
	private AddCourseView view;
	//don't know what clickInProgress means, but it's here because it's in LoginPresenterImpl
	private boolean addCourseClickInProgress;
	
	@Inject
	public AddCoursePresenterImpl(IndexPresenter parentPresenter, AddCourseView view)
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
	public AddCourseView getView()
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
	public void addCourse() {
		if (!addCourseClickInProgress) {
			addCourseClickInProgress = false;
			view.getSaveCourseButton().setEnabled(false);
			
			sendAddCourseAction(view.getCourseNumberField().getText(), 
					view.getCourseNameField().getText(),
					view.getInstanceNumberField().getText(), 
					view.getCourseDescField().getText(), 
					view.getStatusField().getText());
		}
		
	}
	
	public void sendAddCourseAction(String number, String name, String level, String description, String status){
		AddCourseAction aca = new AddCourseAction(number, name, level, description, status);
		AddCourseEvent ace = new AddCourseEvent(aca);
		eventBus.fireEvent(ace);
	}

}
