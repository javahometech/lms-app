package com.jm.lms.studentms.service;

import org.springframework.stereotype.Service;

import com.jm.lms.studentms.model.EditCourse;
import com.jm.lms.studentms.repository.EditCourseRepository;
@Service

public class EditCourseService {
	private static EditCourseRepository editCourseRepository;

	public EditCourseService(EditCourseRepository editCourseRepository) {
		EditCourseService.editCourseRepository = editCourseRepository;

	}

	
//	public  EditCourse updateCourseById(EditCourse editcourse) {
//		
//		return editCourseRepository.save(editcourse) ;
//	}


	public static EditCourse updateCourseById(EditCourse course, Long id) {
		
		return editCourseRepository.save(course);
	}

}
