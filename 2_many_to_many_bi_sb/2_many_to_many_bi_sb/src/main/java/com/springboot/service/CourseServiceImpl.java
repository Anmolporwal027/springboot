package com.springboot.service;

import java.util.List;

import com.springboot.entity.Course;
import com.springboot.entity.Student;
import com.springboot.repository.CourseRepo;

public class CourseServiceImpl implements CourseService {
	private CourseRepo courseRepo;
	public CourseServiceImpl(CourseRepo courseRepo) {
		this.courseRepo = courseRepo;
	}
	
	@Override
	public List<Student>getStudentByCourseId(int id) {
		Course course = courseRepo.findById(id).get();
		return course.getS();
	}
}  
