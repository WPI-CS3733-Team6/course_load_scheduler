package org.dselent.course_load_scheduler.client.presenter;

import org.dselent.course_load_scheduler.client.model.GlobalData;
import org.dselent.course_load_scheduler.client.view.IndexView;

public interface IndexPresenter extends BasePresenter
{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	public void showLoadScreen();
	public void hideLoadScreen();
	public void goHome();
	public void logout();
	public void reportAProblem();
	public void currentClasses();
	IndexView getView();
	GlobalData getGlobalData();
}
