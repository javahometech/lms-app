package com.jm.lms.studentms.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jm.lms.studentms.model.CreateTopic;
import com.jm.lms.studentms.service.CreateTopicService;


@RestController
@RequestMapping("/api/v1/lms/topics")
public class CreateTopicController {
	@Autowired
	private CreateTopicService createTopicService;
	
	@PostMapping("/addTopic")
	public ResponseEntity<CreateTopic> addTopic(@RequestBody CreateTopic topic){
		CreateTopic topics = createTopicService.addTopic(topic);
		return ResponseEntity.ok(topics);
	}
	@GetMapping("/getAllTopics")
	public ResponseEntity<List<CreateTopic>> getAllTopics(){
		List<CreateTopic> topics = createTopicService.getAllTopics();
		return ResponseEntity.ok(topics);
	}
	@GetMapping("/find/by/{id}")
	public ResponseEntity<Optional<CreateTopic>> findTopicById(@PathVariable("id") Long id){
		Optional<CreateTopic> topic = createTopicService.findTopicById(id);
		return ResponseEntity.ok(topic);
	}
	@PutMapping("/updateTopic")
	public ResponseEntity<CreateTopic> updateTopics(@RequestBody CreateTopic topic){
		CreateTopic updatedTopic = createTopicService.updateTopics(topic);
		return ResponseEntity.ok(updatedTopic);
	}
	@PutMapping("/updateTopic/{id}")
	public CreateTopic updateTopicById(@PathVariable("id") Long id, @RequestBody CreateTopic topic) {
		return createTopicService.updateTopicById(id, topic);
	}
	@PatchMapping("/update/{id}")
	public CreateTopic updateTopicByFields(@PathVariable("id") Long id, @RequestBody Map<String, Object> fields) {
		return createTopicService.updateTopicByFields(id, fields);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<CreateTopic> deleteTopicById(@PathVariable("id") Long id){
		createTopicService.deleteTopicById(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
