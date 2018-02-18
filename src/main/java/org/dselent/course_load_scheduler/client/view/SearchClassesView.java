package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.SearchClassesPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;

public interface SearchClassesView extends BaseView<SearchClassesPresenter>{

	public ListBox getSemesterField();
	public ListBox getSubjectField();
	public ListBox getLevelField();
	public Button getSearchButton();
	public LayoutPanel getLayoutPanel();
}
