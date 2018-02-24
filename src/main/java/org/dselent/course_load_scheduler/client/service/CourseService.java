package org.dselent.course_load_scheduler.client.service;

import org.dselent.course_load_scheduler.client.event.CourseSearchEvent;

public interface CourseService extends BaseService{
	void onCourseSearch(CourseSearchEvent evt);
}
