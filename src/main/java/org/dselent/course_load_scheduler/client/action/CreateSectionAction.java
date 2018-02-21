package org.dselent.course_load_scheduler.client.action;

public class CreateSectionAction extends Action {
	private String courseNum;
	private Integer instanceNum;
	
	public CreateSectionAction(String courseNum, Integer instanceNum) {
		this.courseNum = courseNum;
		this.instanceNum = instanceNum;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public Integer getInstanceNum() {
		return instanceNum;
	}

	@Override
	public String toString() {
		return "CreateSectionAction [courseNum=" + courseNum + ", instanceNum=" + instanceNum + "]";
	}
	
}
