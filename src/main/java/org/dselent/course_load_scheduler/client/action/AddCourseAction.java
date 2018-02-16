package org.dselent.course_load_scheduler.client.action;

public class AddCourseAction {
	
	private String number;
	private String name;
	private String level;
	private String description;
	private String status;
	
	public AddCourseAction(String number, String name, String level, String description, String status) {
		this.number = number;
		this.name = name;
		this.level = level;
		this.description = description;
		this.status = status;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getLevel() {
		return level;
	}

	public String getDescription() {
		return description;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "AddCourseAction [number=" + number + ", name=" + name + ", level=" + level
				+ ", description=" + description + ", status=" + status + "]";
	}
	
}
