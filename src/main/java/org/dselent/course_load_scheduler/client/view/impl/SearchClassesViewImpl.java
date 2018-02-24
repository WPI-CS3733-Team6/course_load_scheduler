package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.SearchClassesPresenter;
import org.dselent.course_load_scheduler.client.view.SearchClassesView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class SearchClassesViewImpl extends BaseViewImpl<SearchClassesPresenter> implements SearchClassesView {

	private static SearchClassesViewImplUiBinder uiBinder = GWT.create(SearchClassesViewImplUiBinder.class);
	@UiField ListBox semester;
	@UiField ListBox subject;
	@UiField Button searchButton;
	@UiField ListBox level;
	@UiField Grid gridCourses;
	@UiField ScrollPanel scrollPanel;
	@UiField LayoutPanel bottomPanel;
	@UiField HTMLPanel rootPanel;
	@UiField LayoutPanel topPanel;

	interface SearchClassesViewImplUiBinder extends UiBinder<Widget, SearchClassesViewImpl> {
	}

	public SearchClassesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(SearchClassesPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		// TODO Auto-generated method stub
		return rootPanel;
	}

	public ListBox getSemester() {
		return semester;
	}

	public void setSemester(ListBox semester) {
		this.semester = semester;
	}

	public ListBox getSubject() {
		return subject;
	}

	public void setSubject(ListBox subject) {
		this.subject = subject;
	}

	public ListBox getLevel() {
		return level;
	}

	public void setLevel(ListBox level) {
		this.level = level;
	}

	public Grid getGridCourses() {
		return gridCourses;
	}

	public void setGridCourses(Grid gridCourses) {
		this.gridCourses = gridCourses;
	}

	public ScrollPanel getScrollPanel() {
		return scrollPanel;
	}

	public void setScrollPanel(ScrollPanel scrollPanel) {
		this.scrollPanel = scrollPanel;
	}

	public LayoutPanel getBottomPanel() {
		return bottomPanel;
	}

	public void setBottomPanel(LayoutPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}

	public LayoutPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(LayoutPanel topPanel) {
		this.topPanel = topPanel;
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public HTMLPanel getRootPanel() {
		return rootPanel;
	}

	@Override
	public ListBox getSemesterField() {
		return semester;
	}

	@Override
	public ListBox getSubjectField() {
		return subject;
	}

	@Override
	public ListBox getLevelField() {
		return level;
	}

	@Override
	public LayoutPanel getLayoutPanel() {
		return bottomPanel;
	}
	
	
	
	@UiHandler("searchButton")
	void onSearchButtonClick(ClickEvent event) {
	}
}
