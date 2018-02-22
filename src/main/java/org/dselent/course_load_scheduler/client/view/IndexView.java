package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PopupPanel;

public interface IndexView extends BaseView<IndexPresenter>
{
	HTMLPanel getTopPanel();
	void setTopPanel(HTMLPanel topPanel);
	LayoutPanel getLayoutPanel();
	void setLayoutPanel(LayoutPanel layoutPanel);
	AbsolutePanel getAbsolutePanel();
	void setAbsolutePanel(AbsolutePanel absolutePanel);
	LayoutPanel getInnerlayoutPanel();
	void setInnerlayoutPanel(LayoutPanel innerLayoutPanel);
	Label getIdentification();
	void setIdentification(Label identification);
	LayoutPanel getLowerPanel();
	void setLowerPanel(LayoutPanel lowerPanel);
	HTMLPanel getBottonPanel();
	void setBottonPanel(HTMLPanel bottomPanel); 
	HTMLPanel getMiddlePanel();
	void setMiddlePanel(HTMLPanel middlePanel);
	
	Button getHome();
	Button getLogout();
	Button getReportAProblem();
	
	
	//for the loading image
	PopupPanel getGlassLoadingPanel();
	Image getLoadingImage();
	
}
