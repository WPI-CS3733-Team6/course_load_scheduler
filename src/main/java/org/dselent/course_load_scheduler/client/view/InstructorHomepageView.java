package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.InstructorHomepagePresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;

public interface InstructorHomepageView extends BaseView<InstructorHomepagePresenter> {
	
	public LayoutPanel getLayoutPanel();
	public void setLayoutPanel(LayoutPanel layoutPanel);
	public HorizontalPanel getHeaderPanel();
	public void setHeaderPanel(HorizontalPanel headerPanel);
	public SplitLayoutPanel getCourseInfoPanel();
	public void setCourseInfoPanel(SplitLayoutPanel courseInfoPanel);
	public LayoutPanel getBodyPanel();
	public void setBodyPanel(LayoutPanel bodyPanel);
	public ListBox getRegisteredCourseListBox();
	public void setRegisteredCourseListBox(ListBox registeredCourseListBox);
	public ListBox getPendingCourseListBox();
	public void setPendingCourseListBox(ListBox pendingCourseListBox);
	public HorizontalPanel getSelectPanel();
	public Button getCurrentClassButton();
	public Button getClassSearchButton();
	public Button getAccountInfoButton();
	public Button getCourseCartButton();
	public Button getCreateRequestButton();
	public Button getGenerateScheduleButton();
	public TextBox getRegisteredHeaderBox();
	public TextBox getPendingHeaderBox();
	public TextBox getTitleBox();
	
}
