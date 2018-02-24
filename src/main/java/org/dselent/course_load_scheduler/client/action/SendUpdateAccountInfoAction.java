package org.dselent.course_load_scheduler.client.action;

public class SendUpdateAccountInfoAction extends Action {
	
	// TODO need to add confirmed new password, or get rid of it server side
	
	private String oldPassword;
	private String newPassword;
	private String newEmail;
	private Integer newPhoneNum;
	
	public SendUpdateAccountInfoAction(String oldPassword, String newPassword, String newEmail, Integer newPhoneNum) {
		this.oldPassword = oldPassword;
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

	public Integer getNewPhoneNum() {
		return newPhoneNum;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	@Override
	public String toString() {
		return "UpdateAccountAction [oldPassword=" + oldPassword + ", newPassword=" + newPassword + ", newEmail="
				+ newEmail + ", newPhoneNum=" + newPhoneNum + "]";
	}
}
