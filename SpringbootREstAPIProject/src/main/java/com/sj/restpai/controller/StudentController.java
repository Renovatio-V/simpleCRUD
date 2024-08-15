package com.sj.restpai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.sj.restpai.entity.Student;
import com.sj.restpai.repository.StudentRepository;


@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	//Get all students at localhost:8080/students
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		List<Student> students = repo.findAll();
		return students;
	}
	
	//localhost:8080/students/1
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		 Student student = repo.findById(id).orElse(null);
		
		return student;
	}
	
	//localhost:8080/student/add
	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student){
		repo.save(student);
	}
	
	@PutMapping("/student/update/{id}")
	public Student updateStudents(@PathVariable int id, @RequestBody Student studentUpdated) {
		Student student = repo.findById(id).get();
		if(student != null) {
			student.setName(studentUpdated.getName());
			student.setBranch(studentUpdated.getBranch());
			student.setPercentage(studentUpdated.getPercentage());			
			repo.save(student);			
		} 
		
		return student;
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
	}
}
