package com.gl.rahul;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course {
	@Id
	private int id;
	private String cname;
	private String author;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String cname, String author) {
		super();
		this.id = id;
		this.cname = cname;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", author=" + author + "]";
	}
	
}
