package com.jm.lms.studentms.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.jm.lms.studentms.model.CourseDetails;
import com.jm.lms.studentms.repository.ViewCourseDetailsRepository;

@Service
public class ViewCourseDetailsService {
	
	@Autowired
	private ViewCourseDetailsRepository viewCourseDetailsRepository;

	public List<CourseDetails> getAllCourseDetails() {
		return viewCourseDetailsRepository.findAll();
	}

	public CourseDetails addCourseDetails(CourseDetails coursedetails) {
		return viewCourseDetailsRepository.save(coursedetails);
	}
	public CourseDetails updateCourseDetailsById(Long id, CourseDetails coursedetails) {
	CourseDetails existingCourse = viewCourseDetailsRepository.findById(id).orElse(null);

	if (existingCourse == null) {
	System.out.println("Course not found with id " + id);
	return null; 
	}
	    
	existingCourse.setCourseName(coursedetails.getCourseName());
	existingCourse.setCourseDescription(coursedetails.getCourseDescription());
	existingCourse.setCourseInstructor(coursedetails.getCourseInstructor());

	return viewCourseDetailsRepository.save(existingCourse);
	}

	public CourseDetails updateCourseDetailsByFields(Long id, Map<String, Object> fields) {
    Optional<CourseDetails> existingCourseDetails = viewCourseDetailsRepository.findById(id);
	if(existingCourseDetails.isPresent()){
	fields.forEach((key,val)->{
	Field field =  ReflectionUtils.findField(CourseDetails.class, key);
	field.setAccessible(true);
	ReflectionUtils.setField(field,existingCourseDetails.get(),val);
	});
	return viewCourseDetailsRepository.save(existingCourseDetails.get());
	}

		return null;
	}

	public void deleteCourseById(Long id) {
	viewCourseDetailsRepository.deleteById(id);
			
	}

}
