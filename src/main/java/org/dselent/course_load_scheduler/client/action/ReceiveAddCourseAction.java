package org.dselent.course_load_scheduler.client.action;

import org.dselent.course_load_scheduler.client.model.CourseInformation;

public class ReceiveAddCourseAction extends Action{
	private CourseInformation model;
	
	public ReceiveAddCourseAction (CourseInformation model) {
		this.model = model;
	}

	public CourseInformation getModel() {
		return model;
	}

	public void setModel(CourseInformation model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "ReceiveAddCourseAction [model=" + model + "]";
	}
}
