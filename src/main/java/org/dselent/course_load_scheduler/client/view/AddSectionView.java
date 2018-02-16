package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AddSectionPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;

public interface AddSectionView extends BaseView<AddSectionPresenter>{
	public HTMLPanel getRootPanel();
	public TextBox getCourseNumberHeader();
	public TextBox getInstanceNumberHeader();
	public TextBox getSectionNumberHeader();
	public TextBox getCourseNumberField();
	public IntegerBox getInstanceNumberField();
	public IntegerBox getSectionNumberField();
	public TextBox getExpectedPopHeader();
	public TextBox getTypeHeader();
	public IntegerBox getExpectedPopField();
	public TextBox getTypeField();
	public TextBox getDaysHeader();
	public CheckBox getMondayCheck();
	public CheckBox getTuesdayCheck();
	public CheckBox getWednesdayCheck();
	public CheckBox getThursdayCheck();
	public CheckBox getFridayCheck();
	public Label getTimeStartSeparator();
	public Label getTimeEndSeparator();
	public IntegerBox getStartMinutesField();
	public IntegerBox getStartHoursField();
	public IntegerBox getEndMinutesField();
	public IntegerBox getEndHoursField();
	public Button getSaveButton();
	public Button getDeleteButton();
	public Button getBackButton();
	public LayoutPanel getSaveDeletePanel();
	public LayoutPanel getDetailsPanel();
	public LayoutPanel getSectionInfoPanel();
}
