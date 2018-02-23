package org.dselent.course_load_scheduler.client.action;

public class CourseSearchAction extends Action {
	private Integer subject;
	private Integer term;
	private Integer level;
	
	public CourseSearchAction(Integer department, Integer term, Integer level, String name) {
		this.subject = department;
		this.term = term;
		this.level = level;
	}

	public Integer getDepartment() {
		return subject;
	}

	public Integer getTerm() {
		return term;
	}

	public Integer getLevel() {
		return level;
	}

	@Override
	public String toString() {
		return "CourseSearchAction [subject=" + subject + ", term=" + term + ", level=" + level + "]";
	}
}
