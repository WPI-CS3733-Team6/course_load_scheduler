package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.AddInstanceAction;
import org.dselent.course_load_scheduler.client.action.CreateSectionAction;
import org.dselent.course_load_scheduler.client.action.DeleteInstanceAction;
import org.dselent.course_load_scheduler.client.action.GoToEditCourseAction;
import org.dselent.course_load_scheduler.client.action.GoToEditSectionAction;
import org.dselent.course_load_scheduler.client.action.InvalidInstanceAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidInstanceStrings;
import org.dselent.course_load_scheduler.client.event.AddInstanceEvent;
import org.dselent.course_load_scheduler.client.event.CreateSectionEvent;
import org.dselent.course_load_scheduler.client.event.DeleteInstanceEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditCourseEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditSectionEvent;
import org.dselent.course_load_scheduler.client.event.InvalidInstanceEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.AddInstancePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AddInstanceView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AddInstancePresenterImpl extends BasePresenterImpl implements AddInstancePresenter{
	
	private IndexPresenter parentPresenter;
	private AddInstanceView view;
	private boolean addInstanceClickInProgress;
	
	@Inject
	public AddInstancePresenterImpl(IndexPresenter parentPresenter, AddInstanceView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		addInstanceClickInProgress = false;
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
	public AddInstanceView getView()
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
	public void saveInstance() {
		
		if(!addInstanceClickInProgress) {
			
			addInstanceClickInProgress = false;
			view.getSaveButton().setEnabled(false);
			parentPresenter.showLoadScreen();
			
			String number = view.getCourseNumberField().getText();
			Integer instanceNum = view.getInstanceNumberField().getValue();
			Integer term = view.getTermList().getSelectedIndex();
			
			boolean validNumber = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try {
				validateCourseNum(number);
			}
			catch(EmptyStringException e) {
				//add error
				invalidReasonList.add(InvalidInstanceStrings.NULL_NUMBER);
				validNumber = false;
			}
			
			if(validNumber) {
				AddInstanceAction aia = new AddInstanceAction(number, instanceNum, term);
				AddInstanceEvent aie = new AddInstanceEvent(aia);
				eventBus.fireEvent(aie);
			} else {
				InvalidInstanceAction iia = new InvalidInstanceAction(invalidReasonList);
				InvalidInstanceEvent iie = new InvalidInstanceEvent(iia);
				eventBus.fireEvent(iie);
			}
			
		}
		
	}
	
	private void validateCourseNum(String number) throws EmptyStringException {
		checkEmptyString(number);
	}
	
	private void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
	}

	@Override
	public void deleteInstance() {
		String courseNum = view.getCourseNumberField().getValue();
		Integer instanceNum = view.getInstanceNumberField().getValue();
		
		DeleteInstanceAction dia = new DeleteInstanceAction(courseNum, instanceNum);
		DeleteInstanceEvent die = new DeleteInstanceEvent(dia);
		eventBus.fireEvent(die);
	}

	@Override
	public void createSection() {
		String courseNum = view.getCourseNumberField().getValue();
		Integer instanceNum = view.getInstanceNumberField().getValue();
		
		CreateSectionAction dia = new CreateSectionAction(courseNum, instanceNum);
		CreateSectionEvent die = new CreateSectionEvent(dia);
		eventBus.fireEvent(die);
	}

	@Override
	public void goToEditSection() {
		String courseNum = view.getCourseNumberField().getValue();
		Integer instanceNum = view.getInstanceNumberField().getValue();
		Integer sectionNum = view.getSectionDropList().getSelectedIndex();
		
		GoToEditSectionAction dia = new GoToEditSectionAction(courseNum, instanceNum, sectionNum);
		GoToEditSectionEvent die = new GoToEditSectionEvent(dia);
		eventBus.fireEvent(die);
	}

	@Override
	public void goToEditCourse() {
		String courseNum = view.getCourseNumberField().getValue();
		
		GoToEditCourseAction dia = new GoToEditCourseAction(courseNum);
		GoToEditCourseEvent die = new GoToEditCourseEvent(dia);
		eventBus.fireEvent(die);
		
	}
	
}
