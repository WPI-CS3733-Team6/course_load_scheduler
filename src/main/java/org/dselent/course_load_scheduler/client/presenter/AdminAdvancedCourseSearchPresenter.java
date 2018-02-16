package org.dselent.course_load_scheduler.client.presenter;

public interface AdminAdvancedCourseSearchPresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void search();
}
