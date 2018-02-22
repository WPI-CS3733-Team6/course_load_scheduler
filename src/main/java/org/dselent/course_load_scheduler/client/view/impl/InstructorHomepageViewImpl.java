package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.InstructorHomepagePresenter;
import org.dselent.course_load_scheduler.client.view.InstructorHomepageView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class InstructorHomepageViewImpl extends BaseViewImpl<InstructorHomepagePresenter> implements InstructorHomepageView {

	private static InstructorHomepageUiBinder uiBinder = GWT.create(InstructorHomepageUiBinder.class);
	@UiField HTMLPanel rootPanel;
	@UiField LayoutPanel layoutPanel;
	@UiField HorizontalPanel selectPanel;
	@UiField Button currentClassButton;
	@UiField Button classSearchButton;
	@UiField Button accountInfoButton;
	@UiField Button courseCartButton;
	@UiField Button facultyCourseMapButton;
	@UiField HorizontalPanel headerPanel;
	@UiField SplitLayoutPanel courseInfoPanel;
	@UiField LayoutPanel bodyPanel;
	@UiField TextBox registeredHeaderBox;
	@UiField TextBox pendingHeaderBox;
	@UiField ListBox registeredCourseListBox;
	@UiField ListBox pendingCourseListBox;
	@UiField TextBox titleBox;

	interface InstructorHomepageUiBinder extends UiBinder<Widget, InstructorHomepageViewImpl> {
	}

	public InstructorHomepageViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(InstructorHomepagePresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return rootPanel;
	}
	
	//need to add the button clicks and so forth

	/**
	 * @return the layoutPanel
	 */
	public LayoutPanel getLayoutPanel() {
		return layoutPanel;
	}

	/**
	 * @param layoutPanel the layoutPanel to set
	 */
	public void setLayoutPanel(LayoutPanel layoutPanel) {
		this.layoutPanel = layoutPanel;
	}

	/**
	 * @return the headerPanel
	 */
	public HorizontalPanel getHeaderPanel() {
		return headerPanel;
	}

	/**
	 * @param headerPanel the headerPanel to set
	 */
	public void setHeaderPanel(HorizontalPanel headerPanel) {
		this.headerPanel = headerPanel;
	}

	/**
	 * @return the courseInfoPanel
	 */
	public SplitLayoutPanel getCourseInfoPanel() {
		return courseInfoPanel;
	}

	/**
	 * @param courseInfoPanel the courseInfoPanel to set
	 */
	public void setCourseInfoPanel(SplitLayoutPanel courseInfoPanel) {
		this.courseInfoPanel = courseInfoPanel;
	}

	/**
	 * @return the bodyPanel
	 */
	public LayoutPanel getBodyPanel() {
		return bodyPanel;
	}

	/**
	 * @param bodyPanel the bodyPanel to set
	 */
	public void setBodyPanel(LayoutPanel bodyPanel) {
		this.bodyPanel = bodyPanel;
	}

	/**
	 * @return the registeredCourseListBox
	 */
	public ListBox getRegisteredCourseListBox() {
		return registeredCourseListBox;
	}

	/**
	 * @param registeredCourseListBox the registeredCourseListBox to set
	 */
	public void setRegisteredCourseListBox(ListBox registeredCourseListBox) {
		this.registeredCourseListBox = registeredCourseListBox;
	}

	/**
	 * @return the pendingCourseListBox
	 */
	public ListBox getPendingCourseListBox() {
		return pendingCourseListBox;
	}

	/**
	 * @param pendingCourseListBox the pendingCourseListBox to set
	 */
	public void setPendingCourseListBox(ListBox pendingCourseListBox) {
		this.pendingCourseListBox = pendingCourseListBox;
	}

	/**
	 * @return the selectPanel
	 */
	public HorizontalPanel getSelectPanel() {
		return selectPanel;
	}

	/**
	 * @return the currentClassButton
	 */
	public Button getCurrentClassButton() {
		return currentClassButton;
	}

	/**
	 * @return the classSearchButton
	 */
	public Button getClassSearchButton() {
		return classSearchButton;
	}

	/**
	 * @return the accountInfoButton
	 */
	public Button getAccountInfoButton() {
		return accountInfoButton;
	}

	/**
	 * @return the courseCartButton
	 */
	public Button getCourseCartButton() {
		return courseCartButton;
	}

	/**
	 * @return the generateScheduleButton
	 */
	public Button getGenerateScheduleButton() {
		return facultyCourseMapButton;
	}

	/**
	 * @return the registeredHeaderBox
	 */
	public TextBox getRegisteredHeaderBox() {
		return registeredHeaderBox;
	}

	/**
	 * @return the pendingHeaderBox
	 */
	public TextBox getPendingHeaderBox() {
		return pendingHeaderBox;
	}

	/**
	 * @return the titleBox
	 */
	public TextBox getTitleBox() {
		return titleBox;
	}
	
	@UiHandler("currentClassButton")
	void onCurrentClassButtonClicked(ClickEvent evt) {
		presenter.currentClasses();
	}
	
	@UiHandler("classSearchButton")
	void onClassSearchButtonClicked(ClickEvent evt) {
		presenter.classSearch();
	}
	
	@UiHandler("accountInfoButton")
	void onAccountInfoButtonClicked(ClickEvent evt) {
		presenter.accountInfo();
	}
	
	@UiHandler("courseCartButton")
	void onCourseCartButtonClicked(ClickEvent evt) {
		presenter.courseCart();
	}
	/*
	@UiHandler("generateScheduleButton")
	void onGenerateScheduleButtonClicked(ClickEvent evt) {
		presenter.generateSchedule();
	}
	*/
}
