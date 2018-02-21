package org.dselent.course_load_scheduler.client.action;

public class AdminAdvancedCourseSearchAction extends Action {
	private Integer department;
	private Integer term;
	private Integer level;
	private String name;
	
	public AdminAdvancedCourseSearchAction(Integer department, Integer term, Integer level, String name) {
		this.department = department;
		this.term = term;
		this.level = level;
		this.name = name;
	}

	public Integer getDepartment() {
		return department;
	}

	public Integer getTerm() {
		return term;
	}

	public Integer getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "AdminAdvancedCourseSearchAction [department=" + department + ", term=" + term + ", level=" + level
				+ ", name=" + name + "]";
	}
}
