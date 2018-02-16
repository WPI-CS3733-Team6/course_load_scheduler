package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.CourseRegistrationCartPresenter;

import com.google.gwt.user.client.ui.Button;

public interface CourseRegistrationCartView extends BaseView<CourseRegistrationCartPresenter>{
	public Button getSubmitForApproval();
}
