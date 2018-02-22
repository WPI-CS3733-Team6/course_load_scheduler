package org.dselent.course_load_scheduler.client.presenter;

import org.dselent.course_load_scheduler.client.view.IndexView;

public interface IndexPresenter extends BasePresenter
{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	public void showLoadScreen();
	public void hideLoadScreen();
	IndexView getView();
}
