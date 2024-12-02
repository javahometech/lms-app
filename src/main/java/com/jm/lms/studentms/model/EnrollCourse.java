package com.jm.lms.studentms.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENROLLCOURSE")
public class EnrollCourse {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_enrollcourse")
	    @GenericGenerator(name = "seq_enrollcourse", strategy = "increment")
	    @Column(name = "id")
	    private Long id;
	    
	 @Column(name = "course_name")
	    private String courseName;
	 
	 @Column(name = "course_username")  
	    private String courseUserName;
	 
	 @Column(name = "course_password")   
	    private String coursePassword;
	 
	 @Column(name = "course_duration")
	    private String courseDuration;

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

	public String getCourseUserName() {
		return courseUserName;
	}

	public void setCourseUserName(String courseUserName) {
		this.courseUserName = courseUserName;
	}

	public String getCoursePassword() {
		return coursePassword;
	}

	public void setCoursePassword(String coursePassword) {
		this.coursePassword = coursePassword;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "EnrollCourse [id=" + id + ", courseName=" + courseName + ", courseUserName=" + courseUserName
				+ ", coursePassword=" + coursePassword + ", courseDuration=" + courseDuration + "]";
	}

	public EnrollCourse() {
		super();
		
	}

	public EnrollCourse(Long id, String courseName, String courseUserName, String coursePassword,
			String courseDuration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseUserName = courseUserName;
		this.coursePassword = coursePassword;
		this.courseDuration = courseDuration;
	}
	 
	 
	    

}
