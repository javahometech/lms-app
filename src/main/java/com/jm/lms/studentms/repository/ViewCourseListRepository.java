package com.jm.lms.studentms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jm.lms.studentms.model.Course;
@Repository
public interface ViewCourseListRepository.java extends JpaRepository<Course, Long>{
	

}
