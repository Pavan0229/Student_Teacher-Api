package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.vo.ResponseTemplateVo;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);

	}

	@GetMapping("/getStudentId/{id}")
	public Optional<Student> getById(@PathVariable(name = "id") Long id) {
		return studentService.getById(id);

	}

	@GetMapping("/students")
	public List<Student> getAll() {
		return studentService.getAllStudent();
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVo getStudentWithTeacher(@PathVariable("id") Long id) {
		return studentService.getStudentWithTeacher(id);
		
	}
}
