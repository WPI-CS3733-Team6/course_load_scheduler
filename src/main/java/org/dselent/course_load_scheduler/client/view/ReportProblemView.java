package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.ReportProblemPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public interface ReportProblemView extends BaseView<ReportProblemPresenter> {
	
	public ListBox getTypeList();
	public void setTypeList(ListBox typeList);
	public TextBox getNameBox();
	public void setNameBox(TextBox nameBox);
	public TextBox getEmailBox();
	public void setEmailBox(TextBox emailBox);
	public TextArea getDescriptionArea();
	public void setDescriptionArea(TextArea descriptionArea);
	public Button getExitButton();
	public Button getSubmitButton();
	
}
