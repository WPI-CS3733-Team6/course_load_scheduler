package org.dselent.course_load_scheduler.client.model;

public class Instructor extends Model {
	// attributes
	
	private Integer id;
	private Integer userId;
	private Integer reqCourses;
	
	// methods
	
	public int getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public Integer getReqCourses()
	{
		return reqCourses;
	}

	public void setReqCourses(Integer reqCourses)
	{
		this.reqCourses = reqCourses;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reqCourses == null) ? 0 : reqCourses.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (!(obj instanceof Instructor))
		{
			return false;
		}
		Instructor other = (Instructor) obj;
		if (userId == null)
		{
			if (other.userId != null)
			{
				return false;
			}
		}
		else if (!userId.equals(other.userId))
		{
			return false;
		}
		if (id == null)
		{
			if (other.id != null)
			{
				return false;
			}
		}
		else if (!id.equals(other.id))
		{
			return false;
		}
		if (reqCourses == null)
		{
			if (other.reqCourses != null)
			{
				return false;
			}
		}
		else if (!reqCourses.equals(other.reqCourses))
		{
			return false;
		}
		return true;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("UserStates [id=");
		builder.append(id);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", reqCourses=");
		builder.append(reqCourses);
		builder.append("]");
		return builder.toString();
	}
}
