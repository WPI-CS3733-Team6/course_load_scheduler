package org.dselent.course_load_scheduler.client.action;

public class AddUserAction {

	private String firstName;
	private String lastName;
	private String email;
	private Integer requirments;
	private Boolean administrator;
	
	private AddUserAction(String firstName, String lastName, String email, Integer requirments, Boolean administrator)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.requirments = requirments;
		this.administrator = administrator;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public Integer getRequirments() {
		return requirments;
	}

	public Boolean getAdministrator() {
		return administrator;
	}

	@Override
	public String toString() {
		return "AddUserAction [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", requirments=" + requirments + ", administrator=" + administrator + "]";
	}
}
