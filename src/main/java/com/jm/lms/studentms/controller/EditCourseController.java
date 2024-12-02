package com.jm.lms.studentms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jm.lms.studentms.model.EditCourse;
import com.jm.lms.studentms.service.EditCourseService;


@RestController
@RequestMapping("api/v1/lms/editCourse")

public class EditCourseController {

	private final EditCourseService editCourseService;

    public EditCourseController(EditCourseService editCourseService) {
        this.editCourseService = editCourseService;
    }

	@PutMapping("/{courseId}")
	public ResponseEntity<EditCourse> updateCourseById(@RequestBody EditCourse course,@PathVariable("courseId") Long id) {
		EditCourse updated = EditCourseService.updateCourseById(course, id);
		return ResponseEntity.accepted().body(updated);
	}
	 
}
