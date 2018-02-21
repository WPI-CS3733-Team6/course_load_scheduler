package org.dselent.course_load_scheduler.client.action;

public class AddInstanceAction extends Action {
//num, instance number, term
	private String number;
	private Integer instanceNum;
	private Integer term;
	
	public AddInstanceAction(String number, Integer instanceNum, Integer term) {
		this.number = number;
		this.instanceNum = instanceNum;
		this.term = term;
	}

	public String getNumber() {
		return number;
	}

	public Integer getInstanceNum() {
		return instanceNum;
	}

	public Integer getTerm() {
		return term;
	}

	@Override
	public String toString() {
		return "AddInstanceAction [number=" + number + ", instanceNum=" + instanceNum + ", term=" + term + "]";
	}
	
	
	
}
