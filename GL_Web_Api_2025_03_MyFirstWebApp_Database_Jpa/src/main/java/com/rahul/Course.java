package com.rahul;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Course")
public class Course {

	@Id
	@Column(name = "cid")
	private int courseid;
	@Column(name = "cname")
	private String courseName;
	
	private String Department;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseid, String courseName, String department) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		Department = department;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseName=" + courseName + ", Department=" + Department + "]";
	}
	
	
}
