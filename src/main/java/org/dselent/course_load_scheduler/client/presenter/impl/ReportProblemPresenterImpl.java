package org.dselent.course_load_scheduler.client.presenter.impl;

import javax.inject.Inject;

import org.dselent.course_load_scheduler.client.model.Model;
import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.ReportProblemPresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.ReportProblemView;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReportProblemPresenterImpl extends BasePresenterImpl implements ReportProblemPresenter {
	
	private ReportProblemView view;
	
	@Inject
	public ReportProblemPresenterImpl(ReportProblemView view) {
		this.view = view;
		view.setPresenter(this);
	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());

	}

	@Override
	public ReportProblemView getView() {
		return view;
	}
	
	@Override
	public Model getModel()
	{
		return null;
	}
	
	public void submitReport() {
		
	}

	@Override
	public void showLoadScreen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hideLoadScreen() {
		// TODO Auto-generated method stub

	}

}
