package org.dselent.course_load_scheduler.client.action;

public class InvalidCourseIdAction extends Action {
	
	private String reason;
	
	public InvalidCourseIdAction() {
		this.reason = "Invalid course ID, cannot be 0.";
	}

	@Override
	public String toString() {
		return "InvalidCourseIdAction [reason=" + reason + "]";
	}

	public String getReason() {
		return reason;
	}

}
