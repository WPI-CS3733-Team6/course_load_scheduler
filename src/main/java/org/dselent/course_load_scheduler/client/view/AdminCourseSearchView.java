package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminCourseSearchPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;

public interface AdminCourseSearchView extends BaseView<AdminCourseSearchPresenter>{
	public ListBox getSemesterList();
	public ListBox getCourseList();
	public Button getSearchButton();
	public Button getAdvSearchButton();
	public Button getAddCourseButton();
	public LayoutPanel getLayoutPanel();
	public FlexTable getResultTable();
}
