package org.dselent.course_load_scheduler.client.action;

public class UpdateAccountAction extends Action {
	
	private String newPassword;
	private String newEmail;
	private String newPhoneNum;
	
	public UpdateAccountAction(String newPassword, String newEmail, String newPhoneNum) {
		this.newEmail = newEmail;
		this.newPassword = newPassword;
		this.newPhoneNum = newPhoneNum;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public String getNewEmail() {
		return newEmail;
	}

	public String getNewPhoneNum() {
		return newPhoneNum;
	}

	@Override
	public String toString() {
		return "SendAccountUpdate [newPassword=" + newPassword + ", newEmail=" + newEmail + ", newPhoneNum="
				+ newPhoneNum + "]";
	}
}
