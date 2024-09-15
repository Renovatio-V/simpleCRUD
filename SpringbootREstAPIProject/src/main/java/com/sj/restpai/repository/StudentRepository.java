package com.sj.restpai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.restpai.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	


}
