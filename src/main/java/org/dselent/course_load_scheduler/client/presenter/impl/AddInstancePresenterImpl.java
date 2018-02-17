package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.AddInstanceAction;
import org.dselent.course_load_scheduler.client.action.InvalidInstanceAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidInstanceStrings;
import org.dselent.course_load_scheduler.client.event.AddInstanceEvent;
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
	public void addInstance() {
		
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
	
}
