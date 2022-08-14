package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Teacher;
import com.example.repository.TeacherRepository;
import com.example.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

}
