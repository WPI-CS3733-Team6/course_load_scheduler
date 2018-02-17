/**
 * 
 */
package org.dselent.course_load_scheduler.client.presenter.impl;


import org.dselent.course_load_scheduler.client.presenter.BasePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.InstructorHomepagePresenter;
import org.dselent.course_load_scheduler.client.view.BaseView;
import org.dselent.course_load_scheduler.client.view.InstructorHomepageView;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

/**
 * @author bobbyshome
 *
 */
public class InstructorHompagePresenterImpl extends BasePresenterImpl implements InstructorHomepagePresenter {
	
	private IndexPresenter parentPresenter;
	private InstructorHomepageView view;
	private boolean clickInProgress;

	/**
	 * 
	 */
	@Inject
	public InstructorHompagePresenterImpl(IndexPresenter parentPresenter, InstructorHomepageView view) {
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		clickInProgress = false;
	}

	/* (non-Javadoc)
	 * @see org.dselent.course_load_scheduler.client.presenter.BasePresenter#go(com.google.gwt.user.client.ui.HasWidgets)
	 */
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.getWidgetContainer());
	}

	/* (non-Javadoc)
	 * @see org.dselent.course_load_scheduler.client.presenter.BasePresenter#getView()
	 */
	@Override
	public InstructorHomepageView getView() {
		return view;
	}

	/**
	 * @return the parentPresenter
	 */
	public IndexPresenter getParentPresenter() {
		return parentPresenter;
	}

	/**
	 * @param parentPresenter the parentPresenter to set
	 */
	public void setParentPresenter(IndexPresenter parentPresenter) {
		this.parentPresenter = parentPresenter;
	}
	
	public void currentClasses() {
		
	}
	
	public void classSearch() {
		
	}
	
	public void accountInfo() {
		
	}
	
	public void courseCart() {
		
	}
	
	public void createRequest() {
		
	}
	
	public void generateSchedule() {
		
	}
	
}
