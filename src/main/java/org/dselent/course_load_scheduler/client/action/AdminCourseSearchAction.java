package org.dselent.course_load_scheduler.client.action;

public class AdminCourseSearchAction extends Action {
	private String subject;
	private String term;
	
	public AdminCourseSearchAction(String subject, String term) {
		this.subject = subject;
		this.term = term;
	}
	
	public String getSubject() {
		return subject;
	}

	public String getTerm() {
		return term;
	}

	@Override
	public String toString() {
		return "AdminCourseSearchAction [subject=" + subject + ", term=" + term + "]";
	}
}
