package org.dselent.course_load_scheduler.client.action;

public class AdminCourseSearchAction extends Action {
	private String subject;
	private String term;
	private String level;
	
	public AdminCourseSearchAction(String subject, String term, String level) {
		this.subject = subject;
		this.term = term;
		this.level = level;
	}
	
	public String getSubject() {
		return subject;
	}

	public String getTerm() {
		return term;
	}
	
	public String getLevel() {
		return level;
	}

	@Override
	public String toString() {
		return "AdminCourseSearchAction [subject=" + subject + ", term=" + term + ", level" + level + "]";
	}
}
