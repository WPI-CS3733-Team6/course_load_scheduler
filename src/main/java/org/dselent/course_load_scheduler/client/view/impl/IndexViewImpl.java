package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.IndexView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;

public class IndexViewImpl extends BaseViewImpl<IndexPresenter> implements IndexView
{
	private static IndexViewImplUiBinder uiBinder = GWT.create(IndexViewImplUiBinder.class);

	interface IndexViewImplUiBinder extends UiBinder<Widget, IndexViewImpl> {}
	
	@UiField HTMLPanel topPanel;
	@UiField LayoutPanel layoutPanel;
	@UiField AbsolutePanel absolutePanel;
	@UiField LayoutPanel innerlayoutPanel;
	@UiField Label identification;
	@UiField LayoutPanel lowerPanel;
	@UiField HTMLPanel bottonPanel;
	@UiField HTMLPanel middlePanel;
	@UiField Button viewCurrentClasses;
	@UiField Button home;
	@UiField Button logout;
	@UiField Button reportAProblem;

	
	public IndexViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public HTMLPanel getTopPanel()
	{
		return topPanel;
	}

	@Override
	public void setTopPanel(HTMLPanel topPanel)
	{
		this.topPanel = topPanel;
	}

	@Override
	public void setPresenter(IndexPresenter presenter)
	{
		this.presenter = presenter;
	}
	
	public LayoutPanel getLayoutPanel() {
		return layoutPanel;
	}

	public void setLayoutPanel(LayoutPanel layoutPanel) {
		this.layoutPanel = layoutPanel;
	}

	public AbsolutePanel getAbsolutePanel() {
		return absolutePanel;
	}

	public void setAbsolutePanel(AbsolutePanel absolutePanel) {
		this.absolutePanel = absolutePanel;
	}

	public LayoutPanel getInnerlayoutPanel() {
		return innerlayoutPanel;
	}

	public void setInnerlayoutPanel(LayoutPanel innerlayoutPanel) {
		this.innerlayoutPanel = innerlayoutPanel;
	}

	public Label getIdentification() {
		return identification;
	}

	public void setIdentification(Label identification) {
		this.identification = identification;
	}

	public LayoutPanel getLowerPanel() {
		return lowerPanel;
	}

	public void setLowerPanel(LayoutPanel lowerPanel) {
		this.lowerPanel = lowerPanel;
	}

	public HTMLPanel getBottonPanel() {
		return bottonPanel;
	}

	public void setBottonPanel(HTMLPanel bottonPanel) {
		this.bottonPanel = bottonPanel;
	}

	public HTMLPanel getMiddlePanel() {
		return middlePanel;
	}

	public void setMiddlePanel(HTMLPanel middlePanel) {
		this.middlePanel = middlePanel;
	}

	public Button getViewCurrentClasses() {
		return viewCurrentClasses;
	}

	public Button getHome() {
		return home;
	}

	public Button getLogout() {
		return logout;
	}

	public Button getReportAProblem() {
		return reportAProblem;
	}
	@UiHandler("home")
	void onHomeButtonClicked(ClickEvent evt)
	{
		presenter.home();
	}
	
	@UiHandler("logout")
	void onLogoutButtonClicked(ClickEvent evt)
	{
		presenter.logout();
	}
	
	@UiHandler("reportAProblem")
	void onReportAProblemButtonClicked(ClickEvent evt)
	{
		presenter.reportAProblem();
	}
	
	@UiHandler("viewCurrentClasses")
	void onViewCurrentClassesButtonClicked(ClickEvent evt)
	{
		presenter.currentClasses();
	}
	
// Part of the template code from Doug:
// Not necessary for now, but keep it for reference

	@Override
	public PopupPanel getGlassLoadingPanel()
	{
		return null; //glassLoadingPanel;
	}
	
	@Override
	public Image getLoadingImage()
	{
		return null; //loadingImage;
	}
	
	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return middlePanel;
	}
	
	

}
