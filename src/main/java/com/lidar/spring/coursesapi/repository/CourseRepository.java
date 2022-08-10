package com.lidar.spring.coursesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lidar.spring.coursesapi.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
