package org.dselent.course_load_scheduler.client.action;

public class CheckUserAction extends Action{
	private Integer id;
	
	public CheckUserAction(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CheckUserAction [id=" + id + "]";
	}
}
