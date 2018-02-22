package org.dselent.course_load_scheduler.client.action;

public class SubmitCourseToCartAction extends Action {
	
	private String courseName;

	public SubmitCourseToCartAction(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "SubmitCourseToCartAction [courseName=" + courseName + "]";
	}

	public String getCourseName() {
		return courseName;
	}

}
