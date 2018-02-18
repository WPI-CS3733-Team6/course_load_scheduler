package org.dselent.course_load_scheduler.client.action;

public class DeleteCourseAction {

	private Integer courseId;
	
	public DeleteCourseAction(Integer courseId) {
		this.courseId = courseId;
	}
	
	public Integer getCourseId() {
		return courseId;
	}

	@Override
	public String toString() {
		return "DeleteCourseAction [courseId=" + courseId + "]";
	}
	
	
}
