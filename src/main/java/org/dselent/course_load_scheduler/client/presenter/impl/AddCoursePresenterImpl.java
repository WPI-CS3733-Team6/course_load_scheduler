package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.AddCourseAction;
import org.dselent.course_load_scheduler.client.action.CreateInstanceAction;
import org.dselent.course_load_scheduler.client.action.DeleteCourseAction;
import org.dselent.course_load_scheduler.client.action.EditCourseAction;
import org.dselent.course_load_scheduler.client.action.GoToEditInstanceAction;
import org.dselent.course_load_scheduler.client.action.InvalidCourseAction;
import org.dselent.course_load_scheduler.client.action.InvalidCourseIdAction;
import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import org.dselent.course_load_scheduler.client.event.CreateInstanceEvent;
import org.dselent.course_load_scheduler.client.event.DeleteCourseEvent;
import org.dselent.course_load_scheduler.client.event.EditCourseEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditInstanceEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCourseEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCourseIdEvent;
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
	
	@Inject
	public AddCoursePresenterImpl(IndexPresenter parentPresenter, AddCourseView view)
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
	public void saveCourse() {
		String name = view.getCourseNameField().getValue();
		String number = view.getCourseNumberField().getValue();
		String type = view.getTypeField().getValue();
		Integer level = view.getLevelList().getSelectedIndex();
		String department = view.getDepartmentField().getValue();
		String description = view.getCourseDescField().getValue();
		Integer courseId = view.getCourseIdField().getValue();
		
		if (number == "" || name == "" || type == "" || number == null || name == null || type == null) {
			InvalidCourseAction ica = new InvalidCourseAction();
			InvalidCourseEvent ice = new InvalidCourseEvent(ica);
			eventBus.fireEvent(ice);
		}
		
		if (courseId == 0) {
			AddCourseAction aca = new AddCourseAction(name, number, type, level, department, description);
			AddCourseEvent ace = new AddCourseEvent(aca);
			eventBus.fireEvent(ace);
		}
		
		else {
			EditCourseAction eca = new EditCourseAction(name, number, type, level, department, description, courseId);
			EditCourseEvent ece = new EditCourseEvent(eca);
			eventBus.fireEvent(ece);
		}
	}
	
	public void deleteCourse() {
		Integer courseId = view.getCourseIdField().getValue();
		
		if (courseId == 0) {
			InvalidCourseIdAction icia = new InvalidCourseIdAction();
			InvalidCourseIdEvent icie = new InvalidCourseIdEvent(icia);
			eventBus.fireEvent(icie);
		} else {
			DeleteCourseAction dca = new DeleteCourseAction(courseId);
			DeleteCourseEvent dce = new DeleteCourseEvent(dca);
			eventBus.fireEvent(dce);
		}

	}
	
	public void createInstance() {
		CreateInstanceAction cia = new CreateInstanceAction();
		CreateInstanceEvent cie = new CreateInstanceEvent(cia);
		eventBus.fireEvent(cie);
	}
	
	public void editInstance() {
		Integer instance = view.getInstanceList().getSelectedIndex();
		GoToEditInstanceAction eia = new GoToEditInstanceAction(instance);
		GoToEditInstanceEvent eie = new GoToEditInstanceEvent(eia);
		eventBus.fireEvent(eie);
	}
}
