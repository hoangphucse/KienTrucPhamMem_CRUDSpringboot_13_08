package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query(value = "select * from student", nativeQuery = true)
	List<Student> getAll();
	
	
//	@Transactional
//	@Modifying
//	@Query(value = "insert into student(name, gender, age, major) values(:student.name,:student.gender,:student.age,:student.major)", nativeQuery = true)
//	void addPerson(@Param("student") Student student);
//	
//	@Transactional
//	@Modifying
//	@Query(value = "update person set name = :student.name, gender = :student.gender, age = :student.age, major= :student.major where id = :id", nativeQuery = true)
//	void updatePerson(@Param("id") Integer id, @Param("student") Student student);
	
	@Transactional
	@Modifying
	@Query(value = "insert into student(name, gender, age, major) values(?1,?2,?3,?4)", nativeQuery = true)
	void addPerson(String name, boolean gender, int age, String major);
	
	@Transactional
	@Modifying
	@Query(value = "update student set name = ?2, gender = ?3,age =?4, major =?5 where id = ?1", nativeQuery = true)
	void updatePerson(Integer id, String name, boolean gender, int age, String major);
	
	@Transactional
	@Modifying
	@Query(value = "delete from person where id = ?1", nativeQuery = true)
	void deletePersonById(Integer id);
}
