package com.example.service;

import java.util.List;

import com.example.entity.Teacher;

public interface TeacherService {

	public Teacher saveTeacher(Teacher teacher);
	
	public List<Teacher> getTeachers();
}
