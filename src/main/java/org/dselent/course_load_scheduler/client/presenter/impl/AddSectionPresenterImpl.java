package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.AddSectionAction;
import org.dselent.course_load_scheduler.client.action.DeleteSectionAction;
import org.dselent.course_load_scheduler.client.action.GoToEditInstanceAction;
import org.dselent.course_load_scheduler.client.event.AddSectionEvent;
import org.dselent.course_load_scheduler.client.event.DeleteSectionEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditInstanceEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.AddSectionPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AddSectionView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AddSectionPresenterImpl extends BasePresenterImpl implements AddSectionPresenter{

	private IndexPresenter parentPresenter;
	private AddSectionView view;
	private boolean saveClickInProgress;
	private boolean backClickInProgress;
	private boolean deleteClickInProgress;

	@Inject
	public AddSectionPresenterImpl(IndexPresenter parentPresenter, AddSectionView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		saveClickInProgress = false;
		backClickInProgress = false;
		deleteClickInProgress = false;
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
	public AddSectionView getView()
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
	public void addSection() {
		if (!saveClickInProgress) {
			saveClickInProgress = false;
			view.getSaveButton().setEnabled(false);

			Integer expectedPop = view.getExpectedPopField().getValue();
			String lectureType = view.getTypeField().getText();
			String days = "";
			if (view.getMondayCheck().getValue()) {
				days = days + "m";
			}
			if (view.getTuesdayCheck().getValue()) {
				days = days + "t";
			}
			if (view.getWednesdayCheck().getValue()) {
				days = days + "w";
			}
			if (view.getThursdayCheck().getValue()) {
				days = days + "r";
			}
			if (view.getFridayCheck().getValue()) {
				days = days + "f";
			}
			Integer timeStart = (view.getStartHoursField().getValue()*100) + view.getStartMinutesField().getValue();
			Integer timeEnd = (view.getEndHoursField().getValue()*100) + view.getEndMinutesField().getValue();

			sendAddSection (expectedPop, lectureType, days, timeStart, timeEnd);
		}

	}

	private void sendAddSection (Integer expectedPop, String lectureType, String days, Integer timeStart, Integer timeEnd) {
		AddSectionAction asa = new AddSectionAction(expectedPop, lectureType, days, timeStart, timeEnd);
		AddSectionEvent ase = new AddSectionEvent(asa);
		eventBus.fireEvent(ase);
	}

	public void deleteSection() {
		if (!deleteClickInProgress) {
			deleteClickInProgress = false;
			view.getSaveButton().setEnabled(false);
			
			String courseNum = view.getCourseNumberField().getValue();
			Integer instanceNum = view.getInstanceNumberField().getValue();
			Integer sectionNum = view.getSectionNumberField().getValue();

			DeleteSectionAction dsa = new DeleteSectionAction(courseNum, instanceNum, sectionNum);
			DeleteSectionEvent dse = new DeleteSectionEvent(dsa);
			eventBus.fireEvent(dse);
		}
	}

	public void goToInstanceEdit() {
		
		//How to implement this method???
		//server side or client side 
		if(!saveClickInProgress) {
			saveClickInProgress = false;
			view.getSaveButton().setEnabled(false);
			
		//String courseNum = view.getCourseNumberField().getValue();
		Integer instanceNum = view.getInstanceNumberField().getValue();

		GoToEditInstanceAction eia = new GoToEditInstanceAction(instanceNum);
		GoToEditInstanceEvent eie = new GoToEditInstanceEvent(eia);
		eventBus.fireEvent(eie);
		}
	}
	
	public void backButton() {
		if(!backClickInProgress){
			backClickInProgress = false;
			view.getBackButton().setEnabled(false);
			
			//Ask professor how to create back button
			//InstanceViewImpl
			
		}
	}
}