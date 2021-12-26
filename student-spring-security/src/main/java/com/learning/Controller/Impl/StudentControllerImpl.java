package com.learning.Controller.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.Controller.StudentController;
import com.learning.Entity.Student;
import com.learning.Service.StudentService;

@RestController
public class StudentControllerImpl implements StudentController {

	@Autowired
	StudentService studentService;
	

	@PostMapping("/students")
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentService.saveStudent(student);
	}

	@GetMapping("/listStudents")
	public String listStudentsPage(Model theModel) {
		// TODO Auto-generated method stub
		List<Student> students=studentService.getStudents();
		theModel.addAttribute("Students",students);
		return "list-Students";
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentService.getStudents();
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		return studentService.getStudentById(id);
	}

	@GetMapping("/students/name")
	public Student getStudentByName(@RequestParam("name") String name) {
		// TODO Auto-generated method stub
		return studentService.getStudentByName(name);
	}

	@PutMapping("students/{id}")
	public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		// TODO Auto-generated method stub
		return studentService.updateStudent(id, student);
	}

	@PutMapping("students/{id}")
	public Student deleteStudent(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		return studentService.deleteStudent(id);
	}

}
