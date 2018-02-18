package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminAddEditUserPresenter;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;

public interface AdminAddEditUserView extends BaseView<AdminAddEditUserPresenter>{

	//TextFields
	public TextBox getFirstNameField();
	public TextBox getLastNameField();
	public TextBox getEmailField();
	public IntegerBox getTeachingRequirments();
	
	//Button
	public Button getSubmitButton();
}
