package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;
import com.example.vo.ResponseTemplateVo;
import com.example.vo.Teacher;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> getById(Long id) {

		return studentRepository.findById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public ResponseTemplateVo getStudentWithTeacher(Long id) {
			ResponseTemplateVo vo = new ResponseTemplateVo();
			Optional<Student> student = studentRepository.findById(id);
			
			ResponseEntity<Teacher> teacher = restTemplate.getForEntity("http://localhost:8081/getTeachers/"+student.get(),Teacher.class);
			vo.setStudent(student);
			
		return null;
	}

}
