package com.example.vo;

public class Teacher {

	private Long teacherId;

	private String name;

	private String title;

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Teacher(Long teacherId, String name, String title) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.title = title;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", title=" + title + "]";
	}
	
	

}
