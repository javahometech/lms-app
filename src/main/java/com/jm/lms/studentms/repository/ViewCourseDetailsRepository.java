package com.jm.lms.studentms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jm.lms.studentms.model.CourseDetails;

@Repository
public interface ViewCourseDetailsRepository extends JpaRepository<CourseDetails, Long> {

}
