package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminAdvancedCourseSearchPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;

public interface AdminAdvancedCourseSearchView extends BaseView<AdminAdvancedCourseSearchPresenter>{

	public TextBox getCourseNameFieldTextBox();
	public ListBox getTermList();
	public ListBox getDepartmentList();
	public ListBox getLevelList();
	public FlexTable getResultTable();
	public Button getAddCourseButton();
	public Button getSearchButton();
}
