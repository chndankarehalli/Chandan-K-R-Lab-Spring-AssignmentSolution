package com.learning.Controller;

import java.util.List;

import com.learning.Entity.Student;

public interface StudentController {

	Student saveStudent(Student student);

	List<Student> getStudents();

	Student getStudentById(Long id);

	Student getStudentByName(String name);

	Student updateStudent(Long id, Student student);

	Student deleteStudent(Long id);
	
}
