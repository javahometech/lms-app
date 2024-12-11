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

	public CourseDetails updateCourseDetailsById(Long id, CourseDetails courseDetails) {
		CourseDetails existingCourse = viewCourseDetailsRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));

		existingCourse.setCourseName(courseDetails.getCourseName());
		existingCourse.setCourseDescription(courseDetails.getCourseDescription());
		existingCourse.setCourseInstructor(courseDetails.getCourseInstructor());
		return viewCourseDetailsRepository.save(existingCourse);

	}

	@SuppressWarnings("serial")
	public class ResourceNotFoundException extends RuntimeException {
		public ResourceNotFoundException(String message) {
			super(message);
		}
	}

	public CourseDetails updateCourseDetailsByFields(Long id, Map<String, Object> fields) {
		Optional<CourseDetails> existingOrder = viewCourseDetailsRepository.findById(id);
		if (existingOrder.isPresent()) {
			fields.forEach((key, val) -> {
				Field field = ReflectionUtils.findField(CourseDetails.class, key);
				field.setAccessible(true);
				ReflectionUtils.setField(field, existingOrder.get(), val);
			});
			return viewCourseDetailsRepository.save(existingOrder.get());
		}

		return null;
	}

	public void deleteCourseById(Long id) {
		viewCourseDetailsRepository.deleteById(id);
	}
}
