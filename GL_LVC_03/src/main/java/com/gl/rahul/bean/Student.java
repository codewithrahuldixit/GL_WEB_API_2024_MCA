package com.gl.rahul.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Long id;
	private String name;
	private String course;
	public Student(Long id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	

}
