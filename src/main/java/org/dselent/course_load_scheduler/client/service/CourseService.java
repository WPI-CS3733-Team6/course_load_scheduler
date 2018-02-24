package org.dselent.course_load_scheduler.client.service;

import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import org.dselent.course_load_scheduler.client.event.CourseSearchEvent;
import org.dselent.course_load_scheduler.client.event.DeleteCourseEvent;
import org.dselent.course_load_scheduler.client.event.EditCourseEvent;

public interface CourseService extends BaseService{
	void onCourseSearch(CourseSearchEvent evt);
	
	void onEditCourse(EditCourseEvent evt);
	
	void onAddCourse(AddCourseEvent evt);
	
	void onDeleteCourse(DeleteCourseEvent evt);
}
