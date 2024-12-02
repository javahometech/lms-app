package com.jm.lms.studentms.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EDITCOURSE")

public class EditCourse {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "edit_course")
	@GenericGenerator(name = "edit_course", strategy = "increment")
	
	@Column(name = "id")
	private Long id;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "course_duriation")
	private String courseDuriation;

	@Column(name = "course_price")
	private Long coursePrice;

	public Long getId() {
		return id;
	}

	public  void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuriation() {
		return courseDuriation;
	}

	public void setCourseDuriation(String courseDuriation) {
		this.courseDuriation = courseDuriation;
	}

	public Long getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Long coursePrice) {
		this.coursePrice = coursePrice;
	}

	public EditCourse(Long id, String courseName, String courseDuriation, Long coursePrice) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDuriation = courseDuriation;
		this.coursePrice = coursePrice;
	}

	@Override
	public String toString() {
		return "Editcourse [id=" + id + ", courseName=" + courseName + ", courseDuriation=" + courseDuriation
				+ ", coursePrice=" + coursePrice + "]";
	}

	public EditCourse() {
		super();

	}
}
