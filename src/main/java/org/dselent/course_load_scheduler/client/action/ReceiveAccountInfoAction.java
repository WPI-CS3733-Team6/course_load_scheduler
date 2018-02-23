package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.User;

public class ReceiveAccountInfoAction extends Action {
	
	private User model;

	public ReceiveAccountInfoAction(User model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "ReceiveAccountInfoAction [model=" + model + "]";
	}

	public User getModel() {
		return model;
	}

	public void setModel(User model) {
		this.model = model;
	}

}
