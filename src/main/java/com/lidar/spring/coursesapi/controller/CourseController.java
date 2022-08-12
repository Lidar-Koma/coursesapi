package com.lidar.spring.coursesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lidar.spring.coursesapi.model.Course;
import com.lidar.spring.coursesapi.repository.CourseRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping("/hello")
	public String HelloWorld(){
	return "Hello World";
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> list = courseRepository.findAll();
		return new ResponseEntity<List<Course>>(list, HttpStatus.OK);
	}
}
