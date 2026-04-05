package com.springboot.service;

import java.util.List;

import com.springboot.entity.Student;

public interface CourseService {
	public List<Student>getStudentByCourseId(int id);
} 
