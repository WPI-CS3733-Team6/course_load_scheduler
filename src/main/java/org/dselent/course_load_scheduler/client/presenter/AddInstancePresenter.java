package org.dselent.course_load_scheduler.client.presenter;

public interface AddInstancePresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void addInstance();
}
