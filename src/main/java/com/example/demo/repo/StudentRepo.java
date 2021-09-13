package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	@Query("select s from Student s")
	List<Student> getAll();



	@Transactional
	@Modifying
	@Query(value = "insert into student(name, gender, age, major) values(?1,?2,?3,?4)", nativeQuery = true)
	void addPerson(String name, boolean gender, int age, String major);

	@Transactional
	@Modifying
	
	
	@Query(value = "update Student t set t.name = ?2, t.gender = ?3,t.age =?4, t.major =?5 where t.id = ?1", nativeQuery = true)
	void updatePerson(Integer id, String name, boolean gender, int age, String major);

	@Transactional
	@Modifying
	@Query("delete from Student t where t.id = ?1")
	void deletePersonById(Integer id);
}
