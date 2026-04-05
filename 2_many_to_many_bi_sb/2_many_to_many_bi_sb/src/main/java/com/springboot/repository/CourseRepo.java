package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Course;
import com.springboot.entity.Student;

public interface CourseRepo extends JpaRepository<Course, Integer> {
}
