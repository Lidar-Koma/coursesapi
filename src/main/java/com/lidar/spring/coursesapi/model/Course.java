package com.lidar.spring.coursesapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(columnDefinition = "varchar(100)", name = "courseName")
	private String courseName;
	
	
	@Column(columnDefinition = "varchar(50)", name = "instructor")
	private String instructor;
	
	@Column(columnDefinition = "varchar(50)", name = "source")
	private String source;
	
	@Column(columnDefinition="TEXT", name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "ratings")
	private double ratings;
	public Course() {
		
	}
	
	

	public Course(String courseName, String instructor, String source, String description, String image, double ratings) {
		
		this.courseName = courseName;
		this.instructor = instructor;
		this.source = source;
		
		this.description = description;
		this.image = image;
		this.ratings = ratings;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}



	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", instructor=" + instructor + ", source=" + source
				+ ", description=" + description + ", image=" + image + ", ratings=" + ratings + "]";
	}

	

	
	
	
	
}
