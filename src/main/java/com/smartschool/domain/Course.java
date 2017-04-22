package com.smartschool.domain;

import java.util.Date;

public class Course {
	
	private int courseId;
	private int courseName;
	private int teacherId;
	private Date startDate;
	private Date endDate;
	
	public Course(int courseId, int courseName, int teacherId, Date startDate, Date endDate){
		this.courseId = courseId;
		this.courseName = courseName;
		this.teacherId = teacherId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getCourseId() {
		return courseId;
	}

	public int getCourseName() {
		return courseName;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
	
}
