package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dselent.course_load_scheduler.client.action.InvalidReportAction;
import org.dselent.course_load_scheduler.client.action.SubmitReportAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidReportStrings;
import org.dselent.course_load_scheduler.client.event.InvalidReportEvent;
import org.dselent.course_load_scheduler.client.event.SubmitReportEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.ReportProblemPresenter;
import org.dselent.course_load_scheduler.client.view.ReportProblemView;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReportProblemPresenterImpl extends BasePresenterImpl implements ReportProblemPresenter {
	
	private IndexPresenter parentPresenter;
	private ReportProblemView view;
	private boolean submitClickInProgress;
	
	@Inject
	public ReportProblemPresenterImpl(IndexPresenter parentPresenter, ReportProblemView view) {
		this.view = view;
		view.setPresenter(this);
		this.parentPresenter = parentPresenter;
		submitClickInProgress = false;
	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());

	}
	
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}
	
	public void setParentPresenter(IndexPresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}

	@Override
	public ReportProblemView getView() {
		return view;
	}
	/* not sure why this is here, commenting for now, possibly forever
	@Override
	public Model getModel()
	{
		return null;
	}
	*/
	public void submitReport() {
		if(!submitClickInProgress) {
			submitClickInProgress = true;
			view.getSubmitButton().setEnabled(false);
			
			parentPresenter.showLoadScreen();
			
			String typeList = view.getTypeList().getItemText(view.getTypeList().getSelectedIndex());
			String nameBox = view.getNameBox().getText();
			String emailBox = view.getEmailBox().getText();
			String description = view.getDescriptionArea().getText();
			
			boolean validType = true;
			boolean validDescription = true;
			
			List<String> invalidReasonList = new ArrayList<>();
			
			try {
				validateReportType(typeList);
			}
			catch(EmptyStringException e) {
				invalidReasonList.add(InvalidReportStrings.NULL_TYPE);
				validType = false;
			}
			
			try {
				validateReportDesc(description);
			}
			catch(EmptyStringException e) {
				invalidReasonList.add(InvalidReportStrings.NULL_DESC);
				validDescription = false;
			}
			
			if(validType && validDescription) {
				sendReport(typeList, nameBox, emailBox, description);
				submitClickInProgress = false;
			} else {
				InvalidReportAction ira = new InvalidReportAction(invalidReasonList);
				InvalidReportEvent ire = new InvalidReportEvent(ira);
				eventBus.fireEvent(ire);
				submitClickInProgress = false;
			}
		}
	}
	
	private void sendReport(String type, String name, String email, String desc) {
		//write in actions and event handling gubbins
		HasWidgets container = parentPresenter.getView().getViewRootPanel();
		SubmitReportAction sra = new SubmitReportAction(name, email, type, desc);
		SubmitReportEvent sre = new SubmitReportEvent(sra, container);
		eventBus.fireEvent(sre);
	}
	
	private void validateReportType(String type) throws EmptyStringException {
		checkEmptyString(type);
	}
	
	private void validateReportDesc(String desc) throws EmptyStringException {
		checkEmptyString(desc);
	}
	
	private void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
	}

}
