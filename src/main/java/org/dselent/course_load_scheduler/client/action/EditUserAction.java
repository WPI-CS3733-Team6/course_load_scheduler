package org.dselent.course_load_scheduler.client.action;

public class EditUserAction {

	private String newLastName;
	private String newEmail;
	private Double newRequierments;
	private Boolean newAdministrator;
	
	public EditUserAction(String newLastName, String newEmail, Double newRequierments, Boolean newAdministrator)
	{
		this.newLastName = newLastName;
		this.newEmail = newEmail;
		this.newRequierments = newRequierments;
		this.newAdministrator = newAdministrator;
	}

	public String getNewLastName() {
		return newLastName;
	}

	public String getNewEmail() {
		return newEmail;
	}

	public Double getNewRequierments() {
		return newRequierments;
	}

	public Boolean getNewAdministrator() {
		return newAdministrator;
	}

	@Override
	public String toString() {
		return "EditUserAction [newLastName=" + newLastName + ", newEmail=" + newEmail + ", newRequierments="
				+ newRequierments + ", newAdministrator=" + newAdministrator + "]";
	}

	
	
}
