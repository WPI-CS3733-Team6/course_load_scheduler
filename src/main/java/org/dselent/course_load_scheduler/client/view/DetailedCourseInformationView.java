package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.DetailedCourseInformationPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;

public interface DetailedCourseInformationView extends BaseView<DetailedCourseInformationPresenter>{

	//TextBoxes
	public TextBox getCourseNameTextBox();
	public TextBox getRegistrationTextBox();
	public IntegerBox getCourseTextBox();
	public TextBox getScheduleTextBox();
	public TextBox getLevelTextBox();
	public IntegerBox getExpectedPopulationTextBox();
	public TextBox getSectionIdTextBox();
	public TextBox getSectionType();
	public TextBox getCourseDescription();
	
	//Buttons
	public Button getReturnToSearchButton();
	public Button getSubmitToRegistration();
}
