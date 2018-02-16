package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AddCoursePresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;

public interface AddCourseView extends BaseView<AddCoursePresenter>{
	
	public TextBox getCourseNumberField();

	public TextBox getCourseNameField();

	public TextBox getInstanceNumberField();

	public TextArea getCourseDescField();

	public TextBox getStatusField();
	
	public Button getSaveCourseButton();
}