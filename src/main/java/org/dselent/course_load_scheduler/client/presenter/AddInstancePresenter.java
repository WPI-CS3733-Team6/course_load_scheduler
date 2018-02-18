package org.dselent.course_load_scheduler.client.presenter;

public interface AddInstancePresenter extends BasePresenter{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void saveInstance();
	void deleteInstance();
	void createSection();
	void goToEditSection();
	void goToEditCourse();
}
