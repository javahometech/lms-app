package com.jm.lms.studentms.model;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="coursedetails")
public class CourseDetails {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq_coursedetails")
	@GenericGenerator(name="seq_coursedetails", strategy="increment")
	@Column(name="id")
	private Long id;
	@Column(name="course_name")
	private String courseName;
	@Column(name="course_description")
	private String courseDescription;
	@Column(name="course_instructor")
	private String courseInstructor;
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
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	
	public CourseDetails() {
		super();
	}
	@Override
	public String toString() {
		return "CourseDetails [id=" + id + ", courseName=" + courseName + ", courseDescription=" + courseDescription
				+ ", courseInstructor=" + courseInstructor + "]";
	}
}
