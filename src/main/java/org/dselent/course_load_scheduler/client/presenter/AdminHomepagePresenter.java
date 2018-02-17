package org.dselent.course_load_scheduler.client.presenter;

public interface AdminHomepagePresenter extends BasePresenter
{
	IndexPresenter getParentPresenter();
	void setParentPresenter(IndexPresenter parentPresenter);
	void goToAddCourse();
	void goToAddUser();
	void goToAcctInfo();
	void goToEditUser();
	void goToModifyCourse();
	void goToGeneratedCompleteDepartmentSchedule();
	void goToCurrentClasses();
	void goToSearchClasses();
	void goToCart();
}
