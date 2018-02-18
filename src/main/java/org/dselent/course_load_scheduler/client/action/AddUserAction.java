package org.dselent.course_load_scheduler.client.action;

public class AddUserAction {

	private String firstName;
	private String lastName;
	private String email;
	private Double requierments;
	private Boolean administrator;
	
	public AddUserAction(String firstName, String lastName, String email, Double requirments, Boolean administrator)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.requierments = requirments;
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

	public Double getRequirments() {
		return requierments;
	}

	public Boolean getAdministrator() {
		return administrator;
	}

	@Override
	public String toString() {
		return "AddUserAction [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", requirments=" + requierments + ", administrator=" + administrator + "]";
	}
}
