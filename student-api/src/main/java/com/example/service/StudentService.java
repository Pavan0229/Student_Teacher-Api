package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Student;
import com.example.vo.ResponseTemplateVo;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public Optional<Student> getById(Long id);
	
	public List<Student> getAllStudent();

	public ResponseTemplateVo getStudentWithTeacher(Long id);

}
