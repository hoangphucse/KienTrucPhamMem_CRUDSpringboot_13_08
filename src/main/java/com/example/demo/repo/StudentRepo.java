package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	boolean CreateStudent(Student student);
	List<Student> getStudents();
	boolean updateStudent(Student student);
	boolean deleteStudent (int idStudent);
}
