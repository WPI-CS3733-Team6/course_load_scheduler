package org.dselent.course_load_scheduler.client.model;

public class GlobalData {
	private Integer userId;
	private Integer courseId;
	private String courseNum;
	private Integer InstanceId;
	private Integer InstanceNum;
	private Integer SectionId;
	private Integer SectionNum;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public Integer getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(Integer instanceId) {
		InstanceId = instanceId;
	}
	public Integer getInstanceNum() {
		return InstanceNum;
	}
	public void setInstanceNum(Integer instanceNum) {
		InstanceNum = instanceNum;
	}
	public Integer getSectionId() {
		return SectionId;
	}
	public void setSectionId(Integer sectionId) {
		SectionId = sectionId;
	}
	public Integer getSectionNum() {
		return SectionNum;
	}
	public void setSectionNum(Integer sectionNum) {
		SectionNum = sectionNum;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((InstanceId == null) ? 0 : InstanceId.hashCode());
		result = prime * result + ((InstanceNum == null) ? 0 : InstanceNum.hashCode());
		result = prime * result + ((SectionId == null) ? 0 : SectionId.hashCode());
		result = prime * result + ((SectionNum == null) ? 0 : SectionNum.hashCode());
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result + ((courseNum == null) ? 0 : courseNum.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GlobalData other = (GlobalData) obj;
		if (InstanceId == null) {
			if (other.InstanceId != null)
				return false;
		} else if (!InstanceId.equals(other.InstanceId))
			return false;
		if (InstanceNum == null) {
			if (other.InstanceNum != null)
				return false;
		} else if (!InstanceNum.equals(other.InstanceNum))
			return false;
		if (SectionId == null) {
			if (other.SectionId != null)
				return false;
		} else if (!SectionId.equals(other.SectionId))
			return false;
		if (SectionNum == null) {
			if (other.SectionNum != null)
				return false;
		} else if (!SectionNum.equals(other.SectionNum))
			return false;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (courseNum == null) {
			if (other.courseNum != null)
				return false;
		} else if (!courseNum.equals(other.courseNum))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "GlobalData [userId=" + userId + ", courseId=" + courseId + ", courseNum=" + courseNum + ", InstanceId="
				+ InstanceId + ", InstanceNum=" + InstanceNum + ", SectionId=" + SectionId + ", SectionNum="
				+ SectionNum + "]";
	}
}
