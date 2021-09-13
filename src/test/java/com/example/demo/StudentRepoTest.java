package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@SpringBootTest
public class StudentRepoTest {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Test
	public void getAll() {

		System.out.println("getAll: " + studentRepo.getAll());
	}

	@Test
	public void add() {
//		Student student = new Student(0, "Hoàng Phúc", false, 20, "abc");
//		

		studentRepo.addPerson("Hoàng Phúc", true, 22, "a111c");
	}

	@Test
	public void update() {

		studentRepo.updatePerson(1,"Hoàng Phúc 123", false, 20, "abc");
	}

	@Test
	public void delete() {

		studentRepo.deletePersonById(1);
	}
}
