package com.lidar.spring.coursesapi;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lidar.spring.coursesapi.model.Course;
import com.lidar.spring.coursesapi.repository.CourseRepository;

import antlr.collections.List;

@SpringBootApplication
public class CoursesapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoursesapiApplication.class, args);
	}
	



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Bean
    public CommandLineRunner mappingDemo(CourseRepository courseRepository  ) {
        return args -> {
            ArrayList<Course> courses = new ArrayList<>();
           

        	Course c1 = new Course("Java Object-Oriented Programming", "Kathryn Hodge", "Linkedin",
        			"Are you familiar with Java but want to get the most out of your Java programs? In this course, Kathryn Hodge teaches the basics of object-oriented programming in Java, so you can write code that’s secure, scalable, and easier to troubleshoot. Kathryn begins by showing how object-oriented principles are embedded into the Java language from the first code file you create. She looks at how classes, instances, and constructors embody the idea of representing real-life objects in code. Kathryn not only shows how to apply object-oriented principles in your own programs, but also explains how Java leverages these principles behind the scenes. While many resources about object-oriented programming focus on abstract examples, the goal of this course is to get away from the abstract and focus more on practical examples of these principles in Java. Along with deep dives into the source code, this course also provides several challenges and solutions to help you apply what you’ve learned.",
        			"java1.png", 4.8);
        	
        	Course c2 = new Course("Spring Boot 2.0 Essential Training", "Frank P Moley III", "Linkedin",
        		"Learn how to get started with Spring Boot 2.x, a powerful framework that can help you build web applications quickly, using less code. The Java-based programs you build in Spring Boot \"just run\": they resolve their own dependencies and create containers for running code in any environment. Learn how to use Spring Boot to build your projects in this course with software architect and Spring developer Frank Moley. Frank shows how to initialize, containerize, and run Spring Boot web apps and CLI apps, and use the library of common starter projects to fill business-critical needs: data, messaging, security, and more. Plus, find how to extend Spring Boot by creating your own starters and use the Actuator module's HTTP endpoints to monitor and manage your apps.", 
        		"springboot1.png", 4.7);
        	
        	Course c3 = new Course("Laravel 9 Fundamentals", "Mateo Prigl", "pluralsight",
            		"Most web applications are built in a similar way. For example, they use HTML templates, connect to the database, validate user input, and implement some kind of authentication. This is why developers choose to use a structured framework like Laravel, which does all of the heavy-lifting and lets them focus on building websites. In this course, Laravel 9 Fundamentals, you’ll learn how to build web applications with Laravel. First, you’ll explore how to route the requests to the correct view. Next, you’ll discover how to process user input and save it to the database. Finally, you’ll learn how to implement user authentication and authorization without any starter kits. When you’re finished with this course, you’ll have the skills and knowledge of the Laravel framework needed to easily build maintainable websites with Laravel.", 
            		"laravel1.png", 4.9);
        	Course c4 = new Course("Object Oriented Programming in Java Specialization","Owen-Astrachan","Coursera",
        			"This Specialization is for aspiring software developers with some programming experience in at least one other programming language (e.g., Python, C, JavaScript, etc.) who want to be able to solve more complex problems through objected-oriented design with Java. In addition to learning Java, you will gain experience with two Java development environments (BlueJ and Eclipse), learn how to program with graphical user interfaces, and learn how to design programs capable of managing large amounts of data. These software engineering skills are broadly applicable across wide array of industries.",
            		"java2.png", 4.6);
        	
           Course c5 = new Course("sql-basics","Andrew Chalkley","teamtreehouse",
        			"In SQL Basics we’ll take a look at what databases are and how you can retrieve information from them. Databases can store massive amounts of information to be retrieved at a later date. Databases act as the memory for dynamic web sites or mobile apps.you will learn Write SELECT statement to query data from a relational database.Be able to create analyses, such as line charts, stacked bar charts, or geographic analyses using maps. You can also become used to more advanced features, such as Calculated Fields, Parameters and Hierarchies. You will be able to format numbers and dates, and add labels, tooltips and animation.By the end of the course, you will, with some experience, have the knowledge to take (and pass) the Tableau Qualified Associate certification.",
            		"sql1.png", 4.6);
        	
        	Course c6 = new Course("Tableau Data Analyst/Specialist Desktop Certification","Phillip Burton","Udemy",
            		"This course covers all of the content required for the Data Analyst (the new version of the Certified Associate) or Desktop Specialist certifications.",
        			"data1.png", 4.7);
        	
            // save the data
        	courses.add(c1);
        	courses.add(c3);
        	courses.add(c2);
        	courses.add(c4);
        	courses.add(c5);
        	courses.add(c6);
        	courseRepository.saveAll(courses);
            
        };
    
  }
}