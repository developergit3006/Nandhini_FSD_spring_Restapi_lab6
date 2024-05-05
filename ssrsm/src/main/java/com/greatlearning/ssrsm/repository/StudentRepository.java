package com.greatlearning.ssrsm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ssrsm.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
