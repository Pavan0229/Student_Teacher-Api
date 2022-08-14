package com.example.vo;

import com.example.entity.Student;

public class ResponseTemplateVo {

	private Student student;
	private Teacher teacher;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ResponseTemplateVo(Student student, Teacher teacher) {
		super();
		this.student = student;
		this.teacher = teacher;
	}

	public ResponseTemplateVo() {
		super();
	}

}
