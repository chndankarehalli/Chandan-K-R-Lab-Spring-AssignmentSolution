package com.learning.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.Entity.Student;
import com.learning.Repository.StudentRepository;
import com.learning.Service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		}
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findByName(name);
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		// TODO Auto-generated method stub
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			return studentRepository.save(student);
		}
		return null;
	}

	@Override
	public Student deleteStudent(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			Student student = optionalStudent.get();
			studentRepository.delete(student);
			return student;
		}
		return null;
	}

}
