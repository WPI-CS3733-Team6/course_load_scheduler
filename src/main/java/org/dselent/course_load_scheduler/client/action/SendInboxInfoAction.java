package org.dselent.course_load_scheduler.client.action;

public class SendInboxInfoAction extends Action{
	private Integer userId;
	
	public SendInboxInfoAction(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "SendInboxInfoAction [userId=" + userId + "]";
	}
}
