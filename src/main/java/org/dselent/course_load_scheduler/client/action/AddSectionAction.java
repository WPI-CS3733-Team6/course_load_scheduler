package org.dselent.course_load_scheduler.client.action;

public class AddSectionAction extends Action {

	private Integer expectedPop;
	private String lectureType;
	private String days;
	private Integer timeStart;
	private Integer timeEnd;
	
	public AddSectionAction(Integer expectedPop, String lectureType, String days, Integer timeStart, Integer timeEnd) {
		this.expectedPop = expectedPop;
		this.lectureType = lectureType;
		this.days = days;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}

	public Integer getExpectedPop() {
		return expectedPop;
	}

	public String getLectureType() {
		return lectureType;
	}

	public String getDays() {
		return days;
	}

	public Integer getTimeStart() {
		return timeStart;
	}

	public Integer getTimeEnd() {
		return timeEnd;
	}

	@Override
	public String toString() {
		return "AddSectionAction [expectedPop=" + expectedPop + ", lectureType=" + lectureType + ", days=" + days
				+ ", timeStart=" + timeStart + ", timeEnd=" + timeEnd + "]";
	}
	
	
	
}
