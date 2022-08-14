package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Teacher;
import com.example.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;

	@PostMapping("/saveTeacher")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}
	
	@GetMapping("/getTeachers")
	public List<Teacher> getTeachers(){
		return teacherService.getTeachers();
	}
}
