package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@SpringBootTest
public class RepositoryTest {
	
	@Autowired
	private StudentRepo studentRepo;

	@Test
	public void getAll() {

		System.out.println("getAll: " + studentRepo.findAll());
	}
	
	

	@Test
	public void add() {
		
		Student student = Student.builder().name("Hoàng Phúc").gender(false).age(21).major("CNTT").build();
		System.out.println("Save Student: " + studentRepo.save(student));
		
		studentRepo.save(new Student(0, "abnc", true, 22, "CNTT"));
	}

	@Test
	public void update() {

		Student student = Student.builder().id(1).major("KTPM").build();
		System.out.println("Update student: " + studentRepo.save(student));
	}

	@Test
	public void delete() {

		studentRepo.deleteById(1);
	}

}
