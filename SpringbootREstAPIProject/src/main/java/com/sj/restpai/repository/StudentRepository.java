package com.sj.restpai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sj.restpai.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
